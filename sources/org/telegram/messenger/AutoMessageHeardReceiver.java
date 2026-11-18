package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        t0.w();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra == 0 || intExtra == 0 || !j10.r(intExtra2)) {
            return;
        }
        final c a10 = c.a(intExtra2);
        if (n5.E(longExtra)) {
            if (mp.u1(a10.a).c2(Long.valueOf(longExtra)) == null) {
                final int i7 = 0;
                Utilities.e.c(new Runnable() { // from class: org.telegram.messenger.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                int i10 = AutoMessageHeardReceiver.a;
                                c cVar = a10;
                                tr a02 = tr.a0(cVar.a);
                                long j3 = longExtra;
                                g0.g3(new b1(cVar, a02.k0(j3), intExtra2, j3, intExtra, 0));
                                break;
                            default:
                                int i11 = AutoMessageHeardReceiver.a;
                                c cVar2 = a10;
                                tr a03 = tr.a0(cVar2.a);
                                long j10 = longExtra;
                                g0.g3(new b1(cVar2, a03.P(-j10), intExtra2, j10, intExtra, 1));
                                break;
                        }
                    }
                });
                return;
            }
        } else if (n5.z(longExtra) && mp.u1(a10.a).O0(Long.valueOf(-longExtra)) == null) {
            final int i10 = 1;
            Utilities.e.c(new Runnable() { // from class: org.telegram.messenger.a1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            int i102 = AutoMessageHeardReceiver.a;
                            c cVar = a10;
                            tr a02 = tr.a0(cVar.a);
                            long j3 = longExtra;
                            g0.g3(new b1(cVar, a02.k0(j3), intExtra2, j3, intExtra, 0));
                            break;
                        default:
                            int i11 = AutoMessageHeardReceiver.a;
                            c cVar2 = a10;
                            tr a03 = tr.a0(cVar2.a);
                            long j10 = longExtra;
                            g0.g3(new b1(cVar2, a03.P(-j10), intExtra2, j10, intExtra, 1));
                            break;
                    }
                }
            });
            return;
        }
        mp.u1(intExtra2).q3(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
        mp.u1(intExtra2).A3(longExtra, 0L);
    }
}
