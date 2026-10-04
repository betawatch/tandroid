package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class h31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h31(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        org.telegram.ui.uy uyVar;
        org.telegram.ui.uy uyVar2;
        int i11 = this.a;
        long j3 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i11) {
            case 0:
                v31 v31Var = (v31) obj3;
                ArrayList arrayList = (ArrayList) obj;
                v31Var.e0.removeAll((HashSet) obj2);
                v31Var.o();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj4 = arrayList.get(i12);
                    i12++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j3 == intValue) {
                        v31Var.m(intValue, false);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.uy uyVar3 = (org.telegram.ui.uy) obj3;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (dialogFilter == null || !uyVar3.p4(dialog)) {
                    i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        i13 = Math.min(i13, dialogFilter.pinnedDialogs.valueAt(i14));
                    }
                    i10 = i13 - uyVar3.N2;
                }
                long j10 = this.b;
                TLRPC.EncryptedChat l4 = DialogObject.isEncryptedDialog(j10) ? org.telegram.messenger.f0.l(uyVar3.getMessagesController(), j10) : null;
                UndoView h42 = uyVar3.h4();
                if (h42 != null) {
                    if (uyVar3.p4(dialog)) {
                        uyVar = uyVar3;
                        uyVar.B4(j10, false, dialogFilter, i10, true);
                        h42.k(0L, 79, 1, 1600, null, null);
                    } else {
                        uyVar = uyVar3;
                        uyVar.B4(j10, true, dialogFilter, i10, true);
                        h42.k(0L, 78, 1, 1600, null, null);
                        if (dialogFilter != null) {
                            if (l4 != null) {
                                if (!dialogFilter.alwaysShow.contains(Long.valueOf(l4.user_id))) {
                                    dialogFilter.alwaysShow.add(Long.valueOf(l4.user_id));
                                }
                            } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j10))) {
                                dialogFilter.alwaysShow.add(Long.valueOf(j10));
                            }
                        }
                    }
                    if (dialogFilter != null) {
                        org.telegram.ui.uy uyVar4 = uyVar;
                        org.telegram.ui.f10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, uyVar4, null);
                        uyVar2 = uyVar4;
                    } else {
                        uyVar2 = uyVar;
                    }
                    uyVar2.getMessagesController().reorderPinnedDialogs(uyVar2.V2, null, 0L);
                    uyVar2.c5(true);
                    if (uyVar2.e0 != null) {
                        int i15 = 0;
                        while (true) {
                            org.telegram.ui.ty[] tyVarArr = uyVar2.e0;
                            if (i15 < tyVarArr.length) {
                                tyVarArr[i15].d.H = false;
                                i15++;
                            }
                        }
                    }
                    uyVar2.p5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.h60 h60Var = (org.telegram.ui.h60) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ChatObject.Call call = h60Var.a1;
                if (call != null && !h60Var.s0) {
                    call.addInvitedUser(j3);
                    h60Var.O0(true);
                    v30 v30Var = h60Var.E1;
                    if (v30Var != null) {
                        v30Var.dismiss();
                    }
                    try {
                        b2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    b2VarArr[0] = null;
                    h60Var.k1().k(0L, 34, user, h60Var.Z0, null, null);
                    break;
                }
                break;
            case 3:
                TLObject tLObject = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                org.telegram.ui.uq uqVar = (org.telegram.ui.uq) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TL_stories.TL_stories_peerStories) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    messagesController.putUsers(tL_stories_peerStories.users, false);
                    messagesController.getStoriesController().a0(j3, tL_stories_peerStories.stories);
                    uqVar.run();
                    break;
                } else {
                    uqVar.run();
                    break;
                }
            case 4:
                org.telegram.ui.ya0 ya0Var = (org.telegram.ui.ya0) obj3;
                LaunchActivity launchActivity = ya0Var.g;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (((String) obj2) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.O);
                    MessagesController messagesController2 = accountInstance.getMessagesController();
                    long j11 = this.b;
                    long j12 = -j11;
                    if (messagesController2.getGroupCall(j12, false) != null) {
                        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j12));
                        accountInstance.getMessagesController().getInputPeer(j11);
                        org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf(!r3.call.rtmp_stream), launchActivity, n2Var, accountInstance);
                        break;
                    } else {
                        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j12);
                        if (chatFull != null) {
                            if (chatFull.call == null) {
                                if (n2Var.getParentActivity() != null) {
                                    org.telegram.messenger.f0.p(R.string.InviteExpired, yc.a0(n2Var), R.raw.linkbroken, 36);
                                    break;
                                }
                            } else {
                                accountInstance.getMessagesController().getGroupCall(j12, true, new org.telegram.ui.xa0(ya0Var, accountInstance, j11, n2Var, 0));
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                long j13 = this.b;
                ai.l lVar = new ai.l(photoViewer, (String) obj2, photoEntry, j13, 8);
                if (photoViewer.D2) {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.C2, createBitmap, new org.telegram.ui.wj0(15, lVar, createBitmap));
                    break;
                } else {
                    TextureView textureView = photoViewer.B2;
                    Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.B2.getHeight());
                    if (bitmap == null) {
                        lVar.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j13, null, true));
                        break;
                    } else {
                        lVar.run(bitmap);
                        break;
                    }
                }
            case 6:
                yh.x3 x3Var = (yh.x3) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (((yh.t5) obj2).e) {
                    x3Var.v1(j3, callback);
                    break;
                } else {
                    rc Q = x3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                }
            case 7:
                yh.x3.d0((yh.x3) obj3, j3, (TL_stars.TL_starGiftUnique) obj2, (org.telegram.ui.uy) obj);
                break;
            case 8:
                yh.x3 x3Var2 = (yh.x3) obj3;
                x3Var2.getClass();
                ((boolean[]) obj2)[0] = true;
                x3Var2.j0.setLoading(false);
                x3Var2.v1(j3, (Utilities.Callback) obj);
                break;
            case 9:
                ((yh.t5) obj2).d0((MessageObject) obj, ((yh.b4) obj3).a, this.b, true, true, null);
                break;
            case 10:
                yh.t5 t5Var = (yh.t5) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tLObject2 instanceof TL_stars.starGiftUpgradePreview) {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject2;
                    t5Var.M.put(Long.valueOf(j3), stargiftupgradepreview);
                    callback2.run(stargiftupgradepreview);
                    break;
                } else {
                    t5Var.getClass();
                    callback2.run(null);
                    break;
                }
            case 11:
                yh.t5 t5Var2 = (yh.t5) obj3;
                Utilities.Callback callback3 = (Utilities.Callback) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (t5Var2.e) {
                    t5Var2.H(starGift, this.b, null, true, callback3);
                    break;
                } else {
                    yh.t5.e("NO_BALANCE");
                    callback3.run(null);
                    break;
                }
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                yc a02 = yc.a0((org.telegram.ui.yn) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j3, new Object[0]));
                }
                a02.s(document, string, charSequence).k(true);
                break;
            default:
                ((yh.t5) obj3).h0((LaunchActivity) obj2, j3, (String) obj);
                break;
        }
    }

    public /* synthetic */ h31(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }

    public /* synthetic */ h31(org.telegram.ui.ActionBar.f3 f3Var, long j3, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.c = f3Var;
        this.b = j3;
        this.d = obj;
        this.e = obj2;
    }
}
