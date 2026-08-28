package m3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n implements kb {
    public long a;

    public boolean a(te.m mVar) {
        return mVar.b == this.a && te.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.kb
    public void e(lb lbVar, wa waVar, ua uaVar, xa xaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lbVar, lb.IN_OUT_OFFSET_Y2, lbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(xs.c);
        ofFloat.addListener(new fg.j(waVar, uaVar, 15));
        ofFloat.addUpdateListener(new f2.g(8, xaVar, lbVar));
        ofFloat.start();
    }

    @Override // org.telegram.ui.Components.kb
    public void g(lb lbVar, wa waVar, fg fgVar, dl dlVar) {
        lbVar.setInOutOffset(lbVar.getMeasuredHeight());
        dlVar.accept(Float.valueOf(lbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lbVar, lb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(xs.d);
        ofFloat.addListener(new fg.j(waVar, fgVar, 14));
        ofFloat.addUpdateListener(new f2.g(9, dlVar, lbVar));
        ofFloat.start();
    }
}
