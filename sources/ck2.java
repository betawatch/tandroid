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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ck2 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ck2(lk2 lk2Var, long j, ik2 ik2Var, int i, boolean z, um4 um4Var) {
        this.e = lk2Var;
        this.c = j;
        this.f = ik2Var;
        this.b = i;
        this.d = z;
        this.h = um4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x018a A[Catch: all -> 0x01aa, TryCatch #0 {, blocks: (B:62:0x0133, B:64:0x013d, B:66:0x0149, B:68:0x0151, B:71:0x0158, B:73:0x015e, B:75:0x0168, B:81:0x0172, B:82:0x0179, B:84:0x018a, B:86:0x0193, B:88:0x0199, B:89:0x01a4, B:93:0x01a6), top: B:61:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0199 A[Catch: all -> 0x01aa, TryCatch #0 {, blocks: (B:62:0x0133, B:64:0x013d, B:66:0x0149, B:68:0x0151, B:71:0x0158, B:73:0x015e, B:75:0x0168, B:81:0x0172, B:82:0x0179, B:84:0x018a, B:86:0x0193, B:88:0x0199, B:89:0x01a4, B:93:0x01a6), top: B:61:0x0133 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        q0d q0dVar;
        TLRPC.User user;
        switch (this.a) {
            case 0:
                lk2 lk2Var = (lk2) this.e;
                long j = this.c;
                ik2 ik2Var = (ik2) this.f;
                int i = this.b;
                boolean z2 = this.d;
                um4 um4Var = (um4) this.h;
                synchronized (mk2.d) {
                    Spannable spannable = (Spannable) lk2Var.a.get();
                    if (spannable == null || lk2Var.b.get(Long.valueOf(j)) != ik2Var) {
                        return;
                    }
                    String str = ik2Var.a;
                    if (i <= spannable.length() && i == str.length()) {
                        for (int i2 = 0; i2 < str.length(); i2++) {
                            if (spannable.charAt(i2) == str.charAt(i2)) {
                            }
                        }
                        z = true;
                        if (z && !z2) {
                            mk2.a(spannable, i, (j26) um4Var.b);
                        }
                        lk2Var.b.remove(Long.valueOf(j));
                        if (lk2Var.b.isEmpty()) {
                            mk2.e.remove(lk2Var);
                            if (spannable instanceof gk2) {
                                ((gk2) spannable).a = true;
                            }
                        }
                        if (z) {
                            jn7.e().k(jn7.l4, new Object[0]);
                        }
                        return;
                    }
                    z = false;
                    if (z) {
                        mk2.a(spannable, i, (j26) um4Var.b);
                    }
                    lk2Var.b.remove(Long.valueOf(j));
                    if (lk2Var.b.isEmpty()) {
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
                if (zVar.A || (q0dVar = zVar.R) == null) {
                    return;
                }
                if (i3 != 19) {
                    z3f z3fVar = q0dVar.d;
                    if (z3fVar == null) {
                        q0dVar.b(3, null, j2);
                        return;
                    }
                    z3fVar.getClass();
                    h0d g = k0d.g(q0dVar);
                    if (g == null || !g.i || (z3 && !k0d.G(g))) {
                        q0dVar.b(3, null, j2);
                        return;
                    }
                    TLRPC.TL_widgetQueryTypeData tL_widgetQueryTypeData = new TLRPC.TL_widgetQueryTypeData();
                    tL_widgetQueryTypeData.with_wallet = z3;
                    k0d.x(g, q0dVar, j2, tL_widgetQueryTypeData, str2.getBytes(StandardCharsets.UTF_8));
                    return;
                }
                if (q0dVar.d == null) {
                    q0dVar.b(3, null, j2);
                    return;
                }
                h0d g2 = k0d.g(q0dVar);
                if (g2 != null) {
                    long j3 = g2.n;
                    if (j3 != 0) {
                        user = uc7.s1(g2.b).X1(Long.valueOf(j3));
                        e S = LaunchActivity.S();
                        if (g2 != null || !k0d.G(g2) || user == null || !user.bot) {
                            q0dVar.b(5, null, j2);
                            return;
                        }
                        if (S == null || S.getContext() == null) {
                            q0dVar.b(3, null, j2);
                            return;
                        }
                        byte[] bytes = jSONObject.optString("data").getBytes(StandardCharsets.UTF_8);
                        Context context = S.getContext();
                        int i4 = g2.b;
                        vnb resourceProvider = S.getResourceProvider();
                        g0d g0dVar = new g0d(g2, q0dVar, j2, bytes);
                        ArrayList arrayList = o55.a;
                        l55 l55Var = new l55(new boolean[]{false}, g0dVar);
                        c C = c.C(i4);
                        boolean[] zArr = {false};
                        st stVar = new st((Object) zArr, (Object) context, i4, (Object) user, (Object) jSONObject, (Object) resourceProvider, (Object) l55Var, (byte) 7);
                        if (C.M()) {
                            stVar.run();
                            return;
                        }
                        o55.a.add(stVar);
                        C.A0(stVar);
                        hl.d3(new re4((Object) stVar, (Object) zArr, (Object) l55Var, (byte) 20), 10000L);
                        return;
                    }
                }
                user = null;
                e S2 = LaunchActivity.S();
                if (g2 != null) {
                }
                q0dVar.b(5, null, j2);
                return;
        }
    }

    public /* synthetic */ ck2(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i, long j, boolean z) {
        this.e = intent;
        this.f = phoneCall;
        this.h = context;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public /* synthetic */ ck2(z zVar, int i, long j, JSONObject jSONObject, String str, boolean z) {
        this.e = zVar;
        this.b = i;
        this.c = j;
        this.f = jSONObject;
        this.h = str;
        this.d = z;
    }
}
