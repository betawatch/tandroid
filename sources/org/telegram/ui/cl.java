package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cl implements LayoutTransition.TransitionListener {
    public h6 a;
    public int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.a0 c;
    public final /* synthetic */ bo d;

    public cl(bo boVar, org.telegram.ui.ActionBar.a0 a0Var) {
        this.d = boVar;
        this.c = a0Var;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.b - 1;
        this.b = i11;
        if (i11 != 0 || this.a == null) {
            return;
        }
        this.c.getViewTreeObserver().removeOnPreDrawListener(this.a);
        this.a = null;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.b == 0 && this.a == null) {
            this.a = new h6(this, 1);
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
