// default package

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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ck4 extends ListView {
    public final ek4 a;
    public final LinearGradient b;
    public final Paint c;
    public final Paint d;
    public final Matrix e;

    public ck4(ek4 ek4Var) {
        super(ek4Var.a);
        float L = gl.L(16.0f);
        int[] iArr = new int[8];
        PathInterpolator pathInterpolator = jz4.i;
        jz4.a(pathInterpolator, -16777216, iArr);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, L, 0.0f, 0.0f, iArr, (float[]) null, tileMode);
        float L2 = gl.L(16.0f);
        int[] iArr2 = new int[8];
        jz4.a(pathInterpolator, -16777216, iArr2);
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
        this.a = ek4Var;
        setVerticalScrollBarEnabled(false);
    }

    @Override // android.view.View
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.d()) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float y = view.getY();
        float height = y + view.getHeight();
        boolean z = y < ((float) gl.L(16.0f));
        boolean z2 = height > ((float) (getHeight() - gl.L(16.0f)));
        if (!z && !z2) {
            return super.drawChild(canvas, view, j);
        }
        canvas.saveLayer(0.0f, y, getWidth(), height, null);
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), gl.L(16.0f), this.c);
        }
        if (z2) {
            canvas.drawRect(0.0f, getHeight() - gl.L(16.0f), getWidth(), getHeight(), this.d);
        }
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        ek4 ek4Var = this.a;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ek4Var.I.getHeight() - ek4Var.H.getHeight(), TLObject.FLAG_30));
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Matrix matrix = this.e;
        matrix.reset();
        matrix.postTranslate(0.0f, i2 - gl.L(16.0f));
        this.b.setLocalMatrix(matrix);
    }
}
