package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class jv extends il0 {
    public long h;
    public boolean n;
    public float r;
    public final /* synthetic */ lv s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(lv lvVar, Context context) {
        super(context);
        this.s = lvVar;
        boolean z10 = lvVar.n;
        this.n = z10;
        this.r = z10 ? 1.0f : 0.0f;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(12, context, this);
        this.b = d61Var;
        d61Var.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        for (int i7 = 0; i7 < 8; i7++) {
            int i10 = lv.f0[i7];
            iv ivVar = new iv(this, context, lv.g0[i7]);
            ivVar.setContentDescription(lv.f(i7));
            this.b.addView(ivVar);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.r, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(Math.min(5.7f, this.b.getChildCount()) * 32.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.il0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
