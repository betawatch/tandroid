package c3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.tb;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class s implements sb {
    public long a;

    @Override // org.telegram.ui.Components.sb
    public void U(tb tbVar, eb ebVar, og ogVar, ml mlVar) {
        tbVar.setInOutOffset(tbVar.getMeasuredHeight());
        mlVar.accept(Float.valueOf(tbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tbVar, tb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(kt.d);
        ofFloat.addListener(new ai.z(ebVar, ogVar, 16));
        ofFloat.addUpdateListener(new ai.x(13, mlVar, tbVar));
        ofFloat.start();
    }

    public boolean a(lf.n nVar) {
        return nVar.b == this.a && lf.a.c(nVar);
    }

    @Override // org.telegram.ui.Components.sb
    public void g(tb tbVar, eb ebVar, cb cbVar, fb fbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tbVar, tb.IN_OUT_OFFSET_Y2, tbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(kt.c);
        ofFloat.addListener(new ai.z(ebVar, cbVar, 17));
        ofFloat.addUpdateListener(new ai.x(12, fbVar, tbVar));
        ofFloat.start();
    }
}
