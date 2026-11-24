// default package

import android.content.Context;
import android.content.Intent;
import android.text.Spannable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj2 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ gj2(pj2 pj2Var, long j, mj2 mj2Var, int i, boolean z, wk4 wk4Var) {
        this.e = pj2Var;
        this.c = j;
        this.f = mj2Var;
        this.b = i;
        this.d = z;
        this.h = wk4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0187 A[Catch: all -> 0x01a7, TryCatch #0 {, blocks: (B:62:0x0130, B:64:0x013a, B:66:0x0146, B:68:0x014e, B:71:0x0155, B:73:0x015b, B:75:0x0165, B:81:0x016f, B:82:0x0176, B:84:0x0187, B:86:0x0190, B:88:0x0196, B:89:0x01a1, B:93:0x01a3), top: B:61:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0196 A[Catch: all -> 0x01a7, TryCatch #0 {, blocks: (B:62:0x0130, B:64:0x013a, B:66:0x0146, B:68:0x014e, B:71:0x0155, B:73:0x015b, B:75:0x0165, B:81:0x016f, B:82:0x0176, B:84:0x0187, B:86:0x0190, B:88:0x0196, B:89:0x01a1, B:93:0x01a3), top: B:61:0x0130 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        bwc bwcVar;
        TLRPC.User user;
        switch (this.a) {
            case 0:
                pj2 pj2Var = (pj2) this.e;
                long j = this.c;
                mj2 mj2Var = (mj2) this.f;
                int i = this.b;
                boolean z2 = this.d;
                wk4 wk4Var = (wk4) this.h;
                synchronized (qj2.d) {
                    Spannable spannable = (Spannable) pj2Var.a.get();
                    if (spannable == null || pj2Var.b.get(Long.valueOf(j)) != mj2Var) {
                        return;
                    }
                    String str = mj2Var.a;
                    if (i <= spannable.length() && i == str.length()) {
                        for (int i2 = 0; i2 < str.length(); i2++) {
                            if (spannable.charAt(i2) == str.charAt(i2)) {
                            }
                        }
                        z = true;
                        if (z && !z2) {
                            qj2.a(spannable, i, (f06) wk4Var.b);
                        }
                        pj2Var.b.remove(Long.valueOf(j));
                        if (pj2Var.b.isEmpty()) {
                            qj2.e.remove(pj2Var);
                            if (spannable instanceof kj2) {
                                ((kj2) spannable).a = true;
                            }
                        }
                        if (z) {
                            kk7.e().k(kk7.k4, new Object[0]);
                        }
                        return;
                    }
                    z = false;
                    if (z) {
                        qj2.a(spannable, i, (f06) wk4Var.b);
                    }
                    pj2Var.b.remove(Long.valueOf(j));
                    if (pj2Var.b.isEmpty()) {
                    }
                    if (z) {
                    }
                    return;
                }
            case 1:
                VoIPPreNotificationService.lambda$show$1((Intent) this.e, (TL_phone.PhoneCall) this.f, (Context) this.h, this.b, this.c, this.d);
                return;
            default:
                z zVar = (z) this.e;
                int i3 = this.b;
                long j2 = this.c;
                JSONObject jSONObject = (JSONObject) this.f;
                String str2 = (String) this.h;
                boolean z3 = this.d;
                if (zVar.A || (bwcVar = zVar.R) == null) {
                    return;
                }
                if (i3 != 19) {
                    if (bwcVar.d == null) {
                        bwcVar.b(3, null, j2);
                        return;
                    }
                    svc g = vvc.g(bwcVar);
                    if (g == null || !g.i || (z3 && !vvc.F(g))) {
                        bwcVar.b(3, null, j2);
                        return;
                    }
                    TLRPC.TL_widgetQueryTypeData tL_widgetQueryTypeData = new TLRPC.TL_widgetQueryTypeData();
                    tL_widgetQueryTypeData.with_wallet = z3;
                    vvc.w(g, bwcVar, j2, tL_widgetQueryTypeData, str2.getBytes(StandardCharsets.UTF_8));
                    return;
                }
                if (bwcVar.d == null) {
                    bwcVar.b(3, null, j2);
                    return;
                }
                svc g2 = vvc.g(bwcVar);
                if (g2 != null) {
                    long j3 = g2.n;
                    if (j3 != 0) {
                        user = na7.q1(g2.b).V1(Long.valueOf(j3));
                        d S = LaunchActivity.S();
                        if (g2 != null || !vvc.F(g2) || user == null || !user.bot) {
                            bwcVar.b(5, null, j2);
                            return;
                        }
                        if (S == null || S.getContext() == null) {
                            bwcVar.b(3, null, j2);
                            return;
                        }
                        byte[] bytes = jSONObject.optString("data").getBytes(StandardCharsets.UTF_8);
                        Context context = S.getContext();
                        int i4 = g2.b;
                        wjb resourceProvider = S.getResourceProvider();
                        rvc rvcVar = new rvc(g2, bwcVar, j2, bytes);
                        ArrayList arrayList = k35.a;
                        h35 h35Var = new h35(new boolean[]{false}, rvcVar);
                        c C = c.C(i4);
                        boolean[] zArr = {false};
                        qt qtVar = new qt((Object) zArr, (Object) context, i4, (Object) user, (Object) jSONObject, (Object) resourceProvider, (Object) h35Var, (byte) 7);
                        if (C.M()) {
                            qtVar.run();
                            return;
                        }
                        k35.a.add(qtVar);
                        C.x0(qtVar);
                        gl.d3(new jf4((Object) qtVar, (Object) zArr, (Object) h35Var, (byte) 15), 10000L);
                        return;
                    }
                }
                user = null;
                d S2 = LaunchActivity.S();
                if (g2 != null) {
                }
                bwcVar.b(5, null, j2);
                return;
        }
    }

    public /* synthetic */ gj2(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i, long j, boolean z) {
        this.e = intent;
        this.f = phoneCall;
        this.h = context;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public /* synthetic */ gj2(z zVar, int i, long j, JSONObject jSONObject, String str, boolean z) {
        this.e = zVar;
        this.b = i;
        this.c = j;
        this.f = jSONObject;
        this.h = str;
        this.d = z;
    }
}
