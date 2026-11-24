package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.messenger.AutoMessageHeardReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a.v();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra == 0 || intExtra == 0 || !y6c.q(intExtra2)) {
            return;
        }
        final j5 a2 = j5.a(intExtra2);
        if (cf3.D(longExtra)) {
            if (na7.q1(a2.a).V1(Long.valueOf(longExtra)) == null) {
                final byte b = 0;
                Utilities.e.c(new Runnable() { // from class: z60
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b) {
                            case 0:
                                int i = AutoMessageHeardReceiver.a;
                                j5 j5Var = a2;
                                ad7 Y = ad7.Y(j5Var.a);
                                long j = longExtra;
                                gl.c3(new a70(j5Var, Y.h0(j), intExtra2, j, intExtra, (byte) 0));
                                break;
                            default:
                                int i2 = AutoMessageHeardReceiver.a;
                                j5 j5Var2 = a2;
                                ad7 Y2 = ad7.Y(j5Var2.a);
                                long j2 = longExtra;
                                gl.c3(new a70(j5Var2, Y2.O(-j2), intExtra2, j2, intExtra, (byte) 1));
                                break;
                        }
                    }
                });
                return;
            }
        } else if (cf3.y(longExtra) && na7.q1(a2.a).K0(Long.valueOf(-longExtra)) == null) {
            final byte b2 = 1;
            Utilities.e.c(new Runnable() { // from class: z60
                @Override // java.lang.Runnable
                public final void run() {
                    switch (b2) {
                        case 0:
                            int i = AutoMessageHeardReceiver.a;
                            j5 j5Var = a2;
                            ad7 Y = ad7.Y(j5Var.a);
                            long j = longExtra;
                            gl.c3(new a70(j5Var, Y.h0(j), intExtra2, j, intExtra, (byte) 0));
                            break;
                        default:
                            int i2 = AutoMessageHeardReceiver.a;
                            j5 j5Var2 = a2;
                            ad7 Y2 = ad7.Y(j5Var2.a);
                            long j2 = longExtra;
                            gl.c3(new a70(j5Var2, Y2.O(-j2), intExtra2, j2, intExtra, (byte) 1));
                            break;
                    }
                }
            });
            return;
        }
        na7.q1(intExtra2).l3(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
        na7.q1(intExtra2).v3(longExtra, 0L);
    }
}
