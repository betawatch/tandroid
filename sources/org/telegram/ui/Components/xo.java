package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo implements Utilities.Callback {
    public final /* synthetic */ l80 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 f;

    public /* synthetic */ xo(l80 l80Var, int i10, long j10, long j11, org.telegram.ui.fo foVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = l80Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.e = foVar;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.e;
        org.telegram.ui.ActionBar.c6 c6Var = this.f;
        if (intValue != 0) {
            NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
            if (zc.a(m2Var)) {
                zc.z(m2Var, 5, num.intValue(), c6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
            NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
        }
        if (zc.a(m2Var)) {
            zc.z(m2Var, 4, num.intValue(), c6Var).j();
        }
    }
}
