package f2;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p1 extends r0.b {
    public final RecyclerView d;
    public final o1 e = new o1(this);

    public p1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override // r0.b
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.Z()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            j0 j0Var = (j0) recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = j0Var.b;
            d1 d1Var = recyclerView2.b;
            if (accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView2.canScrollVertically(1) && !j0Var.b.canScrollVertically(-1) && !j0Var.b.canScrollHorizontally(-1) && !j0Var.b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                p0 p0Var = j0Var.b.w;
                if (p0Var != null) {
                    accessibilityEvent.setItemCount(p0Var.h());
                }
            }
            if (j0Var.r() > 0) {
                accessibilityEvent.setFromIndex(j0Var.L0());
                accessibilityEvent.setToIndex(j0Var.N0());
            }
        }
    }

    @Override // r0.b
    public final void c(View view, s0.c cVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, cVar.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.Z() || recyclerView.getLayoutManager() == null) {
            return;
        }
        w0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.S(recyclerView2.b, recyclerView2.p0, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // r0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(View view, int i10, Bundle bundle) {
        int F;
        int D;
        if (super.d(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            w0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            d1 d1Var = recyclerView2.b;
            if (i10 == 4096) {
                F = recyclerView2.canScrollVertically(1) ? (layoutManager.n - layoutManager.F()) - layoutManager.C() : 0;
                if (layoutManager.b.canScrollHorizontally(1)) {
                    D = (layoutManager.m - layoutManager.D()) - layoutManager.E();
                    if (F == 0) {
                    }
                    layoutManager.b.v0(D, F, null);
                    return true;
                }
                D = 0;
                if (F == 0) {
                }
                layoutManager.b.v0(D, F, null);
                return true;
            }
            if (i10 != 8192) {
                D = 0;
                F = 0;
            } else {
                F = recyclerView2.canScrollVertically(-1) ? -((layoutManager.n - layoutManager.F()) - layoutManager.C()) : 0;
                if (layoutManager.b.canScrollHorizontally(-1)) {
                    D = -((layoutManager.m - layoutManager.D()) - layoutManager.E());
                }
                D = 0;
            }
            if (F == 0 || D != 0) {
                layoutManager.b.v0(D, F, null);
                return true;
            }
        }
        return false;
    }
}
