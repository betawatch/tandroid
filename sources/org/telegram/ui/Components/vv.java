package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.hb1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vv extends um0 {
    public long h;
    public boolean n;
    public float r;
    public final /* synthetic */ xv s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(xv xvVar, Context context) {
        super(context);
        this.s = xvVar;
        boolean z4 = xvVar.n;
        this.n = z4;
        this.r = z4 ? 1.0f : 0.0f;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        hb1 hb1Var = new hb1(this, context, 7);
        this.b = hb1Var;
        hb1Var.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = xv.b0;
            if (i10 >= 8) {
                return;
            }
            uv uvVar = new uv(this, context, iArr[i10], xv.c0[i10]);
            uvVar.setContentDescription(xv.f(i10));
            this.b.addView(uvVar);
            i10++;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.b.getChildCount()) * 32.0f), this.r), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.um0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
