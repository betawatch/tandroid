package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ay extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public boolean E;
    public uw F;
    public hg.m G;
    public boolean H;
    public final ew I;
    public final ew J;
    public final /* synthetic */ cy K;
    public xx a;
    public a5.a b;
    public fw c;
    public jw d;
    public s4.y e;
    public zx f;
    public int h;
    public iw n;
    public org.telegram.ui.Components.ll0 r;
    public int s;
    public int v;
    public org.telegram.ui.Components.b10 w;
    public dw x;
    public org.telegram.ui.Components.nl0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(Context context, cy cyVar) {
        super(context);
        this.K = cyVar;
        this.I = new ew(this, 1);
        this.J = new ew(this, 2);
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
        if (((org.telegram.ui.ActionBar.n2) this.K).isPaused) {
            return;
        }
        ew ewVar = this.J;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(ewVar);
            this.a.setItemAnimator(this.x);
            ewVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(ewVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        ay ayVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            cy cyVar = this.K;
            if (cyVar.h3 && (ayVar = cyVar.e0[0]) == this) {
                cyVar.z0.g(Math.abs(ayVar.getTranslationX()) / cyVar.e0[0].getMeasuredWidth(), cyVar.e0[1].h);
            }
            cyVar.j3();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            this.K.j3();
        }
        super.setTranslationY(f7);
    }
}
