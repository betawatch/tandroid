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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class u4 extends ListView {
    public final v4 a;
    public final LinearGradient b;
    public final Paint c;
    public final Paint d;
    public final Matrix e;

    public u4(v4 v4Var) {
        super(v4Var.a);
        float dp = AndroidUtilities.dp(16.0f);
        int[] iArr = new int[8];
        PathInterpolator pathInterpolator = yf.z.i;
        yf.z.a(pathInterpolator, -16777216, iArr);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, dp, 0.0f, 0.0f, iArr, (float[]) null, tileMode);
        float dp2 = AndroidUtilities.dp(16.0f);
        int[] iArr2 = new int[8];
        yf.z.a(pathInterpolator, -16777216, iArr2);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, dp2, iArr2, (float[]) null, tileMode);
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
        this.a = v4Var;
        setVerticalScrollBarEnabled(false);
    }

    @Override // android.view.View
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (v4.b(this.a)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float y3 = view.getY();
        float height = y3 + view.getHeight();
        boolean z10 = y3 < ((float) AndroidUtilities.dp(16.0f));
        boolean z11 = height > ((float) (getHeight() - AndroidUtilities.dp(16.0f)));
        if (!z10 && !z11) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.saveLayer(0.0f, y3, getWidth(), height, null);
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(16.0f), this.c);
        }
        if (z11) {
            canvas.drawRect(0.0f, getHeight() - AndroidUtilities.dp(16.0f), getWidth(), getHeight(), this.d);
        }
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        v4 v4Var = this.a;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(v4Var.I.getHeight() - v4Var.H.getHeight(), TLObject.FLAG_30));
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        Matrix matrix = this.e;
        matrix.reset();
        matrix.postTranslate(0.0f, i11 - AndroidUtilities.dp(16.0f));
        this.b.setLocalMatrix(matrix);
    }
}
