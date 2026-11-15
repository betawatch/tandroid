package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((r1) this.b).run();
                break;
            case 1:
                ((e2) this.b).l.a();
                break;
            case 2:
                j5 j5Var = (j5) this.b;
                h5 h5Var = j5Var.b0;
                if (h5Var != null) {
                    h5Var.a(j5Var.c);
                    break;
                }
                break;
            case 3:
                m5 m5Var = (m5) this.b;
                k5 k5Var = m5Var.b0;
                if (k5Var != null) {
                    k5Var.a(m5Var.c);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList = ((di.l5) this.b).e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    di.j5 j5Var2 = (di.j5) obj;
                    if (j5Var2.c) {
                        j5Var2.d.P();
                    }
                }
                break;
            case 5:
                ((fi.n1) this.b).f.P();
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
                ((org.telegram.ui.Components.p6) this.b).c(null);
                break;
            case 10:
                ((a4) this.b).a(view);
                break;
            case 11:
                u9 u9Var = (u9) this.b;
                ArrayList arrayList2 = u9Var.c;
                arrayList2.clear();
                for (View view2 = u9Var.b; view2 != null; view2 = (View) view2.getParent()) {
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
                ek0 ek0Var = (ek0) this.b;
                org.telegram.ui.Components.e5 e5Var = ek0Var.t;
                if (e5Var != null) {
                    e5Var.a();
                }
                org.telegram.ui.Components.e5 e5Var2 = ek0Var.u;
                if (e5Var2 != null) {
                    e5Var2.a();
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
                ((e2) this.b).l.b();
                break;
            case 2:
                j5 j5Var = (j5) this.b;
                h5 h5Var = j5Var.b0;
                if (h5Var != null) {
                    h5Var.n(j5Var.c);
                    break;
                }
                break;
            case 3:
                m5 m5Var = (m5) this.b;
                k5 k5Var = m5Var.b0;
                if (k5Var != null) {
                    k5Var.n(m5Var.c);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList = ((di.l5) this.b).e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((di.j5) obj).a();
                }
                break;
            case 5:
                ((fi.n1) this.b).f.R();
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
                ((org.telegram.ui.Components.p6) this.b).b(null);
                break;
            case 10:
                ((a4) this.b).n(view);
                break;
            case 11:
                ((u9) this.b).c.clear();
                break;
            case 12:
                xb xbVar = (xb) this.b;
                xbVar.e.removeOnAttachStateChangeListener(this);
                xbVar.c(0L, false);
                break;
            case 13:
                ((a5.h) this.b).b();
                break;
            case 14:
                ek0 ek0Var = (ek0) this.b;
                org.telegram.ui.Components.e5 e5Var = ek0Var.t;
                if (e5Var != null) {
                    e5Var.b();
                }
                org.telegram.ui.Components.e5 e5Var2 = ek0Var.u;
                if (e5Var2 != null) {
                    e5Var2.a();
                    break;
                }
                break;
            default:
                view.removeCallbacks((Runnable) ((om0) this.b).a.remove(view));
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
