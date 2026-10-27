package org.telegram.ui.Cells;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa b;

    public /* synthetic */ m9(fa faVar, int i10) {
        this.a = i10;
        this.b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int m10;
        int i10;
        int p10;
        switch (this.a) {
            case 0:
                fa faVar = this.b;
                if (faVar.N && faVar.E != null) {
                    if (faVar.Z && faVar.W == null) {
                        m10 = AndroidUtilities.dp(8.0f);
                    } else if (faVar.W != null) {
                        m10 = faVar.m() >> 1;
                    }
                    if (!faVar.Z && !faVar.j0) {
                        if (faVar.O) {
                            if (faVar.W.getBottom() - m10 < faVar.F.getMeasuredHeight() - faVar.o()) {
                                i10 = faVar.W.getBottom() - faVar.F.getMeasuredHeight();
                                p10 = faVar.o();
                                m10 = i10 + p10;
                            }
                        } else if (faVar.W.getTop() + m10 > faVar.p()) {
                            i10 = -faVar.W.getTop();
                            p10 = faVar.p();
                            m10 = i10 + p10;
                        }
                    }
                    nm0 nm0Var = faVar.E;
                    if (nm0Var != null) {
                        if (!faVar.O) {
                            m10 = -m10;
                        }
                        nm0Var.scrollBy(0, m10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    break;
                }
                break;
            default:
                fa faVar2 = this.b;
                org.telegram.ui.ActionBar.m4 m4Var = faVar2.Y;
                if (m4Var != null && !faVar2.P) {
                    m4Var.hide(Long.MAX_VALUE);
                    AndroidUtilities.runOnUIThread(faVar2.n0, 1000L);
                    break;
                }
                break;
        }
    }
}
