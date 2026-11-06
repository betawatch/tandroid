package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.zj0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class m6 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((s6) this.b).e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    q6 q6Var = (q6) obj;
                    if (q6Var.c) {
                        q6Var.d.P();
                    }
                }
                break;
            case 1:
                ((di.p1) this.b).f.P();
                break;
            case 2:
                h6.m mVar = (h6.m) this.b;
                jh.k kVar = (jh.k) mVar.c;
                ViewTreeObserver viewTreeObserver = ((View) mVar.b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) mVar.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) mVar.d).removeOnPreDrawListener(kVar);
                        }
                        mVar.d = null;
                    }
                    mVar.d = viewTreeObserver;
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
                ((org.telegram.ui.Components.r6) this.b).c(null);
                break;
            case 6:
                ((zh.y1) this.b).a(view);
                break;
            case 7:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.b;
                ArrayList arrayList2 = y9Var.c;
                arrayList2.clear();
                for (View view2 = y9Var.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
                break;
            case 8:
                break;
            case 9:
                ((a5.h) this.b).a();
                break;
            case 10:
                zj0 zj0Var = (zj0) this.b;
                org.telegram.ui.Components.g5 g5Var = zj0Var.t;
                if (g5Var != null) {
                    g5Var.a();
                }
                org.telegram.ui.Components.g5 g5Var2 = zj0Var.u;
                if (g5Var2 != null) {
                    g5Var2.a();
                    break;
                }
                break;
            case 11:
                break;
            case 12:
                ((i0) this.b).run();
                break;
            case 13:
                ((zh.w0) this.b).l.a();
                break;
            case 14:
                zh.y2 y2Var = (zh.y2) this.b;
                zh.w2 w2Var = y2Var.a0;
                if (w2Var != null) {
                    w2Var.a(y2Var.c);
                    break;
                }
                break;
            default:
                zh.b3 b3Var = (zh.b3) this.b;
                zh.z2 z2Var = b3Var.a0;
                if (z2Var != null) {
                    z2Var.a(b3Var.c);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((s6) this.b).e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((q6) obj).a();
                }
                break;
            case 1:
                ((di.p1) this.b).f.R();
                break;
            case 2:
                h6.m mVar = (h6.m) this.b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) mVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) mVar.d).removeOnPreDrawListener((jh.k) mVar.c);
                    }
                    mVar.d = null;
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
                ((org.telegram.ui.Components.r6) this.b).b(null);
                break;
            case 6:
                ((zh.y1) this.b).n(view);
                break;
            case 7:
                ((org.telegram.ui.Components.y9) this.b).c.clear();
                break;
            case 8:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.b;
                ccVar.e.removeOnAttachStateChangeListener(this);
                ccVar.c(0L, false);
                break;
            case 9:
                ((a5.h) this.b).b();
                break;
            case 10:
                zj0 zj0Var = (zj0) this.b;
                org.telegram.ui.Components.g5 g5Var = zj0Var.t;
                if (g5Var != null) {
                    g5Var.b();
                }
                org.telegram.ui.Components.g5 g5Var2 = zj0Var.u;
                if (g5Var2 != null) {
                    g5Var2.a();
                    break;
                }
                break;
            case 11:
                view.removeCallbacks((Runnable) ((km0) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            case 12:
                break;
            case 13:
                ((zh.w0) this.b).l.b();
                break;
            case 14:
                zh.y2 y2Var = (zh.y2) this.b;
                zh.w2 w2Var = y2Var.a0;
                if (w2Var != null) {
                    w2Var.n(y2Var.c);
                    break;
                }
                break;
            default:
                zh.b3 b3Var = (zh.b3) this.b;
                zh.z2 z2Var = b3Var.a0;
                if (z2Var != null) {
                    z2Var.n(b3Var.c);
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
