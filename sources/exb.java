// default package

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class exb implements z27 {
    public f27 a;
    public j27 b;
    public final /* synthetic */ Toolbar c;

    public exb(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // z27
    public final boolean b(zdb zdbVar) {
        return false;
    }

    @Override // z27
    public final boolean c() {
        return false;
    }

    @Override // z27
    public final boolean e(j27 j27Var) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.r;
        if (callback instanceof ml2) {
            ((ml2) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.r);
        toolbar.removeView(toolbar.n);
        toolbar.r = null;
        ArrayList arrayList = toolbar.V;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        j27Var.C = false;
        j27Var.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // z27
    public final boolean i(j27 j27Var) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.n);
            }
            toolbar.addView(toolbar.n);
        }
        View actionView = j27Var.getActionView();
        toolbar.r = actionView;
        this.b = j27Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.r);
            }
            fxb h = Toolbar.h();
            h.a = (toolbar.E & jn7.w1) | 8388611;
            h.b = (byte) 2;
            toolbar.r.setLayoutParams(h);
            toolbar.addView(toolbar.r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((fxb) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.V.add(childAt);
            }
        }
        toolbar.requestLayout();
        j27Var.C = true;
        j27Var.n.p(false);
        KeyEvent.Callback callback = toolbar.r;
        if (callback instanceof ml2) {
            ((ml2) callback).onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // z27
    public final void j() {
        if (this.b != null) {
            f27 f27Var = this.a;
            if (f27Var != null) {
                int size = f27Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            e(this.b);
        }
    }

    @Override // z27
    public final void k(Context context, f27 f27Var) {
        j27 j27Var;
        f27 f27Var2 = this.a;
        if (f27Var2 != null && (j27Var = this.b) != null) {
            f27Var2.d(j27Var);
        }
        this.a = f27Var;
    }

    @Override // z27
    public final void f(f27 f27Var, boolean z) {
    }
}
