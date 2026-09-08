package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.pr;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k extends FrameLayout {
    public final j a;
    public final TransitionSet b;
    public boolean c;

    public k(Activity activity) {
        super(activity);
        this.c = false;
        setWillNotDraw(false);
        j jVar = new j(activity);
        this.a = jVar;
        addView(jVar, x5.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) pr.f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.c) {
            return;
        }
        this.c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.b);
        }
        j jVar = this.a;
        jVar.v = 255;
        jVar.n = -1;
        jVar.s = 0;
        jVar.r = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        layoutParams.width = -1;
        jVar.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new jn0(26, this, onClickListener), 500L);
    }

    public j getEndCloseView() {
        return this.a;
    }
}
