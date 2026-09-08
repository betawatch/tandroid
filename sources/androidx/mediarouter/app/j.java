package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import m.j2;
import org.telegram.ui.Components.ed0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
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
                u uVar = (u) obj;
                uVar.U.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = uVar.X;
                if (hashSet != null && hashSet.size() != 0) {
                    k kVar = new k(uVar, i11);
                    int firstVisiblePosition = uVar.U.getFirstVisiblePosition();
                    boolean z10 = false;
                    while (i11 < uVar.U.getChildCount()) {
                        View childAt = uVar.U.getChildAt(i11);
                        if (uVar.X.contains((p4.v) uVar.V.getItem(firstVisiblePosition + i11))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(uVar.y0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z10) {
                                alphaAnimation.setAnimationListener(kVar);
                                z10 = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                        i11++;
                    }
                    break;
                } else {
                    uVar.j(true);
                    break;
                }
            case 1:
                l.f fVar = (l.f) obj;
                ArrayList arrayList = fVar.n;
                if (fVar.a() && arrayList.size() > 0 && !((l.e) arrayList.get(0)).a.N) {
                    View view = fVar.E;
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
                if (d0Var.a() && !j2Var.N) {
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
                m.p0 p0Var2 = m0Var.W;
                m0Var.getClass();
                WeakHashMap weakHashMap = r0.i0.a;
                if (!p0Var2.isAttachedToWindow() || !p0Var2.getGlobalVisibleRect(m0Var.U)) {
                    m0Var.dismiss();
                    break;
                } else {
                    m0Var.s();
                    m0Var.g();
                    break;
                }
                break;
            default:
                ed0 ed0Var = (ed0) obj;
                ed0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ed0Var.h = ed0Var.e.getCurrentItem();
                ed0.a(ed0Var, ed0Var.h, 0);
                break;
        }
    }
}
