package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ik implements LayoutTransition.TransitionListener {
    public hk a;
    public int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.y c;
    public final /* synthetic */ cn d;

    public ik(cn cnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = cnVar;
        this.c = yVar;
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
            this.a = new hk(this, 0);
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
