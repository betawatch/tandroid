package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ v c;

    public p(v vVar, HashMap hashMap, HashMap hashMap2) {
        this.c = vVar;
        this.a = hashMap;
        this.b = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        q0 q0Var;
        c2.a0 a0Var;
        v vVar = this.c;
        vVar.Q.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = vVar.T;
        if (hashSet == null || vVar.U == null) {
            return;
        }
        int size = hashSet.size() - vVar.U.size();
        l lVar = new l(vVar, 1);
        int firstVisiblePosition = vVar.Q.getFirstVisiblePosition();
        int i9 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = vVar.Q.getChildCount();
            map = this.a;
            map2 = this.b;
            if (i9 >= childCount) {
                break;
            }
            View childAt = vVar.Q.getChildAt(i9);
            c2.a0 a0Var2 = (c2.a0) vVar.R.getItem(firstVisiblePosition + i9);
            Rect rect = (Rect) map.get(a0Var2);
            int top = childAt.getTop();
            int i10 = rect != null ? rect.top : (vVar.a0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = vVar.T;
            if (hashSet2 == null || !hashSet2.contains(a0Var2)) {
                a0Var = a0Var2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                a0Var = a0Var2;
                alphaAnimation.setDuration(vVar.u0);
                animationSet.addAnimation(alphaAnimation);
                i10 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i10 - top, 0.0f);
            translateAnimation.setDuration(vVar.t0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(vVar.w0);
            if (!z10) {
                animationSet.setAnimationListener(lVar);
                z10 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            c2.a0 a0Var3 = a0Var;
            map.remove(a0Var3);
            map2.remove(a0Var3);
            i9++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            c2.a0 a0Var4 = (c2.a0) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(a0Var4);
            if (vVar.U.contains(a0Var4)) {
                q0Var = new q0(bitmapDrawable, rect2);
                q0Var.h = 0.0f;
                q0Var.e = vVar.v0;
                q0Var.d = vVar.w0;
            } else {
                int i11 = vVar.a0 * size;
                q0 q0Var2 = new q0(bitmapDrawable, rect2);
                q0Var2.g = i11;
                q0Var2.e = vVar.t0;
                q0Var2.d = vVar.w0;
                q0Var2.l = new we.b(5, vVar, a0Var4);
                vVar.V.add(a0Var4);
                q0Var = q0Var2;
            }
            vVar.Q.a.add(q0Var);
        }
    }
}
