package org.telegram.ui.Components;

import android.animation.ObjectAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jb implements mb {
    public long a;

    @Override // org.telegram.ui.Components.mb
    public void A(nb nbVar, wa waVar, fg fgVar, il ilVar) {
        nbVar.setInOutOffset(nbVar.getMeasuredHeight());
        ilVar.accept(Float.valueOf(nbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nbVar, nb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(jt.d);
        ofFloat.addListener(new eg.w2(waVar, fgVar, 13));
        ofFloat.addUpdateListener(new bg.a(12, ilVar, nbVar));
        ofFloat.start();
    }

    public boolean a(ye.m mVar) {
        return mVar.b == this.a && ye.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.mb
    public void c(nb nbVar, wa waVar, ua uaVar, xa xaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nbVar, nb.IN_OUT_OFFSET_Y2, nbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(jt.c);
        ofFloat.addListener(new eg.w2(waVar, uaVar, 14));
        ofFloat.addUpdateListener(new bg.a(11, xaVar, nbVar));
        ofFloat.start();
    }
}
