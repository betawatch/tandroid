package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hk implements LayoutTransition.TransitionListener {
    public gk a;
    public int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.z c;
    public final /* synthetic */ bn d;

    public hk(bn bnVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = bnVar;
        this.c = zVar;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.b - 1;
        this.b = i10;
        if (i10 != 0 || this.a == null) {
            return;
        }
        this.c.getViewTreeObserver().removeOnPreDrawListener(this.a);
        this.a = null;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.b == 0 && this.a == null) {
            this.a = new gk(this, 0);
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
