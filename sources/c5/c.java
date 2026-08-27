package c5;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class c extends FrameLayout {
    public final b a;
    public float b;
    public int c;
    public boolean d;
    public int e;
    public final Matrix f;

    public c(Context context) {
        super(context);
        this.f = new Matrix();
        this.c = 0;
        this.a = new b(this, 0);
    }

    public final void a(float f10, int i10) {
        if (this.b != f10) {
            this.b = f10;
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
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = (this.b / (f12 / f13)) - 1.0f;
        float abs = Math.abs(f14);
        b bVar = this.a;
        if (abs <= 0.01f) {
            if (bVar.b) {
                return;
            }
            bVar.b = true;
            ((c) bVar.c).post(bVar);
            return;
        }
        int i12 = this.c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.b;
                } else if (i12 != 3) {
                    if (i12 == 4) {
                        if (f14 > 0.0f) {
                            f10 = this.b;
                        } else {
                            f11 = this.b;
                        }
                    }
                } else if (f14 <= 0.0f) {
                    f11 = this.b;
                } else {
                    f10 = this.b;
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f14 > 0.0f) {
            f11 = this.b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.b;
            measuredWidth = (int) (f13 * f10);
        }
        if (!bVar.b) {
            bVar.b = true;
            ((c) bVar.c).post(bVar);
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

    public void setAspectRatioListener(a aVar) {
    }
}
