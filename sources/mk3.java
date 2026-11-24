// default package

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mk3 extends FrameLayout {
    public static final /* synthetic */ int M = 0;
    public w49 E;
    public boolean F;
    public bj3 G;
    public zk3 H;
    public boolean I;
    public final li3 J;
    public final li3 K;
    public final /* synthetic */ nk3 L;
    public jk3 a;
    public kq b;
    public mi3 c;
    public qi3 d;
    public hu5 e;
    public lk3 f;
    public int h;
    public pi3 n;
    public cw6 r;
    public int s;
    public byte w;
    public tk4 x;
    public ki3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk3(nk3 nk3Var, Context context) {
        super(context);
        this.L = nk3Var;
        this.J = new li3(this, (byte) 1);
        this.K = new li3(this, (byte) 2);
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
        li3 li3Var = this.K;
        if (z) {
            gm.r(li3Var);
            this.a.setItemAnimator(this.y);
            li3Var.run();
        } else {
            if (this.I) {
                return;
            }
            this.I = true;
            if (!this.y.k()) {
                this.a.setItemAnimator(null);
            }
            gm.d3(li3Var, 36L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ((FrameLayout.LayoutParams) this.a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        sy4 sy4Var;
        mk3 mk3Var;
        if (getTranslationX() != f) {
            super.setTranslationX(f);
            nk3 nk3Var = this.L;
            if (nk3Var.j3 && (mk3Var = nk3Var.f0[0]) == this) {
                nk3Var.A0.h(Math.abs(mk3Var.getTranslationX()) / nk3Var.f0[0].getMeasuredWidth(), nk3Var.f0[1].h);
            }
            sy4Var = ((d) nk3Var).glassEngine;
            sy4Var.g();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        sy4 sy4Var;
        if (getTranslationY() != f) {
            sy4Var = ((d) this.L).glassEngine;
            sy4Var.g();
        }
        super.setTranslationY(f);
    }
}
