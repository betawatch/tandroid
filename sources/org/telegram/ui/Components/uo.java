package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo implements Utilities.Callback {
    public final /* synthetic */ j80 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 f;

    public /* synthetic */ uo(j80 j80Var, int i10, long j10, long j11, org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = j80Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.e = snVar;
        this.f = g6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.a.u();
        int intValue = num.intValue();
        int i10 = this.b;
        long j10 = this.c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = this.e;
        org.telegram.ui.ActionBar.g6 g6Var = this.f;
        if (intValue != 0) {
            NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
            if (xc.a(o2Var)) {
                xc.z(o2Var, 5, num.intValue(), g6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
            NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
        }
        if (xc.a(o2Var)) {
            xc.z(o2Var, 4, num.intValue(), g6Var).j();
        }
    }
}
