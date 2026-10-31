package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kv extends yl0 {
    public long h;
    public boolean n;
    public float r;
    public final /* synthetic */ mv s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(mv mvVar, Context context) {
        super(context);
        this.s = mvVar;
        boolean z10 = mvVar.n;
        this.n = z10;
        this.r = z10 ? 1.0f : 0.0f;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.u71 u71Var = new org.telegram.ui.u71(this, context, 7);
        this.b = u71Var;
        u71Var.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = mv.e0[i10];
            jv jvVar = new jv(this, context, mv.f0[i10]);
            jvVar.setContentDescription(mv.f(i10));
            this.b.addView(jvVar);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (!this.n || this.d) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.a = false;
                return;
            } else if (action != 2) {
                return;
            }
        }
        this.a = true;
        if (!this.d) {
            this.e = -1;
        }
        this.s.requestDisallowInterceptTouchEvent(true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.W1(this.r, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(Math.min(5.7f, this.b.getChildCount()) * 32.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.yl0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
