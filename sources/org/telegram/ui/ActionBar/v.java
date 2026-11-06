package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class v implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ f2 b;
    public final /* synthetic */ f2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ActionBarLayout e;

    public v(ActionBarLayout actionBarLayout, boolean z9, f2 f2Var, f2 f2Var2, boolean z10) {
        this.e = actionBarLayout;
        this.a = z9;
        this.b = f2Var;
        this.c = f2Var2;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d != this) {
            return;
        }
        actionBarLayout.d = null;
        if (this.a) {
            f2 f2Var = this.b;
            if (f2Var != null) {
                f2Var.onTransitionAnimationStart(false, false);
            }
            this.c.onTransitionAnimationStart(true, false);
            actionBarLayout.h0(true, true, this.d);
            return;
        }
        Runnable runnable = actionBarLayout.e;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            if (actionBarLayout.X0) {
                actionBarLayout.e.run();
            } else {
                org.telegram.messenger.g0.i3(actionBarLayout.e, 200L);
            }
        }
    }
}
