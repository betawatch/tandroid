package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ r0 b;

    public k0(r0 r0Var, float f10) {
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
        r0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(xq.f).start();
        return true;
    }
}
