package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.wb;
import ph.a3;
import ph.c3;
import ph.d2;
import ph.d3;
import ph.f3;
import ph.z0;
import rh.l3;
import rh.n3;
import th.c1;
import z7.fe;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                ji.f fVar = (ji.f) this.b;
                if (view == ((View) fVar.c)) {
                    fVar.w(view.getViewTreeObserver());
                    break;
                }
                break;
            case 3:
                ((n6) this.b).c(null);
                break;
            case 4:
                ((d2) this.b).a(view);
                break;
            case 5:
                s9 s9Var = (s9) this.b;
                ArrayList arrayList = s9Var.c;
                arrayList.clear();
                for (View view2 = s9Var.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
                break;
            case 6:
                break;
            case 7:
                ((gq) this.b).a();
                break;
            case 8:
                dl0 dl0Var = (dl0) this.b;
                d5 d5Var = dl0Var.t;
                if (d5Var != null) {
                    d5Var.a();
                }
                d5 d5Var2 = dl0Var.u;
                if (d5Var2 != null) {
                    d5Var2.a();
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                ((org.telegram.messenger.voip.g) this.b).run();
                break;
            case 11:
                ((z0) this.b).l.a();
                break;
            case 12:
                c3 c3Var = (c3) this.b;
                a3 a3Var = c3Var.a0;
                if (a3Var != null) {
                    a3Var.a(c3Var.c);
                    break;
                }
                break;
            case 13:
                f3 f3Var = (f3) this.b;
                d3 d3Var = f3Var.a0;
                if (d3Var != null) {
                    d3Var.a(f3Var.c);
                    break;
                }
                break;
            case 14:
                ArrayList arrayList2 = ((n3) this.b).e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    l3 l3Var = (l3) obj;
                    if (l3Var.c) {
                        l3Var.d.P();
                    }
                }
                break;
            case 15:
                ((c1) this.b).f.P();
                break;
            default:
                fe feVar = (fe) this.b;
                zg.h hVar = (zg.h) feVar.b;
                ViewTreeObserver viewTreeObserver = ((View) feVar.a).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) feVar.c;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) feVar.c).removeOnPreDrawListener(hVar);
                        }
                        feVar.c = null;
                    }
                    feVar.c = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(hVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                ViewTreeObserver viewTreeObserver = fVar.N;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.N = view.getViewTreeObserver();
                    }
                    fVar.N.removeGlobalOnLayoutListener(fVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                d0 d0Var = (d0) this.b;
                ViewTreeObserver viewTreeObserver2 = d0Var.E;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.E = view.getViewTreeObserver();
                    }
                    d0Var.E.removeGlobalOnLayoutListener(d0Var.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                ji.f fVar2 = (ji.f) this.b;
                if (view == ((View) fVar2.c)) {
                    fVar2.w(null);
                    break;
                }
                break;
            case 3:
                ((n6) this.b).b(null);
                break;
            case 4:
                ((d2) this.b).n(view);
                break;
            case 5:
                ((s9) this.b).c.clear();
                break;
            case 6:
                wb wbVar = (wb) this.b;
                wbVar.e.removeOnAttachStateChangeListener(this);
                wbVar.c(0L, false);
                break;
            case 7:
                ((gq) this.b).b();
                break;
            case 8:
                dl0 dl0Var = (dl0) this.b;
                d5 d5Var = dl0Var.t;
                if (d5Var != null) {
                    d5Var.b();
                }
                d5 d5Var2 = dl0Var.u;
                if (d5Var2 != null) {
                    d5Var2.a();
                    break;
                }
                break;
            case 9:
                view.removeCallbacks((Runnable) ((ln0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            case 10:
                break;
            case 11:
                ((z0) this.b).l.b();
                break;
            case 12:
                c3 c3Var = (c3) this.b;
                a3 a3Var = c3Var.a0;
                if (a3Var != null) {
                    a3Var.n(c3Var.c);
                    break;
                }
                break;
            case 13:
                f3 f3Var = (f3) this.b;
                d3 d3Var = f3Var.a0;
                if (d3Var != null) {
                    d3Var.n(f3Var.c);
                    break;
                }
                break;
            case 14:
                ArrayList arrayList = ((n3) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((l3) obj).a();
                }
                break;
            case 15:
                ((c1) this.b).f.R();
                break;
            default:
                fe feVar = (fe) this.b;
                ViewTreeObserver viewTreeObserver3 = (ViewTreeObserver) feVar.c;
                if (viewTreeObserver3 != null) {
                    if (viewTreeObserver3.isAlive()) {
                        ((ViewTreeObserver) feVar.c).removeOnPreDrawListener((zg.h) feVar.b);
                    }
                    feVar.c = null;
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
