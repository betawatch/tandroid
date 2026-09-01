package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class io implements Utilities.Callback {
    public final /* synthetic */ q70 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 f;

    public /* synthetic */ io(q70 q70Var, int i10, long j10, long j11, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = q70Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.e = xnVar;
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
        org.telegram.ui.ActionBar.p2 p2Var = this.e;
        org.telegram.ui.ActionBar.g6 g6Var = this.f;
        if (intValue != 0) {
            NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
            if (qc.a(p2Var)) {
                qc.z(p2Var, 5, num.intValue(), g6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
            NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
        }
        if (qc.a(p2Var)) {
            qc.z(p2Var, 4, num.intValue(), g6Var).j();
        }
    }
}
