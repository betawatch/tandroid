package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        w0.w();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra == 0 || intExtra == 0 || !e20.r(intExtra2)) {
            return;
        }
        final c a2 = c.a(intExtra2);
        if (o5.E(longExtra)) {
            if (wp.r1(a2.a).Z1(Long.valueOf(longExtra)) == null) {
                final int i10 = 0;
                Utilities.e.c(new Runnable() { // from class: org.telegram.messenger.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                int i11 = AutoMessageHeardReceiver.a;
                                c cVar = a2;
                                is a02 = is.a0(cVar.a);
                                long j10 = longExtra;
                                i0.g3(new e1(cVar, a02.k0(j10), intExtra2, j10, intExtra, 0));
                                break;
                            default:
                                int i12 = AutoMessageHeardReceiver.a;
                                c cVar2 = a2;
                                is a03 = is.a0(cVar2.a);
                                long j11 = longExtra;
                                i0.g3(new e1(cVar2, a03.P(-j11), intExtra2, j11, intExtra, 1));
                                break;
                        }
                    }
                });
                return;
            }
        } else if (o5.z(longExtra) && wp.r1(a2.a).L0(Long.valueOf(-longExtra)) == null) {
            final int i11 = 1;
            Utilities.e.c(new Runnable() { // from class: org.telegram.messenger.d1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            int i112 = AutoMessageHeardReceiver.a;
                            c cVar = a2;
                            is a02 = is.a0(cVar.a);
                            long j10 = longExtra;
                            i0.g3(new e1(cVar, a02.k0(j10), intExtra2, j10, intExtra, 0));
                            break;
                        default:
                            int i12 = AutoMessageHeardReceiver.a;
                            c cVar2 = a2;
                            is a03 = is.a0(cVar2.a);
                            long j11 = longExtra;
                            i0.g3(new e1(cVar2, a03.P(-j11), intExtra2, j11, intExtra, 1));
                            break;
                    }
                }
            });
            return;
        }
        wp.r1(intExtra2).h3(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
        wp.r1(intExtra2).q3(longExtra, 0L);
    }
}
