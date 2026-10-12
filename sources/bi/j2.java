package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tm0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class j2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((k2) this.b).f.onAttachedToWindow();
                break;
            case 1:
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
            case 2:
            case 3:
                break;
            case 4:
                ((yh.k2) this.b).a(view);
                break;
            case 5:
                org.telegram.ui.Components.la laVar = (org.telegram.ui.Components.la) this.b;
                ArrayList arrayList = laVar.c;
                arrayList.clear();
                for (View view2 = laVar.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
                break;
            case 6:
                break;
            case 7:
                ((er) this.b).a();
                break;
            case 8:
                tm0 tm0Var = (tm0) this.b;
                org.telegram.ui.Components.q5 q5Var = tm0Var.t;
                if (q5Var != null) {
                    q5Var.a();
                }
                org.telegram.ui.Components.q5 q5Var2 = tm0Var.u;
                if (q5Var2 != null) {
                    q5Var2.a();
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                ((org.telegram.ui.Components.q5) this.b).a();
                break;
            case 11:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.b;
                if (view == ((View) sVar.c)) {
                    sVar.u(view.getViewTreeObserver());
                    break;
                }
                break;
            case 12:
                ((yh.e1) this.b).l.a();
                break;
            case 13:
                yh.o3 o3Var = (yh.o3) this.b;
                yh.m3 m3Var = o3Var.N;
                if (m3Var != null) {
                    m3Var.a(o3Var.c);
                    break;
                }
                break;
            case 14:
                yh.r3 r3Var = (yh.r3) this.b;
                yh.p3 p3Var = r3Var.N;
                if (p3Var != null) {
                    p3Var.a(r3Var.c);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = ((zh.e3) this.b).e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    zh.c3 c3Var = (zh.c3) obj;
                    if (c3Var.c) {
                        c3Var.d.onAttachedToWindow();
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((k2) this.b).f.onDetachedFromWindow();
                break;
            case 1:
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
            case 2:
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
            case 3:
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
            case 4:
                ((yh.k2) this.b).o(view);
                break;
            case 5:
                ((org.telegram.ui.Components.la) this.b).c.clear();
                break;
            case 6:
                sc scVar = (sc) this.b;
                scVar.e.removeOnAttachStateChangeListener(this);
                scVar.c(0L, false);
                break;
            case 7:
                ((er) this.b).b();
                break;
            case 8:
                tm0 tm0Var = (tm0) this.b;
                org.telegram.ui.Components.q5 q5Var = tm0Var.t;
                if (q5Var != null) {
                    q5Var.b();
                }
                org.telegram.ui.Components.q5 q5Var2 = tm0Var.u;
                if (q5Var2 != null) {
                    q5Var2.a();
                    break;
                }
                break;
            case 9:
                view.removeCallbacks((Runnable) ((dp0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            case 10:
                ((org.telegram.ui.Components.q5) this.b).b();
                break;
            case 11:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.b;
                if (view == ((View) sVar.c)) {
                    sVar.u(null);
                    break;
                }
                break;
            case 12:
                ((yh.e1) this.b).l.b();
                break;
            case 13:
                yh.o3 o3Var = (yh.o3) this.b;
                yh.m3 m3Var = o3Var.N;
                if (m3Var != null) {
                    m3Var.o(o3Var.c);
                    break;
                }
                break;
            case 14:
                yh.r3 r3Var = (yh.r3) this.b;
                yh.p3 p3Var = r3Var.N;
                if (p3Var != null) {
                    p3Var.o(r3Var.c);
                    break;
                }
                break;
            default:
                ArrayList arrayList = ((zh.e3) this.b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((zh.c3) obj).a();
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
