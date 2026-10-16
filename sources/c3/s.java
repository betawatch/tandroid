package c3;

import ah.l0;
import android.animation.ObjectAnimator;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.zl;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class s implements vb {
    public long a;

    @Override // org.telegram.ui.Components.vb
    public void X(wb wbVar, hb hbVar, qg qgVar, zl zlVar) {
        wbVar.setInOutOffset(wbVar.getMeasuredHeight());
        zlVar.accept(Float.valueOf(wbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wbVar, wb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(xt.d);
        ofFloat.addListener(new bi.t(hbVar, qgVar, 16));
        ofFloat.addUpdateListener(new l0(14, zlVar, wbVar));
        ofFloat.start();
    }

    public boolean a(nf.m mVar) {
        return mVar.b == this.a && nf.a.c(mVar);
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
