package ff;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.messaging.s;
import java.util.ArrayList;
import l.d0;
import l.f;
import lh.l3;
import lh.u1;
import lh.u4;
import lh.w4;
import lh.x4;
import lh.z4;
import mh.p4;
import mh.r4;
import oh.q1;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.rq;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                if (view == ((View) sVar.b)) {
                    sVar.p(view.getViewTreeObserver());
                    break;
                }
                break;
            case 1:
            case 2:
                break;
            case 3:
                ((u1) this.b).l.a();
                break;
            case 4:
                w4 w4Var = (w4) this.b;
                u4 u4Var = w4Var.K;
                if (u4Var != null) {
                    u4Var.a(w4Var.c);
                    break;
                }
                break;
            case 5:
                z4 z4Var = (z4) this.b;
                x4 x4Var = z4Var.K;
                if (x4Var != null) {
                    x4Var.a(z4Var.c);
                    break;
                }
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
                ((l3) this.b).a(view);
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
                ((rq) this.b).a();
                break;
            case 12:
                am0 am0Var = (am0) this.b;
                j5 j5Var = am0Var.t;
                if (j5Var != null) {
                    j5Var.a();
                }
                j5 j5Var2 = am0Var.u;
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
                s sVar = (s) this.b;
                if (view == ((View) sVar.b)) {
                    sVar.p(null);
                    break;
                }
                break;
            case 1:
                f fVar = (f) this.b;
                ViewTreeObserver viewTreeObserver = fVar.K;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.K = view.getViewTreeObserver();
                    }
                    fVar.K.removeGlobalOnLayoutListener(fVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                d0 d0Var = (d0) this.b;
                ViewTreeObserver viewTreeObserver2 = d0Var.B;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.B = view.getViewTreeObserver();
                    }
                    d0Var.B.removeGlobalOnLayoutListener(d0Var.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                ((u1) this.b).l.b();
                break;
            case 4:
                w4 w4Var = (w4) this.b;
                u4 u4Var = w4Var.K;
                if (u4Var != null) {
                    u4Var.o(w4Var.c);
                    break;
                }
                break;
            case 5:
                z4 z4Var = (z4) this.b;
                x4 x4Var = z4Var.K;
                if (x4Var != null) {
                    x4Var.o(z4Var.c);
                    break;
                }
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
                ((l3) this.b).o(view);
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
                ((rq) this.b).b();
                break;
            case 12:
                am0 am0Var = (am0) this.b;
                j5 j5Var = am0Var.t;
                if (j5Var != null) {
                    j5Var.b();
                }
                j5 j5Var2 = am0Var.u;
                if (j5Var2 != null) {
                    j5Var2.a();
                    break;
                }
                break;
            case 13:
                view.removeCallbacks((Runnable) ((ho0) this.b).a.remove(view));
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
