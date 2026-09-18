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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k21(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        org.telegram.ui.wy wyVar;
        org.telegram.ui.wy wyVar2;
        int i11 = this.a;
        long j3 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i11) {
            case 0:
                y21 y21Var = (y21) obj3;
                ArrayList arrayList = (ArrayList) obj;
                y21Var.e0.removeAll((HashSet) obj2);
                y21Var.o();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj4 = arrayList.get(i12);
                    i12++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j3 == intValue) {
                        y21Var.m(intValue, false);
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.wy wyVar3 = (org.telegram.ui.wy) obj3;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (dialogFilter == null || !wyVar3.g4(dialog)) {
                    i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    int size2 = dialogFilter.pinnedDialogs.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        i13 = Math.min(i13, dialogFilter.pinnedDialogs.valueAt(i14));
                    }
                    i10 = i13 - wyVar3.N2;
                }
                long j10 = this.b;
                TLRPC.EncryptedChat m10 = DialogObject.isEncryptedDialog(j10) ? org.telegram.messenger.w1.m(wyVar3.getMessagesController(), j10) : null;
                UndoView Y3 = wyVar3.Y3();
                if (Y3 != null) {
                    if (wyVar3.g4(dialog)) {
                        wyVar = wyVar3;
                        wyVar.s4(j10, false, dialogFilter, i10, true);
                        Y3.k(0L, 79, 1, 1600, null, null);
                    } else {
                        wyVar = wyVar3;
                        wyVar.s4(j10, true, dialogFilter, i10, true);
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
                        org.telegram.ui.wy wyVar4 = wyVar;
                        org.telegram.ui.h10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, wyVar4, null);
                        wyVar2 = wyVar4;
                    } else {
                        wyVar2 = wyVar;
                    }
                    wyVar2.getMessagesController().reorderPinnedDialogs(wyVar2.V2, null, 0L);
                    wyVar2.T4(true);
                    if (wyVar2.e0 != null) {
                        int i15 = 0;
                        while (true) {
                            org.telegram.ui.vy[] vyVarArr = wyVar2.e0;
                            if (i15 < vyVarArr.length) {
                                vyVarArr[i15].d.H = false;
                                i15++;
                            }
                        }
                    }
                    wyVar2.g5(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.k60 k60Var = (org.telegram.ui.k60) obj3;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ChatObject.Call call = k60Var.a1;
                if (call != null && !k60Var.s0) {
                    call.addInvitedUser(j3);
                    k60Var.O0(true);
                    r30 r30Var = k60Var.E1;
                    if (r30Var != null) {
                        r30Var.dismiss();
                    }
                    try {
                        c2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    c2VarArr[0] = null;
                    k60Var.k1().k(0L, 34, user, k60Var.Z0, null, null);
                    break;
                }
                break;
            case 3:
                TLObject tLObject = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                org.telegram.ui.xq xqVar = (org.telegram.ui.xq) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TL_stories.TL_stories_peerStories) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    messagesController.putUsers(tL_stories_peerStories.users, false);
                    messagesController.getStoriesController().a0(j3, tL_stories_peerStories.stories);
                    xqVar.run();
                    break;
                } else {
                    xqVar.run();
                    break;
                }
            case 4:
                org.telegram.ui.cb0 cb0Var = (org.telegram.ui.cb0) obj3;
                LaunchActivity launchActivity = cb0Var.g;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (((String) obj2) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.O);
                    MessagesController messagesController2 = accountInstance.getMessagesController();
                    long j11 = this.b;
                    long j12 = -j11;
                    if (messagesController2.getGroupCall(j12, false) != null) {
                        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j12));
                        accountInstance.getMessagesController().getInputPeer(j11);
                        org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf(!r3.call.rtmp_stream), launchActivity, o2Var, accountInstance);
                        break;
                    } else {
                        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j12);
                        if (chatFull != null) {
                            if (chatFull.call == null) {
                                if (o2Var.getParentActivity() != null) {
                                    org.telegram.messenger.w1.o(R.string.InviteExpired, vc.a0(o2Var), R.raw.linkbroken, 36);
                                    break;
                                }
                            } else {
                                accountInstance.getMessagesController().getGroupCall(j12, true, new org.telegram.ui.bb0(cb0Var, accountInstance, j11, o2Var, 0));
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
                org.telegram.messenger.f2 f2Var = new org.telegram.messenger.f2(photoViewer, (String) obj2, photoEntry, j13, 4);
                if (photoViewer.D2) {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.C2, createBitmap, new org.telegram.ui.pl0(12, f2Var, createBitmap));
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
                yh.a4 a4Var = (yh.a4) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (((yh.v5) obj2).e) {
                    a4Var.v1(j3, callback);
                    break;
                } else {
                    oc Q = a4Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                }
            case 7:
                yh.a4.e0((yh.a4) obj3, j3, (TL_stars.TL_starGiftUnique) obj2, (org.telegram.ui.wy) obj);
                break;
            case 8:
                yh.a4 a4Var2 = (yh.a4) obj3;
                a4Var2.getClass();
                ((boolean[]) obj2)[0] = true;
                a4Var2.j0.setLoading(false);
                a4Var2.v1(j3, (Utilities.Callback) obj);
                break;
            case 9:
                ((yh.v5) obj2).d0((MessageObject) obj, ((yh.e4) obj3).a, this.b, true, true, null);
                break;
            case 10:
                yh.v5 v5Var = (yh.v5) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tLObject2 instanceof TL_stars.starGiftUpgradePreview) {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject2;
                    v5Var.M.put(Long.valueOf(j3), stargiftupgradepreview);
                    callback2.run(stargiftupgradepreview);
                    break;
                } else {
                    v5Var.getClass();
                    callback2.run(null);
                    break;
                }
            case 11:
                yh.v5 v5Var2 = (yh.v5) obj3;
                Utilities.Callback callback3 = (Utilities.Callback) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (v5Var2.e) {
                    v5Var2.H(starGift, this.b, null, true, callback3);
                    break;
                } else {
                    yh.v5.e("NO_BALANCE");
                    callback3.run(null);
                    break;
                }
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                vc a02 = vc.a0((org.telegram.ui.bo) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j3, new Object[0]));
                }
                a02.s(document, string, charSequence).k(true);
                break;
            default:
                ((yh.v5) obj3).h0((LaunchActivity) obj2, j3, (String) obj);
                break;
        }
    }

    public /* synthetic */ k21(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }

    public /* synthetic */ k21(org.telegram.ui.ActionBar.g3 g3Var, long j3, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.c = g3Var;
        this.b = j3;
        this.d = obj;
        this.e = obj2;
    }
}
