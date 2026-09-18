package ci;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class y extends FrameLayout {
    public final v a;
    public t b;
    public Utilities.Callback c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public y(Activity activity, y2 y2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.a = vVar;
        vVar.setAdapter(new w(this, activity, y2Var));
        vVar.setLayoutManager(new s4.c0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new ai.g(this, 2));
        addView(vVar, w7.y5.c(56.0f, -1));
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
        ofFloat.addUpdateListener(new ai.a(this, 16));
        this.f.addListener(new ai.n(r0, this, z10));
        this.f.setInterpolator(qr.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(Utilities.Callback<t> callback) {
        this.c = callback;
    }

    public void setSelected(t tVar) {
        this.b = tVar;
        AndroidUtilities.updateVisibleRows(this.a);
    }
}
