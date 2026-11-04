package org.telegram.ui.Components.Paint.Views;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import tg.h1;
import ug.a;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ColorPicker extends FrameLayout {
    public static final int[] d = {-1431751, -2409774, -13610525, -11942419, -8337308, -205211, -223667, -16777216, -1};
    public static final float[] e = {0.0f, 0.14f, 0.24f, 0.39f, 0.49f, 0.62f, 0.73f, 0.85f, 1.0f};
    public float a;
    public float b;
    public float c;

    public static int a(float f10) {
        float[] fArr;
        int i3;
        int[] iArr = d;
        if (f10 <= 0.0f) {
            return iArr[0];
        }
        if (f10 >= 1.0f) {
            return iArr[8];
        }
        int i10 = 1;
        while (true) {
            fArr = e;
            if (i10 >= 9) {
                i10 = -1;
                i3 = -1;
                break;
            }
            if (fArr[i10] >= f10) {
                i3 = i10 - 1;
                break;
            }
            i10++;
        }
        float f11 = fArr[i3];
        int i11 = iArr[i3];
        float f12 = fArr[i10];
        int i12 = iArr[i10];
        float min = Math.min(Math.max((f10 - f11) / (f12 - f11), 0.0f), 1.0f);
        int red = Color.red(i11);
        int red2 = Color.red(i12);
        int green = Color.green(i11);
        int green2 = Color.green(i12);
        int blue = Color.blue(i11);
        int blue2 = Color.blue(i12);
        return Color.argb(hs.e4, Math.min(hs.e4, (int) (((red2 - red) * min) + red)), Math.min(hs.e4, (int) (((green2 - green) * min) + green)), Math.min(hs.e4, (int) (((blue2 - blue) * min) + blue)));
    }

    private void setDraggingFactor(float f10) {
        this.c = f10;
        invalidate();
    }

    public float getDraggingFactor() {
        return this.c;
    }

    public View getSettingsButton() {
        return null;
    }

    public h1 getSwatch() {
        return new h1(this.a, this.b, a(this.a));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRoundRect(null, g0.L(6.0f), g0.L(6.0f), null);
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        new LinearGradient(g0.L(56.0f), 0.0f, (i11 - i3) - g0.L(56.0f), 0.0f, d, e, Shader.TileMode.REPEAT);
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        motionEvent.getX();
        throw null;
    }

    public void setLocation(float f10) {
        this.a = f10;
        a(f10);
        throw null;
    }

    public void setSettingsButtonImage(int i3) {
        throw null;
    }

    public void setSwatch(h1 h1Var) {
        setLocation(h1Var.b);
        setWeight(h1Var.c);
    }

    public void setUndoEnabled(boolean z10) {
        throw null;
    }

    public void setWeight(float f10) {
        this.b = f10;
        invalidate();
    }

    public void setDelegate(a aVar) {
    }
}
