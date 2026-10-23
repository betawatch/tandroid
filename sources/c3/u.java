package c3;

import ai.ne;
import android.animation.ObjectAnimator;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.xl;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class u implements tb {
    public long a;

    @Override // org.telegram.ui.Components.tb
    public void D0(ub ubVar, fb fbVar, pg pgVar, xl xlVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        xlVar.accept(Float.valueOf(ubVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(st.d);
        ofFloat.addListener(new ne(fbVar, pgVar, 17));
        ofFloat.addUpdateListener(new ah.l0(15, xlVar, ubVar));
        ofFloat.start();
    }

    public boolean a(nf.m mVar) {
        return mVar.b == this.a && nf.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.tb
    public void c(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, ubVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(st.c);
        ofFloat.addListener(new ne(fbVar, dbVar, 18));
        ofFloat.addUpdateListener(new ah.l0(14, gbVar, ubVar));
        ofFloat.start();
    }
}
