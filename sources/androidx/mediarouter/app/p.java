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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        c2.b0 b0Var;
        v vVar = this.c;
        vVar.R.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = vVar.U;
        if (hashSet == null || vVar.V == null) {
            return;
        }
        int size = hashSet.size() - vVar.V.size();
        l lVar = new l(vVar, 1);
        int firstVisiblePosition = vVar.R.getFirstVisiblePosition();
        int i10 = 0;
        boolean z4 = false;
        while (true) {
            int childCount = vVar.R.getChildCount();
            map = this.a;
            map2 = this.b;
            if (i10 >= childCount) {
                break;
            }
            View childAt = vVar.R.getChildAt(i10);
            c2.b0 b0Var2 = (c2.b0) vVar.S.getItem(firstVisiblePosition + i10);
            Rect rect = (Rect) map.get(b0Var2);
            int top = childAt.getTop();
            int i11 = rect != null ? rect.top : (vVar.b0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = vVar.U;
            if (hashSet2 == null || !hashSet2.contains(b0Var2)) {
                b0Var = b0Var2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                b0Var = b0Var2;
                alphaAnimation.setDuration(vVar.v0);
                animationSet.addAnimation(alphaAnimation);
                i11 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i11 - top, 0.0f);
            translateAnimation.setDuration(vVar.u0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(vVar.x0);
            if (!z4) {
                animationSet.setAnimationListener(lVar);
                z4 = true;
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
            if (vVar.V.contains(b0Var4)) {
                q0Var = new q0(bitmapDrawable, rect2);
                q0Var.h = 0.0f;
                q0Var.e = vVar.w0;
                q0Var.d = vVar.x0;
            } else {
                int i12 = vVar.b0 * size;
                q0 q0Var2 = new q0(bitmapDrawable, rect2);
                q0Var2.g = i12;
                q0Var2.e = vVar.u0;
                q0Var2.d = vVar.x0;
                q0Var2.l = new af.c(vVar, b0Var4, false, 8);
                vVar.W.add(b0Var4);
                q0Var = q0Var2;
            }
            vVar.R.a.add(q0Var);
        }
    }
}
