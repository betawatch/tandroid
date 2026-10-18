package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.sa1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class iw extends kn0 {
    public long h;
    public boolean n;
    public float r;
    public final /* synthetic */ kw s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(kw kwVar, Context context) {
        super(context);
        this.s = kwVar;
        boolean z10 = kwVar.n;
        this.n = z10;
        this.r = z10 ? 1.0f : 0.0f;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        sa1 sa1Var = new sa1(this, context, 8);
        this.b = sa1Var;
        sa1Var.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = kw.e0;
            if (i10 >= 8) {
                return;
            }
            int i11 = iArr[i10];
            hw hwVar = new hw(this, context, kw.f0[i10]);
            hwVar.setContentDescription(kw.f(i10));
            this.b.addView(hwVar);
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

    @Override // org.telegram.ui.Components.kn0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
