package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.rq;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class u2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((v2) this.b).f.onAttachedToWindow();
                break;
            case 1:
                aa.a aVar = (aa.a) this.b;
                hh.k kVar = (hh.k) aVar.c;
                ViewTreeObserver viewTreeObserver = ((View) aVar.b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) aVar.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) aVar.d).removeOnPreDrawListener(kVar);
                        }
                        aVar.d = null;
                    }
                    aVar.d = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(kVar);
                        break;
                    }
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
                ((xh.m2) this.b).a(view);
                break;
            case 5:
                org.telegram.ui.Components.ia iaVar = (org.telegram.ui.Components.ia) this.b;
                ArrayList arrayList = iaVar.c;
                arrayList.clear();
                for (View view2 = iaVar.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
                break;
            case 6:
                break;
            case 7:
                ((rq) this.b).a();
                break;
            case 8:
                fm0 fm0Var = (fm0) this.b;
                org.telegram.ui.Components.n5 n5Var = fm0Var.t;
                if (n5Var != null) {
                    n5Var.a();
                }
                org.telegram.ui.Components.n5 n5Var2 = fm0Var.u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                ((org.telegram.ui.Components.n5) this.b).a();
                break;
            case 11:
                oi.f fVar = (oi.f) this.b;
                if (view == ((View) fVar.b)) {
                    fVar.Q(view.getViewTreeObserver());
                    break;
                }
                break;
            case 12:
                ((xh.f1) this.b).l.a();
                break;
            case 13:
                xh.q3 q3Var = (xh.q3) this.b;
                xh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.a(q3Var.c);
                    break;
                }
                break;
            case 14:
                xh.t3 t3Var = (xh.t3) this.b;
                xh.r3 r3Var = t3Var.N;
                if (r3Var != null) {
                    r3Var.a(t3Var.c);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((yh.k3) this.b).e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    yh.i3 i3Var = (yh.i3) obj;
                    if (i3Var.c) {
                        i3Var.d.onAttachedToWindow();
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((v2) this.b).f.onDetachedFromWindow();
                break;
            case 1:
                aa.a aVar = (aa.a) this.b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) aVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) aVar.d).removeOnPreDrawListener((hh.k) aVar.c);
                    }
                    aVar.d = null;
                    break;
                }
                break;
            case 2:
                l.f fVar = (l.f) this.b;
                ViewTreeObserver viewTreeObserver2 = fVar.N;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        fVar.N = view.getViewTreeObserver();
                    }
                    fVar.N.removeGlobalOnLayoutListener(fVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                l.d0 d0Var = (l.d0) this.b;
                ViewTreeObserver viewTreeObserver3 = d0Var.E;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        d0Var.E = view.getViewTreeObserver();
                    }
                    d0Var.E.removeGlobalOnLayoutListener(d0Var.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                ((xh.m2) this.b).o(view);
                break;
            case 5:
                ((org.telegram.ui.Components.ia) this.b).c.clear();
                break;
            case 6:
                org.telegram.ui.Components.pc pcVar = (org.telegram.ui.Components.pc) this.b;
                pcVar.e.removeOnAttachStateChangeListener(this);
                pcVar.c(0L, false);
                break;
            case 7:
                ((rq) this.b).b();
                break;
            case 8:
                fm0 fm0Var = (fm0) this.b;
                org.telegram.ui.Components.n5 n5Var = fm0Var.t;
                if (n5Var != null) {
                    n5Var.b();
                }
                org.telegram.ui.Components.n5 n5Var2 = fm0Var.u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    break;
                }
                break;
            case 9:
                view.removeCallbacks((Runnable) ((ro0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            case 10:
                ((org.telegram.ui.Components.n5) this.b).b();
                break;
            case 11:
                oi.f fVar2 = (oi.f) this.b;
                if (view == ((View) fVar2.b)) {
                    fVar2.Q(null);
                    break;
                }
                break;
            case 12:
                ((xh.f1) this.b).l.b();
                break;
            case 13:
                xh.q3 q3Var = (xh.q3) this.b;
                xh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.o(q3Var.c);
                    break;
                }
                break;
            case 14:
                xh.t3 t3Var = (xh.t3) this.b;
                xh.r3 r3Var = t3Var.N;
                if (r3Var != null) {
                    r3Var.o(t3Var.c);
                    break;
                }
                break;
            default:
                ArrayList arrayList = ((yh.k3) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yh.i3) obj).a();
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
}
