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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class i21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i21(Object obj, Object obj2, long j3, Object obj3, int i10) {
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
                w21 w21Var = (w21) obj3;
                ArrayList arrayList = (ArrayList) obj;
                w21Var.e0.removeAll((HashSet) obj2);
                w21Var.o();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj4 = arrayList.get(i12);
                    i12++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j3 == intValue) {
                        w21Var.m(intValue, false);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.uy uyVar3 = (org.telegram.ui.uy) obj3;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (dialogFilter == null || !uyVar3.g4(dialog)) {
                    i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        i13 = Math.min(i13, dialogFilter.pinnedDialogs.valueAt(i14));
                    }
                    i10 = i13 - uyVar3.N2;
                }
                long j10 = this.b;
                TLRPC.EncryptedChat m10 = DialogObject.isEncryptedDialog(j10) ? org.telegram.messenger.w1.m(uyVar3.getMessagesController(), j10) : null;
                UndoView Y3 = uyVar3.Y3();
                if (Y3 != null) {
                    if (uyVar3.g4(dialog)) {
                        uyVar = uyVar3;
                        uyVar.s4(j10, false, dialogFilter, i10, true);
                        Y3.k(0L, 79, 1, 1600, null, null);
                    } else {
                        uyVar = uyVar3;
                        uyVar.s4(j10, true, dialogFilter, i10, true);
                        Y3.k(0L, 78, 1, 1600, null, null);
                        if (dialogFilter != null) {
                            if (m10 != null) {
                                if (!dialogFilter.alwaysShow.contains(Long.valueOf(m10.user_id))) {
                                    dialogFilter.alwaysShow.add(Long.valueOf(m10.user_id));
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
                    uyVar2.T4(true);
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
                    uyVar2.g5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ChatObject.Call call = j60Var.a1;
                if (call != null && !j60Var.s0) {
                    call.addInvitedUser(j3);
                    j60Var.O0(true);
                    r30 r30Var = j60Var.E1;
                    if (r30Var != null) {
                        r30Var.dismiss();
                    }
                    try {
                        b2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    b2VarArr[0] = null;
                    j60Var.k1().k(0L, 34, user, j60Var.Z0, null, null);
                    break;
                }
                break;
            case 3:
                TLObject tLObject = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                org.telegram.ui.yq yqVar = (org.telegram.ui.yq) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TL_stories.TL_stories_peerStories) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    messagesController.putUsers(tL_stories_peerStories.users, false);
                    messagesController.getStoriesController().a0(j3, tL_stories_peerStories.stories);
                    yqVar.run();
                    break;
                } else {
                    yqVar.run();
                    break;
                }
            case 4:
                org.telegram.ui.ab0 ab0Var = (org.telegram.ui.ab0) obj3;
                LaunchActivity launchActivity = ab0Var.g;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (((String) obj2) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.O);
                    MessagesController messagesController2 = accountInstance.getMessagesController();
                    long j11 = this.b;
                    long j12 = -j11;
                    if (messagesController2.getGroupCall(j12, false) != null) {
                        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j12));
                        accountInstance.getMessagesController().getInputPeer(j11);
                        org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf(!r3.call.rtmp_stream), launchActivity, n2Var, accountInstance);
                        break;
                    } else {
                        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j12);
                        if (chatFull != null) {
                            if (chatFull.call == null) {
                                if (n2Var.getParentActivity() != null) {
                                    org.telegram.messenger.w1.o(R.string.InviteExpired, yc.a0(n2Var), R.raw.linkbroken, 36);
                                    break;
                                }
                            } else {
                                accountInstance.getMessagesController().getGroupCall(j12, true, new org.telegram.ui.za0(ab0Var, accountInstance, j11, n2Var, 0));
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                long j13 = this.b;
                org.telegram.messenger.f2 f2Var = new org.telegram.messenger.f2(photoViewer, (String) obj2, photoEntry, j13, 4);
                if (photoViewer.D2) {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.C2, createBitmap, new org.telegram.ui.ej0(18, f2Var, createBitmap));
                    break;
                } else {
                    TextureView textureView = photoViewer.B2;
                    Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.B2.getHeight());
                    if (bitmap == null) {
                        f2Var.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j13, null, true));
                        break;
                    } else {
                        f2Var.run(bitmap);
                        break;
                    }
                }
            case 6:
                zh.w3 w3Var = (zh.w3) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (((zh.s5) obj2).e) {
                    w3Var.v1(j3, callback);
                    break;
                } else {
                    qc Q = w3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                }
            case 7:
                zh.w3.e0((zh.w3) obj3, j3, (TL_stars.TL_starGiftUnique) obj2, (org.telegram.ui.uy) obj);
                break;
            case 8:
                zh.w3 w3Var2 = (zh.w3) obj3;
                w3Var2.getClass();
                ((boolean[]) obj2)[0] = true;
                w3Var2.j0.setLoading(false);
                w3Var2.v1(j3, (Utilities.Callback) obj);
                break;
            case 9:
                ((zh.s5) obj2).d0((MessageObject) obj, ((zh.a4) obj3).a, this.b, true, true, null);
                break;
            case 10:
                zh.s5 s5Var = (zh.s5) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tLObject2 instanceof TL_stars.starGiftUpgradePreview) {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject2;
                    s5Var.M.put(Long.valueOf(j3), stargiftupgradepreview);
                    callback2.run(stargiftupgradepreview);
                    break;
                } else {
                    s5Var.getClass();
                    callback2.run(null);
                    break;
                }
            case 11:
                zh.s5 s5Var2 = (zh.s5) obj3;
                Utilities.Callback callback3 = (Utilities.Callback) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (s5Var2.e) {
                    s5Var2.H(starGift, this.b, null, true, callback3);
                    break;
                } else {
                    zh.s5.e("NO_BALANCE");
                    callback3.run(null);
                    break;
                }
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                yc a02 = yc.a0((org.telegram.ui.co) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j3, new Object[0]));
                }
                a02.s(document, string, charSequence).k(true);
                break;
            default:
                ((zh.s5) obj3).h0((LaunchActivity) obj2, j3, (String) obj);
                break;
        }
    }

    public /* synthetic */ i21(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }

    public /* synthetic */ i21(org.telegram.ui.ActionBar.f3 f3Var, long j3, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.c = f3Var;
        this.b = j3;
        this.d = obj;
        this.e = obj2;
    }
}
