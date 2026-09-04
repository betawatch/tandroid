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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class o implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ u c;

    public o(u uVar, HashMap hashMap, HashMap hashMap2) {
        this.c = uVar;
        this.a = hashMap;
        this.b = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        p0 p0Var;
        p4.v vVar;
        u uVar = this.c;
        uVar.U.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = uVar.X;
        if (hashSet == null || uVar.Y == null) {
            return;
        }
        int size = hashSet.size() - uVar.Y.size();
        k kVar = new k(uVar, 1);
        int firstVisiblePosition = uVar.U.getFirstVisiblePosition();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = uVar.U.getChildCount();
            map = this.a;
            map2 = this.b;
            if (i10 >= childCount) {
                break;
            }
            View childAt = uVar.U.getChildAt(i10);
            p4.v vVar2 = (p4.v) uVar.V.getItem(firstVisiblePosition + i10);
            Rect rect = (Rect) map.get(vVar2);
            int top = childAt.getTop();
            int i11 = rect != null ? rect.top : (uVar.e0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = uVar.X;
            if (hashSet2 == null || !hashSet2.contains(vVar2)) {
                vVar = vVar2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                vVar = vVar2;
                alphaAnimation.setDuration(uVar.y0);
                animationSet.addAnimation(alphaAnimation);
                i11 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i11 - top, 0.0f);
            translateAnimation.setDuration(uVar.x0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(uVar.A0);
            if (!z10) {
                animationSet.setAnimationListener(kVar);
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
            if (uVar.Y.contains(vVar4)) {
                p0Var = new p0(bitmapDrawable, rect2);
                p0Var.h = 0.0f;
                p0Var.e = uVar.z0;
                p0Var.d = uVar.A0;
            } else {
                int i12 = uVar.e0 * size;
                p0 p0Var2 = new p0(bitmapDrawable, rect2);
                p0Var2.g = i12;
                p0Var2.e = uVar.x0;
                p0Var2.d = uVar.A0;
                p0Var2.l = new n4.y(uVar, vVar4, false, 5);
                uVar.Z.add(vVar4);
                p0Var = p0Var2;
            }
            uVar.U.a.add(p0Var);
        }
    }
}
