package jg;

import android.hardware.Camera;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.m20;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.k9;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    public /* synthetic */ w0(i1 i1Var, String str, boolean z9, TLObject tLObject, TLRPC.User user, String str2, yr yrVar, String str3) {
        this.c = i1Var;
        this.d = str;
        this.b = z9;
        this.h = tLObject;
        this.n = user;
        this.e = str2;
        this.r = yrVar;
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
        boolean z9;
        ?? r32;
        ?? r15;
        String str;
        int i7 = this.a;
        boolean z10 = this.b;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i7) {
            case 0:
                i1 i1Var = (i1) obj7;
                String str2 = (String) obj6;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj5;
                yr yrVar = (yr) obj;
                String str4 = (String) obj4;
                b90 b90Var = i1Var.V;
                if (str2.equals(i1Var.r0)) {
                    i1Var.u0 = 0;
                    if (z10 && tLObject == null) {
                        i1Var.T(false, user, str2, str3);
                    } else if (b90Var != null) {
                        b90Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z10 && tL_messages_botResults.cache_time != 0) {
                            yrVar.v1(str4, tL_messages_botResults);
                        }
                        i1Var.s0 = tL_messages_botResults.next_offset;
                        if (i1Var.T == null) {
                            i1Var.T = tL_messages_botResults.switch_pm;
                        }
                        i1Var.U = tL_messages_botResults.switch_webview;
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
                        if (i1Var.R == null || str3.length() == 0) {
                            i1Var.R = tL_messages_botResults.results;
                            i1Var.x0 = tL_messages_botResults.gallery;
                            z9 = false;
                        } else {
                            i1Var.R.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                i1Var.s0 = "";
                            }
                            z9 = true;
                        }
                        fi.x1 x1Var = i1Var.p0;
                        if (x1Var != null) {
                            org.telegram.messenger.g0.r(x1Var);
                            r32 = 0;
                            i1Var.p0 = null;
                        } else {
                            r32 = 0;
                        }
                        i1Var.I = r32;
                        i1Var.A0 = r32;
                        i1Var.y = r32;
                        i1Var.D = r32;
                        i1Var.J = r32;
                        i1Var.Q = r32;
                        i1Var.M = r32;
                        i1Var.N = r32;
                        i1Var.K = r32;
                        i1Var.P = r32;
                        i1Var.o0 = false;
                        b90Var.a((i1Var.R.isEmpty() && i1Var.T == null && i1Var.U == null) ? false : true);
                        if (!z9) {
                            i1Var.f();
                            break;
                        } else {
                            int i11 = (i1Var.T == null && i1Var.U == null) ? 0 : 1;
                            i1Var.g(((i1Var.R.size() - tL_messages_botResults.results.size()) + i11) - 1);
                            i1Var.o((i1Var.R.size() - tL_messages_botResults.results.size()) + i11, tL_messages_botResults.results.size());
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((CameraController) obj7).lambda$recordVideo$14((Camera) obj6, (CameraSession) obj5, this.b, (File) obj4, (CameraInfo) obj3, (CameraController.VideoTakeCallback) obj2, (Runnable) obj);
                break;
            default:
                fi.d dVar = (fi.d) obj7;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj6;
                org.telegram.ui.Wallet.d2 d2Var = l0Var.g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj4;
                TextView textView = (TextView) obj3;
                k9 k9Var = (k9) obj2;
                TextView textView2 = (TextView) obj;
                if (!z10) {
                    ArrayList arrayList = d2Var.d;
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
                                y1Var.e = tonconnectsession2;
                            } else {
                                i12 = i13;
                                arrayList = arrayList2;
                            }
                        } else {
                            r15 = 0;
                        }
                    }
                    TL_wallet.tonConnectSession tonconnectsession3 = y1Var.e;
                    boolean z11 = (tonconnectsession3.manifest == null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing) ? r15 : true;
                    dVar.setEnabled((!z11 || y1Var.f) ? r15 : true);
                    TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                    if (tonconnectmanifest != null) {
                        Object[] objArr = new Object[1];
                        objArr[r15] = tonconnectmanifest.name;
                        str = null;
                        textView.setText(id.V(null, null, 2131743160, objArr));
                        TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                        if (webDocument != null) {
                            k9Var.p(hc.p(m20.c(webDocument)), "76_76", null, tonconnectsession3.manifest);
                        }
                    } else {
                        str = null;
                    }
                    Integer num = tonconnectsession3.manifest_error;
                    if (num == null) {
                        if (!z11) {
                            textView2.setText(id.M0((tonconnectsession3.closed || tonconnectsession3.closing) ? 2131742992 : 2131748779, str));
                            break;
                        } else {
                            d2Var.getClass();
                            textView2.setText(id.M0(org.telegram.ui.Wallet.d2.w(y1Var) ? 2131743161 : 2131743163, str));
                            break;
                        }
                    } else {
                        Object[] objArr2 = new Object[1];
                        objArr2[r15] = num;
                        textView2.setText(id.a0(str, str, 2131743002, objArr2));
                        break;
                    }
                } else {
                    dVar.setEnabled((!l0Var.G() || l0Var.t() == null || l0Var.y() == null || dVar.Q) ? false : true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w0(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z9, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.c = cameraController;
        this.d = camera;
        this.e = cameraSession;
        this.b = z9;
        this.f = file;
        this.h = cameraInfo;
        this.n = videoTakeCallback;
        this.r = runnable;
    }

    public /* synthetic */ w0(boolean z9, fi.d dVar, org.telegram.ui.Wallet.l0 l0Var, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.y1 y1Var, TextView textView, k9 k9Var, TextView textView2) {
        this.b = z9;
        this.c = dVar;
        this.d = l0Var;
        this.e = tonconnectsession;
        this.f = y1Var;
        this.h = textView;
        this.n = k9Var;
        this.r = textView2;
    }
}
