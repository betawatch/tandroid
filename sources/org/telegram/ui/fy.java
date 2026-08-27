package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fy extends FrameLayout {
    public static final /* synthetic */ int H = 0;
    public boolean A;
    public zw B;
    public pf.k C;
    public boolean D;
    public final jw E;
    public final jw F;
    public final /* synthetic */ gy G;
    public cy a;
    public b6.a b;
    public kw c;
    public ow d;
    public f2.f0 e;
    public ey f;
    public int h;
    public nw n;
    public c2.x r;
    public int s;
    public int v;
    public org.telegram.ui.Components.h00 w;
    public iw x;
    public org.telegram.ui.Components.gk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy(Context context, gy gyVar) {
        super(context);
        this.G = gyVar;
        this.E = new jw(this, 1);
        this.F = new jw(this, 2);
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
        if (((org.telegram.ui.ActionBar.n2) this.G).isPaused) {
            return;
        }
        jw jwVar = this.F;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(jwVar);
            this.a.setItemAnimator(this.x);
            jwVar.run();
        } else {
            if (this.D) {
                return;
            }
            this.D = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(jwVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        fy fyVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            gy gyVar = this.G;
            if (gyVar.c3 && (fyVar = gyVar.a0[0]) == this) {
                gyVar.v0.g(Math.abs(fyVar.getTranslationX()) / gyVar.a0[0].getMeasuredWidth(), gyVar.a0[1].h);
            }
            gyVar.m3();
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
