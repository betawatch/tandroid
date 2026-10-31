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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ t c;

    public n(t tVar, HashMap hashMap, HashMap hashMap2) {
        this.c = tVar;
        this.a = hashMap;
        this.b = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        p0 p0Var;
        p4.w wVar;
        t tVar = this.c;
        tVar.U.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = tVar.X;
        if (hashSet == null || tVar.Y == null) {
            return;
        }
        int size = hashSet.size() - tVar.Y.size();
        j jVar = new j(tVar, 1);
        int firstVisiblePosition = tVar.U.getFirstVisiblePosition();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = tVar.U.getChildCount();
            map = this.a;
            map2 = this.b;
            if (i10 >= childCount) {
                break;
            }
            View childAt = tVar.U.getChildAt(i10);
            p4.w wVar2 = (p4.w) tVar.V.getItem(firstVisiblePosition + i10);
            Rect rect = (Rect) map.get(wVar2);
            int top = childAt.getTop();
            int i11 = rect != null ? rect.top : (tVar.e0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = tVar.X;
            if (hashSet2 == null || !hashSet2.contains(wVar2)) {
                wVar = wVar2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                wVar = wVar2;
                alphaAnimation.setDuration(tVar.y0);
                animationSet.addAnimation(alphaAnimation);
                i11 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i11 - top, 0.0f);
            translateAnimation.setDuration(tVar.x0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(tVar.A0);
            if (!z10) {
                animationSet.setAnimationListener(jVar);
                z10 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            p4.w wVar3 = wVar;
            map.remove(wVar3);
            map2.remove(wVar3);
            i10++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            p4.w wVar4 = (p4.w) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(wVar4);
            if (tVar.Y.contains(wVar4)) {
                p0Var = new p0(bitmapDrawable, rect2);
                p0Var.h = 0.0f;
                p0Var.e = tVar.z0;
                p0Var.d = tVar.A0;
            } else {
                int i12 = tVar.e0 * size;
                p0 p0Var2 = new p0(bitmapDrawable, rect2);
                p0Var2.g = i12;
                p0Var2.e = tVar.x0;
                p0Var2.d = tVar.A0;
                p0Var2.l = new n4.q(tVar, wVar4, false);
                tVar.Z.add(wVar4);
                p0Var = p0Var2;
            }
            tVar.U.a.add(p0Var);
        }
    }
}
