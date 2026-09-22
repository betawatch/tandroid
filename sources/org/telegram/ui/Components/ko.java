package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements Utilities.Callback {
    public final /* synthetic */ n70 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 f;

    public /* synthetic */ ko(n70 n70Var, int i10, long j3, long j10, org.telegram.ui.bo boVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = n70Var;
        this.b = i10;
        this.c = j3;
        this.d = j10;
        this.e = boVar;
        this.f = e6Var;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        if (intValue != 0) {
            NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
            if (vc.a(n2Var)) {
                vc.z(n2Var, 5, num.intValue(), e6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
            NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
        }
        if (vc.a(n2Var)) {
            vc.z(n2Var, 4, num.intValue(), e6Var).j();
        }
    }
}
