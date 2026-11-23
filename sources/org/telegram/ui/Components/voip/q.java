package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        addView(pVar, ma.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) nr.f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.c) {
            return;
        }
        this.c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.b);
        }
        p pVar = this.a;
        pVar.w = ls.e4;
        pVar.n = -1;
        pVar.s = 0;
        pVar.r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
        layoutParams.width = -1;
        pVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.h3(new fm0(26, this, onClickListener), 500L);
    }

    public p getEndCloseView() {
        return this.a;
    }
}
