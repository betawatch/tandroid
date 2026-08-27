package bf;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.messaging.t;
import gh.b5;
import gh.d5;
import gh.e5;
import gh.g5;
import gh.r3;
import gh.y1;
import hh.r4;
import hh.t4;
import java.util.ArrayList;
import jh.p1;
import l.d0;
import l.f;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.z9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                t tVar = (t) this.b;
                if (view == ((View) tVar.c)) {
                    tVar.P(view.getViewTreeObserver());
                    break;
                }
                break;
            case 1:
                ((y1) this.b).l.a();
                break;
            case 2:
                d5 d5Var = (d5) this.b;
                b5 b5Var = d5Var.J;
                if (b5Var != null) {
                    b5Var.a(d5Var.c);
                    break;
                }
                break;
            case 3:
                g5 g5Var = (g5) this.b;
                e5 e5Var = g5Var.J;
                if (e5Var != null) {
                    e5Var.a(g5Var.c);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList = ((t4) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    r4 r4Var = (r4) obj;
                    if (r4Var.c) {
                        r4Var.d.onAttachedToWindow();
                    }
                }
                break;
            case 5:
                ((p1) this.b).f.onAttachedToWindow();
                break;
            case 6:
            case 7:
                break;
            case 8:
                ((r3) this.b).a(view);
                break;
            case 9:
                z9 z9Var = (z9) this.b;
                ArrayList arrayList2 = z9Var.c;
                arrayList2.clear();
                for (View view2 = z9Var.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
                break;
            case 10:
                break;
            case 11:
                ((fq) this.b).a();
                break;
            case 12:
                gl0 gl0Var = (gl0) this.b;
                i5 i5Var = gl0Var.t;
                if (i5Var != null) {
                    i5Var.a();
                }
                i5 i5Var2 = gl0Var.u;
                if (i5Var2 != null) {
                    i5Var2.a();
                    break;
                }
                break;
            case 13:
                break;
            default:
                ((i5) this.b).a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                t tVar = (t) this.b;
                if (view == ((View) tVar.c)) {
                    tVar.P(null);
                    break;
                }
                break;
            case 1:
                ((y1) this.b).l.b();
                break;
            case 2:
                d5 d5Var = (d5) this.b;
                b5 b5Var = d5Var.J;
                if (b5Var != null) {
                    b5Var.o(d5Var.c);
                    break;
                }
                break;
            case 3:
                g5 g5Var = (g5) this.b;
                e5 e5Var = g5Var.J;
                if (e5Var != null) {
                    e5Var.o(g5Var.c);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList = ((t4) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((r4) obj).a();
                }
                break;
            case 5:
                ((p1) this.b).f.onDetachedFromWindow();
                break;
            case 6:
                f fVar = (f) this.b;
                ViewTreeObserver viewTreeObserver = fVar.J;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.J = view.getViewTreeObserver();
                    }
                    fVar.J.removeGlobalOnLayoutListener(fVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 7:
                d0 d0Var = (d0) this.b;
                ViewTreeObserver viewTreeObserver2 = d0Var.A;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.A = view.getViewTreeObserver();
                    }
                    d0Var.A.removeGlobalOnLayoutListener(d0Var.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 8:
                ((r3) this.b).o(view);
                break;
            case 9:
                ((z9) this.b).c.clear();
                break;
            case 10:
                ec ecVar = (ec) this.b;
                ecVar.e.removeOnAttachStateChangeListener(this);
                ecVar.c(0L, false);
                break;
            case 11:
                ((fq) this.b).b();
                break;
            case 12:
                gl0 gl0Var = (gl0) this.b;
                i5 i5Var = gl0Var.t;
                if (i5Var != null) {
                    i5Var.b();
                }
                i5 i5Var2 = gl0Var.u;
                if (i5Var2 != null) {
                    i5Var2.a();
                    break;
                }
                break;
            case 13:
                view.removeCallbacks((Runnable) ((nn0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ((i5) this.b).b();
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
