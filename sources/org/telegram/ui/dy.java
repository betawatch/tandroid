package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dy extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public boolean E;
    public tw F;
    public ig.n G;
    public boolean H;
    public final dw I;
    public final dw J;
    public final /* synthetic */ ey K;
    public zx a;
    public a8.ng b;
    public ew c;
    public iw d;
    public s4.z e;
    public cy f;
    public int h;
    public hw n;
    public org.telegram.ui.Components.ql0 r;
    public int s;
    public int v;
    public org.telegram.ui.Components.c10 w;
    public cw x;
    public org.telegram.ui.Components.rl0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(Context context, ey eyVar) {
        super(context);
        this.K = eyVar;
        this.I = new dw(this, 1);
        this.J = new dw(this, 2);
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
        if (((org.telegram.ui.ActionBar.r2) this.K).isPaused) {
            return;
        }
        dw dwVar = this.J;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(dwVar);
            this.a.setItemAnimator(this.x);
            dwVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(dwVar, 36L);
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
            ((org.telegram.ui.ActionBar.r2) eyVar).glassEngine.g();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            ((org.telegram.ui.ActionBar.r2) this.K).glassEngine.g();
        }
        super.setTranslationY(f7);
    }
}
