package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lv extends xl0 {
    public long h;
    public boolean n;
    public float r;
    public final /* synthetic */ nv s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(nv nvVar, Context context) {
        super(context);
        this.s = nvVar;
        boolean z10 = nvVar.n;
        this.n = z10;
        this.r = z10 ? 1.0f : 0.0f;
        setSmoothScrollingEnabled(true);
        int i9 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ta1 ta1Var = new ta1(this, context, 7);
        this.b = ta1Var;
        ta1Var.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = nv.a0;
            if (i9 >= 8) {
                return;
            }
            kv kvVar = new kv(this, context, iArr[i9], nv.b0[i9]);
            kvVar.setContentDescription(nv.f(i9));
            this.b.addView(kvVar);
            i9++;
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.b.getChildCount()) * 32.0f), this.r), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.xl0, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
