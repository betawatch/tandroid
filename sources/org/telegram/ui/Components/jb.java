package org.telegram.ui.Components;

import android.animation.ObjectAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jb implements mb {
    public long a;

    public boolean a(ye.m mVar) {
        return mVar.b == this.a && ye.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.mb
    public void c(nb nbVar, wa waVar, ua uaVar, xa xaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nbVar, nb.IN_OUT_OFFSET_Y2, nbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(gt.c);
        ofFloat.addListener(new dg.y2(waVar, uaVar, 14));
        ofFloat.addUpdateListener(new ag.a(11, xaVar, nbVar));
        ofFloat.start();
    }

    @Override // org.telegram.ui.Components.mb
    public void v(nb nbVar, wa waVar, fg fgVar, gl glVar) {
        nbVar.setInOutOffset(nbVar.getMeasuredHeight());
        glVar.accept(Float.valueOf(nbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nbVar, nb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(gt.d);
        ofFloat.addListener(new dg.y2(waVar, fgVar, 13));
        ofFloat.addUpdateListener(new ag.a(12, glVar, nbVar));
        ofFloat.start();
    }
}
