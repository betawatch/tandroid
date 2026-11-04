package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        t0.w();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra == 0 || intExtra == 0 || !h10.r(intExtra2)) {
            return;
        }
        final c a10 = c.a(intExtra2);
        if (m5.E(longExtra)) {
            if (hp.s1(a10.a).a2(Long.valueOf(longExtra)) == null) {
                final int i3 = 0;
                Utilities.e.c(new Runnable() { // from class: org.telegram.messenger.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                int i10 = AutoMessageHeardReceiver.a;
                                c cVar = a10;
                                qr a02 = qr.a0(cVar.a);
                                long j10 = longExtra;
                                g0.h3(new b1(cVar, a02.k0(j10), intExtra2, j10, intExtra, 0));
                                break;
                            default:
                                int i11 = AutoMessageHeardReceiver.a;
                                c cVar2 = a10;
                                qr a03 = qr.a0(cVar2.a);
                                long j11 = longExtra;
                                g0.h3(new b1(cVar2, a03.P(-j11), intExtra2, j11, intExtra, 1));
                                break;
                        }
                    }
                });
                return;
            }
        } else if (m5.z(longExtra) && hp.s1(a10.a).M0(Long.valueOf(-longExtra)) == null) {
            final int i10 = 1;
            Utilities.e.c(new Runnable() { // from class: org.telegram.messenger.a1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            int i102 = AutoMessageHeardReceiver.a;
                            c cVar = a10;
                            qr a02 = qr.a0(cVar.a);
                            long j10 = longExtra;
                            g0.h3(new b1(cVar, a02.k0(j10), intExtra2, j10, intExtra, 0));
                            break;
                        default:
                            int i11 = AutoMessageHeardReceiver.a;
                            c cVar2 = a10;
                            qr a03 = qr.a0(cVar2.a);
                            long j11 = longExtra;
                            g0.h3(new b1(cVar2, a03.P(-j11), intExtra2, j11, intExtra, 1));
                            break;
                    }
                }
            });
            return;
        }
        hp.s1(intExtra2).j3(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
        hp.s1(intExtra2).t3(longExtra, 0L);
    }
}
