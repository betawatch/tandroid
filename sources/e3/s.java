package e3;

import android.animation.ObjectAnimator;
import ci.uc;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.zk;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s implements eb {
    public long a;

    public s(zi ziVar) {
        this.a = zi.B0(ziVar.k);
        ziVar.f1();
    }

    @Override // org.telegram.ui.Components.eb
    public void G(fb fbVar, qa qaVar, vf vfVar, zk zkVar) {
        fbVar.setInOutOffset(fbVar.getMeasuredHeight());
        zkVar.accept(Float.valueOf(fbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fbVar, fb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(ks.d);
        ofFloat.addListener(new bh.j(qaVar, vfVar, 18));
        ofFloat.addUpdateListener(new uc(14, zkVar, fbVar));
        ofFloat.start();
    }

    public boolean a(qf.m mVar) {
        return mVar.b == this.a && qf.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.eb
    public void e(fb fbVar, qa qaVar, oa oaVar, ra raVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fbVar, fb.IN_OUT_OFFSET_Y2, fbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(ks.c);
        ofFloat.addListener(new bh.j(qaVar, oaVar, 19));
        ofFloat.addUpdateListener(new uc(13, raVar, fbVar));
        ofFloat.start();
    }
}
