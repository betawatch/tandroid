package gi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y extends FrameLayout {
    public final v a;
    public t b;
    public u10 c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public y(Activity activity, n2 n2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.a = vVar;
        vVar.setAdapter(new w(this, activity, n2Var, 0));
        vVar.setLayoutManager(new u4.b0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new ai.j6(this, 8));
        addView(vVar, mf.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        v vVar = this.a;
        if (!z11) {
            this.d = z10 ? 1.0f : 0.0f;
            vVar.invalidate();
            vVar.setVisibility(z10 ? 0 : 8);
            return;
        }
        vVar.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z10 ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new bh.f(this, 27));
        this.f.addListener(new dh.x(9, this, z10));
        this.f.setInterpolator(xq.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(u10 u10Var) {
        this.c = u10Var;
    }

    public void setSelected(t tVar) {
        this.b = tVar;
        org.telegram.messenger.g0.b4(this.a);
    }
}
