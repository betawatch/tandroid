package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ev extends al0 {
    public long h;
    public boolean n;
    public float r;
    public final /* synthetic */ gv s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(gv gvVar, Context context) {
        super(context);
        this.s = gvVar;
        boolean z10 = gvVar.n;
        this.n = z10;
        this.r = z10 ? 1.0f : 0.0f;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.z51 z51Var = new org.telegram.ui.z51(13, context, this);
        this.b = z51Var;
        z51Var.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        for (int i7 = 0; i7 < 8; i7++) {
            int i10 = gv.f0[i7];
            dv dvVar = new dv(this, context, gv.g0[i7]);
            dvVar.setContentDescription(gv.f(i7));
            this.b.addView(dvVar);
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

    @Override // org.telegram.ui.Components.al0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
