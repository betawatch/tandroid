package df;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.messaging.s;
import ih.l3;
import ih.u4;
import ih.v1;
import ih.w4;
import ih.x4;
import ih.z4;
import java.util.ArrayList;
import jh.q4;
import jh.s4;
import l.c0;
import l.e;
import lh.p1;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.xn0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                s sVar = (s) this.b;
                if (view == ((View) sVar.c)) {
                    sVar.P(view.getViewTreeObserver());
                    break;
                }
                break;
            case 1:
                ((v1) this.b).l.a();
                break;
            case 2:
                w4 w4Var = (w4) this.b;
                u4 u4Var = w4Var.J;
                if (u4Var != null) {
                    u4Var.a(w4Var.c);
                    break;
                }
                break;
            case 3:
                z4 z4Var = (z4) this.b;
                x4 x4Var = z4Var.J;
                if (x4Var != null) {
                    x4Var.a(z4Var.c);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList = ((s4) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    q4 q4Var = (q4) obj;
                    if (q4Var.c) {
                        q4Var.d.onAttachedToWindow();
                    }
                }
                break;
            case 5:
            case 6:
                break;
            case 7:
                ((p1) this.b).f.onAttachedToWindow();
                break;
            case 8:
                ((l3) this.b).a(view);
                break;
            case 9:
                ga gaVar = (ga) this.b;
                ArrayList arrayList2 = gaVar.c;
                arrayList2.clear();
                for (View view2 = gaVar.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
                break;
            case 10:
                break;
            case 11:
                ((lq) this.b).a();
                break;
            case 12:
                ql0 ql0Var = (ql0) this.b;
                n5 n5Var = ql0Var.t;
                if (n5Var != null) {
                    n5Var.a();
                }
                n5 n5Var2 = ql0Var.u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    break;
                }
                break;
            case 13:
                break;
            default:
                ((n5) this.b).a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                s sVar = (s) this.b;
                if (view == ((View) sVar.c)) {
                    sVar.P(null);
                    break;
                }
                break;
            case 1:
                ((v1) this.b).l.b();
                break;
            case 2:
                w4 w4Var = (w4) this.b;
                u4 u4Var = w4Var.J;
                if (u4Var != null) {
                    u4Var.o(w4Var.c);
                    break;
                }
                break;
            case 3:
                z4 z4Var = (z4) this.b;
                x4 x4Var = z4Var.J;
                if (x4Var != null) {
                    x4Var.o(z4Var.c);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList = ((s4) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((q4) obj).a();
                }
                break;
            case 5:
                e eVar = (e) this.b;
                ViewTreeObserver viewTreeObserver = eVar.J;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        eVar.J = view.getViewTreeObserver();
                    }
                    eVar.J.removeGlobalOnLayoutListener(eVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                c0 c0Var = (c0) this.b;
                ViewTreeObserver viewTreeObserver2 = c0Var.A;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c0Var.A = view.getViewTreeObserver();
                    }
                    c0Var.A.removeGlobalOnLayoutListener(c0Var.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 7:
                ((p1) this.b).f.onDetachedFromWindow();
                break;
            case 8:
                ((l3) this.b).o(view);
                break;
            case 9:
                ((ga) this.b).c.clear();
                break;
            case 10:
                mc mcVar = (mc) this.b;
                mcVar.e.removeOnAttachStateChangeListener(this);
                mcVar.c(0L, false);
                break;
            case 11:
                ((lq) this.b).b();
                break;
            case 12:
                ql0 ql0Var = (ql0) this.b;
                n5 n5Var = ql0Var.t;
                if (n5Var != null) {
                    n5Var.b();
                }
                n5 n5Var2 = ql0Var.u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    break;
                }
                break;
            case 13:
                view.removeCallbacks((Runnable) ((xn0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ((n5) this.b).b();
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
