package hi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class h0 extends FrameLayout {
    public final e0 a;
    public c0 b;
    public w10 c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public h0(Activity activity, w2 w2Var) {
        super(activity);
        e0 e0Var = new e0(this, activity);
        this.a = e0Var;
        e0Var.setAdapter(new f0(this, activity, w2Var, 0));
        e0Var.setLayoutManager(new v4.c0(0, false));
        e0Var.setClipToPadding(false);
        e0Var.setVisibility(8);
        e0Var.setWillNotDraw(false);
        e0Var.setOnItemClickListener(new bi.n8(this, 8));
        addView(e0Var, c8.na.c(56.0f, -1));
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
        e0 e0Var = this.a;
        if (!z11) {
            this.d = z10 ? 1.0f : 0.0f;
            e0Var.invalidate();
            e0Var.setVisibility(z10 ? 0 : 8);
            return;
        }
        e0Var.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z10 ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 27));
        this.f.addListener(new bi.j7(9, this, z10));
        this.f.setInterpolator(kr.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(w10 w10Var) {
        this.c = w10Var;
    }

    public void setSelected(c0 c0Var) {
        this.b = c0Var;
        org.telegram.messenger.g0.Z3(this.a);
    }
}
