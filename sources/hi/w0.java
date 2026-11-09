package hi;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.e40;
import org.telegram.ui.fy0;
import org.telegram.ui.ih;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ w0(int i7, org.telegram.ui.ActionBar.u1 u1Var, Context context, long j3, g6 g6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        this.c = i7;
        this.d = u1Var;
        this.e = context;
        this.b = j3;
        this.f = g6Var;
        this.g = pVar;
        this.h = t0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = this.c;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new y0(tLObject, this.c, (org.telegram.ui.ActionBar.u1) obj5, (Context) obj3, this.b, (g6) obj4, (org.telegram.ui.web.p) obj2, (bi.t0) obj));
                break;
            case 1:
                e40 e40Var = (e40) obj5;
                HashSet hashSet = (HashSet) obj3;
                AtomicInteger atomicInteger = (AtomicInteger) obj4;
                org.telegram.messenger.r3 r3Var = (org.telegram.messenger.r3) obj2;
                String str = (String) obj;
                boolean z9 = tLObject instanceof TLRPC.Updates;
                long j3 = this.b;
                if (z9) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    qp.s1(e40Var.a).O3(updates, false);
                    org.telegram.messenger.g0.h3(new bi.d3(e40Var, updates, j3, 27));
                } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                    hashSet.add(Long.valueOf(j3));
                }
                if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
                    org.telegram.messenger.g0.h3(new ln0(e40Var, hashSet, r3Var, str, 7));
                    break;
                }
                break;
            case 2:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new y0((LaunchActivity) obj5, tLObject, this.c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.b));
                break;
            default:
                Activity activity = (Activity) obj5;
                g6 g6Var = (g6) obj4;
                byte[] bArr = (byte[]) obj3;
                cn cnVar = (cn) obj2;
                ij ijVar = (ij) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.messenger.g0.i3(new fy0(cnVar, activity, g6Var, ijVar, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            org.telegram.messenger.g0.i3(new ih(cnVar, i10, ijVar), 200L);
                            break;
                        }
                    } else {
                        org.telegram.messenger.g0.i3(new fy0(cnVar, activity, g6Var, ijVar, 0), 200L);
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new bg.h0(tLObject, activity, g6Var, this.b, bArr, cnVar, ijVar));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w0(Activity activity, g6 g6Var, long j3, byte[] bArr, cn cnVar, ij ijVar, int i7) {
        this.d = activity;
        this.f = g6Var;
        this.b = j3;
        this.e = bArr;
        this.g = cnVar;
        this.h = ijVar;
        this.c = i7;
    }

    public /* synthetic */ w0(e40 e40Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, org.telegram.messenger.r3 r3Var, String str) {
        this.d = e40Var;
        this.b = j3;
        this.e = hashSet;
        this.f = atomicInteger;
        this.c = i7;
        this.g = r3Var;
        this.h = str;
    }

    public /* synthetic */ w0(LaunchActivity launchActivity, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.d = launchActivity;
        this.c = i7;
        this.e = str;
        this.f = str2;
        this.g = user;
        this.h = str3;
        this.b = j3;
    }
}
