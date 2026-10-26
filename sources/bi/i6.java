package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.wm0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class i6 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((o6) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    m6 m6Var = (m6) obj;
                    if (m6Var.c) {
                        m6Var.d.onAttachedToWindow();
                    }
                }
                break;
            case 1:
                ((di.v1) this.b).f.onAttachedToWindow();
                break;
            case 2:
                a8.h0 h0Var = (a8.h0) this.b;
                jh.k kVar = (jh.k) h0Var.c;
                ViewTreeObserver viewTreeObserver = ((View) h0Var.b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) h0Var.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) h0Var.d).removeOnPreDrawListener(kVar);
                        }
                        h0Var.d = null;
                    }
                    h0Var.d = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(kVar);
                        break;
                    }
                }
                break;
            case 3:
            case 4:
                break;
            case 5:
                ((zh.k2) this.b).a(view);
                break;
            case 6:
                org.telegram.ui.Components.la laVar = (org.telegram.ui.Components.la) this.b;
                ArrayList arrayList2 = laVar.c;
                arrayList2.clear();
                for (View view2 = laVar.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
                break;
            case 7:
            case 8:
                break;
            case 9:
                ((cr) this.b).a();
                break;
            case 10:
                wm0 wm0Var = (wm0) this.b;
                org.telegram.ui.Components.r5 r5Var = wm0Var.t;
                if (r5Var != null) {
                    r5Var.a();
                }
                org.telegram.ui.Components.r5 r5Var2 = wm0Var.u;
                if (r5Var2 != null) {
                    r5Var2.a();
                    break;
                }
                break;
            case 11:
                break;
            case 12:
                ((org.telegram.ui.Components.r5) this.b).a();
                break;
            case 13:
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.b;
                if (view == ((View) qVar.b)) {
                    qVar.E(view.getViewTreeObserver());
                    break;
                }
                break;
            case 14:
                ((zh.d1) this.b).l.a();
                break;
            case 15:
                zh.p3 p3Var = (zh.p3) this.b;
                zh.n3 n3Var = p3Var.a0;
                if (n3Var != null) {
                    n3Var.a(p3Var.c);
                    break;
                }
                break;
            default:
                zh.s3 s3Var = (zh.s3) this.b;
                zh.q3 q3Var = s3Var.a0;
                if (q3Var != null) {
                    q3Var.a(s3Var.c);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((o6) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((m6) obj).a();
                }
                break;
            case 1:
                ((di.v1) this.b).f.onDetachedFromWindow();
                break;
            case 2:
                a8.h0 h0Var = (a8.h0) this.b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) h0Var.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) h0Var.d).removeOnPreDrawListener((jh.k) h0Var.c);
                    }
                    h0Var.d = null;
                    break;
                }
                break;
            case 3:
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
            case 4:
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
            case 5:
                ((zh.k2) this.b).o(view);
                break;
            case 6:
                ((org.telegram.ui.Components.la) this.b).c.clear();
                break;
            case 7:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.b;
                qcVar.e.removeOnAttachStateChangeListener(this);
                qcVar.c(0L, false);
                break;
            case 8:
                ((org.telegram.ui.Components.md) this.b).d();
                break;
            case 9:
                ((cr) this.b).b();
                break;
            case 10:
                wm0 wm0Var = (wm0) this.b;
                org.telegram.ui.Components.r5 r5Var = wm0Var.t;
                if (r5Var != null) {
                    r5Var.b();
                }
                org.telegram.ui.Components.r5 r5Var2 = wm0Var.u;
                if (r5Var2 != null) {
                    r5Var2.a();
                    break;
                }
                break;
            case 11:
                view.removeCallbacks((Runnable) ((jp0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            case 12:
                ((org.telegram.ui.Components.r5) this.b).b();
                break;
            case 13:
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.b;
                if (view == ((View) qVar.b)) {
                    qVar.E(null);
                    break;
                }
                break;
            case 14:
                ((zh.d1) this.b).l.b();
                break;
            case 15:
                zh.p3 p3Var = (zh.p3) this.b;
                zh.n3 n3Var = p3Var.a0;
                if (n3Var != null) {
                    n3Var.o(p3Var.c);
                    break;
                }
                break;
            default:
                zh.s3 s3Var = (zh.s3) this.b;
                zh.q3 q3Var = s3Var.a0;
                if (q3Var != null) {
                    q3Var.o(s3Var.c);
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
