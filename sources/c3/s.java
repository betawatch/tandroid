package c3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class s implements wb {
    public long a;

    public boolean a(mf.n nVar) {
        return nVar.b == this.a && mf.a.c(nVar);
    }

    @Override // org.telegram.ui.Components.wb
    public void d(xb xbVar, ib ibVar, gb gbVar, jb jbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xbVar, xb.IN_OUT_OFFSET_Y2, xbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(au.c);
        ofFloat.addListener(new ai.z(ibVar, gbVar, 17));
        ofFloat.addUpdateListener(new ai.x(12, jbVar, xbVar));
        ofFloat.start();
    }

    @Override // org.telegram.ui.Components.wb
    public void z(xb xbVar, ib ibVar, rg rgVar, dm dmVar) {
        xbVar.setInOutOffset(xbVar.getMeasuredHeight());
        dmVar.accept(Float.valueOf(xbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xbVar, xb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(au.d);
        ofFloat.addListener(new ai.z(ibVar, rgVar, 16));
        ofFloat.addUpdateListener(new ai.x(13, dmVar, xbVar));
        ofFloat.start();
    }
}
