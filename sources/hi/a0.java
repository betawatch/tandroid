package hi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class a0 extends FrameLayout {
    public final x a;
    public v b;
    public x10 c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public a0(Activity activity, n2 n2Var) {
        super(activity);
        x xVar = new x(this, activity);
        this.a = xVar;
        xVar.setAdapter(new y(this, activity, n2Var, 0));
        xVar.setLayoutManager(new v4.c0(0, false));
        xVar.setClipToPadding(false);
        xVar.setVisibility(8);
        xVar.setWillNotDraw(false);
        xVar.setOnItemClickListener(new bi.l8(this, 8));
        addView(xVar, c8.ma.c(56.0f, -1));
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
        x xVar = this.a;
        if (!z11) {
            this.d = z10 ? 1.0f : 0.0f;
            xVar.invalidate();
            xVar.setVisibility(z10 ? 0 : 8);
            return;
        }
        xVar.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z10 ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 27));
        this.f.addListener(new bi.h7(9, this, z10));
        this.f.setInterpolator(nr.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(x10 x10Var) {
        this.c = x10Var;
    }

    public void setSelected(v vVar) {
        this.b = vVar;
        org.telegram.messenger.g0.Z3(this.a);
    }
}
