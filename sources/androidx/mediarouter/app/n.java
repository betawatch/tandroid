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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ u c;

    public n(u uVar, HashMap hashMap, HashMap hashMap2) {
        this.c = uVar;
        this.a = hashMap;
        this.b = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        q0 q0Var;
        c2.z zVar;
        u uVar = this.c;
        uVar.Q.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = uVar.T;
        if (hashSet == null || uVar.U == null) {
            return;
        }
        int size = hashSet.size() - uVar.U.size();
        o oVar = new o(uVar, 0);
        int firstVisiblePosition = uVar.Q.getFirstVisiblePosition();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = uVar.Q.getChildCount();
            map = this.a;
            map2 = this.b;
            if (i10 >= childCount) {
                break;
            }
            View childAt = uVar.Q.getChildAt(i10);
            c2.z zVar2 = (c2.z) uVar.R.getItem(firstVisiblePosition + i10);
            Rect rect = (Rect) map.get(zVar2);
            int top = childAt.getTop();
            int i11 = rect != null ? rect.top : (uVar.a0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = uVar.T;
            if (hashSet2 == null || !hashSet2.contains(zVar2)) {
                zVar = zVar2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                zVar = zVar2;
                alphaAnimation.setDuration(uVar.u0);
                animationSet.addAnimation(alphaAnimation);
                i11 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i11 - top, 0.0f);
            translateAnimation.setDuration(uVar.t0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(uVar.w0);
            if (!z10) {
                animationSet.setAnimationListener(oVar);
                z10 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            c2.z zVar3 = zVar;
            map.remove(zVar3);
            map2.remove(zVar3);
            i10++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            c2.z zVar4 = (c2.z) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(zVar4);
            if (uVar.U.contains(zVar4)) {
                q0Var = new q0(bitmapDrawable, rect2);
                q0Var.h = 0.0f;
                q0Var.e = uVar.v0;
                q0Var.d = uVar.w0;
            } else {
                int i12 = uVar.a0 * size;
                q0 q0Var2 = new q0(bitmapDrawable, rect2);
                q0Var2.g = i12;
                q0Var2.e = uVar.t0;
                q0Var2.d = uVar.w0;
                q0Var2.l = new xe.b(6, uVar, zVar4);
                uVar.V.add(zVar4);
                q0Var = q0Var2;
            }
            uVar.Q.a.add(q0Var);
        }
    }
}
