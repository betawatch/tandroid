package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r extends FrameLayout {
    public final q a;
    public final TransitionSet b;
    public boolean c;

    public r(Activity activity) {
        super(activity);
        this.c = false;
        setWillNotDraw(false);
        q qVar = new q(activity);
        this.a = qVar;
        addView(qVar, na.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) kr.f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.c) {
            return;
        }
        this.c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.b);
        }
        q qVar = this.a;
        qVar.w = ks.e4;
        qVar.n = -1;
        qVar.s = 0;
        qVar.r = org.telegram.messenger.g0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
        layoutParams.width = -1;
        qVar.setLayoutParams(layoutParams);
        org.telegram.messenger.g0.h3(new o(0, this, onClickListener), 500L);
    }

    public q getEndCloseView() {
        return this.a;
    }
}
