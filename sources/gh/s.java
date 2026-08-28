package gh;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ s(c0 c0Var, long j10, int i9) {
        this.a = i9;
        this.b = c0Var;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 1;
                final c0 c0Var = this.b;
                final long j10 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i9;
                        long j11 = j10;
                        TLObject tLObject2 = tLObject;
                        c0 c0Var2 = c0Var;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = c0Var2.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j11), null);
                                }
                                c0Var2.d.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(c0Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j11));
                                break;
                            default:
                                HashMap hashMap2 = c0Var2.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j11), null);
                                }
                                c0Var2.b.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(c0Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j11));
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final c0 c0Var2 = this.b;
                final long j11 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        long j112 = j11;
                        TLObject tLObject2 = tLObject;
                        c0 c0Var22 = c0Var2;
                        switch (i102) {
                            case 0:
                                HashMap hashMap = c0Var22.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j112), null);
                                }
                                c0Var22.d.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(c0Var22.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j112));
                                break;
                            default:
                                HashMap hashMap2 = c0Var22.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j112), null);
                                }
                                c0Var22.b.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(c0Var22.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j112));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
