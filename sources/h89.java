// default package

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class h89 extends r4 {
    public final RecyclerView d;
    public final g89 e = new g89(this);

    public h89(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override // r4
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || e()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            x46 x46Var = (x46) recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = x46Var.b;
            oh2 oh2Var = recyclerView2.b;
            if (accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView2.canScrollVertically(1) && !x46Var.b.canScrollVertically(-1) && !x46Var.b.canScrollHorizontally(-1) && !x46Var.b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                j79 j79Var = x46Var.b.x;
                if (j79Var != null) {
                    accessibilityEvent.setItemCount(j79Var.b());
                }
            }
            if (x46Var.r() > 0) {
                accessibilityEvent.setFromIndex(x46Var.K0());
                accessibilityEvent.setToIndex(x46Var.M0());
            }
        }
    }

    @Override // r4
    public final void c(View view, v4 v4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, v4Var.a);
        if (e()) {
            return;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.getLayoutManager() != null) {
            q79 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            layoutManager.R(recyclerView2.b, recyclerView2.v0, v4Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[ADDED_TO_REGION] */
    @Override // r4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(View view, int i, Bundle bundle) {
        int E;
        int C;
        if (super.d(view, i, bundle)) {
            return true;
        }
        if (!e()) {
            RecyclerView recyclerView = this.d;
            if (recyclerView.getLayoutManager() != null) {
                q79 layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.b;
                oh2 oh2Var = recyclerView2.b;
                if (i == 4096) {
                    E = recyclerView2.canScrollVertically(1) ? (layoutManager.n - layoutManager.E()) - layoutManager.B() : 0;
                    if (layoutManager.b.canScrollHorizontally(1)) {
                        C = (layoutManager.m - layoutManager.C()) - layoutManager.D();
                        if (E == 0) {
                        }
                        layoutManager.b.y0(C, E, null);
                        return true;
                    }
                    C = 0;
                    if (E == 0) {
                    }
                    layoutManager.b.y0(C, E, null);
                    return true;
                }
                if (i != 8192) {
                    E = 0;
                    C = 0;
                } else {
                    E = recyclerView2.canScrollVertically(-1) ? -((layoutManager.n - layoutManager.E()) - layoutManager.B()) : 0;
                    if (layoutManager.b.canScrollHorizontally(-1)) {
                        C = -((layoutManager.m - layoutManager.C()) - layoutManager.D());
                    }
                    C = 0;
                }
                if (E == 0 || C != 0) {
                    layoutManager.b.y0(C, E, null);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean e() {
        RecyclerView recyclerView = this.d;
        return recyclerView.b0() || recyclerView.v0.g;
    }
}
