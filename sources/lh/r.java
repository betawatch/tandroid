package lh;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ r(b0 b0Var, long j10, int i10) {
        this.a = i10;
        this.b = b0Var;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final b0 b0Var = this.b;
                final long j10 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: lh.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        long j11 = j10;
                        TLObject tLObject2 = tLObject;
                        b0 b0Var2 = b0Var;
                        switch (i11) {
                            case 0:
                                HashMap hashMap = b0Var2.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j11), null);
                                }
                                b0Var2.d.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(b0Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j11));
                                break;
                            default:
                                HashMap hashMap2 = b0Var2.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j11), null);
                                }
                                b0Var2.b.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(b0Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j11));
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final b0 b0Var2 = this.b;
                final long j11 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: lh.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        long j112 = j11;
                        TLObject tLObject2 = tLObject;
                        b0 b0Var22 = b0Var2;
                        switch (i112) {
                            case 0:
                                HashMap hashMap = b0Var22.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j112), null);
                                }
                                b0Var22.d.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(b0Var22.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j112));
                                break;
                            default:
                                HashMap hashMap2 = b0Var22.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j112), null);
                                }
                                b0Var22.b.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(b0Var22.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j112));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
