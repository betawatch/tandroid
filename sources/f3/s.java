package f3;

import android.animation.ObjectAnimator;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.zs;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class s implements kb {
    public long a;

    public s(fj fjVar) {
        this.a = fj.B0(fjVar.k);
        fjVar.e1();
    }

    @Override // org.telegram.ui.Components.kb
    public void J(lb lbVar, wa waVar, og ogVar, rl rlVar) {
        lbVar.setInOutOffset(lbVar.getMeasuredHeight());
        rlVar.accept(Float.valueOf(lbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lbVar, lb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(zs.d);
        ofFloat.addListener(new ah.l(waVar, ogVar, 19));
        ofFloat.addUpdateListener(new ch.w(13, rlVar, lbVar));
        ofFloat.start();
    }

    public boolean a(tf.m mVar) {
        return mVar.b == this.a && tf.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.kb
    public void j(lb lbVar, wa waVar, ua uaVar, xa xaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lbVar, lb.IN_OUT_OFFSET_Y2, lbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(zs.c);
        ofFloat.addListener(new ah.l(waVar, uaVar, 20));
        ofFloat.addUpdateListener(new ch.w(12, xaVar, lbVar));
        ofFloat.start();
    }
}
