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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        s4.v vVar;
        t tVar = this.c;
        tVar.V.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = tVar.Y;
        if (hashSet == null || tVar.Z == null) {
            return;
        }
        int size = hashSet.size() - tVar.Z.size();
        j jVar = new j(tVar, 1);
        int firstVisiblePosition = tVar.V.getFirstVisiblePosition();
        int i7 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = tVar.V.getChildCount();
            map = this.a;
            map2 = this.b;
            if (i7 >= childCount) {
                break;
            }
            View childAt = tVar.V.getChildAt(i7);
            s4.v vVar2 = (s4.v) tVar.W.getItem(firstVisiblePosition + i7);
            Rect rect = (Rect) map.get(vVar2);
            int top = childAt.getTop();
            int i10 = rect != null ? rect.top : (tVar.f0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = tVar.Y;
            if (hashSet2 == null || !hashSet2.contains(vVar2)) {
                vVar = vVar2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                vVar = vVar2;
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
            s4.v vVar3 = vVar;
            map.remove(vVar3);
            map2.remove(vVar3);
            i7++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            s4.v vVar4 = (s4.v) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(vVar4);
            if (tVar.Z.contains(vVar4)) {
                o0Var = new o0(bitmapDrawable, rect2);
                o0Var.h = 0.0f;
                o0Var.e = tVar.A0;
                o0Var.d = tVar.B0;
            } else {
                int i11 = tVar.f0 * size;
                o0 o0Var2 = new o0(bitmapDrawable, rect2);
                o0Var2.g = i11;
                o0Var2.e = tVar.y0;
                o0Var2.d = tVar.B0;
                o0Var2.l = new q4.q(7, tVar, vVar4);
                tVar.a0.add(vVar4);
                o0Var = o0Var2;
            }
            tVar.V.a.add(o0Var);
        }
    }
}
