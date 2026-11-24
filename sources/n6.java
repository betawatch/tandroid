// default package

import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n6 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d b;
    public final /* synthetic */ d c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ActionBarLayout e;

    public n6(ActionBarLayout actionBarLayout, boolean z, d dVar, d dVar2, boolean z2) {
        this.e = actionBarLayout;
        this.a = z;
        this.b = dVar;
        this.c = dVar2;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.a) {
                d dVar = this.b;
                if (dVar != null) {
                    dVar.onTransitionAnimationStart(false, false);
                }
                this.c.onTransitionAnimationStart(true, false);
                actionBarLayout.g0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.e;
            if (runnable != null) {
                gl.r(runnable);
                boolean z = actionBarLayout.Y0;
                Runnable runnable2 = actionBarLayout.e;
                if (z) {
                    runnable2.run();
                } else {
                    gl.d3(runnable2, 200L);
                }
            }
        }
    }
}
