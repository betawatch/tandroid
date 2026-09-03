package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ob1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xv extends um0 {
    public long h;
    public boolean n;
    public float r;
    public final /* synthetic */ zv s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(zv zvVar, Context context) {
        super(context);
        this.s = zvVar;
        boolean z4 = zvVar.n;
        this.n = z4;
        this.r = z4 ? 1.0f : 0.0f;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ob1 ob1Var = new ob1(this, context, 7);
        this.b = ob1Var;
        ob1Var.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = zv.b0;
            if (i10 >= 8) {
                return;
            }
            wv wvVar = new wv(this, context, iArr[i10], zv.c0[i10]);
            wvVar.setContentDescription(zv.f(i10));
            this.b.addView(wvVar);
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
