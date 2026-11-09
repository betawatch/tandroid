package fi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y extends FrameLayout {
    public final v a;
    public t b;
    public c20 c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public y(Activity activity, p2 p2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.a = vVar;
        vVar.setAdapter(new w(this, activity, p2Var, 0));
        vVar.setLayoutManager(new v4.b0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new ai.k(this, 7));
        addView(vVar, c8.ha.c(56.0f, -1));
    }

    public final void a(boolean z9, boolean z10) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z9) {
            return;
        }
        this.e = z9;
        v vVar = this.a;
        if (!z10) {
            this.d = z9 ? 1.0f : 0.0f;
            vVar.invalidate();
            vVar.setVisibility(z9 ? 0 : 8);
            return;
        }
        vVar.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z9 ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 26));
        this.f.addListener(new ch.y(r0, this, z9));
        this.f.setInterpolator(xq.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(c20 c20Var) {
        this.c = c20Var;
    }

    public void setSelected(t tVar) {
        this.b = tVar;
        org.telegram.messenger.g0.b4(this.a);
    }
}
