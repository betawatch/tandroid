package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import m.j2;
import org.telegram.ui.Components.lb0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i3 = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (i3) {
            case 0:
                t tVar = (t) obj;
                tVar.V.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = tVar.Y;
                if (hashSet != null && hashSet.size() != 0) {
                    j jVar = new j(tVar, i10);
                    int firstVisiblePosition = tVar.V.getFirstVisiblePosition();
                    boolean z10 = false;
                    while (i10 < tVar.V.getChildCount()) {
                        View childAt = tVar.V.getChildAt(i10);
                        if (tVar.Y.contains((r4.w) tVar.W.getItem(firstVisiblePosition + i10))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(tVar.z0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z10) {
                                alphaAnimation.setAnimationListener(jVar);
                                z10 = true;
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
                if (eVar.a() && arrayList.size() > 0 && !((l.d) arrayList.get(0)).a.O) {
                    View view = eVar.F;
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
                j2 j2Var = c0Var.n;
                if (c0Var.a() && !j2Var.O) {
                    View view2 = c0Var.y;
                    if (view2 != null && view2.isShown()) {
                        j2Var.g();
                        break;
                    } else {
                        c0Var.dismiss();
                        break;
                    }
                }
                break;
            case 3:
                m.p0 p0Var = (m.p0) obj;
                if (!p0Var.getInternalPopup().a()) {
                    p0Var.f.m(m.g0.b(p0Var), m.g0.a(p0Var));
                }
                ViewTreeObserver viewTreeObserver = p0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    m.f0.a(viewTreeObserver, this);
                    break;
                }
                break;
            case 4:
                m.m0 m0Var = (m.m0) obj;
                m.p0 p0Var2 = m0Var.X;
                m0Var.getClass();
                WeakHashMap weakHashMap = r0.i0.a;
                if (!p0Var2.isAttachedToWindow() || !p0Var2.getGlobalVisibleRect(m0Var.V)) {
                    m0Var.dismiss();
                    break;
                } else {
                    m0Var.r();
                    m0Var.g();
                    break;
                }
                break;
            default:
                lb0 lb0Var = (lb0) obj;
                lb0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                lb0Var.h = lb0Var.e.getCurrentItem();
                lb0.a(lb0Var, lb0Var.h, 0);
                break;
        }
    }
}
