package hi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y extends FrameLayout {
    public final v a;
    public t b;
    public z10 c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public y(Activity activity, n2 n2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.a = vVar;
        vVar.setAdapter(new w(this, activity, n2Var, 0));
        vVar.setLayoutManager(new v4.b0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new bi.b6(this, 8));
        addView(vVar, c8.ja.c(56.0f, -1));
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
        ofFloat.addUpdateListener(new ah.h(this, 27));
        this.f.addListener(new bi.v4(9, this, z10));
        this.f.setInterpolator(er.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(z10 z10Var) {
        this.c = z10Var;
    }

    public void setSelected(t tVar) {
        this.b = tVar;
        org.telegram.messenger.g0.a4(this.a);
    }
}
