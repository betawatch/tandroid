package ii;

import android.app.Activity;
import android.content.Context;
import bg.i0;
import bi.h0;
import bi.s2;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.dy0;
import org.telegram.ui.e40;
import org.telegram.ui.hh;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ f(int i7, p10 p10Var, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, Runnable runnable, g2 g2Var, long j3) {
        this.b = i7;
        this.d = p10Var;
        this.e = inputCheckPasswordSRP;
        this.f = twoStepVerificationActivity;
        this.g = runnable;
        this.h = g2Var;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = this.b;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                g0.g3(new i(this.b, tL_error, (p10) obj5, (TLRPC.InputCheckPasswordSRP) obj4, (TwoStepVerificationActivity) obj3, (Runnable) obj2, (g2) obj, this.c));
                break;
            case 1:
                g0.g3(new i(tLObject, this.b, (t1) obj5, (Context) obj4, this.c, (i6) obj3, (org.telegram.ui.web.q) obj2, (h0) obj));
                break;
            case 2:
                e40 e40Var = (e40) obj5;
                HashSet hashSet = (HashSet) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                t3 t3Var = (t3) obj2;
                String str = (String) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                long j3 = this.c;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mp.u1(e40Var.a).V3(updates, false);
                    g0.g3(new s2(e40Var, updates, j3, 28));
                } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                    hashSet.add(Long.valueOf(j3));
                }
                if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
                    g0.g3(new xz(e40Var, hashSet, t3Var, str, 15));
                    break;
                }
                break;
            case 3:
                String str2 = LaunchActivity.C1;
                g0.g3(new i((LaunchActivity) obj5, tLObject, this.b, (String) obj4, (String) obj3, (TLRPC.User) obj2, (String) obj, this.c));
                break;
            default:
                Activity activity = (Activity) obj5;
                i6 i6Var = (i6) obj4;
                byte[] bArr = (byte[]) obj3;
                bn bnVar = (bn) obj2;
                fj fjVar = (fj) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        g0.h3(new dy0(bnVar, activity, i6Var, fjVar, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            g0.h3(new hh(bnVar, i10, fjVar), 200L);
                            break;
                        }
                    } else {
                        g0.h3(new dy0(bnVar, activity, i6Var, fjVar, 0), 200L);
                        break;
                    }
                } else {
                    g0.g3(new i0(tLObject, activity, i6Var, this.c, bArr, bnVar, fjVar));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f(int i7, t1 t1Var, Context context, long j3, i6 i6Var, org.telegram.ui.web.q qVar, h0 h0Var) {
        this.b = i7;
        this.d = t1Var;
        this.e = context;
        this.c = j3;
        this.f = i6Var;
        this.g = qVar;
        this.h = h0Var;
    }

    public /* synthetic */ f(Activity activity, i6 i6Var, long j3, byte[] bArr, bn bnVar, fj fjVar, int i7) {
        this.d = activity;
        this.e = i6Var;
        this.c = j3;
        this.f = bArr;
        this.g = bnVar;
        this.h = fjVar;
        this.b = i7;
    }

    public /* synthetic */ f(e40 e40Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i7, t3 t3Var, String str) {
        this.d = e40Var;
        this.c = j3;
        this.e = hashSet;
        this.f = atomicInteger;
        this.b = i7;
        this.g = t3Var;
        this.h = str;
    }

    public /* synthetic */ f(LaunchActivity launchActivity, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.d = launchActivity;
        this.b = i7;
        this.e = str;
        this.f = str2;
        this.g = user;
        this.h = str3;
        this.c = j3;
    }
}
