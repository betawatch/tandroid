package f3;

import android.animation.ObjectAnimator;
import bi.de;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.wf;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class s implements eb {
    public long a;

    public s(ij ijVar) {
        this.a = ij.B0(ijVar.k);
        ijVar.e1();
    }

    @Override // org.telegram.ui.Components.eb
    public void B(fb fbVar, qa qaVar, wf wfVar, al alVar) {
        fbVar.setInOutOffset(fbVar.getMeasuredHeight());
        alVar.accept(Float.valueOf(fbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fbVar, fb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(js.d);
        ofFloat.addListener(new ah.l(qaVar, wfVar, 19));
        ofFloat.addUpdateListener(new de(14, alVar, fbVar));
        ofFloat.start();
    }

    public boolean a(tf.m mVar) {
        return mVar.b == this.a && tf.a.c(mVar);
    }

    @Override // org.telegram.ui.Components.eb
    public void c(fb fbVar, qa qaVar, oa oaVar, ra raVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fbVar, fb.IN_OUT_OFFSET_Y2, fbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(js.c);
        ofFloat.addListener(new ah.l(qaVar, oaVar, 20));
        ofFloat.addUpdateListener(new de(13, raVar, fbVar));
        ofFloat.start();
    }
}
