package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class po implements Utilities.Callback {
    public final /* synthetic */ w70 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 f;

    public /* synthetic */ po(w70 w70Var, int i10, long j3, long j10, org.telegram.ui.eo eoVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = w70Var;
        this.b = i10;
        this.c = j3;
        this.d = j10;
        this.e = eoVar;
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
        org.telegram.ui.ActionBar.p2 p2Var = this.e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f;
        if (intValue != 0) {
            NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
            if (wc.a(p2Var)) {
                wc.z(p2Var, 5, num.intValue(), f6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
            NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
        }
        if (wc.a(p2Var)) {
            wc.z(p2Var, 4, num.intValue(), f6Var).j();
        }
    }
}
