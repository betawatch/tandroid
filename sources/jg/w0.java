package jg;

import android.hardware.Camera;
import android.widget.TextView;
import di.a8;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Wallet.g2;
import org.telegram.ui.Wallet.l2;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ w0(h1 h1Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, ur urVar, String str3) {
        this.c = h1Var;
        this.d = str;
        this.b = z10;
        this.h = tLObject;
        this.n = user;
        this.e = str2;
        this.r = urVar;
        this.f = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [a0.h, java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        ?? r32;
        ?? r15;
        String str;
        int i7 = this.a;
        boolean z11 = this.b;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i7) {
            case 0:
                h1 h1Var = (h1) obj7;
                String str2 = (String) obj6;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj5;
                ur urVar = (ur) obj;
                String str4 = (String) obj4;
                q90 q90Var = h1Var.W;
                if (str2.equals(h1Var.s0)) {
                    h1Var.v0 = 0;
                    if (z11 && tLObject == null) {
                        h1Var.T(false, user, str2, str3);
                    } else if (q90Var != null) {
                        q90Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z11 && tL_messages_botResults.cache_time != 0) {
                            urVar.v1(str4, tL_messages_botResults);
                        }
                        h1Var.t0 = tL_messages_botResults.next_offset;
                        if (h1Var.U == null) {
                            h1Var.U = tL_messages_botResults.switch_pm;
                        }
                        h1Var.V = tL_messages_botResults.switch_webview;
                        int i10 = 0;
                        while (i10 < tL_messages_botResults.results.size()) {
                            TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i10);
                            if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                                tL_messages_botResults.results.remove(i10);
                                i10--;
                            }
                            botInlineResult.query_id = tL_messages_botResults.query_id;
                            i10++;
                        }
                        if (h1Var.S == null || str3.length() == 0) {
                            h1Var.S = tL_messages_botResults.results;
                            h1Var.y0 = tL_messages_botResults.gallery;
                            z10 = false;
                        } else {
                            h1Var.S.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                h1Var.t0 = "";
                            }
                            z10 = true;
                        }
                        a8 a8Var = h1Var.q0;
                        if (a8Var != null) {
                            org.telegram.messenger.g0.r(a8Var);
                            r32 = 0;
                            h1Var.q0 = null;
                        } else {
                            r32 = 0;
                        }
                        h1Var.J = r32;
                        h1Var.B0 = r32;
                        h1Var.y = r32;
                        h1Var.E = r32;
                        h1Var.K = r32;
                        h1Var.R = r32;
                        h1Var.N = r32;
                        h1Var.O = r32;
                        h1Var.L = r32;
                        h1Var.Q = r32;
                        h1Var.p0 = false;
                        q90Var.a((h1Var.S.isEmpty() && h1Var.U == null && h1Var.V == null) ? false : true);
                        if (!z10) {
                            h1Var.f();
                            break;
                        } else {
                            int i11 = (h1Var.U == null && h1Var.V == null) ? 0 : 1;
                            h1Var.g(((h1Var.S.size() - tL_messages_botResults.results.size()) + i11) - 1);
                            h1Var.o((h1Var.S.size() - tL_messages_botResults.results.size()) + i11, tL_messages_botResults.results.size());
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((CameraController) obj7).lambda$recordVideo$14((Camera) obj6, (CameraSession) obj5, this.b, (File) obj4, (CameraInfo) obj3, (CameraController.VideoTakeCallback) obj2, (Runnable) obj);
                break;
            default:
                hi.e eVar = (hi.e) obj7;
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj6;
                l2 l2Var = u0Var.g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                g2 g2Var = (g2) obj4;
                TextView textView = (TextView) obj3;
                q9 q9Var = (q9) obj2;
                TextView textView2 = (TextView) obj;
                if (!z11) {
                    ArrayList arrayList = l2Var.d;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            Object obj8 = arrayList.get(i12);
                            int i13 = i12 + 1;
                            TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj8;
                            r15 = 0;
                            ArrayList arrayList2 = arrayList;
                            if (tonconnectsession2.id == tonconnectsession.id) {
                                g2Var.e = tonconnectsession2;
                            } else {
                                i12 = i13;
                                arrayList = arrayList2;
                            }
                        } else {
                            r15 = 0;
                        }
                    }
                    TL_wallet.tonConnectSession tonconnectsession3 = g2Var.e;
                    boolean z12 = (tonconnectsession3.manifest == null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing) ? r15 : true;
                    eVar.setEnabled((!z12 || g2Var.f) ? r15 : true);
                    TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                    if (tonconnectmanifest != null) {
                        Object[] objArr = new Object[1];
                        objArr[r15] = tonconnectmanifest.name;
                        str = null;
                        textView.setText(hd.V(null, null, 2131742914, objArr));
                        TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                        if (webDocument != null) {
                            q9Var.p(gc.p(i20.c(webDocument)), "76_76", null, tonconnectsession3.manifest);
                        }
                    } else {
                        str = null;
                    }
                    Integer num = tonconnectsession3.manifest_error;
                    if (num == null) {
                        if (!z12) {
                            textView2.setText(hd.N0((tonconnectsession3.closed || tonconnectsession3.closing) ? 2131742726 : 2131748586, str));
                            break;
                        } else {
                            l2Var.getClass();
                            textView2.setText(hd.N0(l2.w(g2Var) ? 2131742915 : 2131742917, str));
                            break;
                        }
                    } else {
                        Object[] objArr2 = new Object[1];
                        objArr2[r15] = num;
                        textView2.setText(hd.a0(str, str, 2131742736, objArr2));
                        break;
                    }
                } else {
                    eVar.setEnabled((!u0Var.N() || u0Var.y() == null || u0Var.E() == null || eVar.R) ? false : true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w0(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z10, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.c = cameraController;
        this.d = camera;
        this.e = cameraSession;
        this.b = z10;
        this.f = file;
        this.h = cameraInfo;
        this.n = videoTakeCallback;
        this.r = runnable;
    }

    public /* synthetic */ w0(boolean z10, hi.e eVar, org.telegram.ui.Wallet.u0 u0Var, TL_wallet.tonConnectSession tonconnectsession, g2 g2Var, TextView textView, q9 q9Var, TextView textView2) {
        this.b = z10;
        this.c = eVar;
        this.d = u0Var;
        this.e = tonconnectsession;
        this.f = g2Var;
        this.h = textView;
        this.n = q9Var;
        this.r = textView2;
    }
}
