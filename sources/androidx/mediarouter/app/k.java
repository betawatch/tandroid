package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import m.j2;
import org.telegram.ui.Components.hd0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                v vVar = (v) obj;
                vVar.R.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = vVar.U;
                if (hashSet != null && hashSet.size() != 0) {
                    l lVar = new l(vVar, i11);
                    int firstVisiblePosition = vVar.R.getFirstVisiblePosition();
                    boolean z4 = false;
                    while (i11 < vVar.R.getChildCount()) {
                        View childAt = vVar.R.getChildAt(i11);
                        if (vVar.U.contains((c2.a0) vVar.S.getItem(firstVisiblePosition + i11))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(vVar.v0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z4) {
                                alphaAnimation.setAnimationListener(lVar);
                                z4 = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                        i11++;
                    }
                    break;
                } else {
                    vVar.j(true);
                    break;
                }
            case 1:
                l.f fVar = (l.f) obj;
                ArrayList arrayList = fVar.n;
                if (fVar.a() && arrayList.size() > 0 && !((l.e) arrayList.get(0)).a.K) {
                    View view = fVar.B;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            ((l.e) obj2).a.g();
                        }
                        break;
                    } else {
                        fVar.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                l.d0 d0Var = (l.d0) obj;
                j2 j2Var = d0Var.n;
                if (d0Var.a() && !j2Var.K) {
                    View view2 = d0Var.x;
                    if (view2 != null && view2.isShown()) {
                        j2Var.g();
                        break;
                    } else {
                        d0Var.dismiss();
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
                m.p0 p0Var2 = m0Var.T;
                m0Var.getClass();
                WeakHashMap weakHashMap = r0.j0.a;
                if (!p0Var2.isAttachedToWindow() || !p0Var2.getGlobalVisibleRect(m0Var.R)) {
                    m0Var.dismiss();
                    break;
                } else {
                    m0Var.r();
                    m0Var.g();
                    break;
                }
                break;
            default:
                hd0 hd0Var = (hd0) obj;
                hd0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                hd0Var.h = hd0Var.e.getCurrentItem();
                hd0.a(hd0Var, hd0Var.h, 0);
                break;
        }
    }
}
