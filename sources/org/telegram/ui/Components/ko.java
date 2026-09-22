package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements Utilities.Callback {
    public final /* synthetic */ y70 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 f;

    public /* synthetic */ ko(y70 y70Var, int i10, long j3, long j10, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = y70Var;
        this.b = i10;
        this.c = j3;
        this.d = j10;
        this.e = znVar;
        this.f = f6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.a.u();
        int intValue = num.intValue();
        int i10 = this.b;
        long j3 = this.c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f;
        if (intValue != 0) {
            NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
            if (xc.a(n2Var)) {
                xc.z(n2Var, 5, num.intValue(), f6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
            NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
        }
        if (xc.a(n2Var)) {
            xc.z(n2Var, 4, num.intValue(), f6Var).j();
        }
    }
}
