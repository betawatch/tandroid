package kg;

import android.hardware.Camera;
import android.widget.TextView;
import ei.h9;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.e20;
import org.telegram.messenger.qr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Wallet.c2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ t0(e1 e1Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, qr qrVar, String str3) {
        this.c = e1Var;
        this.d = str;
        this.b = z10;
        this.h = tLObject;
        this.n = user;
        this.e = str2;
        this.r = qrVar;
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
        int i3 = this.a;
        boolean z11 = this.b;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i3) {
            case 0:
                e1 e1Var = (e1) obj7;
                String str2 = (String) obj6;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj5;
                qr qrVar = (qr) obj;
                String str4 = (String) obj4;
                x80 x80Var = e1Var.W;
                if (str2.equals(e1Var.s0)) {
                    e1Var.v0 = 0;
                    if (z11 && tLObject == null) {
                        e1Var.T(false, user, str2, str3);
                    } else if (x80Var != null) {
                        x80Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z11 && tL_messages_botResults.cache_time != 0) {
                            qrVar.v1(str4, tL_messages_botResults);
                        }
                        e1Var.t0 = tL_messages_botResults.next_offset;
                        if (e1Var.U == null) {
                            e1Var.U = tL_messages_botResults.switch_pm;
                        }
                        e1Var.V = tL_messages_botResults.switch_webview;
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
                        if (e1Var.S == null || str3.length() == 0) {
                            e1Var.S = tL_messages_botResults.results;
                            e1Var.y0 = tL_messages_botResults.gallery;
                            z10 = false;
                        } else {
                            e1Var.S.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                e1Var.t0 = "";
                            }
                            z10 = true;
                        }
                        h9 h9Var = e1Var.q0;
                        if (h9Var != null) {
                            org.telegram.messenger.g0.r(h9Var);
                            r32 = 0;
                            e1Var.q0 = null;
                        } else {
                            r32 = 0;
                        }
                        e1Var.J = r32;
                        e1Var.B0 = r32;
                        e1Var.y = r32;
                        e1Var.E = r32;
                        e1Var.K = r32;
                        e1Var.R = r32;
                        e1Var.N = r32;
                        e1Var.O = r32;
                        e1Var.L = r32;
                        e1Var.Q = r32;
                        e1Var.p0 = false;
                        x80Var.a((e1Var.S.isEmpty() && e1Var.U == null && e1Var.V == null) ? false : true);
                        if (!z10) {
                            e1Var.f();
                            break;
                        } else {
                            int i11 = (e1Var.U == null && e1Var.V == null) ? 0 : 1;
                            e1Var.g(((e1Var.S.size() - tL_messages_botResults.results.size()) + i11) - 1);
                            e1Var.o((e1Var.S.size() - tL_messages_botResults.results.size()) + i11, tL_messages_botResults.results.size());
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((CameraController) obj7).lambda$recordVideo$14((Camera) obj6, (CameraSession) obj5, this.b, (File) obj4, (CameraInfo) obj3, (CameraController.VideoTakeCallback) obj2, (Runnable) obj);
                break;
            default:
                gi.d dVar = (gi.d) obj7;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj6;
                c2 c2Var = k0Var.g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                org.telegram.ui.Wallet.x1 x1Var = (org.telegram.ui.Wallet.x1) obj4;
                TextView textView = (TextView) obj3;
                k9 k9Var = (k9) obj2;
                TextView textView2 = (TextView) obj;
                if (!z11) {
                    ArrayList arrayList = c2Var.d;
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
                                x1Var.e = tonconnectsession2;
                            } else {
                                i12 = i13;
                                arrayList = arrayList2;
                            }
                        } else {
                            r15 = 0;
                        }
                    }
                    TL_wallet.tonConnectSession tonconnectsession3 = x1Var.e;
                    boolean z12 = (tonconnectsession3.manifest == null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing) ? r15 : true;
                    dVar.setEnabled((!z12 || x1Var.f) ? r15 : true);
                    TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                    if (tonconnectmanifest != null) {
                        Object[] objArr = new Object[1];
                        objArr[r15] = tonconnectmanifest.name;
                        str = null;
                        textView.setText(bd.V(null, null, 2131743170, objArr));
                        TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                        if (webDocument != null) {
                            k9Var.p(ac.p(e20.c(webDocument)), "76_76", null, tonconnectsession3.manifest);
                        }
                    } else {
                        str = null;
                    }
                    Integer num = tonconnectsession3.manifest_error;
                    if (num == null) {
                        if (!z12) {
                            textView2.setText(bd.M0((tonconnectsession3.closed || tonconnectsession3.closing) ? 2131743002 : 2131748787, str));
                            break;
                        } else {
                            c2Var.getClass();
                            textView2.setText(bd.M0(c2.w(x1Var) ? 2131743171 : 2131743173, str));
                            break;
                        }
                    } else {
                        Object[] objArr2 = new Object[1];
                        objArr2[r15] = num;
                        textView2.setText(bd.a0(str, str, 2131743012, objArr2));
                        break;
                    }
                } else {
                    dVar.setEnabled((!k0Var.G() || k0Var.t() == null || k0Var.y() == null || dVar.R) ? false : true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t0(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z10, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.c = cameraController;
        this.d = camera;
        this.e = cameraSession;
        this.b = z10;
        this.f = file;
        this.h = cameraInfo;
        this.n = videoTakeCallback;
        this.r = runnable;
    }

    public /* synthetic */ t0(boolean z10, gi.d dVar, org.telegram.ui.Wallet.k0 k0Var, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.x1 x1Var, TextView textView, k9 k9Var, TextView textView2) {
        this.b = z10;
        this.c = dVar;
        this.d = k0Var;
        this.e = tonconnectsession;
        this.f = x1Var;
        this.h = textView;
        this.n = k9Var;
        this.r = textView2;
    }
}
