package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class dy extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public boolean E;
    public ww F;
    public hg.m G;
    public boolean H;
    public final gw I;
    public final gw J;
    public final /* synthetic */ ey K;
    public zx a;
    public a5.a b;
    public hw c;
    public lw d;
    public s4.y e;
    public cy f;
    public int h;
    public kw n;
    public org.telegram.ui.Components.pl0 r;
    public int s;
    public int v;
    public org.telegram.ui.Components.b10 w;
    public fw x;
    public org.telegram.ui.Components.rl0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(Context context, ey eyVar) {
        super(context);
        this.K = eyVar;
        this.I = new gw(this, 1);
        this.J = new gw(this, 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.s;
        return i10 == 0 || i10 == 7 || i10 == 8;
    }

    public final void q(boolean z10) {
        if (((org.telegram.ui.ActionBar.o2) this.K).isPaused) {
            return;
        }
        gw gwVar = this.J;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(gwVar);
            this.a.setItemAnimator(this.x);
            gwVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(gwVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        dy dyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            ey eyVar = this.K;
            if (eyVar.h3 && (dyVar = eyVar.e0[0]) == this) {
                eyVar.z0.g(Math.abs(dyVar.getTranslationX()) / eyVar.e0[0].getMeasuredWidth(), eyVar.e0[1].h);
            }
            eyVar.i3();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            this.K.i3();
        }
        super.setTranslationY(f7);
    }
}
