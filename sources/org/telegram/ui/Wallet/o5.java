package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class o5 extends FrameLayout {
    public final Matrix a;
    public final float[] b;
    public final FrameLayout c;
    public final ai.j2 d;
    public boolean e;
    public boolean f;

    public o5(Context context) {
        super(context);
        this.a = new Matrix();
        this.b = new float[8];
        this.e = true;
        this.f = true;
        setClipChildren(false);
        setClipToPadding(false);
        ai.j2 j2Var = new ai.j2(context, 1);
        this.d = j2Var;
        j2Var.setLayerType(2, null);
        addView(j2Var, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        j2Var.addView(frameLayout, new FrameLayout.LayoutParams(AndroidUtilities.dp(336.0f), AndroidUtilities.dp(205.0f)));
    }

    public final void a(k5 k5Var) {
        Bitmap bitmap;
        if (!this.e || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        this.e = false;
        int width = getWidth();
        int height = getHeight();
        synchronized (k5Var) {
            try {
                bitmap = k5Var.S;
                k5Var.S = null;
                if (bitmap != null) {
                    if (bitmap.getWidth() == width) {
                        if (bitmap.getHeight() != height) {
                        }
                    }
                    bitmap.recycle();
                    bitmap = null;
                }
                if (bitmap == null) {
                    bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                }
            } finally {
            }
        }
        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmap);
        this.d.draw(canvas);
        canvas.setBitmap(null);
        k5Var.f(bitmap);
    }

    public final void b(float[] fArr) {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float[] fArr2 = this.b;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        float f7 = width;
        fArr2[2] = f7;
        fArr2[3] = 0.0f;
        fArr2[4] = f7;
        float f10 = height;
        fArr2[5] = f10;
        fArr2[6] = 0.0f;
        fArr2[7] = f10;
        this.a.setPolyToPoly(fArr2, 0, fArr, 0, 4);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f) {
            int save = canvas.save();
            canvas.concat(this.a);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        this.e = true;
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        this.e = true;
        super.onDescendantInvalidated(view, view2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.e = true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.e = true;
        FrameLayout frameLayout = this.c;
        frameLayout.setScaleX(i10 / AndroidUtilities.dp(336.0f));
        frameLayout.setScaleY(i11 / AndroidUtilities.dp(205.0f));
    }
}
