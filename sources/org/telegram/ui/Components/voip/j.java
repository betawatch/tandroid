package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.at;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hi0;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j extends FrameLayout {
    public final i a;
    public final TransitionSet b;
    public boolean c;

    public j(Activity activity) {
        super(activity);
        this.c = false;
        setWillNotDraw(false);
        i iVar = new i(activity);
        this.a = iVar;
        addView(iVar, b6.e(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.b = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) gr.f);
    }

    public final void a(View.OnClickListener onClickListener, boolean z10) {
        if (this.c) {
            return;
        }
        this.c = true;
        if (z10) {
            TransitionManager.beginDelayedTransition(this, this.b);
        }
        i iVar = this.a;
        iVar.w = at.e4;
        iVar.n = -1;
        iVar.s = 0;
        iVar.r = org.telegram.messenger.i0.L(8.0f);
        ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
        layoutParams.width = -1;
        iVar.setLayoutParams(layoutParams);
        org.telegram.messenger.i0.h3(new hi0(28, this, onClickListener), 500L);
    }

    public i getEndCloseView() {
        return this.a;
    }
}
