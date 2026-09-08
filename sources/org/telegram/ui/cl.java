package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class cl implements LayoutTransition.TransitionListener {
    public bl a;
    public int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.z c;
    public final /* synthetic */ co d;

    public cl(co coVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = coVar;
        this.c = zVar;
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

    /* JADX WARN: Type inference failed for: r1v5, types: [org.telegram.ui.bl] */
    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.b == 0 && this.a == null) {
            this.a = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.bl
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) cl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
