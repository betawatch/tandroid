package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kw extends m2.g {
    public final /* synthetic */ yy s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(yy yyVar, Context context) {
        super(context);
        this.s0 = yyVar;
    }

    @Override // m2.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.s0.f) {
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

    @Override // m2.g
    public final void x(int i10, boolean z10) {
        yy yyVar = this.s0;
        uv uvVar = yyVar.E;
        yy.b(yyVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                yyVar.d0.x0(0);
                return;
            } else {
                yyVar.z0.x0(1);
                return;
            }
        }
        yyVar.M0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(uvVar, (Property<uv, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(er.h);
        ofFloat.start();
        yyVar.I(1, 0);
        if (uvVar != null) {
            uvVar.j(0, true);
        }
    }
}
