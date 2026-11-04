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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        r4.w wVar;
        t tVar = this.c;
        tVar.V.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = tVar.Y;
        if (hashSet == null || tVar.Z == null) {
            return;
        }
        int size = hashSet.size() - tVar.Z.size();
        j jVar = new j(tVar, 1);
        int firstVisiblePosition = tVar.V.getFirstVisiblePosition();
        int i3 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = tVar.V.getChildCount();
            map = this.a;
            map2 = this.b;
            if (i3 >= childCount) {
                break;
            }
            View childAt = tVar.V.getChildAt(i3);
            r4.w wVar2 = (r4.w) tVar.W.getItem(firstVisiblePosition + i3);
            Rect rect = (Rect) map.get(wVar2);
            int top = childAt.getTop();
            int i10 = rect != null ? rect.top : (tVar.f0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = tVar.Y;
            if (hashSet2 == null || !hashSet2.contains(wVar2)) {
                wVar = wVar2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                wVar = wVar2;
                alphaAnimation.setDuration(tVar.z0);
                animationSet.addAnimation(alphaAnimation);
                i10 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i10 - top, 0.0f);
            translateAnimation.setDuration(tVar.y0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(tVar.B0);
            if (!z10) {
                animationSet.setAnimationListener(jVar);
                z10 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            r4.w wVar3 = wVar;
            map.remove(wVar3);
            map2.remove(wVar3);
            i3++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            r4.w wVar4 = (r4.w) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(wVar4);
            if (tVar.Z.contains(wVar4)) {
                p0Var = new p0(bitmapDrawable, rect2);
                p0Var.h = 0.0f;
                p0Var.e = tVar.A0;
                p0Var.d = tVar.B0;
            } else {
                int i11 = tVar.f0 * size;
                p0 p0Var2 = new p0(bitmapDrawable, rect2);
                p0Var2.g = i11;
                p0Var2.e = tVar.y0;
                p0Var2.d = tVar.B0;
                p0Var2.l = new tf.b(tVar, wVar4, false);
                tVar.a0.add(wVar4);
                p0Var = p0Var2;
            }
            tVar.V.a.add(p0Var);
        }
    }
}
