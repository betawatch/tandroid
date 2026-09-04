package c3;

import ah.m0;
import android.animation.ObjectAnimator;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class s implements tb {
    public long a;

    public boolean a(mf.m mVar) {
        return mVar.b == this.a && mf.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.tb
    public void e(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, ubVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(jt.c);
        ofFloat.addListener(new bi.t(fbVar, dbVar, 17));
        ofFloat.addUpdateListener(new m0(13, gbVar, ubVar));
        ofFloat.start();
    }

    @Override // org.telegram.ui.Components.tb
    public void h0(ub ubVar, fb fbVar, pg pgVar, ml mlVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        mlVar.accept(Float.valueOf(ubVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(jt.d);
        ofFloat.addListener(new bi.t(fbVar, pgVar, 16));
        ofFloat.addUpdateListener(new m0(14, mlVar, ubVar));
        ofFloat.start();
    }
}
