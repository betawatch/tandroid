package bi;

import android.app.Dialog;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ae1;
import org.telegram.ui.eo;
import org.telegram.ui.h90;
import org.telegram.ui.j60;
import org.telegram.ui.kj1;
import org.telegram.ui.kl0;
import org.telegram.ui.mp;
import org.telegram.ui.pn;
import org.telegram.ui.rq;
import org.telegram.ui.tt;
import org.telegram.ui.vr;
import org.telegram.ui.wr;
import org.telegram.ui.wy;
import org.telegram.ui.yo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class ya implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ya(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v4, types: [org.telegram.ui.kj1] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Integer] */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        int i11;
        String str;
        int i12 = this.a;
        int i13 = 4;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        int i14 = 0;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i12) {
            case 0:
                kb kbVar = (kb) obj5;
                TLObject tLObject = (TLObject) obj4;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                rb rbVar = kbVar.W;
                ((org.telegram.ui.ActionBar.d2) obj3).dismiss();
                if (tLObject instanceof TL_phone.groupCallStreamRtmpUrl) {
                    sr[] srVarArr = new sr[1];
                    Context context = kbVar.getContext();
                    i10 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                    sr srVar = new sr(context, i10, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject, rbVar.L ? null : new y2(5, kbVar, srVarArr), new zh.b());
                    srVarArr[0] = srVar;
                    srVar.show();
                    break;
                } else if (tL_error != null) {
                    org.telegram.ui.ActionBar.f3 f3Var = rbVar.container;
                    f6Var = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                    new org.telegram.ui.Components.wc(f3Var, f6Var).d0(tL_error, true);
                    break;
                }
                break;
            case 1:
                me.a((me) obj5, (ViewGroup) obj3, (org.telegram.ui.ActionBar.f6) obj4, (org.telegram.ui.Components.ia) obj2, (View) obj);
                break;
            case 2:
                fg.f2 f2Var = (fg.f2) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                f2Var.getClass();
                String str2 = ((TLRPC.TL_messages_getStickers) obj3).emoticon;
                fg.h2 h2Var = f2Var.a;
                if (str2.equals(h2Var.R)) {
                    h2Var.O = 0;
                    if (tLObject2 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject2;
                        int size = arrayList.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        while (i14 < size2) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i14);
                            if (longSparseArray.indexOfKey(document.id) < 0) {
                                arrayList.add(document);
                            }
                            i14++;
                        }
                        if (size != arrayList.size()) {
                            h2Var.I.put(arrayList, h2Var.R);
                            if (size == 0) {
                                h2Var.J.add(arrayList);
                            }
                            h2Var.l();
                            break;
                        }
                    }
                }
                break;
            case 3:
                gg.k2 k2Var = (gg.k2) obj5;
                Runnable runnable = (Runnable) obj;
                k2Var.e = false;
                int i15 = k2Var.a;
                MessagesController.getInstance(i15).putUsers((ArrayList) obj3, true);
                MessagesController.getInstance(i15).putChats((ArrayList) obj4, true);
                ArrayList arrayList2 = k2Var.b;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj2);
                if (runnable != null) {
                    runnable.run();
                } else {
                    k2Var.i(null, false);
                }
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 4:
                gg.k2 k2Var2 = (gg.k2) obj5;
                gg.j2 j2Var = (gg.j2) obj2;
                MessageObject messageObject = (MessageObject) obj;
                int i16 = k2Var2.a;
                MessagesController.getInstance(i16).putUsers((ArrayList) obj3, true);
                MessagesController.getInstance(i16).putChats((ArrayList) obj4, true);
                j2Var.e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(j2Var.b, j2Var.a);
                }
                k2Var2.l();
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 5:
                gg.k2 k2Var3 = (gg.k2) obj5;
                TLObject tLObject3 = (TLObject) obj4;
                ArrayList<Integer> arrayList3 = (ArrayList) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                k2Var3.getClass();
                if (tLObject3 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList4 = ((TLRPC.TL_messages_messages) tLObject3).messages;
                    arrayList3.clear();
                    int size3 = arrayList4.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        TLRPC.Message message = arrayList4.get(i17);
                        i17++;
                        arrayList3.add(Integer.valueOf(message.id));
                    }
                    tL_messages_sendQuickReplyMessages.id = arrayList3;
                    while (i14 < arrayList3.size()) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                        i14++;
                    }
                    ConnectionsManager.getInstance(k2Var3.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    break;
                } else {
                    FileLog.e("received " + tLObject3 + " " + tL_error2 + " on getQuickReplyMessages when trying to send quick reply");
                    break;
                }
            case 6:
                ((m4.d) obj3).run().a(new androidx.car.app.utils.b((ki.f) obj5, (AtomicBoolean) obj4, (m4.e) obj2, (AtomicBoolean) obj, 17), i9.q.a);
                break;
            case 7:
                ((CameraController) obj5).lambda$open$10((CameraSession) obj3, (Runnable) obj4, (SurfaceTexture) obj2, (Runnable) obj);
                break;
            case 8:
                org.telegram.ui.r7 r7Var = (org.telegram.ui.r7) obj5;
                yh.a aVar = (yh.a) obj3;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj4;
                r7Var.getClass();
                aVar.e.b = false;
                tL_documentAttributeAudio.title = (String) obj2;
                tL_documentAttributeAudio.performer = (String) obj;
                v81 v81Var = r7Var.h;
                for (int i18 = 0; i18 < v81Var.getViewPages().length; i18++) {
                    vl0 vl0Var = (vl0) v81Var.getViewPages()[i18];
                    if (vl0Var != null && ((org.telegram.ui.e7) vl0Var.getAdapter()).d == 3) {
                        org.telegram.ui.e7 e7Var = (org.telegram.ui.e7) vl0Var.getAdapter();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= e7Var.e.size()) {
                                break;
                            } else if (((org.telegram.ui.l7) e7Var.e.get(i19)).d == aVar) {
                                e7Var.m(i19);
                            } else {
                                i19++;
                            }
                        }
                    }
                }
                break;
            case 9:
                org.telegram.ui.ra raVar = (org.telegram.ui.ra) obj5;
                String str3 = (String) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                TLObject tLObject4 = (TLObject) obj4;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) obj2;
                raVar.e = 0;
                String str4 = raVar.f;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error3 != null || !(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                        if (raVar.G != null) {
                            if (tL_error3 != null && "USERNAME_INVALID".equals(tL_error3.text) && checkusername.username.length() == 4) {
                                raVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                                org.telegram.ui.Cells.x1 x1Var = raVar.G;
                                int i20 = org.telegram.ui.ActionBar.j6.p7;
                                x1Var.setTag(Integer.valueOf(i20));
                                raVar.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
                            } else if (tL_error3 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error3.text)) {
                                raVar.G.setText(LocaleController.getString(R.string.UsernameInUse));
                                org.telegram.ui.Cells.x1 x1Var2 = raVar.G;
                                int i21 = org.telegram.ui.ActionBar.j6.p7;
                                x1Var2.setTag(Integer.valueOf(i21));
                                raVar.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
                            } else {
                                if (checkusername.username.length() == 4) {
                                    raVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                                } else {
                                    raVar.G.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                                }
                                org.telegram.ui.Cells.x1 x1Var3 = raVar.G;
                                int i22 = org.telegram.ui.ActionBar.j6.F6;
                                x1Var3.setTag(Integer.valueOf(i22));
                                raVar.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i22, false));
                            }
                            org.telegram.ui.qa qaVar = raVar.F;
                            if (qaVar != null) {
                                org.telegram.ui.qa.a(qaVar);
                                break;
                            }
                        }
                    } else {
                        org.telegram.ui.Cells.x1 x1Var4 = raVar.G;
                        if (x1Var4 != null) {
                            x1Var4.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str3));
                            org.telegram.ui.Cells.x1 x1Var5 = raVar.G;
                            int i23 = org.telegram.ui.ActionBar.j6.w6;
                            x1Var5.setTag(Integer.valueOf(i23));
                            raVar.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
                            org.telegram.ui.qa qaVar2 = raVar.F;
                            if (qaVar2 != null) {
                                org.telegram.ui.qa.a(qaVar2);
                                break;
                            }
                        }
                    }
                }
                break;
            case 10:
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) obj2;
                boolean[] zArr = (boolean[]) obj;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                org.telegram.ui.wb wbVar = ((org.telegram.ui.qb) obj5).a.n;
                wbVar.E0 = false;
                wbVar.C0.put(((TLRPC.TL_chatInviteExported) obj4).link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (!zArr[0]) {
                    d2Var.dismiss();
                    if (tL_messages_exportedChatInvite != null) {
                        org.telegram.ui.wb.A0(wbVar, tL_messages_exportedChatInvite, wbVar.D0);
                        break;
                    } else {
                        org.telegram.messenger.a2.o(R.string.LinkHashExpired, org.telegram.ui.Components.wc.a0(wbVar), R.raw.linkbroken, 36);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.cd cdVar = (org.telegram.ui.cd) obj5;
                boolean[] zArr2 = (boolean[]) obj3;
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                if (!zArr2[0] && (i11 = iArr[0]) < iArr2[0]) {
                    if (tL_error4 != null) {
                        zArr2[0] = true;
                        if ("BOOSTS_REQUIRED".equals(tL_error4.text)) {
                            cdVar.getMessagesController().getBoostsController().userCanBoostChannel(cdVar.a, cdVar.c, new org.telegram.ui.ic(cdVar, i14));
                            break;
                        } else {
                            cdVar.P.setLoading(false);
                            com.google.android.gms.internal.vision.e2.o(R.string.UnknownErrorCode, new Object[]{tL_error4.text}, org.telegram.ui.Components.wc.a0(cdVar), R.raw.error, 36);
                            break;
                        }
                    } else {
                        int i24 = i11 + 1;
                        iArr[0] = i24;
                        if (i24 == iArr2[0]) {
                            cdVar.finishFragment();
                            org.telegram.ui.ActionBar.p2 p2Var = cdVar.l0;
                            if (p2Var != null) {
                                if (p2Var instanceof yo) {
                                    ((yo) p2Var).o0();
                                }
                                org.telegram.messenger.a2.o(cdVar.d ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated, org.telegram.ui.Components.wc.a0(cdVar.l0), R.raw.contact_check, 36);
                                cdVar.l0 = null;
                            }
                            cdVar.P.setLoading(false);
                            break;
                        }
                    }
                }
                break;
            case 12:
                org.telegram.ui.nd ndVar = (org.telegram.ui.nd) obj5;
                String str5 = (String) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                TLObject tLObject5 = (TLObject) obj4;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) obj2;
                ndVar.W = 0;
                String str6 = ndVar.X;
                if (str6 != null && str6.equals(str5)) {
                    if (tL_error5 != null || !(tLObject5 instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error5 != null && "USERNAME_INVALID".equals(tL_error5.text) && tL_channels_checkUsername.username.length() == 4) {
                            ndVar.U.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                            ndVar.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                        } else if (tL_error5 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error5.text)) {
                            if (tL_channels_checkUsername.username.length() == 4) {
                                ndVar.U.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                            } else {
                                ndVar.U.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                            }
                            ndVar.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F6, false));
                        } else if (tL_error5 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error5.text)) {
                            ndVar.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                            ndVar.U.setText(LocaleController.getString(R.string.LinkInUse));
                        } else {
                            ndVar.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                            ndVar.j0 = false;
                            ndVar.f0();
                        }
                        ndVar.Z = false;
                        break;
                    } else {
                        ndVar.U.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str5));
                        org.telegram.ui.Cells.x1 x1Var6 = ndVar.U;
                        int i25 = org.telegram.ui.ActionBar.j6.w6;
                        x1Var6.setTag(Integer.valueOf(i25));
                        ndVar.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                        ndVar.Z = true;
                        break;
                    }
                }
                break;
            case 13:
                eo eoVar = (eo) obj5;
                boolean[] zArr3 = (boolean[]) obj3;
                boolean[] zArr4 = (boolean[]) obj4;
                ImageView imageView = (ImageView) obj2;
                ImageView imageView2 = (ImageView) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    long[] jArr = {-1};
                    org.telegram.ui.da daVar = new org.telegram.ui.da(jArr, zArr4, imageView, imageView2, 3);
                    TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                    tL_messages_rateTranscribedAudio.msg_id = eoVar.d5.getId();
                    tL_messages_rateTranscribedAudio.peer = eoVar.getMessagesController().getInputPeer(eoVar.d5.messageOwner.peer_id);
                    tL_messages_rateTranscribedAudio.transcription_id = eoVar.d5.messageOwner.voiceTranscriptionId;
                    tL_messages_rateTranscribedAudio.good = zArr4[0];
                    eoVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.aa(eoVar, daVar, jArr, i13));
                    AndroidUtilities.runOnUIThread(daVar, 150L);
                    break;
                }
                break;
            case 14:
                pn pnVar = (pn) obj5;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj4;
                MessageObject messageObject2 = (MessageObject) obj2;
                org.telegram.ui.s5 s5Var = (org.telegram.ui.s5) obj;
                eo eoVar2 = pnVar.a;
                if (((TLRPC.Message) obj3).suggested_post.schedule_date == 0) {
                    d2VarArr[0].setOnDismissListener(null);
                    org.telegram.ui.ActionBar.h3 h3Var = org.telegram.ui.Components.d5.T(eoVar2.getParentActivity(), 0L, new org.telegram.ui.oe(6, pnVar, messageObject2), eoVar2.getResourceProvider(), 1).a;
                    h3Var.show();
                    h3Var.setOnDismissListener(s5Var);
                    break;
                } else {
                    eoVar2.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject2.messageOwner.peer_id), messageObject2.messageOwner.id, 0);
                    break;
                }
            case 15:
                mp mpVar = (mp) obj5;
                String str7 = (String) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                TLObject tLObject6 = (TLObject) obj4;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername2 = (TLRPC.TL_channels_checkUsername) obj2;
                mpVar.h0 = 0;
                String str8 = mpVar.i0;
                if (str8 != null && str8.equals(str7)) {
                    if (tL_error6 != null || !(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error6 != null && "USERNAME_INVALID".equals(tL_error6.text) && tL_channels_checkUsername2.username.length() == 4) {
                            mpVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                            mpVar.f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                        } else if (tL_error6 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error6.text)) {
                            if (tL_channels_checkUsername2.username.length() == 4) {
                                mpVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                            } else {
                                mpVar.f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                            }
                            mpVar.f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F6, false));
                        } else if (tL_error6 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error6.text)) {
                            mpVar.f.setText(LocaleController.getString(R.string.LinkInUse));
                            mpVar.f.setTextColorByKey(org.telegram.ui.ActionBar.j6.p7);
                        } else {
                            mpVar.c0 = false;
                            mpVar.Z();
                        }
                        mpVar.k0 = false;
                        break;
                    } else {
                        mpVar.f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str7));
                        mpVar.f.setTextColorByKey(org.telegram.ui.ActionBar.j6.w6);
                        mpVar.k0 = true;
                        break;
                    }
                }
                break;
            case 16:
                rq.Y((rq) obj5, (TLRPC.TL_error) obj, (TLRPC.InputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj4, (TLRPC.TL_channels_editCreator) obj2);
                break;
            case 17:
                vr vrVar = (vr) obj5;
                ArrayList arrayList5 = (ArrayList) obj3;
                a0.i iVar = (a0.i) obj4;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                fg.d2 d2Var2 = vrVar.h;
                wr wrVar = vrVar.y;
                if (wrVar.o1) {
                    vrVar.s = false;
                    vrVar.d = arrayList5;
                    vrVar.e = iVar;
                    vrVar.f = arrayList6;
                    d2Var2.f(arrayList5, null);
                    if (!ChatObject.isChannel(wrVar.r)) {
                        ArrayList arrayList8 = d2Var2.g;
                        arrayList8.clear();
                        arrayList8.addAll(arrayList7);
                    }
                    int i26 = vrVar.r;
                    vrVar.l();
                    if (vrVar.r > i26) {
                        wrVar.y0(i26);
                    }
                    if (!d2Var2.e() && vrVar.r == 0) {
                        wrVar.b.e(false, true);
                        break;
                    }
                }
                break;
            case 18:
                View view = (View) obj5;
                View view2 = (View) obj3;
                WindowManager windowManager = (WindowManager) obj4;
                view.setVisibility(8);
                view2.setVisibility(8);
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView((View) obj2);
                windowManager.removeView((View) obj);
                break;
            case 19:
                hy0 hy0Var = (hy0) obj5;
                String str9 = (String) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                TLObject tLObject7 = (TLObject) obj4;
                TextView textView = (TextView) obj2;
                hy0Var.p0 = 0;
                String str10 = hy0Var.o0;
                if (str10 != null && str10.equals(str9)) {
                    if (tL_error7 != null || !(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
                        textView.setTextColor(hy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                        hy0Var.q0 = false;
                        break;
                    } else {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
                        textView.setTextColor(hy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.w6));
                        hy0Var.q0 = true;
                        break;
                    }
                }
                break;
            case 20:
                ty0 ty0Var = (ty0) obj5;
                TLObject tLObject8 = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                        org.telegram.ui.Components.pc M = org.telegram.ui.Components.wc.a0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
                        M.j = 5000;
                        M.j();
                        break;
                    } else {
                        if (userFull != null) {
                            if (tL_birthday == null) {
                                userFull.flags2 &= -33;
                            } else {
                                userFull.flags2 |= 32;
                            }
                            userFull.birthday = tL_birthday;
                            MessagesStorage.getInstance(ty0Var.a).updateUserInfo(userFull, false);
                        }
                        if (tL_error8 != null && (str = tL_error8.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ty0Var.b.getContext());
                            String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder.a;
                            d2Var3.R = string;
                            d2Var3.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            hc.b.A(R.string.OK, alertDialog$Builder, null);
                            break;
                        } else {
                            org.telegram.messenger.a2.o(R.string.UnknownError, org.telegram.ui.Components.wc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 21:
                k31 k31Var = (k31) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj4;
                w70 w70Var = (w70) obj2;
                w70 w70Var2 = (w70) obj;
                eo eoVar3 = k31Var.h;
                if (((MessagesController) obj3).isDialogMuted(k31Var.c, tL_forumTopic.id)) {
                    w70Var.u();
                    NotificationsController.getInstance(k31Var.b).muteDialog(k31Var.c, tL_forumTopic.id, false);
                    if (org.telegram.ui.Components.wc.a(eoVar3)) {
                        org.telegram.ui.Components.wc.z(eoVar3, 4, 0, k31Var.d).j();
                        break;
                    }
                } else {
                    w70Var.K(w70Var2);
                    break;
                }
                break;
            case 22:
                tt ttVar = (tt) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                ArrayList arrayList9 = (ArrayList) obj3;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj2;
                if (((TLRPC.TL_error) obj) == null && (tLObject9 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject9;
                    ArrayList<TLRPC.StickerSetCovered> arrayList10 = tL_messages_myStickers.sets;
                    int size4 = arrayList10.size();
                    while (i14 < size4) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList10.get(i14);
                        i14++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                            TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(ttVar.r).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                            if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                arrayList9.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) hc.b.i(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(ttVar.r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.aa(ttVar, arrayList9, tL_messages_getMyStickers, 7));
                        break;
                    }
                }
                break;
            case 23:
                wy.I0((wy) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
            case 24:
                j60.A((j60) obj5, (org.telegram.ui.ActionBar.d2) obj3, (TLObject) obj4, (TL_phone.exportGroupCallInvite) obj2, (TLRPC.TL_error) obj);
                break;
            case 25:
                j60.x((j60) obj5, (ArrayList) obj3, (ArrayList) obj4, (ArrayList) obj2, (String) obj);
                break;
            case 26:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                h90 h90Var = (h90) obj3;
                TLObject tLObject10 = (TLObject) obj4;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject10 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject10;
                    if (tL_wallPaper3.pattern) {
                        String str11 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                        ?? kj1Var = new kj1(str11, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r2.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        kj1Var.g = tL_wallPaper3;
                        tL_wallPaper3 = kj1Var;
                    }
                    ae1 ae1Var = new ae1(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    float f7 = wallPaperSettings2.intensity;
                    ae1Var.F1 = z10;
                    ae1Var.E1 = z11;
                    ae1Var.n1 = f7;
                    launchActivity.p0(ae1Var);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    em.l(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error9.text);
                    launchActivity.B0(org.telegram.ui.Components.d5.N(launchActivity, null, sb2.toString()));
                    break;
                }
            case 27:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                wy wyVar = (wy) obj3;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str12 = (String) obj;
                ArrayList arrayList11 = launchActivity2.E0;
                if (wyVar != null) {
                    if (p2Var2 != null) {
                        p2Var2.dismissCurrentDialog();
                    }
                    while (i14 < arrayList11.size()) {
                        if (((Dialog) arrayList11.get(i14)).isShowing()) {
                            ((Dialog) arrayList11.get(i14)).dismiss();
                        }
                        i14++;
                    }
                    arrayList11.clear();
                    launchActivity2.p0(wyVar);
                    break;
                } else if (p2Var2 instanceof eo) {
                    ((eo) p2Var2).W9(user.id, str12, true);
                    break;
                }
                break;
            case 28:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject11 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str13 = (String) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (tLObject11 != null) {
                    if (tLObject11 instanceof TLRPC.TL_urlAuthResultRequest) {
                        kl0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject11, null, null, null, false, null);
                        break;
                    } else if (tLObject11 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        kl0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject11, null, null, null, false, null);
                        break;
                    } else if (tLObject11 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.d5.q0(U2, str13, false, true);
                        break;
                    }
                } else if (tL_error10 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error10.text)) {
                        kl0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        break;
                    } else {
                        kl0.a().d0(tL_error10, false);
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject12 = (TLObject) obj4;
                org.telegram.ui.ActionBar.d2 d2Var4 = (org.telegram.ui.ActionBar.d2) obj3;
                h90 h90Var2 = (h90) obj2;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.B1;
                if (tLObject12 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject12;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.i6 N0 = org.telegram.ui.ActionBar.j6.N0(org.telegram.ui.ActionBar.j6.q0(themeSettings));
                        if (N0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity4.O).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity4.V0 = d2Var4;
                                    launchActivity4.U0 = true;
                                    launchActivity4.S0 = N0;
                                    launchActivity4.T0 = tL_theme;
                                    launchActivity4.R0 = tL_wallPaper;
                                    launchActivity4.Q0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity4.O).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                    break;
                                }
                            }
                            try {
                                h90Var2.run();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            launchActivity4.n0(tL_theme, tL_wallPaper, N0);
                        }
                        i14 = 1;
                    } else {
                        TLRPC.Document document2 = tL_theme.document;
                        if (document2 != null) {
                            launchActivity4.U0 = false;
                            launchActivity4.T0 = tL_theme;
                            launchActivity4.P0 = FileLoader.getAttachFileName(document2);
                            launchActivity4.V0 = d2Var4;
                            FileLoader.getInstance(launchActivity4.O).loadFile(launchActivity4.T0.document, tL_theme, 1, 1);
                        }
                        i14 = 1;
                    }
                } else {
                    if (tL_error11 == null || !"THEME_FORMAT_INVALID".equals(tL_error11.text)) {
                        i14 = 2;
                    }
                    i14 = 1;
                }
                if (i14 != 0) {
                    try {
                        h90Var2.run();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (i14 == 1) {
                        launchActivity4.B0(org.telegram.ui.Components.d5.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        break;
                    } else {
                        launchActivity4.B0(org.telegram.ui.Components.d5.N(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ya(Object obj, String str, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = str;
        this.f = tL_error;
        this.d = tLObject;
        this.e = obj2;
    }

    public /* synthetic */ ya(Object obj, TLObject tLObject, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = tLObject;
        this.c = obj2;
        this.e = obj3;
        this.f = tL_error;
    }

    public /* synthetic */ ya(org.telegram.ui.qb qbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = 10;
        this.b = qbVar;
        this.d = tL_chatInviteExported;
        this.e = tL_messages_exportedChatInvite;
        this.f = zArr;
        this.c = d2Var;
    }

    public /* synthetic */ ya(rq rqVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.a = 16;
        this.b = rqVar;
        this.f = tL_error;
        this.c = inputCheckPasswordSRP;
        this.d = twoStepVerificationActivity;
        this.e = tL_channels_editCreator;
    }

    public /* synthetic */ ya(tt ttVar, TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers) {
        this.a = 22;
        this.b = ttVar;
        this.f = tL_error;
        this.d = tLObject;
        this.c = arrayList;
        this.e = tL_messages_getMyStickers;
    }
}
