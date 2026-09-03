package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import m.k2;
import org.telegram.ui.Components.gd0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                        if (vVar.U.contains((c2.b0) vVar.S.getItem(firstVisiblePosition + i11))) {
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
                l.e eVar = (l.e) obj;
                ArrayList arrayList = eVar.n;
                if (eVar.a() && arrayList.size() > 0 && !((l.d) arrayList.get(0)).a.K) {
                    View view = eVar.B;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
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
                if (c0Var.a() && !k2Var.K) {
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
                    q0Var.f.m(m.g0.b(q0Var), m.g0.a(q0Var));
                }
                ViewTreeObserver viewTreeObserver = q0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    m.f0.a(viewTreeObserver, this);
                    break;
                }
                break;
            case 4:
                m.n0 n0Var = (m.n0) obj;
                m.q0 q0Var2 = n0Var.T;
                n0Var.getClass();
                WeakHashMap weakHashMap = r0.j0.a;
                if (!q0Var2.isAttachedToWindow() || !q0Var2.getGlobalVisibleRect(n0Var.R)) {
                    n0Var.dismiss();
                    break;
                } else {
                    n0Var.s();
                    n0Var.g();
                    break;
                }
                break;
            default:
                gd0 gd0Var = (gd0) obj;
                gd0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                gd0Var.h = gd0Var.e.getCurrentItem();
                gd0.a(gd0Var, gd0Var.h, 0);
                break;
        }
    }
}
