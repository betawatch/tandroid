package f3;

import android.animation.ObjectAnimator;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class s implements kb {
    public long a;

    public s(fj fjVar) {
        this.a = fj.B0(fjVar.k);
        fjVar.e1();
    }

    public boolean a(tf.m mVar) {
        return mVar.b == this.a && tf.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.kb
    public void j(lb lbVar, wa waVar, ua uaVar, xa xaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lbVar, lb.IN_OUT_OFFSET_Y2, lbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(xs.c);
        ofFloat.addListener(new ah.l(waVar, uaVar, 20));
        ofFloat.addUpdateListener(new ch.w(12, xaVar, lbVar));
        ofFloat.start();
    }

    @Override // org.telegram.ui.Components.kb
    public void u(lb lbVar, wa waVar, lg lgVar, pl plVar) {
        lbVar.setInOutOffset(lbVar.getMeasuredHeight());
        plVar.accept(Float.valueOf(lbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lbVar, lb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(xs.d);
        ofFloat.addListener(new ah.l(waVar, lgVar, 19));
        ofFloat.addUpdateListener(new ch.w(13, plVar, lbVar));
        ofFloat.start();
    }
}
