// default package

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class eo0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eo0(oc7 oc7Var, jv0 jv0Var, vn0 vn0Var) {
        this.a = (byte) 1;
        this.b = oc7Var;
        this.c = jv0Var;
        this.d = vn0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 3;
        byte b3 = 25;
        final byte b4 = 1;
        final byte b5 = 0;
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                gm.c3(new da7(tL_error, (qac) obj3, tLObject, (oc7) obj, (qac) obj2, (byte) 3));
                break;
            case 1:
                gm.c3(new da7(tLObject, (oc7) obj, (jv0) obj3, (vn0) obj2, tL_error));
                break;
            case 2:
                to0 to0Var = (to0) obj3;
                oc7 oc7Var = (oc7) obj;
                wo0 wo0Var = (wo0) obj2;
                if (tL_error == null) {
                    if (tLObject != null) {
                        oc7Var.T3((TLRPC.Updates) tLObject, false);
                        gm.c3(new f00(wo0Var, (byte) 16));
                        break;
                    }
                } else {
                    gm.c3(new x30(to0Var, tL_error, (byte) 10));
                    break;
                }
                break;
            case 3:
                gm.c3(new da7(tL_error, (qac) obj3, tLObject, (oc7) obj, (qac) obj2, (byte) 2));
                break;
            case 4:
                gm.c3(new l97((lp0) obj3, (CountDownLatch) obj2, tLObject, (bp0) obj, (byte) 11));
                break;
            case 5:
                gm.c3(new l97((lp0) obj3, (CountDownLatch) obj2, tLObject, (bp0) obj, (byte) 10));
                break;
            case 6:
                gm.c3(new l97((b61) obj3, tLObject, (my0) obj2, (qu0) obj, (byte) 14));
                break;
            case 7:
                gm.c3(new da7(obj3, tL_error, obj2, obj, (Object) tLObject, (byte) 5));
                break;
            case 8:
                gm.c3(new da7((qw0) obj3, tLObject, (String[]) obj2, tL_error, (he) obj));
                break;
            case 9:
                gm.c3(new l97((q51) obj3, tLObject, (TL_account.TL_businessChatLink) obj2, (gx1) obj, (byte) 16));
                break;
            case 10:
                final uf1 uf1Var = (uf1) obj3;
                final he heVar = (he) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                uf1Var.getClass();
                if (tL_error != null) {
                    if (!"USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                        if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                            gm.c3(new l97(uf1Var, heVar, tL_error, updateusername, (byte) 22));
                            break;
                        } else {
                            gm.c3(new Runnable() { // from class: if1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b4;
                                    he heVar2 = heVar;
                                    uf1 uf1Var2 = uf1Var;
                                    uf1Var2.getClass();
                                    switch (b6) {
                                        case 0:
                                            try {
                                                heVar2.dismiss();
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                            }
                                            uf1Var2.finishFragment();
                                            break;
                                        default:
                                            try {
                                                heVar2.dismiss();
                                            } catch (Exception e2) {
                                                fc4.g(e2, true);
                                            }
                                            uf1Var2.m0();
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        gm.c3(new Runnable() { // from class: if1
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b6 = b5;
                                he heVar2 = heVar;
                                uf1 uf1Var2 = uf1Var;
                                uf1Var2.getClass();
                                switch (b6) {
                                    case 0:
                                        try {
                                            heVar2.dismiss();
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                        }
                                        uf1Var2.finishFragment();
                                        break;
                                    default:
                                        try {
                                            heVar2.dismiss();
                                        } catch (Exception e2) {
                                            fc4.g(e2, true);
                                        }
                                        uf1Var2.m0();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    gm.c3(new tv0(uf1Var, heVar, (TLRPC.User) tLObject, (byte) 15));
                    break;
                }
            case 11:
                gm.c3(new da7((d) obj3, (String) obj2, tL_error, tLObject, (TLObject) obj, (byte) 13));
                break;
            case 12:
                gm.c3(new l97((sh1) obj3, (CountDownLatch) obj2, tLObject, (ph1) obj, (byte) 26));
                break;
            case 13:
                gm.c3(new l97((sh1) obj3, (CountDownLatch) obj2, tLObject, (ph1) obj, (byte) 25));
                break;
            case 14:
                gm.c3(new da7((d) obj3, (String) obj2, tL_error, tLObject, (TLObject) obj, (byte) 16));
                break;
            case 15:
                gm.c3(new l97((yv1) obj3, (br1) obj2, tLObject, (hv0) obj, (byte) 29));
                break;
            case 16:
                yv1 yv1Var = (yv1) obj3;
                long[] jArr = (long[]) obj;
                gm.r((l97) obj2);
                yv1Var.v5.k.voiceTranscriptionRated = true;
                cf7 messagesStorage = yv1Var.getMessagesStorage();
                messagesStorage.a.c(new o77(messagesStorage, yv1Var.v5.e1(), k47.B0(yv1Var.v5.k), (TLObject) yv1Var.v5.k, (byte) 11));
                gm.d3(new ho1(yv1Var, b3), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 17:
                yv1 yv1Var2 = (yv1) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                gm.c3(new wi0((he[]) obj2, b2));
                if (tL_error != null) {
                    gm.c3(new co1((Object) yv1Var2, (Object) tL_error, (Object) tL_messages_editMessage, (byte) 4));
                    break;
                } else {
                    yv1Var2.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 18:
                gm.c3(new da7((d) obj3, (String) obj2, tL_error, tLObject, (TLObject) obj, (byte) 21));
                break;
            case 19:
                gm.c3(new co1(obj3, obj2, obj, (byte) 22));
                break;
            case 20:
                gm.c3(new da7(obj3, tL_error, (Object) tLObject, obj2, obj, (byte) 25));
                break;
            case 21:
                nk3 nk3Var = (nk3) obj3;
                nk3Var.getClass();
                gm.c3(new da7((Object) nk3Var, (Object) tLObject, obj2, obj, (Object) tL_error, (byte) 26));
                break;
            case 22:
                gm.c3(new jh3((nk3) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, b4));
                break;
            case 23:
                gm.c3(new xo1((b24) obj3, (he[]) obj2, tLObject, (k6d) obj, (byte) 15));
                break;
            case 24:
                gm.c3(new xo1((y24) obj3, (TLRPC.TL_messages_getStickers) obj2, tLObject, (Runnable) obj, (byte) 16));
                break;
            case 25:
                gm.c3(new if4(obj3, obj2, obj, (byte) 2));
                break;
            case 26:
                gm.c3(new if4((ln4) obj3, (d) obj2, (ArrayList) obj, b2));
                break;
            case 27:
                gm.c3(new da7(obj3, (Object) tLObject, obj2, obj, (Object) tL_error, (byte) 29));
                break;
            case 28:
                g95 g95Var = (g95) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject == null) {
                    gm.c3(new ve4(g95Var, tL_error, b3));
                    break;
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i = 0;
                    while (true) {
                        if (i < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                gm.c3(new d65(g95Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, (byte) 0));
                            } else {
                                i++;
                            }
                        }
                    }
                    oc7.r1(g95Var.n1.a).T3(updates, false);
                    break;
                }
            default:
                gm.c3(new v15((g95) obj3, (he) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error));
                break;
        }
    }

    public /* synthetic */ eo0(qac qacVar, oc7 oc7Var, qac qacVar2, byte b) {
        this.a = b;
        this.c = qacVar;
        this.b = oc7Var;
        this.d = qacVar2;
    }

    public /* synthetic */ eo0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
