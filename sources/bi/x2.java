package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.ym0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((q2) this.b).run();
                break;
            case 1:
                ((e3) this.b).l.a();
                break;
            case 2:
                v7 v7Var = (v7) this.b;
                t7 t7Var = v7Var.b0;
                if (t7Var != null) {
                    t7Var.a(v7Var.c);
                    break;
                }
                break;
            case 3:
                y7 y7Var = (y7) this.b;
                w7 w7Var = y7Var.b0;
                if (w7Var != null) {
                    w7Var.a(y7Var.c);
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
                        m5Var.d.Q();
                    }
                }
                break;
            case 5:
                ((fi.l1) this.b).f.Q();
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
                ((n6) this.b).a(view);
                break;
            case 11:
                ba baVar = (ba) this.b;
                ArrayList arrayList2 = baVar.c;
                arrayList2.clear();
                for (View view2 = baVar.b; view2 != null; view2 = (View) view2.getParent()) {
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
                org.telegram.ui.Components.m5 m5Var2 = ok0Var.t;
                if (m5Var2 != null) {
                    m5Var2.a();
                }
                org.telegram.ui.Components.m5 m5Var3 = ok0Var.u;
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
                ((e3) this.b).l.b();
                break;
            case 2:
                v7 v7Var = (v7) this.b;
                t7 t7Var = v7Var.b0;
                if (t7Var != null) {
                    t7Var.n(v7Var.c);
                    break;
                }
                break;
            case 3:
                y7 y7Var = (y7) this.b;
                w7 w7Var = y7Var.b0;
                if (w7Var != null) {
                    w7Var.n(y7Var.c);
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
                ((fi.l1) this.b).f.S();
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
                ((n6) this.b).n(view);
                break;
            case 11:
                ((ba) this.b).c.clear();
                break;
            case 12:
                fc fcVar = (fc) this.b;
                fcVar.e.removeOnAttachStateChangeListener(this);
                fcVar.c(0L, false);
                break;
            case 13:
                ((a5.h) this.b).b();
                break;
            case 14:
                ok0 ok0Var = (ok0) this.b;
                org.telegram.ui.Components.m5 m5Var = ok0Var.t;
                if (m5Var != null) {
                    m5Var.b();
                }
                org.telegram.ui.Components.m5 m5Var2 = ok0Var.u;
                if (m5Var2 != null) {
                    m5Var2.a();
                    break;
                }
                break;
            default:
                view.removeCallbacks((Runnable) ((ym0) this.b).a.remove(view));
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
