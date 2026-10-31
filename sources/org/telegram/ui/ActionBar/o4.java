package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ListView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o4 extends ListView {
    public final q4 a;
    public final LinearGradient b;
    public final Paint c;
    public final Paint d;
    public final Matrix e;

    public o4(q4 q4Var) {
        super(q4Var.a);
        float L = org.telegram.messenger.i0.L(16.0f);
        int[] iArr = new int[8];
        PathInterpolator pathInterpolator = rf.w.i;
        rf.w.a(pathInterpolator, -16777216, iArr);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, L, 0.0f, 0.0f, iArr, (float[]) null, tileMode);
        float L2 = org.telegram.messenger.i0.L(16.0f);
        int[] iArr2 = new int[8];
        rf.w.a(pathInterpolator, -16777216, iArr2);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, L2, iArr2, (float[]) null, tileMode);
        this.b = linearGradient2;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = q4Var;
        setVerticalScrollBarEnabled(false);
    }

    @Override // android.view.View
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (q4.b(this.a)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float y3 = view.getY();
        float height = y3 + view.getHeight();
        boolean z10 = y3 < ((float) org.telegram.messenger.i0.L(16.0f));
        boolean z11 = height > ((float) (getHeight() - org.telegram.messenger.i0.L(16.0f)));
        if (!z10 && !z11) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayer(0.0f, y3, getWidth(), height, null);
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.L(16.0f), this.c);
        }
        if (z11) {
            canvas.drawRect(0.0f, getHeight() - org.telegram.messenger.i0.L(16.0f), getWidth(), getHeight(), this.d);
        }
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        q4 q4Var = this.a;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(q4Var.I.getHeight() - q4Var.H.getHeight(), TLObject.FLAG_30));
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        Matrix matrix = this.e;
        matrix.reset();
        matrix.postTranslate(0.0f, i11 - org.telegram.messenger.i0.L(16.0f));
        this.b.setLocalMatrix(matrix);
    }
}
