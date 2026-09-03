package f2;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class n1 extends r0.b {
    public final RecyclerView d;
    public final m1 e = new m1(this);

    public n1(RecyclerView recyclerView) {
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
            i0 i0Var = (i0) recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = i0Var.b;
            af.h hVar = recyclerView2.b;
            if (accessibilityEvent != null) {
                boolean z4 = true;
                if (!recyclerView2.canScrollVertically(1) && !i0Var.b.canScrollVertically(-1) && !i0Var.b.canScrollHorizontally(-1) && !i0Var.b.canScrollHorizontally(1)) {
                    z4 = false;
                }
                accessibilityEvent.setScrollable(z4);
                o0 o0Var = i0Var.b.w;
                if (o0Var != null) {
                    accessibilityEvent.setItemCount(o0Var.h());
                }
            }
            if (i0Var.r() > 0) {
                accessibilityEvent.setFromIndex(i0Var.L0());
                accessibilityEvent.setToIndex(i0Var.N0());
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
        v0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.S(recyclerView2.b, recyclerView2.q0, dVar);
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
            v0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            af.h hVar = recyclerView2.b;
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
