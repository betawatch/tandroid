package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cl implements LayoutTransition.TransitionListener {
    public bl a;
    public int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.y c;
    public final /* synthetic */ un d;

    public cl(un unVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = unVar;
        this.c = yVar;
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
            this.a = new bl(this, 0);
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
