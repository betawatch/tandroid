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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ s c;

    public m(s sVar, HashMap hashMap, HashMap hashMap2) {
        this.c = sVar;
        this.a = hashMap;
        this.b = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        n0 n0Var;
        c2.b0 b0Var;
        s sVar = this.c;
        sVar.Q.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = sVar.T;
        if (hashSet == null || sVar.U == null) {
            return;
        }
        int size = hashSet.size() - sVar.U.size();
        i iVar = new i(sVar, 1);
        int firstVisiblePosition = sVar.Q.getFirstVisiblePosition();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = sVar.Q.getChildCount();
            map = this.a;
            map2 = this.b;
            if (i10 >= childCount) {
                break;
            }
            View childAt = sVar.Q.getChildAt(i10);
            c2.b0 b0Var2 = (c2.b0) sVar.R.getItem(firstVisiblePosition + i10);
            Rect rect = (Rect) map.get(b0Var2);
            int top = childAt.getTop();
            int i11 = rect != null ? rect.top : (sVar.a0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = sVar.T;
            if (hashSet2 == null || !hashSet2.contains(b0Var2)) {
                b0Var = b0Var2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                b0Var = b0Var2;
                alphaAnimation.setDuration(sVar.u0);
                animationSet.addAnimation(alphaAnimation);
                i11 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i11 - top, 0.0f);
            translateAnimation.setDuration(sVar.t0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(sVar.w0);
            if (!z10) {
                animationSet.setAnimationListener(iVar);
                z10 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            c2.b0 b0Var3 = b0Var;
            map.remove(b0Var3);
            map2.remove(b0Var3);
            i10++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            c2.b0 b0Var4 = (c2.b0) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(b0Var4);
            if (sVar.U.contains(b0Var4)) {
                n0Var = new n0(bitmapDrawable, rect2);
                n0Var.h = 0.0f;
                n0Var.e = sVar.v0;
                n0Var.d = sVar.w0;
            } else {
                int i12 = sVar.a0 * size;
                n0 n0Var2 = new n0(bitmapDrawable, rect2);
                n0Var2.g = i12;
                n0Var2.e = sVar.t0;
                n0Var2.d = sVar.w0;
                n0Var2.l = new ze.b(sVar, b0Var4, false);
                sVar.V.add(b0Var4);
                n0Var = n0Var2;
            }
            sVar.Q.a.add(n0Var);
        }
    }
}
