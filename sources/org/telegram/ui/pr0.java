package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr0 b;

    public /* synthetic */ pr0(yr0 yr0Var, int i7) {
        this.a = i7;
        this.b = yr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yr0 yr0Var = this.b;
                org.telegram.messenger.g0.h3(new pr0(yr0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = yr0Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = yr0Var.L;
                    q1Var2.c6 = null;
                    q1Var2.invalidate();
                }
                tl tlVar = yr0Var.e0;
                if (tlVar != null) {
                    org.telegram.messenger.g0.h3(tlVar);
                    yr0Var.e0 = null;
                    break;
                }
                break;
            case 1:
                this.b.c(false);
                break;
            case 2:
                this.b.c(false);
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }

    public /* synthetic */ pr0(yr0 yr0Var, boolean z9) {
        this.a = 0;
        this.b = yr0Var;
    }
}
