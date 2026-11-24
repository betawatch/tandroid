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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fn4 extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn4(Context context, AttributeSet attributeSet, go4 go4Var) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hy8.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        bn4 C = go4Var.C(id);
        if (classAttribute != null && C == null) {
            if (id == -1) {
                sc8.j(tb4.y("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            ao4 H = go4Var.H();
            context.getClassLoader();
            bn4 a = H.a(classAttribute);
            a.getClass();
            a.O = id;
            a.P = id;
            a.Q = string;
            a.K = go4Var;
            dn4 dn4Var = go4Var.w;
            a.L = dn4Var;
            a.V = true;
            if ((dn4Var == null ? null : dn4Var.a) != null) {
                a.V = true;
            }
            id0 id0Var = new id0(go4Var);
            id0Var.o = true;
            a.W = this;
            a.G = true;
            id0Var.f(getId(), a, string);
            if (id0Var.g) {
                sc8.j("This transaction is already being added to the back stack");
                throw null;
            }
            go4 go4Var2 = id0Var.q;
            if (go4Var2.w != null && !go4Var2.J) {
                go4Var2.z(true);
                id0 id0Var2 = go4Var2.h;
                if (id0Var2 != null) {
                    id0Var2.r = false;
                    id0Var2.d();
                    if (go4.K(3)) {
                        Log.d("FragmentManager", "Reversing mTransitioningOp " + go4Var2.h + " as part of execSingleAction for action " + id0Var);
                    }
                    go4Var2.h.e(false, false);
                    go4Var2.h.a(go4Var2.L, go4Var2.M);
                    ArrayList arrayList = go4Var2.h.a;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        bn4 bn4Var = ((wo4) obj).b;
                        if (bn4Var != null) {
                            bn4Var.y = false;
                        }
                    }
                    go4Var2.h = null;
                }
                id0Var.a(go4Var2.L, go4Var2.M);
                go4Var2.b = true;
                try {
                    go4Var2.W(go4Var2.L, go4Var2.M);
                    go4Var2.d();
                    go4Var2.h0();
                    go4Var2.v();
                    ((HashMap) go4Var2.c.b).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    go4Var2.d();
                    throw th;
                }
            }
        }
        ArrayList q = go4Var.c.q();
        int size2 = q.size();
        while (i < size2) {
            Object obj2 = q.get(i);
            i++;
            bn4 bn4Var2 = ((to4) obj2).c;
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
        if ((tag instanceof bn4 ? (bn4) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        vxc h;
        windowInsets.getClass();
        vxc h2 = vxc.h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.getClass();
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            h = vxc.h(null, onApplyWindowInsets);
        } else {
            h = jdc.h(this, h2);
        }
        if (!h.a.n()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                jdc.b(getChildAt(i), h);
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

    public final <F extends bn4> F getFragment() {
        bn4 bn4Var;
        en4 en4Var;
        go4 u;
        View view = this;
        while (true) {
            if (view == null) {
                bn4Var = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            bn4Var = tag instanceof bn4 ? (bn4) tag : null;
            if (bn4Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (bn4Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    en4Var = null;
                    break;
                }
                if (context instanceof en4) {
                    en4Var = (en4) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (en4Var == null) {
                w44.d(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            u = en4Var.u();
        } else {
            if (!bn4Var.t()) {
                w44.f("The Fragment ", bn4Var, " that owns View ", this, " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                return null;
            }
            u = bn4Var.l();
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
