package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q extends FrameLayout {
    public final p a;
    public final TransitionSet b;
    public boolean c;

    public q(Activity activity) {
        super(activity);
        this.c = false;
        setWillNotDraw(false);
        p pVar = new p(activity);
        this.a = pVar;
        addView(pVar, ha.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.j(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) wq.f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z9) {
        if (this.c) {
            return;
        }
        this.c = true;
        if (z9) {
            TransitionManager.beginDelayedTransition(this, this.b);
        }
        p pVar = this.a;
        pVar.w = qs.e4;
        pVar.n = -1;
        pVar.s = 0;
        pVar.r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
        layoutParams.width = -1;
        pVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.i3(new h41(5, this, onClickListener), 500L);
    }

    public p getEndCloseView() {
        return this.a;
    }
}
