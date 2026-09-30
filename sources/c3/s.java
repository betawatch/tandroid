package c3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.ol;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class s implements tb {
    public long a;

    @Override // org.telegram.ui.Components.tb
    public void U(ub ubVar, fb fbVar, pg pgVar, ol olVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        olVar.accept(Float.valueOf(ubVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(mt.d);
        ofFloat.addListener(new ai.z(fbVar, pgVar, 16));
        ofFloat.addUpdateListener(new ai.x(13, olVar, ubVar));
        ofFloat.start();
    }

    public boolean a(lf.n nVar) {
        return nVar.b == this.a && lf.a.c(nVar);
    }

    @Override // org.telegram.ui.Components.tb
    public void g(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, ubVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(mt.c);
        ofFloat.addListener(new ai.z(fbVar, dbVar, 17));
        ofFloat.addUpdateListener(new ai.x(12, gbVar, ubVar));
        ofFloat.start();
    }
}
