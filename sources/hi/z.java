package hi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class z extends FrameLayout {
    public final w a;
    public u b;
    public x10 c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public z(Activity activity, o2 o2Var) {
        super(activity);
        w wVar = new w(this, activity);
        this.a = wVar;
        wVar.setAdapter(new x(this, activity, o2Var, 0));
        wVar.setLayoutManager(new v4.c0(0, false));
        wVar.setClipToPadding(false);
        wVar.setVisibility(8);
        wVar.setWillNotDraw(false);
        wVar.setOnItemClickListener(new bi.h8(this, 8));
        addView(wVar, c8.ma.c(56.0f, -1));
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
        w wVar = this.a;
        if (!z11) {
            this.d = z10 ? 1.0f : 0.0f;
            wVar.invalidate();
            wVar.setVisibility(z10 ? 0 : 8);
            return;
        }
        wVar.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z10 ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 27));
        this.f.addListener(new bi.d7(9, this, z10));
        this.f.setInterpolator(lr.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(x10 x10Var) {
        this.c = x10Var;
    }

    public void setSelected(u uVar) {
        this.b = uVar;
        org.telegram.messenger.g0.Z3(this.a);
    }
}
