package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.messenger.AutoMessageHeardReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a.v();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra == 0 || intExtra == 0 || !z8c.q(intExtra2)) {
            return;
        }
        final j5 a2 = j5.a(intExtra2);
        if (pg3.D(longExtra)) {
            if (oc7.r1(a2.a).W1(Long.valueOf(longExtra)) == null) {
                final byte b = 0;
                Utilities.e.c(new Runnable() { // from class: z70
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b) {
                            case 0:
                                int i = AutoMessageHeardReceiver.a;
                                j5 j5Var = a2;
                                cf7 Y = cf7.Y(j5Var.a);
                                long j = longExtra;
                                gm.c3(new a80(j5Var, Y.h0(j), intExtra2, j, intExtra, (byte) 0));
                                break;
                            default:
                                int i2 = AutoMessageHeardReceiver.a;
                                j5 j5Var2 = a2;
                                cf7 Y2 = cf7.Y(j5Var2.a);
                                long j2 = longExtra;
                                gm.c3(new a80(j5Var2, Y2.O(-j2), intExtra2, j2, intExtra, (byte) 1));
                                break;
                        }
                    }
                });
                return;
            }
        } else if (pg3.y(longExtra) && oc7.r1(a2.a).L0(Long.valueOf(-longExtra)) == null) {
            final byte b2 = 1;
            Utilities.e.c(new Runnable() { // from class: z70
                @Override // java.lang.Runnable
                public final void run() {
                    switch (b2) {
                        case 0:
                            int i = AutoMessageHeardReceiver.a;
                            j5 j5Var = a2;
                            cf7 Y = cf7.Y(j5Var.a);
                            long j = longExtra;
                            gm.c3(new a80(j5Var, Y.h0(j), intExtra2, j, intExtra, (byte) 0));
                            break;
                        default:
                            int i2 = AutoMessageHeardReceiver.a;
                            j5 j5Var2 = a2;
                            cf7 Y2 = cf7.Y(j5Var2.a);
                            long j2 = longExtra;
                            gm.c3(new a80(j5Var2, Y2.O(-j2), intExtra2, j2, intExtra, (byte) 1));
                            break;
                    }
                }
            });
            return;
        }
        oc7.r1(intExtra2).n3(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
        oc7.r1(intExtra2).x3(longExtra, 0L);
    }
}
