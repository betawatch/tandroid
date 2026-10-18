package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo implements Utilities.Callback {
    public final /* synthetic */ i80 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 f;

    public /* synthetic */ uo(i80 i80Var, int i10, long j10, long j11, org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = i80Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.e = snVar;
        this.f = d6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.a.u();
        int intValue = num.intValue();
        int i10 = this.b;
        long j10 = this.c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.e;
        org.telegram.ui.ActionBar.d6 d6Var = this.f;
        if (intValue != 0) {
            NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
            if (xc.a(n2Var)) {
                xc.z(n2Var, 5, num.intValue(), d6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
            NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
        }
        if (xc.a(n2Var)) {
            xc.z(n2Var, 4, num.intValue(), d6Var).j();
        }
    }
}
