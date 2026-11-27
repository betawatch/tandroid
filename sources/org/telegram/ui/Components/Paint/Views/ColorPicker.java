package org.telegram.ui.Components.Paint.Views;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class ColorPicker extends FrameLayout {
    public static final int[] d = {-1431751, -2409774, -13610525, -11942419, -8337308, -205211, -223667, -16777216, -1};
    public static final float[] e = {0.0f, 0.14f, 0.24f, 0.39f, 0.49f, 0.62f, 0.73f, 0.85f, 1.0f};
    public float a;
    public float b;
    public float c;

    public static int a(float f) {
        float[] fArr;
        int i;
        int[] iArr = d;
        if (f <= 0.0f) {
            return iArr[0];
        }
        if (f >= 1.0f) {
            return iArr[8];
        }
        int i2 = 1;
        while (true) {
            fArr = e;
            if (i2 >= 9) {
                i2 = -1;
                i = -1;
                break;
            }
            if (fArr[i2] >= f) {
                i = i2 - 1;
                break;
            }
            i2++;
        }
        float f2 = fArr[i];
        int i3 = iArr[i];
        float f3 = fArr[i2];
        int i4 = iArr[i2];
        float min = Math.min(Math.max((f - f2) / (f3 - f2), 0.0f), 1.0f);
        int red = Color.red(i3);
        int red2 = Color.red(i4);
        int green = Color.green(i3);
        int green2 = Color.green(i4);
        int blue = Color.blue(i3);
        int blue2 = Color.blue(i4);
        return Color.argb(jn7.d4, Math.min(jn7.d4, (int) (((red2 - red) * min) + red)), Math.min(jn7.d4, (int) (((green2 - green) * min) + green)), Math.min(jn7.d4, (int) (((blue2 - blue) * min) + blue)));
    }

    private void setDraggingFactor(float f) {
        this.c = f;
        invalidate();
    }

    public float getDraggingFactor() {
        return this.c;
    }

    public View getSettingsButton() {
        return null;
    }

    public igb getSwatch() {
        return new igb(this.a, this.b, a(this.a));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRoundRect(null, hl.L(6.0f), hl.L(6.0f), null);
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        new LinearGradient(hl.L(56.0f), 0.0f, (i3 - i) - hl.L(56.0f), 0.0f, d, e, Shader.TileMode.REPEAT);
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

    public void setLocation(float f) {
        this.a = f;
        a(f);
        throw null;
    }

    public void setSettingsButtonImage(int i) {
        throw null;
    }

    public void setSwatch(igb igbVar) {
        setLocation(igbVar.b);
        setWeight(igbVar.c);
    }

    public void setUndoEnabled(boolean z) {
        throw null;
    }

    public void setWeight(float f) {
        this.b = f;
        invalidate();
    }

    public void setDelegate(gm2 gm2Var) {
    }
}
