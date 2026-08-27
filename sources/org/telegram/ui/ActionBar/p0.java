package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ v0 b;

    public p0(v0 v0Var, float f10) {
        this.b = v0Var;
        this.a = f10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        v0 v0Var = this.b;
        v0Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x8 = v0Var.e.getX();
        float f10 = this.a;
        if (x8 != f10) {
            gg.g gVar = v0Var.e;
            gVar.setTranslationX(f10 - gVar.getX());
        }
        v0Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(er.f).start();
        return true;
    }
}
