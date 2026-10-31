package org.telegram.messenger.camera;

import android.hardware.Camera;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.b30;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cd;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.ic;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Wallet.e2;
import org.telegram.ui.Wallet.k0;
import org.telegram.ui.Wallet.z1;
import zf.x0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ i(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z10, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.c = cameraController;
        this.d = camera;
        this.e = cameraSession;
        this.b = z10;
        this.f = file;
        this.h = cameraInfo;
        this.n = videoTakeCallback;
        this.r = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r17;
        String str;
        boolean z10;
        int i10 = this.a;
        boolean z11 = this.b;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        boolean z12 = false;
        r11 = false;
        r11 = false;
        r11 = false;
        boolean z13 = false;
        switch (i10) {
            case 0:
                ((CameraController) obj7).lambda$recordVideo$14((Camera) obj6, (CameraSession) obj5, this.b, (File) obj4, (CameraInfo) obj3, (CameraController.VideoTakeCallback) obj2, (Runnable) obj);
                break;
            case 1:
                vh.d dVar = (vh.d) obj7;
                k0 k0Var = (k0) obj6;
                e2 e2Var = k0Var.g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                z1 z1Var = (z1) obj4;
                TextView textView = (TextView) obj3;
                g9 g9Var = (g9) obj2;
                TextView textView2 = (TextView) obj;
                if (!z11) {
                    ArrayList arrayList = e2Var.d;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj8 = arrayList.get(i11);
                            i11++;
                            TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj8;
                            ArrayList arrayList2 = arrayList;
                            boolean z14 = z12;
                            if (tonconnectsession2.id == tonconnectsession.id) {
                                z1Var.e = tonconnectsession2;
                                r17 = z14;
                            } else {
                                arrayList = arrayList2;
                                z12 = z14 ? 1 : 0;
                            }
                        } else {
                            r17 = z12;
                        }
                    }
                    TL_wallet.tonConnectSession tonconnectsession3 = z1Var.e;
                    boolean z15 = (tonconnectsession3.manifest == null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing) ? r17 : true;
                    dVar.setEnabled((!z15 || z1Var.f) ? r17 : true);
                    TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                    if (tonconnectmanifest != null) {
                        Object[] objArr = new Object[1];
                        objArr[r17] = tonconnectmanifest.name;
                        str = null;
                        textView.setText(cd.V(null, null, 2131743186, objArr));
                        TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                        if (webDocument != null) {
                            g9Var.p(ic.p(b30.c(webDocument)), "76_76", null, tonconnectsession3.manifest);
                        }
                    } else {
                        str = null;
                    }
                    Integer num = tonconnectsession3.manifest_error;
                    if (num == null) {
                        if (!z15) {
                            textView2.setText(cd.L0((tonconnectsession3.closed || tonconnectsession3.closing) ? 2131743018 : 2131748789, str));
                            break;
                        } else {
                            e2Var.getClass();
                            textView2.setText(cd.L0(e2.w(z1Var) ? 2131743187 : 2131743189, str));
                            break;
                        }
                    } else {
                        Object[] objArr2 = new Object[1];
                        objArr2[r17] = num;
                        textView2.setText(cd.a0(str, str, 2131743028, objArr2));
                        break;
                    }
                } else {
                    if (k0Var.G() && k0Var.t() != null && k0Var.y() != null && !dVar.Q) {
                        z13 = true;
                    }
                    dVar.setEnabled(z13);
                    break;
                }
                break;
            default:
                x0 x0Var = (x0) obj7;
                String str2 = (String) obj6;
                TLObject tLObject = (TLObject) obj5;
                TLRPC.User user = (TLRPC.User) obj4;
                String str3 = (String) obj3;
                hs hsVar = (hs) obj2;
                String str4 = (String) obj;
                t90 t90Var = x0Var.V;
                if (str2.equals(x0Var.r0)) {
                    x0Var.u0 = 0;
                    if (z11 && tLObject == null) {
                        x0Var.T(false, user, str2, str3);
                    } else if (t90Var != null) {
                        t90Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z11 && tL_messages_botResults.cache_time != 0) {
                            hsVar.v1(str4, tL_messages_botResults);
                        }
                        x0Var.s0 = tL_messages_botResults.next_offset;
                        if (x0Var.T == null) {
                            x0Var.T = tL_messages_botResults.switch_pm;
                        }
                        x0Var.U = tL_messages_botResults.switch_webview;
                        int i12 = 0;
                        while (i12 < tL_messages_botResults.results.size()) {
                            TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i12);
                            if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                                tL_messages_botResults.results.remove(i12);
                                i12--;
                            }
                            botInlineResult.query_id = tL_messages_botResults.query_id;
                            i12++;
                        }
                        if (x0Var.R == null || str3.length() == 0) {
                            x0Var.R = tL_messages_botResults.results;
                            x0Var.x0 = tL_messages_botResults.gallery;
                            z10 = false;
                        } else {
                            x0Var.R.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                x0Var.s0 = "";
                            }
                            z10 = true;
                        }
                        zf.k0 k0Var2 = x0Var.p0;
                        if (k0Var2 != null) {
                            i0.r(k0Var2);
                            x0Var.p0 = null;
                        }
                        x0Var.I = null;
                        x0Var.A0 = null;
                        x0Var.y = null;
                        x0Var.D = null;
                        x0Var.J = null;
                        x0Var.Q = null;
                        x0Var.M = null;
                        x0Var.N = null;
                        x0Var.K = null;
                        x0Var.P = null;
                        x0Var.o0 = false;
                        t90Var.a((x0Var.R.isEmpty() && x0Var.T == null && x0Var.U == null) ? false : true);
                        if (!z10) {
                            x0Var.f();
                            break;
                        } else {
                            int i13 = (x0Var.T == null && x0Var.U == null) ? 0 : 1;
                            x0Var.g(((x0Var.R.size() - tL_messages_botResults.results.size()) + i13) - 1);
                            x0Var.o((x0Var.R.size() - tL_messages_botResults.results.size()) + i13, tL_messages_botResults.results.size());
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ i(x0 x0Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, hs hsVar, String str3) {
        this.c = x0Var;
        this.d = str;
        this.b = z10;
        this.e = tLObject;
        this.f = user;
        this.h = str2;
        this.n = hsVar;
        this.r = str3;
    }

    public /* synthetic */ i(boolean z10, vh.d dVar, k0 k0Var, TL_wallet.tonConnectSession tonconnectsession, z1 z1Var, TextView textView, g9 g9Var, TextView textView2) {
        this.b = z10;
        this.c = dVar;
        this.d = k0Var;
        this.e = tonconnectsession;
        this.f = z1Var;
        this.h = textView;
        this.n = g9Var;
        this.r = textView2;
    }
}
