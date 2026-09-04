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
import r0.l1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class w extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attrs, i0 i0Var) {
        super(context, attrs);
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(attrs, "attrs");
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
        r C = i0Var.C(id2);
        if (classAttribute != null && C == null) {
            if (id2 == -1) {
                throw new IllegalStateException(a4.a.p("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            b0 H = i0Var.H();
            context.getClassLoader();
            r a2 = H.a(classAttribute);
            kotlin.jvm.internal.i.d(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.N = id2;
            a2.O = id2;
            a2.P = string;
            a2.J = i0Var;
            t tVar = i0Var.w;
            a2.K = tVar;
            a2.U = true;
            if ((tVar == null ? null : tVar.a) != null) {
                a2.U = true;
            }
            a aVar = new a(i0Var);
            aVar.o = true;
            a2.V = this;
            a2.F = true;
            aVar.f(getId(), a2, string);
            if (aVar.g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            i0 i0Var2 = aVar.q;
            if (i0Var2.w != null && !i0Var2.J) {
                i0Var2.z(true);
                a aVar2 = i0Var2.h;
                if (aVar2 != null) {
                    aVar2.r = false;
                    aVar2.d();
                    if (i0.K(3)) {
                        Log.d("FragmentManager", "Reversing mTransitioningOp " + i0Var2.h + " as part of execSingleAction for action " + aVar);
                    }
                    i0Var2.h.e(false, false);
                    i0Var2.h.a(i0Var2.L, i0Var2.M);
                    ArrayList arrayList = i0Var2.h.a;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        r rVar = ((p0) obj).b;
                        if (rVar != null) {
                            rVar.x = false;
                        }
                    }
                    i0Var2.h = null;
                }
                aVar.a(i0Var2.L, i0Var2.M);
                i0Var2.b = true;
                try {
                    i0Var2.W(i0Var2.L, i0Var2.M);
                    i0Var2.d();
                    i0Var2.h0();
                    i0Var2.v();
                    ((HashMap) i0Var2.c.b).values().removeAll(Collections.singleton(null));
                } catch (Throwable th2) {
                    i0Var2.d();
                    throw th2;
                }
            }
        }
        ArrayList q6 = i0Var.c.q();
        int size2 = q6.size();
        while (i10 < size2) {
            Object obj2 = q6.get(i10);
            i10++;
            int i12 = ((o0) obj2).c.O;
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
        kotlin.jvm.internal.i.e(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof r ? (r) tag : null) != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        l1 h;
        kotlin.jvm.internal.i.e(insets, "insets");
        l1 h10 = l1.h(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            kotlin.jvm.internal.i.b(onApplyWindowInsetsListener);
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.i.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            h = l1.h(null, onApplyWindowInsets);
        } else {
            h = r0.i0.h(this, h10);
        }
        kotlin.jvm.internal.i.d(h, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!h.a.n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                r0.i0.b(getChildAt(i10), h);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.i.e(canvas, "canvas");
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
    public final boolean drawChild(Canvas canvas, View child, long j3) {
        kotlin.jvm.internal.i.e(canvas, "canvas");
        kotlin.jvm.internal.i.e(child, "child");
        if (this.d) {
            ArrayList arrayList = this.a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j3);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends r> F getFragment() {
        u uVar;
        r rVar;
        i0 s10;
        View view = this;
        while (true) {
            uVar = null;
            if (view == null) {
                rVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            rVar = tag instanceof r ? (r) tag : null;
            if (rVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (rVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof u) {
                    uVar = (u) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (uVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            s10 = uVar.s();
        } else {
            if (!rVar.t()) {
                throw new IllegalStateException("The Fragment " + rVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            s10 = rVar.l();
        }
        return (F) s10.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.i.e(insets, "insets");
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
                kotlin.jvm.internal.i.d(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View view = getChildAt(i10);
        kotlin.jvm.internal.i.d(view, "view");
        a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.i.d(view, "view");
            a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.i.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.d = z10;
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
        kotlin.jvm.internal.i.e(view, "view");
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }
}
