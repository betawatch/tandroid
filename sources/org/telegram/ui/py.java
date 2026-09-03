package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class py extends FrameLayout {
    public static final /* synthetic */ int I = 0;
    public boolean B;
    public jx C;
    public tf.k D;
    public boolean E;
    public final tw F;
    public final tw G;
    public final /* synthetic */ qy H;
    public my a;
    public b4.e0 b;
    public uw c;
    public yw d;
    public f2.e0 e;
    public oy f;
    public int h;
    public xw n;
    public c2.z r;
    public int s;
    public int v;
    public org.telegram.ui.Components.u00 w;
    public sw x;
    public org.telegram.ui.Components.yk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py(Context context, qy qyVar) {
        super(context);
        this.H = qyVar;
        this.F = new tw(this, 1);
        this.G = new tw(this, 2);
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
        tw twVar = this.G;
        if (z4) {
            AndroidUtilities.cancelRunOnUIThread(twVar);
            this.a.setItemAnimator(this.x);
            twVar.run();
        } else {
            if (this.E) {
                return;
            }
            this.E = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(twVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        py pyVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            qy qyVar = this.H;
            if (qyVar.d3 && (pyVar = qyVar.b0[0]) == this) {
                qyVar.w0.g(Math.abs(pyVar.getTranslationX()) / qyVar.b0[0].getMeasuredWidth(), qyVar.b0[1].h);
            }
            qyVar.m3();
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
