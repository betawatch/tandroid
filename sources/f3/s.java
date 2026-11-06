package f3;

import android.animation.ObjectAnimator;
import bi.de;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.xf;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class s implements fb {
    public long a;

    public s(ij ijVar) {
        this.a = ij.B0(ijVar.k);
        ijVar.f1();
    }

    @Override // org.telegram.ui.Components.fb
    public void B(gb gbVar, ra raVar, xf xfVar, bl blVar) {
        gbVar.setInOutOffset(gbVar.getMeasuredHeight());
        blVar.accept(Float.valueOf(gbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gbVar, gb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(ks.d);
        ofFloat.addListener(new ah.l(raVar, xfVar, 19));
        ofFloat.addUpdateListener(new de(14, blVar, gbVar));
        ofFloat.start();
    }

    public boolean a(tf.m mVar) {
        return mVar.b == this.a && tf.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.fb
    public void c(gb gbVar, ra raVar, pa paVar, sa saVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gbVar, gb.IN_OUT_OFFSET_Y2, gbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(ks.c);
        ofFloat.addListener(new ah.l(raVar, paVar, 20));
        ofFloat.addUpdateListener(new de(13, saVar, gbVar));
        ofFloat.start();
    }
}
