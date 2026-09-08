package org.telegram.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class l4 extends FrameLayout {
    public final k4 a;
    public float b;
    public int c;
    public boolean d;
    public int e;
    public final Matrix f;

    public l4(Context context) {
        super(context);
        this.f = new Matrix();
        this.c = 0;
        this.a = new k4(this, 0);
    }

    public final void a(float f7, int i10) {
        if (this.b != f7) {
            this.b = f7;
            this.e = i10;
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

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        super.onMeasure(i10, i11);
        if (this.b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f11 = measuredWidth;
        float f12 = measuredHeight;
        float f13 = (this.b / (f11 / f12)) - 1.0f;
        float abs = Math.abs(f13);
        k4 k4Var = this.a;
        if (abs <= 0.01f) {
            if (k4Var.b) {
                return;
            }
            k4Var.b = true;
            ((l4) k4Var.c).post(k4Var);
            return;
        }
        int i12 = this.c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f7 = this.b;
                } else if (i12 != 3) {
                    if (i12 == 4) {
                        if (f13 > 0.0f) {
                            f7 = this.b;
                        } else {
                            f10 = this.b;
                        }
                    }
                } else if (f13 <= 0.0f) {
                    f10 = this.b;
                } else {
                    f7 = this.b;
                }
                measuredWidth = (int) (f12 * f7);
            } else {
                f10 = this.b;
            }
            measuredHeight = (int) (f11 / f10);
        } else if (f13 > 0.0f) {
            f10 = this.b;
            measuredHeight = (int) (f11 / f10);
        } else {
            f7 = this.b;
            measuredWidth = (int) (f12 * f7);
        }
        if (!k4Var.b) {
            k4Var.b = true;
            ((l4) k4Var.c).post(k4Var);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt instanceof TextureView) {
                Matrix matrix = this.f;
                matrix.reset();
                float width = getWidth() / 2;
                float height = getHeight() / 2;
                matrix.postRotate(this.e, width, height);
                int i14 = this.e;
                if (i14 == 90 || i14 == 270) {
                    float height2 = getHeight() / getWidth();
                    matrix.postScale(1.0f / height2, height2, width, height);
                }
                ((TextureView) childAt).setTransform(matrix);
                return;
            }
        }
    }

    public void setDrawingReady(boolean z10) {
        if (this.d == z10) {
            return;
        }
        this.d = z10;
    }

    public void setResizeMode(int i10) {
        if (this.c != i10) {
            this.c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(j4 j4Var) {
    }
}
