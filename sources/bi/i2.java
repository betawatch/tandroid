package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class i2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((j2) this.b).f.onAttachedToWindow();
                break;
            case 1:
            case 2:
                break;
            case 3:
                ((yh.k2) this.b).a(view);
                break;
            case 4:
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
            case 5:
                break;
            case 6:
                ((qq) this.b).a();
                break;
            case 7:
                sl0 sl0Var = (sl0) this.b;
                org.telegram.ui.Components.o5 o5Var = sl0Var.t;
                if (o5Var != null) {
                    o5Var.a();
                }
                org.telegram.ui.Components.o5 o5Var2 = sl0Var.u;
                if (o5Var2 != null) {
                    o5Var2.a();
                    break;
                }
                break;
            case 8:
                break;
            case 9:
                ((org.telegram.ui.Components.o5) this.b).a();
                break;
            case 10:
                fg.f fVar = (fg.f) this.b;
                if (view == ((View) fVar.b)) {
                    fVar.T(view.getViewTreeObserver());
                    break;
                }
                break;
            case 11:
                ((yh.e1) this.b).l.a();
                break;
            case 12:
                yh.o3 o3Var = (yh.o3) this.b;
                yh.m3 m3Var = o3Var.N;
                if (m3Var != null) {
                    m3Var.a(o3Var.c);
                    break;
                }
                break;
            case 13:
                yh.r3 r3Var = (yh.r3) this.b;
                yh.p3 p3Var = r3Var.N;
                if (p3Var != null) {
                    p3Var.a(r3Var.c);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((zh.j3) this.b).e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    zh.h3 h3Var = (zh.h3) obj;
                    if (h3Var.c) {
                        h3Var.d.onAttachedToWindow();
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((j2) this.b).f.onDetachedFromWindow();
                break;
            case 1:
                l.f fVar = (l.f) this.b;
                ViewTreeObserver viewTreeObserver = fVar.N;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.N = view.getViewTreeObserver();
                    }
                    fVar.N.removeGlobalOnLayoutListener(fVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                l.d0 d0Var = (l.d0) this.b;
                ViewTreeObserver viewTreeObserver2 = d0Var.E;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.E = view.getViewTreeObserver();
                    }
                    d0Var.E.removeGlobalOnLayoutListener(d0Var.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                ((yh.k2) this.b).o(view);
                break;
            case 4:
                ((org.telegram.ui.Components.ja) this.b).c.clear();
                break;
            case 5:
                qc qcVar = (qc) this.b;
                qcVar.e.removeOnAttachStateChangeListener(this);
                qcVar.c(0L, false);
                break;
            case 6:
                ((qq) this.b).b();
                break;
            case 7:
                sl0 sl0Var = (sl0) this.b;
                org.telegram.ui.Components.o5 o5Var = sl0Var.t;
                if (o5Var != null) {
                    o5Var.b();
                }
                org.telegram.ui.Components.o5 o5Var2 = sl0Var.u;
                if (o5Var2 != null) {
                    o5Var2.a();
                    break;
                }
                break;
            case 8:
                view.removeCallbacks((Runnable) ((co0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            case 9:
                ((org.telegram.ui.Components.o5) this.b).b();
                break;
            case 10:
                fg.f fVar2 = (fg.f) this.b;
                if (view == ((View) fVar2.b)) {
                    fVar2.T(null);
                    break;
                }
                break;
            case 11:
                ((yh.e1) this.b).l.b();
                break;
            case 12:
                yh.o3 o3Var = (yh.o3) this.b;
                yh.m3 m3Var = o3Var.N;
                if (m3Var != null) {
                    m3Var.o(o3Var.c);
                    break;
                }
                break;
            case 13:
                yh.r3 r3Var = (yh.r3) this.b;
                yh.p3 p3Var = r3Var.N;
                if (p3Var != null) {
                    p3Var.o(r3Var.c);
                    break;
                }
                break;
            default:
                ArrayList arrayList = ((zh.j3) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((zh.h3) obj).a();
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
