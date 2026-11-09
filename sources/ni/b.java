package ni;

import android.content.Context;
import android.content.Intent;
import android.text.Spannable;
import com.google.android.gms.internal.play_billing.s0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import jg.c1;
import org.json.JSONObject;
import org.telegram.messenger.g0;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.l0;
import org.telegram.ui.Wallet.q2;
import org.telegram.ui.Wallet.t2;
import org.telegram.utils.twidget.i0;
import org.telegram.utils.twidget.i1;
import org.telegram.utils.twidget.k0;
import org.telegram.utils.twidget.n0;
import org.telegram.utils.twidget.v0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ b(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i7, long j3, boolean z9) {
        this.e = intent;
        this.f = phoneCall;
        this.h = context;
        this.b = i7;
        this.c = j3;
        this.d = z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x018f A[Catch: all -> 0x017c, TryCatch #0 {all -> 0x017c, blocks: (B:62:0x0133, B:64:0x013d, B:67:0x014a, B:69:0x0152, B:73:0x015a, B:75:0x0160, B:77:0x016c, B:83:0x0174, B:84:0x017e, B:86:0x018f, B:88:0x0198, B:90:0x019e, B:91:0x01a9, B:95:0x01ab), top: B:61:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019e A[Catch: all -> 0x017c, TryCatch #0 {all -> 0x017c, blocks: (B:62:0x0133, B:64:0x013d, B:67:0x014a, B:69:0x0152, B:73:0x015a, B:75:0x0160, B:77:0x016c, B:83:0x0174, B:84:0x017e, B:86:0x018f, B:88:0x0198, B:90:0x019e, B:91:0x01a9, B:95:0x01ab), top: B:61:0x0133 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z9;
        v0 v0Var;
        TLRPC.User user;
        switch (this.a) {
            case 0:
                l lVar = (l) this.e;
                long j3 = this.c;
                i iVar = (i) this.f;
                int i7 = this.b;
                boolean z10 = this.d;
                j2.n nVar = (j2.n) this.h;
                synchronized (m.d) {
                    try {
                        Spannable spannable = (Spannable) lVar.a.get();
                        if (spannable != null && lVar.b.get(Long.valueOf(j3)) == iVar) {
                            String str = iVar.a;
                            if (i7 <= spannable.length() && i7 == str.length()) {
                                for (int i10 = 0; i10 < str.length(); i10++) {
                                    if (spannable.charAt(i10) == str.charAt(i10)) {
                                    }
                                }
                                z9 = true;
                                if (z9 && !z10) {
                                    m.a(spannable, i7, (s0) nVar.b);
                                }
                                lVar.b.remove(Long.valueOf(j3));
                                if (lVar.b.isEmpty()) {
                                    m.e.remove(lVar);
                                    if (spannable instanceof g) {
                                        ((g) spannable).a = true;
                                    }
                                }
                                if (z9) {
                                    qs.e().k(qs.i4, new Object[0]);
                                }
                                return;
                            }
                            z9 = false;
                            if (z9) {
                                m.a(spannable, i7, (s0) nVar.b);
                            }
                            lVar.b.remove(Long.valueOf(j3));
                            if (lVar.b.isEmpty()) {
                            }
                            if (z9) {
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 1:
                VoIPPreNotificationService.lambda$show$1((Intent) this.e, (TL_phone.PhoneCall) this.f, (Context) this.h, this.b, this.c, this.d);
                return;
            default:
                i1 i1Var = (i1) this.e;
                int i11 = this.b;
                long j10 = this.c;
                JSONObject jSONObject = (JSONObject) this.f;
                String str2 = (String) this.h;
                boolean z11 = this.d;
                if (i1Var.w || (v0Var = i1Var.L) == null) {
                    return;
                }
                if (i11 != 19) {
                    if (v0Var.e == null) {
                        v0Var.b(3, null, j10);
                        return;
                    }
                    k0 h = n0.h(v0Var);
                    if (h == null || !h.i || (z11 && !n0.F(h))) {
                        v0Var.b(3, null, j10);
                        return;
                    }
                    TLRPC.TL_widgetQueryTypeData tL_widgetQueryTypeData = new TLRPC.TL_widgetQueryTypeData();
                    tL_widgetQueryTypeData.with_wallet = z11;
                    n0.w(h, v0Var, j10, tL_widgetQueryTypeData, str2.getBytes(StandardCharsets.UTF_8));
                    return;
                }
                if (v0Var.e == null) {
                    v0Var.b(3, null, j10);
                    return;
                }
                k0 h7 = n0.h(v0Var);
                if (h7 != null) {
                    long j11 = h7.n;
                    if (j11 != 0) {
                        user = qp.s1(h7.b).a2(Long.valueOf(j11));
                        f2 T = LaunchActivity.T();
                        if (h7 != null || !n0.F(h7) || user == null || !user.bot) {
                            v0Var.b(5, null, j10);
                            return;
                        }
                        if (T == null || T.getContext() == null) {
                            v0Var.b(3, null, j10);
                            return;
                        }
                        byte[] bytes = jSONObject.optString("data").getBytes(StandardCharsets.UTF_8);
                        Context context = T.getContext();
                        int i12 = h7.b;
                        g6 resourceProvider = T.getResourceProvider();
                        i0 i0Var = new i0(h7, v0Var, j10, bytes);
                        ArrayList arrayList = t2.a;
                        q2 q2Var = new q2(new boolean[]{false}, i0Var);
                        l0 x10 = l0.x(i12);
                        boolean[] zArr = {false};
                        c1 c1Var = new c1(zArr, context, i12, user, jSONObject, resourceProvider, q2Var, 16);
                        if (x10.G()) {
                            c1Var.run();
                            return;
                        }
                        t2.a.add(c1Var);
                        x10.m0(c1Var);
                        g0.i3(new org.telegram.ui.Wallet.g(c1Var, zArr, q2Var, 8), 10000L);
                        return;
                    }
                }
                user = null;
                f2 T2 = LaunchActivity.T();
                if (h7 != null) {
                }
                v0Var.b(5, null, j10);
                return;
        }
    }

    public /* synthetic */ b(l lVar, long j3, i iVar, int i7, boolean z9, j2.n nVar) {
        this.e = lVar;
        this.c = j3;
        this.f = iVar;
        this.b = i7;
        this.d = z9;
        this.h = nVar;
    }

    public /* synthetic */ b(i1 i1Var, int i7, long j3, JSONObject jSONObject, String str, boolean z9) {
        this.e = i1Var;
        this.b = i7;
        this.c = j3;
        this.f = jSONObject;
        this.h = str;
        this.d = z9;
    }
}
