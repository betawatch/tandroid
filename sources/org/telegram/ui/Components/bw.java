package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class bw extends c5.l {
    public final /* synthetic */ ly x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(ly lyVar, Context context) {
        super(context);
        this.x0 = lyVar;
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
        ly lyVar = this.x0;
        qw qwVar = lyVar.J;
        ly.a(lyVar, i7 == 1);
        if (i7 != getCurrentItem()) {
            super.x(i7, z10);
            return;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                lyVar.i0.y0(0);
                return;
            } else {
                lyVar.E0.y0(1);
                return;
            }
        }
        lyVar.R0[1] = 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qwVar, (Property<qw, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(er.h);
        ofFloat.start();
        lyVar.H(1, 0);
        if (qwVar != null) {
            qwVar.j(0, true);
        }
    }
}
