package c5;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public final void a(float f10, int i9) {
        if (this.b != f10) {
            this.b = f10;
            this.e = i9;
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
    public void onMeasure(int i9, int i10) {
        float f10;
        float f11;
        super.onMeasure(i9, i10);
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
        int i11 = this.c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f10 = this.b;
                } else if (i11 != 3) {
                    if (i11 == 4) {
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
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof TextureView) {
                Matrix matrix = this.f;
                matrix.reset();
                float width = getWidth() / 2;
                float height = getHeight() / 2;
                matrix.postRotate(this.e, width, height);
                int i13 = this.e;
                if (i13 == 90 || i13 == 270) {
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

    public void setResizeMode(int i9) {
        if (this.c != i9) {
            this.c = i9;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }
}
