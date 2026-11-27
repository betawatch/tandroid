// default package

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class jx extends FrameLayout {
    public final ix a;
    public float b;
    public int c;
    public boolean d;
    public int e;
    public final Matrix f;

    public jx(Context context) {
        super(context);
        this.f = new Matrix();
        this.c = 0;
        this.a = new ix(this, (byte) 0);
    }

    public final void a(float f, int i) {
        if (this.b != f) {
            this.b = f;
            this.e = i;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.b;
    }

    public int getResizeMode() {
        return this.c;
    }

    public int getVideoRotation() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r4 > 0.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        r1 = r1 / r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        r2 = r2 * r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0052, code lost:
    
        if (r4 <= 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0063, code lost:
    
        if (r4 > 0.0f) goto L30;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        if (this.b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f2 = measuredWidth;
            float f3 = measuredHeight;
            float f4 = (this.b / (f2 / f3)) - 1.0f;
            float abs = Math.abs(f4);
            ix ixVar = this.a;
            if (abs <= 0.01f) {
                if (ixVar.b) {
                    return;
                }
                ixVar.b = true;
                ((jx) ixVar.c).post(ixVar);
                return;
            }
            int i3 = this.c;
            if (i3 == 0) {
                f = this.b;
            } else if (i3 == 1) {
                float f5 = f2 / this.b;
                measuredHeight = (int) f5;
            } else if (i3 == 2) {
                float f6 = f3 * this.b;
                measuredWidth = (int) f6;
            } else if (i3 == 3) {
                f = this.b;
            } else if (i3 == 4) {
                f = this.b;
            }
            if (!ixVar.b) {
                ixVar.b = true;
                ((jx) ixVar.c).post(ixVar);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt instanceof TextureView) {
                    Matrix matrix = this.f;
                    matrix.reset();
                    float width = getWidth() / 2;
                    float height = getHeight() / 2;
                    matrix.postRotate(this.e, width, height);
                    int i5 = this.e;
                    if (i5 == 90 || i5 == 270) {
                        float height2 = getHeight() / getWidth();
                        matrix.postScale(1.0f / height2, height2, width, height);
                    }
                    ((TextureView) childAt).setTransform(matrix);
                    return;
                }
            }
        }
    }

    public void setDrawingReady(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
    }

    public void setResizeMode(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setAspectRatioListener(hx hxVar) {
    }
}
