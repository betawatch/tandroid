package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.HashSet;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ u a;

    public i(u uVar) {
        this.a = uVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        u uVar = this.a;
        uVar.Q.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = uVar.T;
        if (hashSet == null || hashSet.size() == 0) {
            uVar.j(true);
            return;
        }
        o oVar = new o(uVar, 1);
        int firstVisiblePosition = uVar.Q.getFirstVisiblePosition();
        boolean z10 = false;
        for (int i10 = 0; i10 < uVar.Q.getChildCount(); i10++) {
            View childAt = uVar.Q.getChildAt(i10);
            if (uVar.T.contains((c2.z) uVar.R.getItem(firstVisiblePosition + i10))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(uVar.u0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z10) {
                    alphaAnimation.setAnimationListener(oVar);
                    z10 = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }
}
