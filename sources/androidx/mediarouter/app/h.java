package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import m.k2;
import m.q0;
import org.telegram.ui.Components.zc0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i10) {
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
                s sVar = (s) obj;
                sVar.Q.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = sVar.T;
                if (hashSet != null && hashSet.size() != 0) {
                    i iVar = new i(sVar, i11);
                    int firstVisiblePosition = sVar.Q.getFirstVisiblePosition();
                    boolean z10 = false;
                    while (i11 < sVar.Q.getChildCount()) {
                        View childAt = sVar.Q.getChildAt(i11);
                        if (sVar.T.contains((c2.b0) sVar.R.getItem(firstVisiblePosition + i11))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(sVar.u0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z10) {
                                alphaAnimation.setAnimationListener(iVar);
                                z10 = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                        i11++;
                    }
                    break;
                } else {
                    sVar.j(true);
                    break;
                }
            case 1:
                l.e eVar = (l.e) obj;
                ArrayList arrayList = eVar.n;
                if (eVar.a() && arrayList.size() > 0 && !((l.d) arrayList.get(0)).a.J) {
                    View view = eVar.A;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            ((l.d) obj2).a.h();
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
                        k2Var.h();
                        break;
                    } else {
                        c0Var.dismiss();
                        break;
                    }
                }
                break;
            case 3:
                q0 q0Var = (q0) obj;
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
                q0 q0Var2 = n0Var.S;
                n0Var.getClass();
                WeakHashMap weakHashMap = r0.j0.a;
                if (!q0Var2.isAttachedToWindow() || !q0Var2.getGlobalVisibleRect(n0Var.Q)) {
                    n0Var.dismiss();
                    break;
                } else {
                    n0Var.s();
                    n0Var.h();
                    break;
                }
                break;
            default:
                zc0 zc0Var = (zc0) obj;
                zc0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                zc0Var.h = zc0Var.e.getCurrentItem();
                zc0.a(zc0Var, zc0Var.h, 0);
                break;
        }
    }
}
