package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.messenger.AutoMessageHeardReceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a.v();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra == 0 || intExtra == 0 || !yac.q(intExtra2)) {
            return;
        }
        final k5 a2 = k5.a(intExtra2);
        if (wf3.D(longExtra)) {
            if (uc7.s1(a2.a).X1(Long.valueOf(longExtra)) == null) {
                final byte b = 0;
                Utilities.e.c(new Runnable() { // from class: b70
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b) {
                            case 0:
                                int i = AutoMessageHeardReceiver.a;
                                k5 k5Var = a2;
                                jf7 Y = jf7.Y(k5Var.a);
                                long j = longExtra;
                                hl.c3(new c70(k5Var, Y.h0(j), intExtra2, j, intExtra, (byte) 0));
                                break;
                            default:
                                int i2 = AutoMessageHeardReceiver.a;
                                k5 k5Var2 = a2;
                                jf7 Y2 = jf7.Y(k5Var2.a);
                                long j2 = longExtra;
                                hl.c3(new c70(k5Var2, Y2.O(-j2), intExtra2, j2, intExtra, (byte) 1));
                                break;
                        }
                    }
                });
                return;
            }
        } else if (wf3.y(longExtra) && uc7.s1(a2.a).M0(Long.valueOf(-longExtra)) == null) {
            final byte b2 = 1;
            Utilities.e.c(new Runnable() { // from class: b70
                @Override // java.lang.Runnable
                public final void run() {
                    switch (b2) {
                        case 0:
                            int i = AutoMessageHeardReceiver.a;
                            k5 k5Var = a2;
                            jf7 Y = jf7.Y(k5Var.a);
                            long j = longExtra;
                            hl.c3(new c70(k5Var, Y.h0(j), intExtra2, j, intExtra, (byte) 0));
                            break;
                        default:
                            int i2 = AutoMessageHeardReceiver.a;
                            k5 k5Var2 = a2;
                            jf7 Y2 = jf7.Y(k5Var2.a);
                            long j2 = longExtra;
                            hl.c3(new c70(k5Var2, Y2.O(-j2), intExtra2, j2, intExtra, (byte) 1));
                            break;
                    }
                }
            });
            return;
        }
        uc7.s1(intExtra2).r3(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
        uc7.s1(intExtra2).B3(longExtra, 0L);
    }
}
