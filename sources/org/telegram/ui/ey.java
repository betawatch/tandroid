package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ey extends FrameLayout {
    public static final /* synthetic */ int H = 0;
    public boolean A;
    public yw B;
    public rf.l C;
    public boolean D;
    public final iw E;
    public final iw F;
    public final /* synthetic */ fy G;
    public ay a;
    public ag.j2 b;
    public jw c;
    public nw d;
    public f2.e0 e;
    public dy f;
    public int h;
    public mw n;
    public c2.z r;
    public int s;
    public int v;
    public org.telegram.ui.Components.p00 w;
    public hw x;
    public org.telegram.ui.Components.pk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(Context context, fy fyVar) {
        super(context);
        this.G = fyVar;
        this.E = new iw(this, 1);
        this.F = new iw(this, 2);
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
        if (((org.telegram.ui.ActionBar.o2) this.G).isPaused) {
            return;
        }
        iw iwVar = this.F;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(iwVar);
            this.a.setItemAnimator(this.x);
            iwVar.run();
        } else {
            if (this.D) {
                return;
            }
            this.D = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(iwVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f9) {
        ey eyVar;
        if (getTranslationX() != f9) {
            super.setTranslationX(f9);
            fy fyVar = this.G;
            if (fyVar.c3 && (eyVar = fyVar.a0[0]) == this) {
                fyVar.v0.g(Math.abs(eyVar.getTranslationX()) / fyVar.a0[0].getMeasuredWidth(), fyVar.a0[1].h);
            }
            fyVar.m3();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            this.G.m3();
        }
        super.setTranslationY(f9);
    }
}
