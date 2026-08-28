package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zn implements Utilities.Callback {
    public final /* synthetic */ x60 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 f;

    public /* synthetic */ zn(x60 x60Var, int i9, long j10, long j11, org.telegram.ui.qn qnVar, org.telegram.ui.ActionBar.b6 b6Var) {
        this.a = x60Var;
        this.b = i9;
        this.c = j10;
        this.d = j11;
        this.e = qnVar;
        this.f = b6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.a.u();
        int intValue = num.intValue();
        int i9 = this.b;
        long j10 = this.c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = this.e;
        org.telegram.ui.ActionBar.b6 b6Var = this.f;
        if (intValue != 0) {
            NotificationsController.getInstance(i9).muteUntil(j10, j11, num.intValue());
            if (oc.a(o2Var)) {
                oc.z(o2Var, 5, num.intValue(), b6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i9).isDialogMuted(j10, j11)) {
            NotificationsController.getInstance(i9).muteDialog(j10, j11, false);
        }
        if (oc.a(o2Var)) {
            oc.z(o2Var, 4, num.intValue(), b6Var).j();
        }
    }
}
