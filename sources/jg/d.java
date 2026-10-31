package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import w7.z8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class d extends FrameLayout {
    public boolean a;
    public final c b;
    public boolean c;
    public float d;
    public float e;
    public boolean f;

    public d(Context context, c cVar) {
        super(context);
        this.b = cVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.a && (view instanceof h2)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (!(view instanceof g3)) {
            super.measureChildWithMargins(view, i10, i11, i12, i13);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.b;
        j g02 = cVar.g0();
        if (g02 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() != 1) {
            g02.n = false;
            g02.r = true;
            this.c = false;
            this.f = true;
            invalidate();
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = false;
            g02.n = false;
            g02.r = false;
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
            this.f = false;
            return true;
        }
        if (!this.f && actionMasked == 2) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (this.c || z8.a(x10, y3, this.d, this.e) > org.telegram.messenger.i0.e) {
                this.c = true;
                g02.n = true;
                g02.e(x10 - this.d, y3 - this.e);
                this.d = x10;
                this.e = y3;
                return true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            g02.n = false;
            g02.r = true;
            if (!this.c) {
                cVar.s();
            }
            invalidate();
            return false;
        }
        return true;
    }
}
