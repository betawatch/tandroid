package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f2(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((z1) this.b).run();
                break;
            case 1:
                ((m2) this.b).l.a();
                break;
            case 2:
                r5 r5Var = (r5) this.b;
                p5 p5Var = r5Var.b0;
                if (p5Var != null) {
                    p5Var.a(r5Var.c);
                    break;
                }
                break;
            case 3:
                u5 u5Var = (u5) this.b;
                s5 s5Var = u5Var.b0;
                if (s5Var != null) {
                    s5Var.a(u5Var.c);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList = ((ci.u5) this.b).e;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ci.s5 s5Var2 = (ci.s5) obj;
                    if (s5Var2.c) {
                        s5Var2.d.P();
                    }
                }
                break;
            case 5:
                ((ei.u1) this.b).f.P();
                break;
            case 6:
                k4.j jVar = (k4.j) this.b;
                kh.k kVar = (kh.k) jVar.b;
                ViewTreeObserver viewTreeObserver = ((View) jVar.a).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) jVar.c;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) jVar.c).removeOnPreDrawListener(kVar);
                        }
                        jVar.c = null;
                    }
                    jVar.c = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(kVar);
                        break;
                    }
                }
                break;
            case 7:
            case 8:
                break;
            case 9:
                ((org.telegram.ui.Components.p6) this.b).c(null);
                break;
            case 10:
                ((m4) this.b).a(view);
                break;
            case 11:
                x9 x9Var = (x9) this.b;
                ArrayList arrayList2 = x9Var.c;
                arrayList2.clear();
                for (View view2 = x9Var.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
                break;
            case 12:
                break;
            case 13:
                ((yp) this.b).a();
                break;
            case 14:
                dk0 dk0Var = (dk0) this.b;
                org.telegram.ui.Components.e5 e5Var = dk0Var.t;
                if (e5Var != null) {
                    e5Var.a();
                }
                org.telegram.ui.Components.e5 e5Var2 = dk0Var.u;
                if (e5Var2 != null) {
                    e5Var2.a();
                    break;
                }
                break;
            case 15:
                break;
            default:
                ui.f fVar = (ui.f) this.b;
                if (view == ((View) fVar.c)) {
                    fVar.M(view.getViewTreeObserver());
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
                ((m2) this.b).l.b();
                break;
            case 2:
                r5 r5Var = (r5) this.b;
                p5 p5Var = r5Var.b0;
                if (p5Var != null) {
                    p5Var.n(r5Var.c);
                    break;
                }
                break;
            case 3:
                u5 u5Var = (u5) this.b;
                s5 s5Var = u5Var.b0;
                if (s5Var != null) {
                    s5Var.n(u5Var.c);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList = ((ci.u5) this.b).e;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ci.s5) obj).a();
                }
                break;
            case 5:
                ((ei.u1) this.b).f.R();
                break;
            case 6:
                k4.j jVar = (k4.j) this.b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) jVar.c;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) jVar.c).removeOnPreDrawListener((kh.k) jVar.b);
                    }
                    jVar.c = null;
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
                ((m4) this.b).n(view);
                break;
            case 11:
                ((x9) this.b).c.clear();
                break;
            case 12:
                ac acVar = (ac) this.b;
                acVar.e.removeOnAttachStateChangeListener(this);
                acVar.c(0L, false);
                break;
            case 13:
                ((yp) this.b).b();
                break;
            case 14:
                dk0 dk0Var = (dk0) this.b;
                org.telegram.ui.Components.e5 e5Var = dk0Var.t;
                if (e5Var != null) {
                    e5Var.b();
                }
                org.telegram.ui.Components.e5 e5Var2 = dk0Var.u;
                if (e5Var2 != null) {
                    e5Var2.a();
                    break;
                }
                break;
            case 15:
                view.removeCallbacks((Runnable) ((nm0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ui.f fVar = (ui.f) this.b;
                if (view == ((View) fVar.c)) {
                    fVar.M(null);
                    break;
                }
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
