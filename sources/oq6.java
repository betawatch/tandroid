// default package

import android.hardware.Camera;
import android.widget.TextView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oq6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ oq6(bw2 bw2Var, HashMap hashMap, HashMap hashMap2, boolean z, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.a = (byte) 2;
        this.c = bw2Var;
        this.e = hashMap;
        this.f = hashMap2;
        this.b = z;
        this.h = hashMap3;
        this.d = arrayList;
        this.n = hashMap4;
        this.r = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z;
        switch (this.a) {
            case 0:
                hs6 hs6Var = (hs6) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                boolean z2 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                ArrayList arrayList4 = (ArrayList) this.h;
                vh6 vh6Var = (vh6) this.n;
                vh6 vh6Var2 = (vh6) this.r;
                hs6Var.getMessagesController().d4(arrayList, z2);
                hs6Var.getMessagesController().X3(arrayList2, z2);
                int size = arrayList3.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList3.get(i2);
                    if ((k47.n1(message) instanceof TLRPC.TL_messageMediaDocument) || (k47.n1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i++;
                    }
                    arrayList4.add(new k47(hs6Var.currentAccount, message, vh6Var, vh6Var2, false, i < 30));
                }
                gm.c3(new yq6(hs6Var, arrayList4, r4));
                break;
            case 1:
                ((CameraController) this.c).lambda$recordVideo$14((Camera) this.d, (CameraSession) this.e, this.b, (File) this.f, (CameraInfo) this.h, (CameraController.VideoTakeCallback) this.n, (Runnable) this.r);
                break;
            case 2:
                bw2 bw2Var = (bw2) this.c;
                HashMap hashMap = (HashMap) this.e;
                HashMap hashMap2 = (HashMap) this.f;
                boolean z3 = this.b;
                HashMap hashMap3 = (HashMap) this.h;
                ArrayList arrayList5 = (ArrayList) this.d;
                HashMap hashMap4 = (HashMap) this.n;
                boolean[] zArr = (boolean[]) this.r;
                bw2Var.a0 = hashMap;
                bw2Var.Z = hashMap2;
                bw2Var.e = false;
                bw2Var.r = true;
                if (z3) {
                    bw2Var.h = true;
                }
                if (!bw2Var.x.isEmpty() && bw2Var.h) {
                    bw2Var.c(bw2Var.x, null, null, null);
                    bw2Var.x.clear();
                }
                gm.c3(new pv2(bw2Var, hashMap3, arrayList5, hashMap4, (byte) 3));
                if (zArr[0]) {
                    Utilities.e.d(new hv2(bw2Var, (byte) 7), 300000L);
                    break;
                }
                break;
            case 3:
                boolean z4 = this.b;
                b61 b61Var = (b61) this.c;
                c cVar = (c) this.d;
                w45 w45Var = cVar.g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.e;
                r45 r45Var = (r45) this.f;
                TextView textView = (TextView) this.h;
                bf0 bf0Var = (bf0) this.n;
                TextView textView2 = (TextView) this.r;
                if (z4) {
                    b61Var.setEnabled((!cVar.M() || cVar.x() == null || cVar.D() == null || b61Var.R) ? false : true);
                    break;
                } else {
                    ArrayList arrayList6 = w45Var.d;
                    int size2 = arrayList6.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            Object obj = arrayList6.get(i3);
                            i3++;
                            TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                            if (tonconnectsession2.id == tonconnectsession.id) {
                                r45Var.e = tonconnectsession2;
                            }
                        }
                    }
                    TL_wallet.tonConnectSession tonconnectsession3 = r45Var.e;
                    boolean z5 = (tonconnectsession3.manifest == null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing) ? false : true;
                    b61Var.setEnabled(z5 && !r45Var.f);
                    TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                    if (tonconnectmanifest != null) {
                        str = null;
                        textView.setText(jb6.V(null, null, 2131742843, tonconnectmanifest.name));
                        TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                        if (webDocument != null) {
                            bf0Var.p(gn5.p(vuc.c(webDocument)), "76_76", null, tonconnectsession3.manifest);
                        }
                    } else {
                        str = null;
                    }
                    Integer num = tonconnectsession3.manifest_error;
                    if (num != null) {
                        textView2.setText(jb6.a0(str, str, 2131742665, num));
                        break;
                    } else if (z5) {
                        w45Var.getClass();
                        textView2.setText(jb6.M0(w45.w(r45Var) ? 2131742844 : 2131742846, str));
                        break;
                    } else {
                        textView2.setText(jb6.M0((tonconnectsession3.closed || tonconnectsession3.closing) ? 2131742655 : 2131748536, str));
                        break;
                    }
                }
                break;
            case 4:
                k17 k17Var = (k17) this.c;
                String str2 = (String) this.d;
                boolean z6 = this.b;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                String str3 = (String) this.h;
                cf7 cf7Var = (cf7) this.n;
                String str4 = (String) this.r;
                p17 p17Var = k17Var.W;
                if (str2.equals(k17Var.s0)) {
                    k17Var.v0 = 0;
                    if (z6 && tLObject == null) {
                        k17Var.T(false, user, str2, str3);
                    } else if (p17Var != null) {
                        p17Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z6 && tL_messages_botResults.cache_time != 0) {
                            cf7Var.s1(str4, tL_messages_botResults);
                        }
                        k17Var.t0 = tL_messages_botResults.next_offset;
                        if (k17Var.U == null) {
                            k17Var.U = tL_messages_botResults.switch_pm;
                        }
                        k17Var.V = tL_messages_botResults.switch_webview;
                        int i4 = 0;
                        while (i4 < tL_messages_botResults.results.size()) {
                            TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i4);
                            if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                                tL_messages_botResults.results.remove(i4);
                                i4--;
                            }
                            botInlineResult.query_id = tL_messages_botResults.query_id;
                            i4++;
                        }
                        if (k17Var.S == null || str3.length() == 0) {
                            k17Var.S = tL_messages_botResults.results;
                            k17Var.y0 = tL_messages_botResults.gallery;
                            z = false;
                        } else {
                            k17Var.S.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                k17Var.t0 = "";
                            }
                            z = true;
                        }
                        fp6 fp6Var = k17Var.q0;
                        if (fp6Var != null) {
                            gm.r(fp6Var);
                            k17Var.q0 = null;
                        }
                        k17Var.J = null;
                        k17Var.B0 = null;
                        k17Var.y = null;
                        k17Var.E = null;
                        k17Var.K = null;
                        k17Var.R = null;
                        k17Var.N = null;
                        k17Var.O = null;
                        k17Var.L = null;
                        k17Var.Q = null;
                        k17Var.p0 = false;
                        p17Var.a((k17Var.S.isEmpty() && k17Var.U == null && k17Var.V == null) ? false : true);
                        if (z) {
                            r4 = (k17Var.U == null && k17Var.V == null) ? (byte) 0 : (byte) 1;
                            k17Var.g(((k17Var.S.size() - tL_messages_botResults.results.size()) + r4) - 1);
                            k17Var.p((k17Var.S.size() - tL_messages_botResults.results.size()) + r4, tL_messages_botResults.results.size());
                            break;
                        } else {
                            k17Var.f();
                            break;
                        }
                    }
                }
                break;
            default:
                a6a a6aVar = (a6a) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z7 = this.b;
                k47 k47Var = (k47) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.n;
                yv1 yv1Var = (yv1) this.r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.f0(password);
                    a6aVar.m0(z7, k47Var, keyboardButtonProto, twoStepVerificationActivity.e0(), twoStepVerificationActivity, yv1Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ oq6(a6a a6aVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, k47 k47Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, yv1 yv1Var) {
        this.a = (byte) 5;
        this.c = a6aVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f = twoStepVerificationActivity;
        this.b = z;
        this.h = k47Var;
        this.n = keyboardButtonProto;
        this.r = yv1Var;
    }

    public /* synthetic */ oq6(Object obj, Serializable serializable, boolean z, Object obj2, Object obj3, Serializable serializable2, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = serializable;
        this.b = z;
        this.e = obj2;
        this.f = obj3;
        this.h = serializable2;
        this.n = obj4;
        this.r = obj5;
    }

    public /* synthetic */ oq6(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.a = (byte) 1;
        this.c = cameraController;
        this.d = camera;
        this.e = cameraSession;
        this.b = z;
        this.f = file;
        this.h = cameraInfo;
        this.n = videoTakeCallback;
        this.r = runnable;
    }

    public /* synthetic */ oq6(boolean z, b61 b61Var, c cVar, TL_wallet.tonConnectSession tonconnectsession, r45 r45Var, TextView textView, bf0 bf0Var, TextView textView2) {
        this.a = (byte) 3;
        this.b = z;
        this.c = b61Var;
        this.d = cVar;
        this.e = tonconnectsession;
        this.f = r45Var;
        this.h = textView;
        this.n = bf0Var;
        this.r = textView2;
    }
}
