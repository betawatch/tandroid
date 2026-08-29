package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i7.z5;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        if (this.a && (view instanceof e3)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (!(view instanceof f4)) {
            super.measureChildWithMargins(view, i10, i11, i12, i13);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.b;
        k b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() != 1) {
            b10.n = false;
            b10.r = true;
            this.c = false;
            this.f = true;
            invalidate();
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = false;
            b10.n = false;
            b10.r = false;
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
            this.f = false;
            return true;
        }
        if (!this.f && actionMasked == 2) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            if (this.c || z5.a(x4, y8, this.d, this.e) > AndroidUtilities.touchSlop) {
                this.c = true;
                b10.n = true;
                b10.e(x4 - this.d, y8 - this.e);
                this.d = x4;
                this.e = y8;
                return true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            b10.n = false;
            b10.r = true;
            if (!this.c) {
                cVar.a();
            }
            invalidate();
            return false;
        }
        return true;
    }
}
