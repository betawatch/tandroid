package o3;

import android.animation.ObjectAnimator;
import bg.b3;
import bg.c3;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.za;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n implements qb {
    public long a;

    public boolean a(we.m mVar) {
        return mVar.b == this.a && we.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.qb
    public void e(rb rbVar, bb bbVar, za zaVar, cb cbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rbVar, rb.IN_OUT_OFFSET_Y2, rbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(ct.c);
        ofFloat.addListener(new c3(bbVar, zaVar, 18));
        ofFloat.addUpdateListener(new b3(10, cbVar, rbVar));
        ofFloat.start();
    }

    @Override // org.telegram.ui.Components.qb
    public void r(rb rbVar, bb bbVar, ig igVar, hl hlVar) {
        rbVar.setInOutOffset(rbVar.getMeasuredHeight());
        hlVar.accept(Float.valueOf(rbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rbVar, rb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(ct.d);
        ofFloat.addListener(new c3(bbVar, igVar, 17));
        ofFloat.addUpdateListener(new b3(11, hlVar, rbVar));
        ofFloat.start();
    }
}
