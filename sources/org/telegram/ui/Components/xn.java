package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xn implements Utilities.Callback {
    public final /* synthetic */ b70 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 f;

    public /* synthetic */ xn(b70 b70Var, int i10, long j10, long j11, org.telegram.ui.rn rnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = b70Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.e = rnVar;
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
        org.telegram.ui.ActionBar.n2 n2Var = this.e;
        org.telegram.ui.ActionBar.c6 c6Var = this.f;
        if (intValue != 0) {
            NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
            if (mc.a(n2Var)) {
                mc.z(n2Var, 5, num.intValue(), c6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
            NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
        }
        if (mc.a(n2Var)) {
            mc.z(n2Var, 4, num.intValue(), c6Var).j();
        }
    }
}
