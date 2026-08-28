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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s4 extends ListView {
    public final t4 a;
    public final LinearGradient b;
    public final Paint c;
    public final Paint d;
    public final Matrix e;

    public s4(t4 t4Var) {
        super(t4Var.a);
        float dp = AndroidUtilities.dp(16.0f);
        int[] iArr = new int[8];
        PathInterpolator pathInterpolator = ff.c0.i;
        ff.c0.a(pathInterpolator, -16777216, iArr);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, dp, 0.0f, 0.0f, iArr, (float[]) null, tileMode);
        float dp2 = AndroidUtilities.dp(16.0f);
        int[] iArr2 = new int[8];
        ff.c0.a(pathInterpolator, -16777216, iArr2);
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
        this.a = t4Var;
        setVerticalScrollBarEnabled(false);
    }

    @Override // android.view.View
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (t4.b(this.a)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float y10 = view.getY();
        float height = y10 + view.getHeight();
        boolean z10 = y10 < ((float) AndroidUtilities.dp(16.0f));
        boolean z11 = height > ((float) (getHeight() - AndroidUtilities.dp(16.0f)));
        if (!z10 && !z11) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayer(0.0f, y10, getWidth(), height, null);
        boolean drawChild = super.drawChild(canvas, view, j10);
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
    public final void onMeasure(int i9, int i10) {
        t4 t4Var = this.a;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(t4Var.I.getHeight() - t4Var.H.getHeight(), TLObject.FLAG_30));
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        Matrix matrix = this.e;
        matrix.reset();
        matrix.postTranslate(0.0f, i10 - AndroidUtilities.dp(16.0f));
        this.b.setLocalMatrix(matrix);
    }
}
