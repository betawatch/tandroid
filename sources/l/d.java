package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xq;
import wh.e1;
import wh.k2;
import wh.m3;
import wh.o3;
import wh.p3;
import wh.r3;
import xh.h3;
import xh.j3;
import zh.d1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                ((k2) this.b).a(view);
                break;
            case 3:
                ia iaVar = (ia) this.b;
                ArrayList arrayList = iaVar.c;
                arrayList.clear();
                for (View view2 = iaVar.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
                break;
            case 4:
                break;
            case 5:
                ((xq) this.b).a();
                break;
            case 6:
                cm0 cm0Var = (cm0) this.b;
                n5 n5Var = cm0Var.t;
                if (n5Var != null) {
                    n5Var.a();
                }
                n5 n5Var2 = cm0Var.u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    break;
                }
                break;
            case 7:
                break;
            case 8:
                ((n5) this.b).a();
                break;
            case 9:
                ki.f fVar = (ki.f) this.b;
                if (view == ((View) fVar.b)) {
                    fVar.O(view.getViewTreeObserver());
                    break;
                }
                break;
            case 10:
                ((e1) this.b).l.a();
                break;
            case 11:
                o3 o3Var = (o3) this.b;
                m3 m3Var = o3Var.N;
                if (m3Var != null) {
                    m3Var.a(o3Var.c);
                    break;
                }
                break;
            case 12:
                r3 r3Var = (r3) this.b;
                p3 p3Var = r3Var.N;
                if (p3Var != null) {
                    p3Var.a(r3Var.c);
                    break;
                }
                break;
            case 13:
                ArrayList arrayList2 = ((j3) this.b).e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    h3 h3Var = (h3) obj;
                    if (h3Var.c) {
                        h3Var.d.onAttachedToWindow();
                    }
                }
                break;
            default:
                ((d1) this.b).f.onAttachedToWindow();
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
                ((k2) this.b).o(view);
                break;
            case 3:
                ((ia) this.b).c.clear();
                break;
            case 4:
                pc pcVar = (pc) this.b;
                pcVar.e.removeOnAttachStateChangeListener(this);
                pcVar.c(0L, false);
                break;
            case 5:
                ((xq) this.b).b();
                break;
            case 6:
                cm0 cm0Var = (cm0) this.b;
                n5 n5Var = cm0Var.t;
                if (n5Var != null) {
                    n5Var.b();
                }
                n5 n5Var2 = cm0Var.u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    break;
                }
                break;
            case 7:
                view.removeCallbacks((Runnable) ((lo0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            case 8:
                ((n5) this.b).b();
                break;
            case 9:
                ki.f fVar2 = (ki.f) this.b;
                if (view == ((View) fVar2.b)) {
                    fVar2.O(null);
                    break;
                }
                break;
            case 10:
                ((e1) this.b).l.b();
                break;
            case 11:
                o3 o3Var = (o3) this.b;
                m3 m3Var = o3Var.N;
                if (m3Var != null) {
                    m3Var.o(o3Var.c);
                    break;
                }
                break;
            case 12:
                r3 r3Var = (r3) this.b;
                p3 p3Var = r3Var.N;
                if (p3Var != null) {
                    p3Var.o(r3Var.c);
                    break;
                }
                break;
            case 13:
                ArrayList arrayList = ((j3) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((h3) obj).a();
                }
                break;
            default:
                ((d1) this.b).f.onDetachedFromWindow();
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
