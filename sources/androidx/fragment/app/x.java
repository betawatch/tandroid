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
import r0.k1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int i7 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, v1.a.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        s C = j0Var.C(id2);
        if (classAttribute != null && C == null) {
            if (id2 == -1) {
                throw new IllegalStateException(a8.p0.p("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            c0 H = j0Var.H();
            context.getClassLoader();
            s a10 = H.a(classAttribute);
            kotlin.jvm.internal.j.d(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.O = id2;
            a10.P = id2;
            a10.Q = string;
            a10.K = j0Var;
            u uVar = j0Var.w;
            a10.L = uVar;
            a10.V = true;
            if ((uVar == null ? null : uVar.a) != null) {
                a10.V = true;
            }
            a aVar = new a(j0Var);
            aVar.o = true;
            a10.W = this;
            a10.G = true;
            aVar.f(getId(), a10, string);
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
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        s sVar = ((q0) obj).b;
                        if (sVar != null) {
                            sVar.y = false;
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
                    ((HashMap) j0Var2.c.b).values().removeAll(Collections.singleton(null));
                } catch (Throwable th2) {
                    j0Var2.d();
                    throw th2;
                }
            }
        }
        ArrayList p10 = j0Var.c.p();
        int size2 = p10.size();
        while (i7 < size2) {
            Object obj2 = p10.get(i7);
            i7++;
            int i11 = ((p0) obj2).c.P;
            getId();
        }
    }

    public final void a(View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i7, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.j.e(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof s ? (s) tag : null) != null) {
            super.addView(child, i7, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        k1 g10;
        kotlin.jvm.internal.j.e(insets, "insets");
        k1 h = k1.h(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            kotlin.jvm.internal.j.b(onApplyWindowInsetsListener);
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.j.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            g10 = k1.h(null, onApplyWindowInsets);
        } else {
            g10 = r0.i0.g(this, h);
        }
        kotlin.jvm.internal.j.d(g10, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!g10.a.n()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                r0.i0.b(getChildAt(i7), g10);
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
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j3) {
        kotlin.jvm.internal.j.e(canvas, "canvas");
        kotlin.jvm.internal.j.e(child, "child");
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
        j0 s5;
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
            s5 = vVar.s();
        } else {
            if (!sVar.t()) {
                throw new IllegalStateException("The Fragment " + sVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            s5 = sVar.l();
        }
        return (F) s5.C(getId());
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
    public final void removeViewAt(int i7) {
        View view = getChildAt(i7);
        kotlin.jvm.internal.j.d(view, "view");
        a(view);
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.j.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i7, int i10) {
        int i11 = i7 + i10;
        for (int i12 = i7; i12 < i11; i12++) {
            View view = getChildAt(i12);
            kotlin.jvm.internal.j.d(view, "view");
            a(view);
        }
        super.removeViews(i7, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i7, int i10) {
        int i11 = i7 + i10;
        for (int i12 = i7; i12 < i11; i12++) {
            View view = getChildAt(i12);
            kotlin.jvm.internal.j.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i7, i10);
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
        kotlin.jvm.internal.j.e(view, "view");
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }
}
