package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cy extends FrameLayout {
    public static final /* synthetic */ int H = 0;
    public boolean A;
    public ww B;
    public of.m C;
    public boolean D;
    public final gw E;
    public final gw F;
    public final /* synthetic */ dy G;
    public yx a;
    public a6.a b;
    public hw c;
    public lw d;
    public f2.h0 e;
    public ay f;
    public int h;
    public kw n;
    public c2.y r;
    public int s;
    public int v;
    public org.telegram.ui.Components.e00 w;
    public fw x;
    public org.telegram.ui.Components.dk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(Context context, dy dyVar) {
        super(context);
        this.G = dyVar;
        this.E = new gw(this, 1);
        this.F = new gw(this, 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        ((FrameLayout.LayoutParams) this.a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i9, i10);
    }

    public final boolean p() {
        int i9 = this.s;
        return i9 == 0 || i9 == 7 || i9 == 8;
    }

    public final void q(boolean z10) {
        if (((org.telegram.ui.ActionBar.o2) this.G).isPaused) {
            return;
        }
        gw gwVar = this.F;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(gwVar);
            this.a.setItemAnimator(this.x);
            gwVar.run();
        } else {
            if (this.D) {
                return;
            }
            this.D = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(gwVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        cy cyVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            dy dyVar = this.G;
            if (dyVar.c3 && (cyVar = dyVar.a0[0]) == this) {
                dyVar.v0.g(Math.abs(cyVar.getTranslationX()) / dyVar.a0[0].getMeasuredWidth(), dyVar.a0[1].h);
            }
            dyVar.m3();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            this.G.m3();
        }
        super.setTranslationY(f10);
    }
}
