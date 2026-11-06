package bi;

import java.util.HashMap;
import org.telegram.messenger.qs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ a0(n0 n0Var, long j3, int i7) {
        this.a = i7;
        this.b = n0Var;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final n0 n0Var = this.b;
                final long j3 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        long j10 = j3;
                        TLObject tLObject2 = tLObject;
                        n0 n0Var2 = n0Var;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = n0Var2.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j10), null);
                                }
                                n0Var2.d.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                qs.f(n0Var2.a).k(qs.C3, Long.valueOf(j10));
                                break;
                            default:
                                HashMap hashMap2 = n0Var2.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j10), null);
                                }
                                n0Var2.b.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                qs.f(n0Var2.a).k(qs.C3, Long.valueOf(j10));
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final n0 n0Var2 = this.b;
                final long j10 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        long j102 = j10;
                        TLObject tLObject2 = tLObject;
                        n0 n0Var22 = n0Var2;
                        switch (i102) {
                            case 0:
                                HashMap hashMap = n0Var22.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j102), null);
                                }
                                n0Var22.d.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                qs.f(n0Var22.a).k(qs.C3, Long.valueOf(j102));
                                break;
                            default:
                                HashMap hashMap2 = n0Var22.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j102), null);
                                }
                                n0Var22.b.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                qs.f(n0Var22.a).k(qs.C3, Long.valueOf(j102));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
