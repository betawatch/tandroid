package androidx.fragment.app;

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
import r0.m1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class x extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attrs, j0 j0Var) {
        super(context, attrs);
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(attrs, "attrs");
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        String classAttribute = attrs.getClassAttribute();
        int i10 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, s1.a.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        s C = j0Var.C(id2);
        if (classAttribute != null && C == null) {
            if (id2 == -1) {
                throw new IllegalStateException(android.support.v4.media.a.o("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            c0 H = j0Var.H();
            context.getClassLoader();
            s a2 = H.a(classAttribute);
            kotlin.jvm.internal.j.d(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.K = id2;
            a2.L = id2;
            a2.M = string;
            a2.G = j0Var;
            u uVar = j0Var.w;
            a2.H = uVar;
            a2.R = true;
            if ((uVar == null ? null : uVar.a) != null) {
                a2.R = true;
            }
            a aVar = new a(j0Var);
            aVar.o = true;
            a2.S = this;
            a2.C = true;
            aVar.f(getId(), a2, string);
            if (aVar.g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            j0 j0Var2 = aVar.q;
            if (j0Var2.w != null && !j0Var2.J) {
                j0Var2.z(true);
                a aVar2 = j0Var2.h;
                if (aVar2 != null) {
                    aVar2.r = false;
                    aVar2.d();
                    if (j0.K(3)) {
                        Log.d("FragmentManager", "Reversing mTransitioningOp " + j0Var2.h + " as part of execSingleAction for action " + aVar);
                    }
                    j0Var2.h.e(false, false);
                    j0Var2.h.a(j0Var2.L, j0Var2.M);
                    ArrayList arrayList = j0Var2.h.a;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        s sVar = ((q0) obj).b;
                        if (sVar != null) {
                            sVar.x = false;
                        }
                    }
                    j0Var2.h = null;
                }
                aVar.a(j0Var2.L, j0Var2.M);
                j0Var2.b = true;
                try {
                    j0Var2.W(j0Var2.L, j0Var2.M);
                    j0Var2.d();
                    j0Var2.h0();
                    j0Var2.v();
                    ((HashMap) j0Var2.c.c).values().removeAll(Collections.singleton(null));
                } catch (Throwable th2) {
                    j0Var2.d();
                    throw th2;
                }
            }
        }
        ArrayList x10 = j0Var.c.x();
        int size2 = x10.size();
        while (i10 < size2) {
            Object obj2 = x10.get(i10);
            i10++;
            int i12 = ((p0) obj2).c.L;
            getId();
        }
    }

    public final void a(View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i10, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.j.e(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof s ? (s) tag : null) != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        m1 h;
        kotlin.jvm.internal.j.e(insets, "insets");
        m1 h9 = m1.h(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            kotlin.jvm.internal.j.b(onApplyWindowInsetsListener);
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.j.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            h = m1.h(null, onApplyWindowInsets);
        } else {
            h = r0.j0.h(this, h9);
        }
        kotlin.jvm.internal.j.d(h, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!h.a.n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                r0.j0.b(getChildAt(i10), h);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.j.e(canvas, "canvas");
        if (this.d) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j10) {
        kotlin.jvm.internal.j.e(canvas, "canvas");
        kotlin.jvm.internal.j.e(child, "child");
        if (this.d) {
            ArrayList arrayList = this.a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j10);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.j.e(view, "view");
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends s> F getFragment() {
        v vVar;
        s sVar;
        j0 s6;
        View view = this;
        while (true) {
            vVar = null;
            if (view == null) {
                sVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            sVar = tag instanceof s ? (s) tag : null;
            if (sVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (sVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof v) {
                    vVar = (v) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (vVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            s6 = vVar.s();
        } else {
            if (!sVar.t()) {
                throw new IllegalStateException("The Fragment " + sVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            s6 = sVar.l();
        }
        return (F) s6.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.j.e(insets, "insets");
        return insets;
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
                View view = getChildAt(childCount);
                kotlin.jvm.internal.j.d(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.j.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View view = getChildAt(i10);
        kotlin.jvm.internal.j.d(view, "view");
        a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.j.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.j.d(view, "view");
            a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.j.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z4) {
        this.d = z4;
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
        kotlin.jvm.internal.j.e(view, "view");
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }
}
