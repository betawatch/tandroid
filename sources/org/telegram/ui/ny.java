package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ny extends FrameLayout {
    public static final /* synthetic */ int I = 0;
    public boolean B;
    public hx C;
    public tf.k D;
    public boolean E;
    public final rw F;
    public final rw G;
    public final /* synthetic */ oy H;
    public ky a;
    public b4.e0 b;
    public sw c;
    public ww d;
    public f2.e0 e;
    public my f;
    public int h;
    public vw n;
    public c2.y r;
    public int s;
    public int v;
    public org.telegram.ui.Components.t00 w;
    public qw x;
    public org.telegram.ui.Components.zk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny(Context context, oy oyVar) {
        super(context);
        this.H = oyVar;
        this.F = new rw(this, 1);
        this.G = new rw(this, 2);
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
        rw rwVar = this.G;
        if (z4) {
            AndroidUtilities.cancelRunOnUIThread(rwVar);
            this.a.setItemAnimator(this.x);
            rwVar.run();
        } else {
            if (this.E) {
                return;
            }
            this.E = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(rwVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        ny nyVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            oy oyVar = this.H;
            if (oyVar.d3 && (nyVar = oyVar.b0[0]) == this) {
                oyVar.w0.g(Math.abs(nyVar.getTranslationX()) / oyVar.b0[0].getMeasuredWidth(), oyVar.b0[1].h);
            }
            oyVar.m3();
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
