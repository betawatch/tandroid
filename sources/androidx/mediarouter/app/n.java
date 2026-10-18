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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        o0 o0Var;
        p4.v vVar;
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
            p4.v vVar2 = (p4.v) tVar.V.getItem(firstVisiblePosition + i10);
            Rect rect = (Rect) map.get(vVar2);
            int top = childAt.getTop();
            int i11 = rect != null ? rect.top : (tVar.e0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = tVar.X;
            if (hashSet2 == null || !hashSet2.contains(vVar2)) {
                vVar = vVar2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                vVar = vVar2;
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
            p4.v vVar3 = vVar;
            map.remove(vVar3);
            map2.remove(vVar3);
            i10++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            p4.v vVar4 = (p4.v) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(vVar4);
            if (tVar.Y.contains(vVar4)) {
                o0Var = new o0(bitmapDrawable, rect2);
                o0Var.h = 0.0f;
                o0Var.e = tVar.z0;
                o0Var.d = tVar.A0;
            } else {
                int i12 = tVar.e0 * size;
                o0 o0Var2 = new o0(bitmapDrawable, rect2);
                o0Var2.g = i12;
                o0Var2.e = tVar.x0;
                o0Var2.d = tVar.A0;
                o0Var2.l = new n4.s(tVar, vVar4, false, 7);
                tVar.Z.add(vVar4);
                o0Var = o0Var2;
            }
            tVar.U.a.add(o0Var);
        }
    }
}
