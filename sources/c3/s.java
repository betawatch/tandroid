package c3;

import ag.p2;
import android.animation.ObjectAnimator;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.vs;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class s implements ab {
    public long a;

    public s(kj kjVar) {
        this.a = kj.B0(kjVar.k);
        kjVar.f1();
    }

    public boolean a(ef.m mVar) {
        return mVar.b == this.a && ef.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.ab
    public void m(bb bbVar, la laVar, ja jaVar, ma maVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bbVar, bb.IN_OUT_OFFSET_Y2, bbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(vs.c);
        ofFloat.addListener(new bg.f(laVar, jaVar, 15));
        ofFloat.addUpdateListener(new p2(12, maVar, bbVar));
        ofFloat.start();
    }

    @Override // org.telegram.ui.Components.ab
    public void p0(bb bbVar, la laVar, tf tfVar, gl glVar) {
        bbVar.setInOutOffset(bbVar.getMeasuredHeight());
        glVar.accept(Float.valueOf(bbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bbVar, bb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(vs.d);
        ofFloat.addListener(new bg.f(laVar, tfVar, 14));
        ofFloat.addUpdateListener(new p2(13, glVar, bbVar));
        ofFloat.start();
    }
}
