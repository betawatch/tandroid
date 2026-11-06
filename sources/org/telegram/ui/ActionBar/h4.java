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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class h4 extends ListView {
    public final i4 a;
    public final LinearGradient b;
    public final Paint c;
    public final Paint d;
    public final Matrix e;

    public h4(i4 i4Var) {
        super(i4Var.a);
        float L = org.telegram.messenger.g0.L(16.0f);
        int[] iArr = new int[8];
        PathInterpolator pathInterpolator = bg.c0.i;
        bg.c0.a(pathInterpolator, -16777216, iArr);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, L, 0.0f, 0.0f, iArr, (float[]) null, tileMode);
        float L2 = org.telegram.messenger.g0.L(16.0f);
        int[] iArr2 = new int[8];
        bg.c0.a(pathInterpolator, -16777216, iArr2);
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
        this.a = i4Var;
        setVerticalScrollBarEnabled(false);
    }

    @Override // android.view.View
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (i4.b(this.a)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float y10 = view.getY();
        float height = y10 + view.getHeight();
        boolean z9 = y10 < ((float) org.telegram.messenger.g0.L(16.0f));
        boolean z10 = height > ((float) (getHeight() - org.telegram.messenger.g0.L(16.0f)));
        if (!z9 && !z10) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.saveLayer(0.0f, y10, getWidth(), height, null);
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z9) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(16.0f), this.c);
        }
        if (z10) {
            canvas.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.L(16.0f), getWidth(), getHeight(), this.d);
        }
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i7, int i10) {
        i4 i4Var = this.a;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i4Var.I.getHeight() - i4Var.H.getHeight(), TLObject.FLAG_30));
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        Matrix matrix = this.e;
        matrix.reset();
        matrix.postTranslate(0.0f, i10 - org.telegram.messenger.g0.L(16.0f));
        this.b.setLocalMatrix(matrix);
    }
}
