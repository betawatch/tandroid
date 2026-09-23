package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class zw extends z4.g {
    public final /* synthetic */ lz w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(lz lzVar, Context context) {
        super(context);
        this.w0 = lzVar;
    }

    @Override // z4.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.w0.f) {
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

    @Override // z4.g
    public final void x(int i10, boolean z10) {
        lz lzVar = this.w0;
        ox oxVar = lzVar.I;
        lz.a(lzVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                lzVar.h0.x0(0);
                return;
            } else {
                lzVar.D0.x0(1);
                return;
            }
        }
        lzVar.Q0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(oxVar, (Property<ox, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(rr.h);
        ofFloat.start();
        lzVar.G(1, 0);
        if (oxVar != null) {
            oxVar.j(0, true);
        }
    }
}
