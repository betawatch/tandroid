package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class py extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public boolean E;
    public ix F;
    public gg.m G;
    public boolean H;
    public final sw I;
    public final sw J;
    public final /* synthetic */ qy K;
    public my a;
    public a5.a b;
    public tw c;
    public xw d;
    public s4.y e;
    public oy f;
    public int h;
    public ww n;
    public org.telegram.ui.Components.zk0 r;
    public int s;
    public int v;
    public org.telegram.ui.Components.u00 w;
    public rw x;
    public org.telegram.ui.Components.bl0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py(Context context, qy qyVar) {
        super(context);
        this.K = qyVar;
        this.I = new sw(this, 1);
        this.J = new sw(this, 2);
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
        if (((org.telegram.ui.ActionBar.m2) this.K).isPaused) {
            return;
        }
        sw swVar = this.J;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(swVar);
            this.a.setItemAnimator(this.x);
            swVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(swVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        py pyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            qy qyVar = this.K;
            if (qyVar.g3 && (pyVar = qyVar.e0[0]) == this) {
                qyVar.z0.g(Math.abs(pyVar.getTranslationX()) / qyVar.e0[0].getMeasuredWidth(), qyVar.e0[1].h);
            }
            qyVar.m3();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            this.K.m3();
        }
        super.setTranslationY(f7);
    }
}
