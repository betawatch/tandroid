package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ay extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public boolean E;
    public rw F;
    public ig.n G;
    public boolean H;
    public final bw I;
    public final bw J;
    public final /* synthetic */ cy K;
    public wx a;
    public a8.ng b;
    public cw c;
    public gw d;
    public s4.z e;
    public zx f;
    public int h;
    public fw n;
    public org.telegram.ui.Components.pl0 r;
    public int s;
    public int v;
    public org.telegram.ui.Components.c10 w;
    public aw x;
    public org.telegram.ui.Components.ql0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(Context context, cy cyVar) {
        super(context);
        this.K = cyVar;
        this.I = new bw(this, 1);
        this.J = new bw(this, 2);
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
        bw bwVar = this.J;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(bwVar);
            this.a.setItemAnimator(this.x);
            bwVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(bwVar, 36L);
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
            ((org.telegram.ui.ActionBar.r2) cyVar).glassEngine.g();
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
