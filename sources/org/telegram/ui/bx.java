package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class bx extends FrameLayout {
    public static final /* synthetic */ int M = 0;
    public org.telegram.ui.Components.fj0 E;
    public boolean F;
    public vv G;
    public jg.m H;
    public boolean I;
    public final fv J;
    public final fv K;
    public final /* synthetic */ cx L;
    public yw a;
    public a8.xa b;
    public gv c;
    public kv d;
    public v4.z e;
    public ax f;
    public int h;
    public jv n;
    public org.telegram.ui.ActionBar.l5 r;
    public int s;
    public int w;
    public org.telegram.ui.Components.wz x;
    public ev y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(Context context, cx cxVar) {
        super(context);
        this.L = cxVar;
        this.J = new fv(this, 1);
        this.K = new fv(this, 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ((FrameLayout.LayoutParams) this.a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
    }

    public final boolean p() {
        int i7 = this.s;
        return i7 == 0 || i7 == 7 || i7 == 8;
    }

    public final void q(boolean z10) {
        if (((org.telegram.ui.ActionBar.h2) this.L).isPaused) {
            return;
        }
        fv fvVar = this.K;
        if (z10) {
            org.telegram.messenger.g0.r(fvVar);
            this.a.setItemAnimator(this.y);
            fvVar.run();
        } else {
            if (this.I) {
                return;
            }
            this.I = true;
            if (!this.y.k()) {
                this.a.setItemAnimator(null);
            }
            org.telegram.messenger.g0.h3(fvVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        bx bxVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            cx cxVar = this.L;
            if (cxVar.j3 && (bxVar = cxVar.f0[0]) == this) {
                cxVar.A0.h(Math.abs(bxVar.getTranslationX()) / cxVar.f0[0].getMeasuredWidth(), cxVar.f0[1].h);
            }
            ((org.telegram.ui.ActionBar.h2) cxVar).glassEngine.g();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            ((org.telegram.ui.ActionBar.h2) this.L).glassEngine.g();
        }
        super.setTranslationY(f10);
    }
}
