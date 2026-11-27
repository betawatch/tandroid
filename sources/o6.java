// default package

import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class o6 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ e b;
    public final /* synthetic */ e c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ActionBarLayout e;

    public o6(ActionBarLayout actionBarLayout, boolean z, e eVar, e eVar2, boolean z2) {
        this.e = actionBarLayout;
        this.a = z;
        this.b = eVar;
        this.c = eVar2;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarLayout actionBarLayout = this.e;
        if (actionBarLayout.d == this) {
            actionBarLayout.d = null;
            if (this.a) {
                e eVar = this.b;
                if (eVar != null) {
                    eVar.onTransitionAnimationStart(false, false);
                }
                this.c.onTransitionAnimationStart(true, false);
                actionBarLayout.g0(true, true, this.d);
                return;
            }
            Runnable runnable = actionBarLayout.e;
            if (runnable != null) {
                hl.r(runnable);
                boolean z = actionBarLayout.Y0;
                Runnable runnable2 = actionBarLayout.e;
                if (z) {
                    runnable2.run();
                } else {
                    hl.d3(runnable2, 200L);
                }
            }
        }
    }
}
