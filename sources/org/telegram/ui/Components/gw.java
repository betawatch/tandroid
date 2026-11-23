package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gw extends c5.l {
    public final /* synthetic */ qy x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(qy qyVar, Context context) {
        super(context);
        this.x0 = qyVar;
    }

    @Override // c5.l, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.x0.f) {
            return false;
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // c5.l
    public final void x(int i7, boolean z10) {
        qy qyVar = this.x0;
        vw vwVar = qyVar.J;
        qy.a(qyVar, i7 == 1);
        if (i7 != getCurrentItem()) {
            super.x(i7, z10);
            return;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                qyVar.i0.y0(0);
                return;
            } else {
                qyVar.E0.y0(1);
                return;
            }
        }
        qyVar.R0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vwVar, (Property<vw, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(kr.h);
        ofFloat.start();
        qyVar.F(1, 0);
        if (vwVar != null) {
            vwVar.j(0, true);
        }
    }
}
