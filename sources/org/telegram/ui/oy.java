package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class oy extends FrameLayout {
    public static final /* synthetic */ int I = 0;
    public boolean B;
    public ix C;
    public uf.k D;
    public boolean E;
    public final sw F;
    public final sw G;
    public final /* synthetic */ py H;
    public ly a;
    public b4.e0 b;
    public tw c;
    public xw d;
    public f2.f0 e;
    public ny f;
    public int h;
    public ww n;
    public c2.y r;
    public int s;
    public int v;
    public org.telegram.ui.Components.u00 w;
    public rw x;
    public org.telegram.ui.Components.al0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy(Context context, py pyVar) {
        super(context);
        this.H = pyVar;
        this.F = new sw(this, 1);
        this.G = new sw(this, 2);
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

    public final void q(boolean z4) {
        if (((org.telegram.ui.ActionBar.p2) this.H).isPaused) {
            return;
        }
        sw swVar = this.G;
        if (z4) {
            AndroidUtilities.cancelRunOnUIThread(swVar);
            this.a.setItemAnimator(this.x);
            swVar.run();
        } else {
            if (this.E) {
                return;
            }
            this.E = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(swVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        oy oyVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            py pyVar = this.H;
            if (pyVar.d3 && (oyVar = pyVar.b0[0]) == this) {
                pyVar.w0.g(Math.abs(oyVar.getTranslationX()) / pyVar.b0[0].getMeasuredWidth(), pyVar.b0[1].h);
            }
            pyVar.m3();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            this.H.m3();
        }
        super.setTranslationY(f10);
    }
}
