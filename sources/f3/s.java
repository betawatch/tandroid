package f3;

import android.animation.ObjectAnimator;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.ws;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class s implements jb {
    public long a;

    public s(fj fjVar) {
        this.a = fj.B0(fjVar.k);
        fjVar.e1();
    }

    @Override // org.telegram.ui.Components.jb
    public void H(kb kbVar, va vaVar, ng ngVar, pl plVar) {
        kbVar.setInOutOffset(kbVar.getMeasuredHeight());
        plVar.accept(Float.valueOf(kbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kbVar, kb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(ws.d);
        ofFloat.addListener(new ah.l(vaVar, ngVar, 19));
        ofFloat.addUpdateListener(new ch.w(13, plVar, kbVar));
        ofFloat.start();
    }

    public boolean a(tf.m mVar) {
        return mVar.b == this.a && tf.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.jb
    public void b(kb kbVar, va vaVar, ta taVar, wa waVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kbVar, kb.IN_OUT_OFFSET_Y2, kbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(ws.c);
        ofFloat.addListener(new ah.l(vaVar, taVar, 20));
        ofFloat.addUpdateListener(new ch.w(12, waVar, kbVar));
        ofFloat.start();
    }
}
