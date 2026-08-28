package af;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.messaging.t;
import fh.b2;
import fh.i5;
import fh.k5;
import fh.l5;
import fh.n5;
import fh.w3;
import gh.t4;
import gh.v4;
import ih.r1;
import java.util.ArrayList;
import l.c0;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.mn0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i9) {
        this.a = i9;
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
                ((b2) this.b).l.a();
                break;
            case 2:
                k5 k5Var = (k5) this.b;
                i5 i5Var = k5Var.J;
                if (i5Var != null) {
                    i5Var.a(k5Var.c);
                    break;
                }
                break;
            case 3:
                n5 n5Var = (n5) this.b;
                l5 l5Var = n5Var.J;
                if (l5Var != null) {
                    l5Var.a(n5Var.c);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList = ((v4) this.b).e;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    t4 t4Var = (t4) obj;
                    if (t4Var.c) {
                        t4Var.d.onAttachedToWindow();
                    }
                }
                break;
            case 5:
                ((r1) this.b).f.onAttachedToWindow();
                break;
            case 6:
            case 7:
                break;
            case 8:
                ((w3) this.b).a(view);
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
                ((hq) this.b).a();
                break;
            case 12:
                dl0 dl0Var = (dl0) this.b;
                org.telegram.ui.Components.i5 i5Var2 = dl0Var.t;
                if (i5Var2 != null) {
                    i5Var2.a();
                }
                org.telegram.ui.Components.i5 i5Var3 = dl0Var.u;
                if (i5Var3 != null) {
                    i5Var3.a();
                    break;
                }
                break;
            case 13:
                break;
            default:
                ((org.telegram.ui.Components.i5) this.b).a();
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
                ((b2) this.b).l.b();
                break;
            case 2:
                k5 k5Var = (k5) this.b;
                i5 i5Var = k5Var.J;
                if (i5Var != null) {
                    i5Var.o(k5Var.c);
                    break;
                }
                break;
            case 3:
                n5 n5Var = (n5) this.b;
                l5 l5Var = n5Var.J;
                if (l5Var != null) {
                    l5Var.o(n5Var.c);
                    break;
                }
                break;
            case 4:
                ArrayList arrayList = ((v4) this.b).e;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((t4) obj).a();
                }
                break;
            case 5:
                ((r1) this.b).f.onDetachedFromWindow();
                break;
            case 6:
                l.e eVar = (l.e) this.b;
                ViewTreeObserver viewTreeObserver = eVar.J;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        eVar.J = view.getViewTreeObserver();
                    }
                    eVar.J.removeGlobalOnLayoutListener(eVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 7:
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
            case 8:
                ((w3) this.b).o(view);
                break;
            case 9:
                ((ba) this.b).c.clear();
                break;
            case 10:
                gc gcVar = (gc) this.b;
                gcVar.e.removeOnAttachStateChangeListener(this);
                gcVar.c(0L, false);
                break;
            case 11:
                ((hq) this.b).b();
                break;
            case 12:
                dl0 dl0Var = (dl0) this.b;
                org.telegram.ui.Components.i5 i5Var2 = dl0Var.t;
                if (i5Var2 != null) {
                    i5Var2.b();
                }
                org.telegram.ui.Components.i5 i5Var3 = dl0Var.u;
                if (i5Var3 != null) {
                    i5Var3.a();
                    break;
                }
                break;
            case 13:
                view.removeCallbacks((Runnable) ((mn0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ((org.telegram.ui.Components.i5) this.b).b();
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
