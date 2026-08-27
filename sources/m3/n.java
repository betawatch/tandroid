package m3;

import ag.t2;
import ag.x1;
import android.animation.ObjectAnimator;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.ws;
import org.telegram.ui.Components.zk;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n implements ib {
    public long a;

    public boolean a(ue.m mVar) {
        return mVar.b == this.a && ue.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.ib
    public void c(jb jbVar, ua uaVar, sa saVar, va vaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jbVar, jb.IN_OUT_OFFSET_Y2, jbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(ws.c);
        ofFloat.addListener(new x1(uaVar, saVar, 17));
        ofFloat.addUpdateListener(new t2(9, vaVar, jbVar));
        ofFloat.start();
    }

    @Override // org.telegram.ui.Components.ib
    public void g(jb jbVar, ua uaVar, bg bgVar, zk zkVar) {
        jbVar.setInOutOffset(jbVar.getMeasuredHeight());
        zkVar.accept(Float.valueOf(jbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jbVar, jb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(ws.d);
        ofFloat.addListener(new x1(uaVar, bgVar, 16));
        ofFloat.addUpdateListener(new t2(10, zkVar, jbVar));
        ofFloat.start();
    }
}
