package c3;

import ai.me;
import android.animation.ObjectAnimator;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.xl;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class s implements tb {
    public long a;

    @Override // org.telegram.ui.Components.tb
    public void D0(ub ubVar, fb fbVar, pg pgVar, xl xlVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        xlVar.accept(Float.valueOf(ubVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(st.d);
        ofFloat.addListener(new me(fbVar, pgVar, 17));
        ofFloat.addUpdateListener(new ah.l0(15, xlVar, ubVar));
        ofFloat.start();
    }

    public boolean a(nf.m mVar) {
        return mVar.b == this.a && nf.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.tb
    public void d(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, ubVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(st.c);
        ofFloat.addListener(new me(fbVar, dbVar, 18));
        ofFloat.addUpdateListener(new ah.l0(14, gbVar, ubVar));
        ofFloat.start();
    }
}
