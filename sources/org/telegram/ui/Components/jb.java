package org.telegram.ui.Components;

import android.animation.ObjectAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jb implements mb {
    public long a;

    @Override // org.telegram.ui.Components.mb
    public void J(nb nbVar, wa waVar, fg fgVar, gl glVar) {
        nbVar.setInOutOffset(nbVar.getMeasuredHeight());
        glVar.accept(Float.valueOf(nbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nbVar, nb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(ft.d);
        ofFloat.addListener(new dg.y2(waVar, fgVar, 13));
        ofFloat.addUpdateListener(new ag.a(12, glVar, nbVar));
        ofFloat.start();
    }

    public boolean a(xe.n nVar) {
        return nVar.b == this.a && xe.a.c(nVar);
    }

    @Override // org.telegram.ui.Components.mb
    public void b(nb nbVar, wa waVar, ua uaVar, xa xaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nbVar, nb.IN_OUT_OFFSET_Y2, nbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(ft.c);
        ofFloat.addListener(new dg.y2(waVar, uaVar, 14));
        ofFloat.addUpdateListener(new ag.a(11, xaVar, nbVar));
        ofFloat.start();
    }
}
