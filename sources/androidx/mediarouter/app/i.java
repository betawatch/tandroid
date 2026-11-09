package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import m.k2;
import org.telegram.ui.Components.rb0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (i7) {
            case 0:
                t tVar = (t) obj;
                tVar.U.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = tVar.X;
                if (hashSet != null && hashSet.size() != 0) {
                    j jVar = new j(tVar, i10);
                    int firstVisiblePosition = tVar.U.getFirstVisiblePosition();
                    boolean z9 = false;
                    while (i10 < tVar.U.getChildCount()) {
                        View childAt = tVar.U.getChildAt(i10);
                        if (tVar.X.contains((s4.v) tVar.V.getItem(firstVisiblePosition + i10))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(tVar.y0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z9) {
                                alphaAnimation.setAnimationListener(jVar);
                                z9 = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                        i10++;
                    }
                    break;
                } else {
                    tVar.j(true);
                    break;
                }
            case 1:
                l.e eVar = (l.e) obj;
                ArrayList arrayList = eVar.n;
                if (eVar.a() && arrayList.size() > 0 && !((l.d) arrayList.get(0)).a.N) {
                    View view = eVar.E;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (i10 < size) {
                            Object obj2 = arrayList.get(i10);
                            i10++;
                            ((l.d) obj2).a.g();
                        }
                        break;
                    } else {
                        eVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                l.c0 c0Var = (l.c0) obj;
                k2 k2Var = c0Var.n;
                if (c0Var.a() && !k2Var.N) {
                    View view2 = c0Var.y;
                    if (view2 != null && view2.isShown()) {
                        k2Var.g();
                        break;
                    } else {
                        c0Var.dismiss();
                        break;
                    }
                }
                break;
            case 3:
                m.q0 q0Var = (m.q0) obj;
                if (!q0Var.getInternalPopup().a()) {
                    q0Var.f.l(m.h0.b(q0Var), m.h0.a(q0Var));
                }
                ViewTreeObserver viewTreeObserver = q0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    m.g0.a(viewTreeObserver, this);
                    break;
                }
                break;
            case 4:
                m.n0 n0Var = (m.n0) obj;
                m.q0 q0Var2 = n0Var.W;
                n0Var.getClass();
                WeakHashMap weakHashMap = r0.i0.a;
                if (!q0Var2.isAttachedToWindow() || !q0Var2.getGlobalVisibleRect(n0Var.U)) {
                    n0Var.dismiss();
                    break;
                } else {
                    n0Var.q();
                    n0Var.g();
                    break;
                }
                break;
            default:
                rb0 rb0Var = (rb0) obj;
                rb0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                rb0Var.h = rb0Var.e.getCurrentItem();
                rb0.a(rb0Var, rb0Var.h, 0);
                break;
        }
    }
}
