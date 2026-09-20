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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
