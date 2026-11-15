package f3;

import android.animation.ObjectAnimator;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.qs;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class s implements bb {
    public long a;

    public s(gj gjVar) {
        this.a = gj.B0(gjVar.k);
        gjVar.e1();
    }

    public boolean a(tf.m mVar) {
        return mVar.b == this.a && tf.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.bb
    public void b(cb cbVar, na naVar, la laVar, oa oaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cbVar, cb.IN_OUT_OFFSET_Y2, cbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(qs.c);
        ofFloat.addListener(new ah.l(naVar, laVar, 20));
        ofFloat.addUpdateListener(new ch.v(12, oaVar, cbVar));
        ofFloat.start();
    }

    @Override // org.telegram.ui.Components.bb
    public void y(cb cbVar, na naVar, dg dgVar, il ilVar) {
        cbVar.setInOutOffset(cbVar.getMeasuredHeight());
        ilVar.accept(Float.valueOf(cbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cbVar, cb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(qs.d);
        ofFloat.addListener(new ah.l(naVar, dgVar, 19));
        ofFloat.addUpdateListener(new ch.v(13, ilVar, cbVar));
        ofFloat.start();
    }
}
