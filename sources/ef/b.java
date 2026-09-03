package ef;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.messaging.r;
import java.util.ArrayList;
import kh.k3;
import kh.t4;
import kh.u1;
import kh.v4;
import kh.w4;
import kh.y4;
import l.c0;
import l.e;
import lh.p4;
import lh.r4;
import nh.q1;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                r rVar = (r) this.b;
                if (view == ((View) rVar.b)) {
                    rVar.p(view.getViewTreeObserver());
                    break;
                }
                break;
            case 1:
                ((u1) this.b).l.a();
                break;
            case 2:
                v4 v4Var = (v4) this.b;
                t4 t4Var = v4Var.K;
                if (t4Var != null) {
                    t4Var.a(v4Var.c);
                    break;
                }
                break;
            case 3:
                y4 y4Var = (y4) this.b;
                w4 w4Var = y4Var.K;
                if (w4Var != null) {
                    w4Var.a(y4Var.c);
                    break;
                }
                break;
            case 4:
            case 5:
                break;
            case 6:
                ArrayList arrayList = ((r4) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    p4 p4Var = (p4) obj;
                    if (p4Var.c) {
                        p4Var.d.onAttachedToWindow();
                    }
                }
                break;
            case 7:
                ((q1) this.b).f.onAttachedToWindow();
                break;
            case 8:
                ((k3) this.b).a(view);
                break;
            case 9:
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
            case 10:
                break;
            case 11:
                ((oq) this.b).a();
                break;
            case 12:
                zl0 zl0Var = (zl0) this.b;
                j5 j5Var = zl0Var.t;
                if (j5Var != null) {
                    j5Var.a();
                }
                j5 j5Var2 = zl0Var.u;
                if (j5Var2 != null) {
                    j5Var2.a();
                    break;
                }
                break;
            case 13:
                break;
            default:
                ((j5) this.b).a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                r rVar = (r) this.b;
                if (view == ((View) rVar.b)) {
                    rVar.p(null);
                    break;
                }
                break;
            case 1:
                ((u1) this.b).l.b();
                break;
            case 2:
                v4 v4Var = (v4) this.b;
                t4 t4Var = v4Var.K;
                if (t4Var != null) {
                    t4Var.o(v4Var.c);
                    break;
                }
                break;
            case 3:
                y4 y4Var = (y4) this.b;
                w4 w4Var = y4Var.K;
                if (w4Var != null) {
                    w4Var.o(y4Var.c);
                    break;
                }
                break;
            case 4:
                e eVar = (e) this.b;
                ViewTreeObserver viewTreeObserver = eVar.K;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        eVar.K = view.getViewTreeObserver();
                    }
                    eVar.K.removeGlobalOnLayoutListener(eVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 5:
                c0 c0Var = (c0) this.b;
                ViewTreeObserver viewTreeObserver2 = c0Var.B;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c0Var.B = view.getViewTreeObserver();
                    }
                    c0Var.B.removeGlobalOnLayoutListener(c0Var.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                ArrayList arrayList = ((r4) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((p4) obj).a();
                }
                break;
            case 7:
                ((q1) this.b).f.onDetachedFromWindow();
                break;
            case 8:
                ((k3) this.b).o(view);
                break;
            case 9:
                ((ba) this.b).c.clear();
                break;
            case 10:
                ic icVar = (ic) this.b;
                icVar.e.removeOnAttachStateChangeListener(this);
                icVar.c(0L, false);
                break;
            case 11:
                ((oq) this.b).b();
                break;
            case 12:
                zl0 zl0Var = (zl0) this.b;
                j5 j5Var = zl0Var.t;
                if (j5Var != null) {
                    j5Var.b();
                }
                j5 j5Var2 = zl0Var.u;
                if (j5Var2 != null) {
                    j5Var2.a();
                    break;
                }
                break;
            case 13:
                view.removeCallbacks((Runnable) ((go0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ((j5) this.b).b();
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
