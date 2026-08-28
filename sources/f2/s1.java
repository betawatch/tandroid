package f2;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s1 extends r0.b {
    public final RecyclerView d;
    public final r1 e = new r1(this);

    public s1(RecyclerView recyclerView) {
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
            m0 m0Var = (m0) recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = m0Var.b;
            g1 g1Var = recyclerView2.b;
            if (accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView2.canScrollVertically(1) && !m0Var.b.canScrollVertically(-1) && !m0Var.b.canScrollHorizontally(-1) && !m0Var.b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                r0 r0Var = m0Var.b.w;
                if (r0Var != null) {
                    accessibilityEvent.setItemCount(r0Var.h());
                }
            }
            if (m0Var.r() > 0) {
                accessibilityEvent.setFromIndex(m0Var.L0());
                accessibilityEvent.setToIndex(m0Var.N0());
            }
        }
    }

    @Override // r0.b
    public final void c(View view, s0.d dVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.Z() || recyclerView.getLayoutManager() == null) {
            return;
        }
        z0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.S(recyclerView2.b, recyclerView2.p0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // r0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(View view, int i9, Bundle bundle) {
        int F;
        int D;
        if (super.d(view, i9, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            z0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            g1 g1Var = recyclerView2.b;
            if (i9 == 4096) {
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
            if (i9 != 8192) {
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
