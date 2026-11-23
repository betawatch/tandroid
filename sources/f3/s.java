package f3;

import android.animation.ObjectAnimator;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.zs;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class s implements kb {
    public long a;

    public s(gj gjVar) {
        this.a = gj.B0(gjVar.k);
        gjVar.e1();
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
