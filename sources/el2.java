// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class el2 extends FrameLayout {
    public final iw a;
    public al2 b;
    public pcc c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public el2(Activity activity, rk4 rk4Var) {
        super(activity);
        iw iwVar = new iw(this, activity);
        this.a = iwVar;
        iwVar.setAdapter(new cl2(this, activity, rk4Var, (byte) 0));
        iwVar.setLayoutManager(new x46(0, false));
        iwVar.setClipToPadding(false);
        iwVar.setVisibility(8);
        iwVar.setWillNotDraw(false);
        iwVar.setOnItemClickListener(new u(this, (byte) 14));
        addView(iwVar, tre.c(56.0f, -1));
    }

    public final void a(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z) {
            return;
        }
        this.e = z;
        iw iwVar = this.a;
        if (!z2) {
            this.d = z ? 1.0f : 0.0f;
            iwVar.invalidate();
            iwVar.setVisibility(z ? 0 : 8);
            return;
        }
        iwVar.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new az1(this, (byte) 13));
        this.f.addListener(new z7((byte) 21, (Object) this, z));
        this.f.setInterpolator(k43.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(pcc pccVar) {
        this.c = pccVar;
    }

    public void setSelected(al2 al2Var) {
        this.b = al2Var;
        hl.V3(this.a);
    }
}
