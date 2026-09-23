package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) this.b;
                ArrayList arrayList = jaVar.c;
                arrayList.clear();
                for (View view2 = jaVar.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
                break;
            case 6:
                break;
            case 7:
                ((sq) this.b).a();
                break;
            case 8:
                tl0 tl0Var = (tl0) this.b;
                org.telegram.ui.Components.o5 o5Var = tl0Var.t;
                if (o5Var != null) {
                    o5Var.a();
                }
                org.telegram.ui.Components.o5 o5Var2 = tl0Var.u;
                if (o5Var2 != null) {
                    o5Var2.a();
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                ((org.telegram.ui.Components.o5) this.b).a();
                break;
            case 11:
                ni.f fVar = (ni.f) this.b;
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
                l.e eVar = (l.e) this.b;
                ViewTreeObserver viewTreeObserver2 = eVar.N;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.N = view.getViewTreeObserver();
                    }
                    eVar.N.removeGlobalOnLayoutListener(eVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                l.c0 c0Var = (l.c0) this.b;
                ViewTreeObserver viewTreeObserver3 = c0Var.E;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.E = view.getViewTreeObserver();
                    }
                    c0Var.E.removeGlobalOnLayoutListener(c0Var.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                ((xh.m2) this.b).o(view);
                break;
            case 5:
                ((org.telegram.ui.Components.ja) this.b).c.clear();
                break;
            case 6:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.b;
                qcVar.e.removeOnAttachStateChangeListener(this);
                qcVar.c(0L, false);
                break;
            case 7:
                ((sq) this.b).b();
                break;
            case 8:
                tl0 tl0Var = (tl0) this.b;
                org.telegram.ui.Components.o5 o5Var = tl0Var.t;
                if (o5Var != null) {
                    o5Var.b();
                }
                org.telegram.ui.Components.o5 o5Var2 = tl0Var.u;
                if (o5Var2 != null) {
                    o5Var2.a();
                    break;
                }
                break;
            case 9:
                view.removeCallbacks((Runnable) ((co0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            case 10:
                ((org.telegram.ui.Components.o5) this.b).b();
                break;
            case 11:
                ni.f fVar = (ni.f) this.b;
                if (view == ((View) fVar.b)) {
                    fVar.Q(null);
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
