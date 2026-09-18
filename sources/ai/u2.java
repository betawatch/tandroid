package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                ((xh.l2) this.b).a(view);
                break;
            case 5:
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.b;
                ArrayList arrayList = haVar.c;
                arrayList.clear();
                for (View view2 = haVar.b; view2 != null; view2 = (View) view2.getParent()) {
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
                tl0 tl0Var = (tl0) this.b;
                org.telegram.ui.Components.m5 m5Var = tl0Var.t;
                if (m5Var != null) {
                    m5Var.a();
                }
                org.telegram.ui.Components.m5 m5Var2 = tl0Var.u;
                if (m5Var2 != null) {
                    m5Var2.a();
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                ((org.telegram.ui.Components.m5) this.b).a();
                break;
            case 11:
                ni.f fVar = (ni.f) this.b;
                if (view == ((View) fVar.b)) {
                    fVar.Q(view.getViewTreeObserver());
                    break;
                }
                break;
            case 12:
                ((xh.e1) this.b).l.a();
                break;
            case 13:
                xh.p3 p3Var = (xh.p3) this.b;
                xh.n3 n3Var = p3Var.N;
                if (n3Var != null) {
                    n3Var.a(p3Var.c);
                    break;
                }
                break;
            case 14:
                xh.s3 s3Var = (xh.s3) this.b;
                xh.q3 q3Var = s3Var.N;
                if (q3Var != null) {
                    q3Var.a(s3Var.c);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((yh.m3) this.b).e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    yh.k3 k3Var = (yh.k3) obj;
                    if (k3Var.c) {
                        k3Var.d.onAttachedToWindow();
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
                ((xh.l2) this.b).o(view);
                break;
            case 5:
                ((org.telegram.ui.Components.ha) this.b).c.clear();
                break;
            case 6:
                org.telegram.ui.Components.oc ocVar = (org.telegram.ui.Components.oc) this.b;
                ocVar.e.removeOnAttachStateChangeListener(this);
                ocVar.c(0L, false);
                break;
            case 7:
                ((rq) this.b).b();
                break;
            case 8:
                tl0 tl0Var = (tl0) this.b;
                org.telegram.ui.Components.m5 m5Var = tl0Var.t;
                if (m5Var != null) {
                    m5Var.b();
                }
                org.telegram.ui.Components.m5 m5Var2 = tl0Var.u;
                if (m5Var2 != null) {
                    m5Var2.a();
                    break;
                }
                break;
            case 9:
                view.removeCallbacks((Runnable) ((do0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            case 10:
                ((org.telegram.ui.Components.m5) this.b).b();
                break;
            case 11:
                ni.f fVar = (ni.f) this.b;
                if (view == ((View) fVar.b)) {
                    fVar.Q(null);
                    break;
                }
                break;
            case 12:
                ((xh.e1) this.b).l.b();
                break;
            case 13:
                xh.p3 p3Var = (xh.p3) this.b;
                xh.n3 n3Var = p3Var.N;
                if (n3Var != null) {
                    n3Var.o(p3Var.c);
                    break;
                }
                break;
            case 14:
                xh.s3 s3Var = (xh.s3) this.b;
                xh.q3 q3Var = s3Var.N;
                if (q3Var != null) {
                    q3Var.o(s3Var.c);
                    break;
                }
                break;
            default:
                ArrayList arrayList = ((yh.m3) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yh.k3) obj).a();
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
