package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class n6 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((t6) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    r6 r6Var = (r6) obj;
                    if (r6Var.c) {
                        r6Var.d.onAttachedToWindow();
                    }
                }
                break;
            case 1:
                ((ci.w1) this.b).f.onAttachedToWindow();
                break;
            case 2:
                androidx.biometric.e eVar = (androidx.biometric.e) this.b;
                ih.j jVar = (ih.j) eVar.c;
                ViewTreeObserver viewTreeObserver = ((View) eVar.b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) eVar.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) eVar.d).removeOnPreDrawListener(jVar);
                        }
                        eVar.d = null;
                    }
                    eVar.d = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(jVar);
                        break;
                    }
                }
                break;
            case 3:
            case 4:
                break;
            case 5:
                ((yh.j2) this.b).a(view);
                break;
            case 6:
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) this.b;
                ArrayList arrayList2 = jaVar.c;
                arrayList2.clear();
                for (View view2 = jaVar.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
                break;
            case 7:
                break;
            case 8:
                ((br) this.b).a();
                break;
            case 9:
                qm0 qm0Var = (qm0) this.b;
                org.telegram.ui.Components.p5 p5Var = qm0Var.t;
                if (p5Var != null) {
                    p5Var.a();
                }
                org.telegram.ui.Components.p5 p5Var2 = qm0Var.u;
                if (p5Var2 != null) {
                    p5Var2.a();
                    break;
                }
                break;
            case 10:
                break;
            case 11:
                ((org.telegram.ui.Components.p5) this.b).a();
                break;
            case 12:
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.b;
                if (view == ((View) rVar.c)) {
                    rVar.u(view.getViewTreeObserver());
                    break;
                }
                break;
            case 13:
                ((yh.d1) this.b).l.a();
                break;
            case 14:
                yh.n3 n3Var = (yh.n3) this.b;
                yh.l3 l3Var = n3Var.N;
                if (l3Var != null) {
                    l3Var.a(n3Var.c);
                    break;
                }
                break;
            default:
                yh.q3 q3Var = (yh.q3) this.b;
                yh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.a(q3Var.c);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((t6) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((r6) obj).a();
                }
                break;
            case 1:
                ((ci.w1) this.b).f.onDetachedFromWindow();
                break;
            case 2:
                androidx.biometric.e eVar = (androidx.biometric.e) this.b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) eVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) eVar.d).removeOnPreDrawListener((ih.j) eVar.c);
                    }
                    eVar.d = null;
                    break;
                }
                break;
            case 3:
                l.e eVar2 = (l.e) this.b;
                ViewTreeObserver viewTreeObserver2 = eVar2.N;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar2.N = view.getViewTreeObserver();
                    }
                    eVar2.N.removeGlobalOnLayoutListener(eVar2.r);
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
                ((yh.j2) this.b).o(view);
                break;
            case 6:
                ((org.telegram.ui.Components.ja) this.b).c.clear();
                break;
            case 7:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.b;
                qcVar.e.removeOnAttachStateChangeListener(this);
                qcVar.c(0L, false);
                break;
            case 8:
                ((br) this.b).b();
                break;
            case 9:
                qm0 qm0Var = (qm0) this.b;
                org.telegram.ui.Components.p5 p5Var = qm0Var.t;
                if (p5Var != null) {
                    p5Var.b();
                }
                org.telegram.ui.Components.p5 p5Var2 = qm0Var.u;
                if (p5Var2 != null) {
                    p5Var2.a();
                    break;
                }
                break;
            case 10:
                view.removeCallbacks((Runnable) ((ap0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            case 11:
                ((org.telegram.ui.Components.p5) this.b).b();
                break;
            case 12:
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.b;
                if (view == ((View) rVar.c)) {
                    rVar.u(null);
                    break;
                }
                break;
            case 13:
                ((yh.d1) this.b).l.b();
                break;
            case 14:
                yh.n3 n3Var = (yh.n3) this.b;
                yh.l3 l3Var = n3Var.N;
                if (l3Var != null) {
                    l3Var.o(n3Var.c);
                    break;
                }
                break;
            default:
                yh.q3 q3Var = (yh.q3) this.b;
                yh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.o(q3Var.c);
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
}
