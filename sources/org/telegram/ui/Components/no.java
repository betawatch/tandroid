package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements Utilities.Callback {
    public final /* synthetic */ b80 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 f;

    public /* synthetic */ no(b80 b80Var, int i10, long j3, long j10, org.telegram.ui.yn ynVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = b80Var;
        this.b = i10;
        this.c = j3;
        this.d = j10;
        this.e = ynVar;
        this.f = d6Var;
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f;
        if (intValue != 0) {
            NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
            if (yc.a(n2Var)) {
                yc.z(n2Var, 5, num.intValue(), d6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
            NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
        }
        if (yc.a(n2Var)) {
            yc.z(n2Var, 4, num.intValue(), d6Var).j();
        }
    }
}
