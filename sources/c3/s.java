package c3;

import ah.l0;
import android.animation.ObjectAnimator;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xt;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class s implements vb {
    public long a;

    public boolean a(nf.m mVar) {
        return mVar.b == this.a && nf.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.vb
    public void a0(wb wbVar, hb hbVar, qg qgVar, am amVar) {
        wbVar.setInOutOffset(wbVar.getMeasuredHeight());
        amVar.accept(Float.valueOf(wbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wbVar, wb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(xt.d);
        ofFloat.addListener(new bi.t(hbVar, qgVar, 16));
        ofFloat.addUpdateListener(new l0(14, amVar, wbVar));
        ofFloat.start();
    }

    @Override // org.telegram.ui.Components.vb
    public void d(wb wbVar, hb hbVar, fb fbVar, ib ibVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wbVar, wb.IN_OUT_OFFSET_Y2, wbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(xt.c);
        ofFloat.addListener(new bi.t(hbVar, fbVar, 17));
        ofFloat.addUpdateListener(new l0(13, ibVar, wbVar));
        ofFloat.start();
    }
}
