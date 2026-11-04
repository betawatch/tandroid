package ci;

import java.util.HashMap;
import org.telegram.messenger.hs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ w(i0 i0Var, long j10, int i3) {
        this.a = i3;
        this.b = i0Var;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 1;
                final i0 i0Var = this.b;
                final long j10 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i3;
                        long j11 = j10;
                        TLObject tLObject2 = tLObject;
                        i0 i0Var2 = i0Var;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = i0Var2.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j11), null);
                                }
                                i0Var2.d.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                hs.f(i0Var2.a).k(hs.C3, Long.valueOf(j11));
                                break;
                            default:
                                HashMap hashMap2 = i0Var2.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j11), null);
                                }
                                i0Var2.b.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                hs.f(i0Var2.a).k(hs.C3, Long.valueOf(j11));
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final i0 i0Var2 = this.b;
                final long j11 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        long j112 = j11;
                        TLObject tLObject2 = tLObject;
                        i0 i0Var22 = i0Var2;
                        switch (i102) {
                            case 0:
                                HashMap hashMap = i0Var22.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j112), null);
                                }
                                i0Var22.d.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                hs.f(i0Var22.a).k(hs.C3, Long.valueOf(j112));
                                break;
                            default:
                                HashMap hashMap2 = i0Var22.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j112), null);
                                }
                                i0Var22.b.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                hs.f(i0Var22.a).k(hs.C3, Long.valueOf(j112));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
