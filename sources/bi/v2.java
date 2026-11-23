package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.zm0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class v2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((o2) this.b).run();
                break;
            case 1:
                ((c3) this.b).l.a();
                break;
            case 2:
                s7 s7Var = (s7) this.b;
                q7 q7Var = s7Var.b0;
                if (q7Var != null) {
                    q7Var.a(s7Var.c);
                    break;
                }
                break;
            case 3:
                v7 v7Var = (v7) this.b;
                t7 t7Var = v7Var.b0;
                if (t7Var != null) {
                    t7Var.a(v7Var.c);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList = ((di.o5) this.b).e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    di.m5 m5Var = (di.m5) obj;
                    if (m5Var.c) {
                        m5Var.d.P();
                    }
                }
                break;
            case 5:
                ((fi.l1) this.b).f.P();
                break;
            case 6:
                h6.m mVar = (h6.m) this.b;
                jh.k kVar = (jh.k) mVar.c;
                ViewTreeObserver viewTreeObserver = ((View) mVar.b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) mVar.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) mVar.d).removeOnPreDrawListener(kVar);
                        }
                        mVar.d = null;
                    }
                    mVar.d = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(kVar);
                        break;
                    }
                }
                break;
            case 9:
                ((org.telegram.ui.Components.w6) this.b).c(null);
                break;
            case 10:
                ((k6) this.b).a(view);
                break;
            case 11:
                ca caVar = (ca) this.b;
                ArrayList arrayList2 = caVar.c;
                arrayList2.clear();
                for (View view2 = caVar.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
                break;
            case 13:
                ((a5.h) this.b).a();
                break;
            case 14:
                ok0 ok0Var = (ok0) this.b;
                org.telegram.ui.Components.n5 n5Var = ok0Var.t;
                if (n5Var != null) {
                    n5Var.a();
                }
                org.telegram.ui.Components.n5 n5Var2 = ok0Var.u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((c3) this.b).l.b();
                break;
            case 2:
                s7 s7Var = (s7) this.b;
                q7 q7Var = s7Var.b0;
                if (q7Var != null) {
                    q7Var.n(s7Var.c);
                    break;
                }
                break;
            case 3:
                v7 v7Var = (v7) this.b;
                t7 t7Var = v7Var.b0;
                if (t7Var != null) {
                    t7Var.n(v7Var.c);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList = ((di.o5) this.b).e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((di.m5) obj).a();
                }
                break;
            case 5:
                ((fi.l1) this.b).f.R();
                break;
            case 6:
                h6.m mVar = (h6.m) this.b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) mVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) mVar.d).removeOnPreDrawListener((jh.k) mVar.c);
                    }
                    mVar.d = null;
                    break;
                }
                break;
            case 7:
                l.e eVar = (l.e) this.b;
                ViewTreeObserver viewTreeObserver2 = eVar.O;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.O = view.getViewTreeObserver();
                    }
                    eVar.O.removeGlobalOnLayoutListener(eVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 8:
                l.c0 c0Var = (l.c0) this.b;
                ViewTreeObserver viewTreeObserver3 = c0Var.F;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.F = view.getViewTreeObserver();
                    }
                    c0Var.F.removeGlobalOnLayoutListener(c0Var.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 9:
                ((org.telegram.ui.Components.w6) this.b).b(null);
                break;
            case 10:
                ((k6) this.b).n(view);
                break;
            case 11:
                ((ca) this.b).c.clear();
                break;
            case 12:
                gc gcVar = (gc) this.b;
                gcVar.e.removeOnAttachStateChangeListener(this);
                gcVar.c(0L, false);
                break;
            case 13:
                ((a5.h) this.b).b();
                break;
            case 14:
                ok0 ok0Var = (ok0) this.b;
                org.telegram.ui.Components.n5 n5Var = ok0Var.t;
                if (n5Var != null) {
                    n5Var.b();
                }
                org.telegram.ui.Components.n5 n5Var2 = ok0Var.u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    break;
                }
                break;
            default:
                view.removeCallbacks((Runnable) ((zm0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
