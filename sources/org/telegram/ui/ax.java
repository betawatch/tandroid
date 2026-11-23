package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ax extends FrameLayout {
    public static final /* synthetic */ int M = 0;
    public org.telegram.ui.Components.hj0 E;
    public boolean F;
    public uv G;
    public jg.m H;
    public boolean I;
    public final ev J;
    public final ev K;
    public final /* synthetic */ bx L;
    public xw a;
    public a8.xa b;
    public fv c;
    public jv d;
    public v4.z e;
    public zw f;
    public int h;
    public iv n;
    public org.telegram.ui.ActionBar.l5 r;
    public int s;
    public int w;
    public org.telegram.ui.Components.vz x;
    public dv y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(Context context, bx bxVar) {
        super(context);
        this.L = bxVar;
        this.J = new ev(this, 1);
        this.K = new ev(this, 2);
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
        if (((org.telegram.ui.ActionBar.g2) this.L).isPaused) {
            return;
        }
        ev evVar = this.K;
        if (z10) {
            org.telegram.messenger.g0.r(evVar);
            this.a.setItemAnimator(this.y);
            evVar.run();
        } else {
            if (this.I) {
                return;
            }
            this.I = true;
            if (!this.y.k()) {
                this.a.setItemAnimator(null);
            }
            org.telegram.messenger.g0.h3(evVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        ax axVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            bx bxVar = this.L;
            if (bxVar.j3 && (axVar = bxVar.f0[0]) == this) {
                bxVar.A0.h(Math.abs(axVar.getTranslationX()) / bxVar.f0[0].getMeasuredWidth(), bxVar.f0[1].h);
            }
            ((org.telegram.ui.ActionBar.g2) bxVar).glassEngine.g();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            ((org.telegram.ui.ActionBar.g2) this.L).glassEngine.g();
        }
        super.setTranslationY(f10);
    }
}
