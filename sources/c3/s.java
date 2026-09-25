package c3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.nl;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class s implements tb {
    public long a;

    @Override // org.telegram.ui.Components.tb
    public void U(ub ubVar, fb fbVar, pg pgVar, nl nlVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        nlVar.accept(Float.valueOf(ubVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(lt.d);
        ofFloat.addListener(new ai.z(fbVar, pgVar, 16));
        ofFloat.addUpdateListener(new ai.x(13, nlVar, ubVar));
        ofFloat.start();
    }

    public boolean a(lf.n nVar) {
        return nVar.b == this.a && lf.a.c(nVar);
    }

    @Override // org.telegram.ui.Components.tb
    public void g(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, ubVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(lt.c);
        ofFloat.addListener(new ai.z(fbVar, dbVar, 17));
        ofFloat.addUpdateListener(new ai.x(12, gbVar, ubVar));
        ofFloat.start();
    }
}
