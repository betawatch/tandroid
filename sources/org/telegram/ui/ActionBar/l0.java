package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ r0 b;

    public l0(r0 r0Var, float f10) {
        this.b = r0Var;
        this.a = f10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        r0 r0Var = this.b;
        r0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x10 = r0Var.e.getX();
        float f10 = this.a;
        if (x10 != f10) {
            ah.i iVar = r0Var.e;
            iVar.setTranslationX(f10 - iVar.getX());
        }
        r0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(lr.f).start();
        return true;
    }
}
