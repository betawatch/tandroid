package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo implements Utilities.Callback {
    public final /* synthetic */ l80 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 f;

    public /* synthetic */ wo(l80 l80Var, int i10, long j10, long j11, org.telegram.ui.wn wnVar, org.telegram.ui.ActionBar.u6 u6Var) {
        this.a = l80Var;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.e = wnVar;
        this.f = u6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.a.u();
        int intValue = num.intValue();
        int i10 = this.b;
        long j10 = this.c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.r2 r2Var = this.e;
        org.telegram.ui.ActionBar.u6 u6Var = this.f;
        if (intValue != 0) {
            NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
            if (wc.a(r2Var)) {
                wc.z(r2Var, 5, num.intValue(), u6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
            NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
        }
        if (wc.a(r2Var)) {
            wc.z(r2Var, 4, num.intValue(), u6Var).j();
        }
    }
}
