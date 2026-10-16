package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import m.l2;
import m.r0;
import org.telegram.ui.Components.de0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
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
                t tVar = (t) obj;
                tVar.U.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = tVar.X;
                if (hashSet != null && hashSet.size() != 0) {
                    j jVar = new j(tVar, i11);
                    int firstVisiblePosition = tVar.U.getFirstVisiblePosition();
                    boolean z10 = false;
                    while (i11 < tVar.U.getChildCount()) {
                        View childAt = tVar.U.getChildAt(i11);
                        if (tVar.X.contains((p4.v) tVar.V.getItem(firstVisiblePosition + i11))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(tVar.y0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z10) {
                                alphaAnimation.setAnimationListener(jVar);
                                z10 = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                        i11++;
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
                l2 l2Var = c0Var.n;
                if (c0Var.a() && !l2Var.N) {
                    View view2 = c0Var.x;
                    if (view2 != null && view2.isShown()) {
                        l2Var.g();
                        break;
                    } else {
                        c0Var.dismiss();
                        break;
                    }
                }
                break;
            case 3:
                r0 r0Var = (r0) obj;
                if (!r0Var.getInternalPopup().a()) {
                    r0Var.f.l(m.i0.b(r0Var), m.i0.a(r0Var));
                }
                ViewTreeObserver viewTreeObserver = r0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    m.h0.a(viewTreeObserver, this);
                    break;
                }
                break;
            case 4:
                m.o0 o0Var = (m.o0) obj;
                r0 r0Var2 = o0Var.W;
                o0Var.getClass();
                WeakHashMap weakHashMap = r0.i0.a;
                if (!r0Var2.isAttachedToWindow() || !r0Var2.getGlobalVisibleRect(o0Var.U)) {
                    o0Var.dismiss();
                    break;
                } else {
                    o0Var.q();
                    o0Var.g();
                    break;
                }
                break;
            default:
                de0 de0Var = (de0) obj;
                de0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                de0Var.h = de0Var.e.getCurrentItem();
                de0.a(de0Var, de0Var.h, 0);
                break;
        }
    }
}
