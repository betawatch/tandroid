package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.pb1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class uv extends tm0 {
    public long h;
    public boolean n;
    public float r;
    public final /* synthetic */ wv s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(wv wvVar, Context context) {
        super(context);
        this.s = wvVar;
        boolean z4 = wvVar.n;
        this.n = z4;
        this.r = z4 ? 1.0f : 0.0f;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        pb1 pb1Var = new pb1(this, context, 7);
        this.b = pb1Var;
        pb1Var.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = wv.b0;
            if (i10 >= 8) {
                return;
            }
            tv tvVar = new tv(this, context, iArr[i10], wv.c0[i10]);
            tvVar.setContentDescription(wv.f(i10));
            this.b.addView(tvVar);
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

    @Override // org.telegram.ui.Components.tm0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
