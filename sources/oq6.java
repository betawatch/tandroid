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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

    public /* synthetic */ oq6(lv2 lv2Var, HashMap hashMap, HashMap hashMap2, boolean z, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.a = (byte) 2;
        this.c = lv2Var;
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
                ls6 ls6Var = (ls6) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                boolean z2 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                ArrayList arrayList4 = (ArrayList) this.h;
                zh6 zh6Var = (zh6) this.n;
                zh6 zh6Var2 = (zh6) this.r;
                ls6Var.getMessagesController().j4(arrayList, z2);
                ls6Var.getMessagesController().c4(arrayList2, z2);
                int size = arrayList3.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList3.get(i2);
                    if ((r47.n1(message) instanceof TLRPC.TL_messageMediaDocument) || (r47.n1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i++;
                    }
                    arrayList4.add(new r47(ls6Var.currentAccount, message, zh6Var, zh6Var2, false, i < 30));
                }
                hl.c3(new ar6(ls6Var, arrayList4, r4));
                break;
            case 1:
                ((CameraController) this.c).lambda$recordVideo$14((Camera) this.d, (CameraSession) this.e, this.b, (File) this.f, (CameraInfo) this.h, (CameraController.VideoTakeCallback) this.n, (Runnable) this.r);
                break;
            case 2:
                lv2 lv2Var = (lv2) this.c;
                HashMap hashMap = (HashMap) this.e;
                HashMap hashMap2 = (HashMap) this.f;
                boolean z3 = this.b;
                HashMap hashMap3 = (HashMap) this.h;
                ArrayList arrayList5 = (ArrayList) this.d;
                HashMap hashMap4 = (HashMap) this.n;
                boolean[] zArr = (boolean[]) this.r;
                lv2Var.a0 = hashMap;
                lv2Var.Z = hashMap2;
                lv2Var.e = false;
                lv2Var.r = true;
                if (z3) {
                    lv2Var.h = true;
                }
                if (!lv2Var.x.isEmpty() && lv2Var.h) {
                    lv2Var.c(lv2Var.x, null, null, null);
                    lv2Var.x.clear();
                }
                hl.c3(new xu2(lv2Var, hashMap3, arrayList5, hashMap4, (byte) 3));
                if (zArr[0]) {
                    Utilities.e.d(new pu2(lv2Var, (byte) 8), 300000L);
                    break;
                }
                break;
            case 3:
                boolean z4 = this.b;
                c51 c51Var = (c51) this.c;
                c cVar = (c) this.d;
                a55 a55Var = cVar.g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.e;
                v45 v45Var = (v45) this.f;
                TextView textView = (TextView) this.h;
                de0 de0Var = (de0) this.n;
                TextView textView2 = (TextView) this.r;
                if (z4) {
                    c51Var.setEnabled((!cVar.M() || cVar.x() == null || cVar.D() == null || c51Var.R) ? false : true);
                    break;
                } else {
                    ArrayList arrayList6 = a55Var.d;
                    int size2 = arrayList6.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            Object obj = arrayList6.get(i3);
                            i3++;
                            TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                            if (tonconnectsession2.id == tonconnectsession.id) {
                                v45Var.e = tonconnectsession2;
                            }
                        }
                    }
                    TL_wallet.tonConnectSession tonconnectsession3 = v45Var.e;
                    boolean z5 = (tonconnectsession3.manifest == null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing) ? false : true;
                    c51Var.setEnabled(z5 && !v45Var.f);
                    TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                    if (tonconnectmanifest != null) {
                        str = null;
                        textView.setText(ob6.V(null, null, 2131742811, tonconnectmanifest.name));
                        TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                        if (webDocument != null) {
                            de0Var.p(jn5.p(jxc.c(webDocument)), "76_76", null, tonconnectsession3.manifest);
                        }
                    } else {
                        str = null;
                    }
                    Integer num = tonconnectsession3.manifest_error;
                    if (num != null) {
                        textView2.setText(ob6.a0(str, str, 2131742633, num));
                        break;
                    } else if (z5) {
                        a55Var.getClass();
                        textView2.setText(ob6.M0(a55.w(v45Var) ? 2131742812 : 2131742814, str));
                        break;
                    } else {
                        textView2.setText(ob6.M0((tonconnectsession3.closed || tonconnectsession3.closing) ? 2131742623 : 2131748533, str));
                        break;
                    }
                }
                break;
            case 4:
                r17 r17Var = (r17) this.c;
                String str2 = (String) this.d;
                boolean z6 = this.b;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                String str3 = (String) this.h;
                jf7 jf7Var = (jf7) this.n;
                String str4 = (String) this.r;
                w17 w17Var = r17Var.W;
                if (str2.equals(r17Var.s0)) {
                    r17Var.v0 = 0;
                    if (z6 && tLObject == null) {
                        r17Var.T(false, user, str2, str3);
                    } else if (w17Var != null) {
                        w17Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z6 && tL_messages_botResults.cache_time != 0) {
                            jf7Var.s1(str4, tL_messages_botResults);
                        }
                        r17Var.t0 = tL_messages_botResults.next_offset;
                        if (r17Var.U == null) {
                            r17Var.U = tL_messages_botResults.switch_pm;
                        }
                        r17Var.V = tL_messages_botResults.switch_webview;
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
                        if (r17Var.S == null || str3.length() == 0) {
                            r17Var.S = tL_messages_botResults.results;
                            r17Var.y0 = tL_messages_botResults.gallery;
                            z = false;
                        } else {
                            r17Var.S.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                r17Var.t0 = "";
                            }
                            z = true;
                        }
                        yg6 yg6Var = r17Var.q0;
                        if (yg6Var != null) {
                            hl.r(yg6Var);
                            r17Var.q0 = null;
                        }
                        r17Var.J = null;
                        r17Var.B0 = null;
                        r17Var.y = null;
                        r17Var.E = null;
                        r17Var.K = null;
                        r17Var.R = null;
                        r17Var.N = null;
                        r17Var.O = null;
                        r17Var.L = null;
                        r17Var.Q = null;
                        r17Var.p0 = false;
                        w17Var.a((r17Var.S.isEmpty() && r17Var.U == null && r17Var.V == null) ? false : true);
                        if (z) {
                            r4 = (r17Var.U == null && r17Var.V == null) ? (byte) 0 : (byte) 1;
                            r17Var.g(((r17Var.S.size() - tL_messages_botResults.results.size()) + r4) - 1);
                            r17Var.p((r17Var.S.size() - tL_messages_botResults.results.size()) + r4, tL_messages_botResults.results.size());
                            break;
                        } else {
                            r17Var.f();
                            break;
                        }
                    }
                }
                break;
            default:
                r7a r7aVar = (r7a) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z7 = this.b;
                r47 r47Var = (r47) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.n;
                zu1 zu1Var = (zu1) this.r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    r7aVar.m0(z7, r47Var, keyboardButtonProto, twoStepVerificationActivity.d0(), twoStepVerificationActivity, zu1Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ oq6(r7a r7aVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, r47 r47Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zu1 zu1Var) {
        this.a = (byte) 5;
        this.c = r7aVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f = twoStepVerificationActivity;
        this.b = z;
        this.h = r47Var;
        this.n = keyboardButtonProto;
        this.r = zu1Var;
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

    public /* synthetic */ oq6(boolean z, c51 c51Var, c cVar, TL_wallet.tonConnectSession tonconnectsession, v45 v45Var, TextView textView, de0 de0Var, TextView textView2) {
        this.a = (byte) 3;
        this.b = z;
        this.c = c51Var;
        this.d = cVar;
        this.e = tonconnectsession;
        this.f = v45Var;
        this.h = textView;
        this.n = de0Var;
        this.r = textView2;
    }
}
