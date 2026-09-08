package ih;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final int[] f = new int[2];
    public static final RectF h = new RectF();
    public final View a;
    public ViewTreeObserver b;
    public boolean c;
    public final WeakHashMap d = new WeakHashMap();
    public final RectF e = new RectF();

    public k(View view) {
        this.a = view;
        view.addOnAttachStateChangeListener(this);
        a();
    }

    public static boolean b(View view, ViewGroup viewGroup, PointF pointF) {
        RectF rectF = h;
        boolean c10 = c(view, viewGroup, rectF);
        if (c10) {
            pointF.x = rectF.left;
            pointF.y = rectF.top;
        }
        return c10;
    }

    public static boolean c(View view, View view2, RectF rectF) {
        float f7 = 0.0f;
        float f10 = 0.0f;
        View view3 = view;
        while (view3 != null && view3 != view2) {
            float x10 = view3.getX() + f7;
            float y3 = view3.getY() + f10;
            Object parent = view3.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view3 = (View) parent;
            f10 = y3 - view3.getScrollY();
            f7 = x10 - view3.getScrollX();
        }
        if (view3 != view2) {
            return false;
        }
        rectF.set(f7, f10, view.getWidth() + f7, view.getHeight() + f10);
        return true;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View view = this.a;
        if (view.isAttachedToWindow() && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            this.b = viewTreeObserver;
            if (this.c) {
                return;
            }
            viewTreeObserver.addOnPreDrawListener(this);
            this.c = true;
        }
    }

    public final void d(View view, ViewGroup viewGroup, i iVar, boolean z10) {
        j jVar = new j(viewGroup, iVar);
        jVar.d = z10;
        WeakHashMap weakHashMap = this.d;
        List list = (List) weakHashMap.get(view);
        if (list == null) {
            list = new ArrayList(1);
            weakHashMap.put(view, list);
        }
        list.add(jVar);
        RectF rectF = this.e;
        c(view, viewGroup, rectF);
        jVar.c.set(rectF);
        if (!this.c) {
            a();
        }
        if (z10) {
            view.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        ViewTreeObserver viewTreeObserver2 = this.b;
        if (viewTreeObserver != viewTreeObserver2) {
            if (this.c && viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                this.b.removeOnPreDrawListener(this);
            }
            this.c = false;
            this.b = null;
            a();
        }
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                View view = (View) entry.getKey();
                List<j> list = (List) entry.getValue();
                if (view != null && list != null) {
                    for (j jVar : list) {
                        boolean z10 = jVar.d;
                        RectF rectF = jVar.c;
                        ViewGroup viewGroup = jVar.a;
                        RectF rectF2 = this.e;
                        if (z10) {
                            int[] iArr = f;
                            view.getLocationOnScreen(iArr);
                            rectF2.set(iArr[0], iArr[1], view.getWidth() + r10, view.getHeight() + iArr[1]);
                            viewGroup.getLocationOnScreen(iArr);
                            rectF2.offset(-iArr[0], -iArr[1]);
                        } else if (!c(view, viewGroup, rectF2)) {
                        }
                        if (!jVar.e || !rectF2.equals(rectF)) {
                            rectF.set(rectF2);
                            jVar.e = true;
                            try {
                                jVar.b.k(new RectF(rectF2), view);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        if (view == this.a) {
            if (this.c && (viewTreeObserver = this.b) != null && viewTreeObserver.isAlive()) {
                this.b.removeOnPreDrawListener(this);
            }
            this.c = false;
            this.b = null;
        }
    }
}
