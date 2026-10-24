package org.telegram.ui.Cells;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class i9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ i9(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int m10;
        int i10;
        int p5;
        switch (this.a) {
            case 0:
                ba baVar = this.b;
                if (baVar.N && baVar.E != null) {
                    if (baVar.Z && baVar.W == null) {
                        m10 = AndroidUtilities.dp(8.0f);
                    } else if (baVar.W != null) {
                        m10 = baVar.m() >> 1;
                    }
                    if (!baVar.Z && !baVar.j0) {
                        if (baVar.O) {
                            if (baVar.W.getBottom() - m10 < baVar.F.getMeasuredHeight() - baVar.o()) {
                                i10 = baVar.W.getBottom() - baVar.F.getMeasuredHeight();
                                p5 = baVar.o();
                                m10 = i10 + p5;
                            }
                        } else if (baVar.W.getTop() + m10 > baVar.p()) {
                            i10 = -baVar.W.getTop();
                            p5 = baVar.p();
                            m10 = i10 + p5;
                        }
                    }
                    mm0 mm0Var = baVar.E;
                    if (mm0Var != null) {
                        if (!baVar.O) {
                            m10 = -m10;
                        }
                        mm0Var.scrollBy(0, m10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    break;
                }
                break;
            default:
                ba baVar2 = this.b;
                org.telegram.ui.ActionBar.k4 k4Var = baVar2.Y;
                if (k4Var != null && !baVar2.P) {
                    k4Var.hide(Long.MAX_VALUE);
                    AndroidUtilities.runOnUIThread(baVar2.n0, 1000L);
                    break;
                }
                break;
        }
    }
}
