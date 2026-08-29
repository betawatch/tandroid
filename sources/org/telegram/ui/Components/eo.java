package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eo implements Utilities.Callback {
    public final /* synthetic */ j70 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 f;

    public /* synthetic */ eo(j70 j70Var, int i10, long j10, long j11, org.telegram.ui.tn tnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = j70Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.e = tnVar;
        this.f = c6Var;
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f;
        if (intValue != 0) {
            NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
            if (tc.a(o2Var)) {
                tc.z(o2Var, 5, num.intValue(), c6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
            NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
        }
        if (tc.a(o2Var)) {
            tc.z(o2Var, 4, num.intValue(), c6Var).j();
        }
    }
}
