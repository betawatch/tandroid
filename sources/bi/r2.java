package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.wm0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((k2) this.b).run();
                break;
            case 1:
                ((y2) this.b).l.a();
                break;
            case 2:
                p7 p7Var = (p7) this.b;
                n7 n7Var = p7Var.b0;
                if (n7Var != null) {
                    n7Var.a(p7Var.c);
                    break;
                }
                break;
            case 3:
                s7 s7Var = (s7) this.b;
                q7 q7Var = s7Var.b0;
                if (q7Var != null) {
                    q7Var.a(s7Var.c);
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
                ((org.telegram.ui.Components.v6) this.b).c(null);
                break;
            case 10:
                ((h6) this.b).a(view);
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
                mk0 mk0Var = (mk0) this.b;
                org.telegram.ui.Components.m5 m5Var2 = mk0Var.t;
                if (m5Var2 != null) {
                    m5Var2.a();
                }
                org.telegram.ui.Components.m5 m5Var3 = mk0Var.u;
                if (m5Var3 != null) {
                    m5Var3.a();
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
                ((y2) this.b).l.b();
                break;
            case 2:
                p7 p7Var = (p7) this.b;
                n7 n7Var = p7Var.b0;
                if (n7Var != null) {
                    n7Var.n(p7Var.c);
                    break;
                }
                break;
            case 3:
                s7 s7Var = (s7) this.b;
                q7 q7Var = s7Var.b0;
                if (q7Var != null) {
                    q7Var.n(s7Var.c);
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
                ((org.telegram.ui.Components.v6) this.b).b(null);
                break;
            case 10:
                ((h6) this.b).n(view);
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
                mk0 mk0Var = (mk0) this.b;
                org.telegram.ui.Components.m5 m5Var = mk0Var.t;
                if (m5Var != null) {
                    m5Var.b();
                }
                org.telegram.ui.Components.m5 m5Var2 = mk0Var.u;
                if (m5Var2 != null) {
                    m5Var2.a();
                    break;
                }
                break;
            default:
                view.removeCallbacks((Runnable) ((wm0) this.b).a.remove(view));
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
