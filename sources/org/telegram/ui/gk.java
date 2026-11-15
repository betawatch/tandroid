package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gk implements LayoutTransition.TransitionListener {
    public fk a;
    public int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.y c;
    public final /* synthetic */ an d;

    public gk(an anVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = anVar;
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
            this.a = new fk(this, 0);
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
