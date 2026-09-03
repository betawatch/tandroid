package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo implements Utilities.Callback {
    public final /* synthetic */ p70 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 f;

    public /* synthetic */ fo(p70 p70Var, int i10, long j10, long j11, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = p70Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.e = znVar;
        this.f = f6Var;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f;
        if (intValue != 0) {
            NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
            if (qc.a(p2Var)) {
                qc.z(p2Var, 5, num.intValue(), f6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
            NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
        }
        if (qc.a(p2Var)) {
            qc.z(p2Var, 4, num.intValue(), f6Var).j();
        }
    }
}
