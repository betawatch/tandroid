// default package

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class kp4 extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp4(Context context, AttributeSet attributeSet, kq4 kq4Var) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u19.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        gp4 C = kq4Var.C(id);
        if (classAttribute != null && C == null) {
            if (id == -1) {
                grb.i(qd4.y("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            eq4 H = kq4Var.H();
            context.getClassLoader();
            gp4 a = H.a(classAttribute);
            a.getClass();
            a.O = id;
            a.P = id;
            a.Q = string;
            a.K = kq4Var;
            ip4 ip4Var = kq4Var.w;
            a.L = ip4Var;
            a.V = true;
            if ((ip4Var == null ? null : ip4Var.a) != null) {
                a.V = true;
            }
            kd0 kd0Var = new kd0(kq4Var);
            kd0Var.o = true;
            a.W = this;
            a.G = true;
            kd0Var.f(getId(), a, string);
            if (kd0Var.g) {
                grb.i("This transaction is already being added to the back stack");
                throw null;
            }
            kq4 kq4Var2 = kd0Var.q;
            if (kq4Var2.w != null && !kq4Var2.J) {
                kq4Var2.z(true);
                kd0 kd0Var2 = kq4Var2.h;
                if (kd0Var2 != null) {
                    kd0Var2.r = false;
                    kd0Var2.d();
                    if (kq4.K(3)) {
                        Log.d("FragmentManager", "Reversing mTransitioningOp " + kq4Var2.h + " as part of execSingleAction for action " + kd0Var);
                    }
                    kq4Var2.h.e(false, false);
                    kq4Var2.h.a(kq4Var2.L, kq4Var2.M);
                    ArrayList arrayList = kq4Var2.h.a;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        gp4 gp4Var = ((ar4) obj).b;
                        if (gp4Var != null) {
                            gp4Var.y = false;
                        }
                    }
                    kq4Var2.h = null;
                }
                kd0Var.a(kq4Var2.L, kq4Var2.M);
                kq4Var2.b = true;
                try {
                    kq4Var2.W(kq4Var2.L, kq4Var2.M);
                    kq4Var2.d();
                    kq4Var2.h0();
                    kq4Var2.v();
                    ((HashMap) kq4Var2.c.b).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    kq4Var2.d();
                    throw th;
                }
            }
        }
        ArrayList r = kq4Var.c.r();
        int size2 = r.size();
        while (i < size2) {
            Object obj2 = r.get(i);
            i++;
            gp4 gp4Var2 = ((xq4) obj2).c;
            getId();
        }
    }

    public final void a(View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof gp4 ? (gp4) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        l2d i;
        windowInsets.getClass();
        l2d h = l2d.h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.getClass();
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            i = l2d.h(null, onApplyWindowInsets);
        } else {
            i = ihc.i(this, h);
        }
        if (!i.a.n()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ihc.b(getChildAt(i2), i);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.d) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.d) {
            ArrayList arrayList = this.a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends gp4> F getFragment() {
        gp4 gp4Var;
        jp4 jp4Var;
        kq4 u;
        View view = this;
        while (true) {
            if (view == null) {
                gp4Var = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            gp4Var = tag instanceof gp4 ? (gp4) tag : null;
            if (gp4Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (gp4Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    jp4Var = null;
                    break;
                }
                if (context instanceof jp4) {
                    jp4Var = (jp4) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (jp4Var == null) {
                xi4.j(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            u = jp4Var.u();
        } else {
            if (!gp4Var.t()) {
                xi4.n("The Fragment ", gp4Var, " that owns View ", this, " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                return null;
            }
            u = gp4Var.l();
        }
        return (F) u.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }
}
