package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import m.k2;
import org.telegram.ui.Components.kc0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i9 = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (i9) {
            case 0:
                v vVar = (v) obj;
                vVar.Q.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = vVar.T;
                if (hashSet != null && hashSet.size() != 0) {
                    l lVar = new l(vVar, i10);
                    int firstVisiblePosition = vVar.Q.getFirstVisiblePosition();
                    boolean z10 = false;
                    while (i10 < vVar.Q.getChildCount()) {
                        View childAt = vVar.Q.getChildAt(i10);
                        if (vVar.T.contains((c2.a0) vVar.R.getItem(firstVisiblePosition + i10))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(vVar.u0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z10) {
                                alphaAnimation.setAnimationListener(lVar);
                                z10 = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                        i10++;
                    }
                    break;
                } else {
                    vVar.j(true);
                    break;
                }
            case 1:
                l.e eVar = (l.e) obj;
                ArrayList arrayList = eVar.n;
                if (eVar.a() && arrayList.size() > 0 && !((l.d) arrayList.get(0)).a.J) {
                    View view = eVar.A;
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
                if (c0Var.a() && !k2Var.J) {
                    View view2 = c0Var.x;
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
                    q0Var.f.m(m.h0.b(q0Var), m.h0.a(q0Var));
                }
                ViewTreeObserver viewTreeObserver = q0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    m.g0.a(viewTreeObserver, this);
                    break;
                }
                break;
            case 4:
                m.n0 n0Var = (m.n0) obj;
                m.q0 q0Var2 = n0Var.S;
                n0Var.getClass();
                WeakHashMap weakHashMap = r0.j0.a;
                if (!q0Var2.isAttachedToWindow() || !q0Var2.getGlobalVisibleRect(n0Var.Q)) {
                    n0Var.dismiss();
                    break;
                } else {
                    n0Var.r();
                    n0Var.g();
                    break;
                }
                break;
            default:
                kc0 kc0Var = (kc0) obj;
                kc0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                kc0Var.h = kc0Var.e.getCurrentItem();
                kc0.a(kc0Var, kc0Var.h, 0);
                break;
        }
    }
}
