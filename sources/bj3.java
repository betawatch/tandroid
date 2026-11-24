// default package

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bj3 extends FrameLayout {
    public static final /* synthetic */ int M = 0;
    public t29 E;
    public boolean F;
    public ph3 G;
    public oj3 H;
    public boolean I;
    public final zg3 J;
    public final zg3 K;
    public final /* synthetic */ cj3 L;
    public yi3 a;
    public kp b;
    public ah3 c;
    public eh3 d;
    public is5 e;
    public aj3 f;
    public int h;
    public dh3 n;
    public cu6 r;
    public int s;
    public byte w;
    public pi4 x;
    public yg3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj3(cj3 cj3Var, Context context) {
        super(context);
        this.L = cj3Var;
        this.J = new zg3(this, (byte) 1);
        this.K = new zg3(this, (byte) 2);
    }

    public final boolean a() {
        int i = this.s;
        return i == 0 || i == 7 || i == 8;
    }

    public final void b(boolean z) {
        boolean z2;
        z2 = ((d) this.L).isPaused;
        if (z2) {
            return;
        }
        zg3 zg3Var = this.K;
        if (z) {
            gl.r(zg3Var);
            this.a.setItemAnimator(this.y);
            zg3Var.run();
        } else {
            if (this.I) {
                return;
            }
            this.I = true;
            if (!this.y.k()) {
                this.a.setItemAnimator(null);
            }
            gl.e3(zg3Var, 36L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ((FrameLayout.LayoutParams) this.a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        qw4 qw4Var;
        bj3 bj3Var;
        if (getTranslationX() != f) {
            super.setTranslationX(f);
            cj3 cj3Var = this.L;
            if (cj3Var.j3 && (bj3Var = cj3Var.f0[0]) == this) {
                cj3Var.A0.h(Math.abs(bj3Var.getTranslationX()) / cj3Var.f0[0].getMeasuredWidth(), cj3Var.f0[1].h);
            }
            qw4Var = ((d) cj3Var).glassEngine;
            qw4Var.g();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        qw4 qw4Var;
        if (getTranslationY() != f) {
            qw4Var = ((d) this.L).glassEngine;
            qw4Var.g();
        }
        super.setTranslationY(f);
    }
}
