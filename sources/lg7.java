// default package

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.Layout;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lg7 implements Choreographer.FrameCallback {
    public static final LinearGradient E;
    public static final Matrix F = new Matrix();
    public static final Paint y;
    public final Choreographer a = Choreographer.getInstance();
    public ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public int e = 0;
    public float f = 0.0f;
    public boolean h = false;
    public boolean n = true;
    public long r = 0;
    public float s = gl.L(40.0f);
    public View w;
    public va2 x;

    static {
        Paint paint = new Paint(1);
        y = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        E = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i, float f, kg7 kg7Var) {
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (i < 0 || i >= lineCount) {
                return;
            }
            kg7 im6Var = kg7Var != null ? kg7Var : new im6(layout, (byte) 9);
            int width = layout.getWidth();
            layout.getHeight();
            int lineTop = layout.getLineTop(i);
            int lineBottom = layout.getLineBottom(i);
            if (lineTop > 0) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, width, lineTop);
                im6Var.b(canvas);
                canvas.restore();
            }
            float lineLeft = layout.getLineLeft(i);
            float lineRight = layout.getLineRight(i);
            float min = Math.min(lineLeft, lineRight);
            float max = Math.max(lineLeft, lineRight);
            if (max > min) {
                int paragraphDirection = layout.getParagraphDirection(i);
                float f2 = max - min;
                float a = moe.a(f, 0.0f, f2);
                float f3 = a / f2;
                if (a > 0.0f) {
                    if (a >= f2) {
                        canvas.save();
                        canvas.clipRect(0.0f, lineTop, width, lineBottom);
                        im6Var.b(canvas);
                        canvas.restore();
                        return;
                    }
                    float R1 = gl.R1(-gl.L(50.0f), f2, f3);
                    float f4 = lineTop;
                    float f5 = lineBottom;
                    int saveLayer = canvas.saveLayer(min, f4, max, f5, null);
                    canvas.save();
                    canvas.clipRect(min, f4, max, f5);
                    im6Var.b(canvas);
                    canvas.restore();
                    Matrix matrix = F;
                    matrix.reset();
                    if (paragraphDirection >= 0) {
                        matrix.setScale(gl.L(50.0f), 1.0f);
                        matrix.postTranslate(R1, 0.0f);
                    } else {
                        matrix.setScale(-gl.L(50.0f), 1.0f);
                        matrix.postTranslate(f2 - R1, 0.0f);
                    }
                    E.setLocalMatrix(matrix);
                    canvas.drawRect(min, f4, max, f5, y);
                    canvas.restoreToCount(saveLayer);
                }
            }
        }
    }

    public static float h(Layout layout, int i) {
        float lineRight = layout.getLineRight(i) - layout.getLineLeft(i);
        return lineRight >= 0.0f ? lineRight : -lineRight;
    }

    public final void a(float f) {
        int size = this.b.size();
        View view = null;
        int i = 0;
        while (i < size) {
            jg7 jg7Var = (jg7) this.b.get(i);
            float f2 = (this.n || i <= this.d) ? 1.0f : 0.0f;
            ArrayList arrayList = this.c;
            float floatValue = i < arrayList.size() ? ((Float) arrayList.get(i)).floatValue() : f2;
            if (floatValue == f2) {
                f2 = floatValue;
            } else if (f > 0.0f) {
                float f3 = f / 0.2f;
                f2 = f2 > floatValue ? Math.min(f2, f3 + floatValue) : Math.max(f2, floatValue - f3);
            }
            if (i < arrayList.size() && f2 != floatValue) {
                arrayList.set(i, Float.valueOf(f2));
            }
            View e = jg7Var.e();
            if (e != null && e != view) {
                if (e.getAlpha() != f2) {
                    e.setAlpha(f2);
                }
                view = e;
            }
            i++;
        }
    }

    public final float c(jg7 jg7Var) {
        int d = d(jg7Var);
        if (d < 0) {
            return 1.0f;
        }
        ArrayList arrayList = this.c;
        if (d < arrayList.size()) {
            return ((Float) arrayList.get(d)).floatValue();
        }
        return 1.0f;
    }

    public final int d(jg7 jg7Var) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (this.b.get(i) == jg7Var) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.h) {
            float f = 0.0f;
            if (this.r != 0) {
                float f2 = (j - r0) * 1.0E-9f;
                if (this.b.isEmpty() || f2 <= 0.0f) {
                    this.n = this.b.isEmpty();
                } else {
                    float f3 = this.s * f2;
                    while (true) {
                        if (f3 <= 0.0f) {
                            break;
                        }
                        if (this.d >= this.b.size()) {
                            this.n = true;
                            break;
                        }
                        Layout a = ((jg7) this.b.get(this.d)).a();
                        if (a != null && a.getLineCount() != 0) {
                            if (this.e >= a.getLineCount()) {
                                int lineCount = a.getLineCount() - 1;
                                this.e = lineCount;
                                this.f = h(a, lineCount);
                            }
                            float h = h(a, this.e);
                            if (h <= 0.001f) {
                                if (j(a)) {
                                    break;
                                }
                            } else {
                                float f4 = this.f;
                                float f5 = h - f4;
                                if (f5 <= 0.001f) {
                                    if (j(a)) {
                                        break;
                                    }
                                } else {
                                    if (f3 < f5) {
                                        f5 = f3;
                                    }
                                    float f6 = f4 + f5;
                                    this.f = f6;
                                    f3 -= f5;
                                    if (h - f6 <= 0.001f && !j(a)) {
                                        f3 = 0.0f;
                                    }
                                }
                            }
                        } else {
                            this.d++;
                            this.e = 0;
                            this.f = 0.0f;
                        }
                    }
                    this.n = f();
                }
                f = f2;
            }
            this.r = j;
            a(f);
            e();
            if (!this.n) {
                this.a.postFrameCallback(this);
                return;
            }
            this.h = false;
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.set(i, Float.valueOf(1.0f));
            }
            int size2 = this.b.size();
            View view = null;
            for (int i2 = 0; i2 < size2; i2++) {
                View e = ((jg7) this.b.get(i2)).e();
                if (e != null && e != view) {
                    if (e.getAlpha() != 1.0f) {
                        e.setAlpha(1.0f);
                    }
                    view = e;
                }
            }
            va2 va2Var = this.x;
            if (va2Var != null) {
                va2Var.run();
                this.x = null;
            }
        }
    }

    public final void e() {
        jg7 jg7Var;
        int i = this.d;
        View e = (i < 0 || i >= this.b.size() || (jg7Var = (jg7) this.b.get(this.d)) == null) ? null : jg7Var.e();
        if (e != null) {
            e.invalidate();
            View view = this.w;
            if (view != null && view != e) {
                view.invalidate();
            }
            this.w = e;
        }
    }

    public final boolean f() {
        if (!this.b.isEmpty()) {
            int size = this.b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((jg7) this.b.get(size)).a();
                if (layout != null && layout.getLineCount() > 0) {
                    break;
                }
                size--;
            }
            if (size >= 0 && layout != null) {
                int i = this.d;
                if (i < size) {
                    return false;
                }
                if (i <= size) {
                    int lineCount = layout.getLineCount() - 1;
                    float h = h(layout, lineCount);
                    if (this.e < lineCount || this.f < h - 0.001f) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean g(jg7 jg7Var) {
        Layout a;
        return d(jg7Var) == this.d && (a = jg7Var.a()) != null && this.e < a.getLineCount();
    }

    public final boolean i(jg7 jg7Var) {
        int d = d(jg7Var);
        if (d < 0 || this.b.isEmpty()) {
            return false;
        }
        int i = this.d;
        return d < i || d <= i;
    }

    public final boolean j(Layout layout) {
        int i = this.e + 1;
        this.e = i;
        this.f = 0.0f;
        if (i >= layout.getLineCount()) {
            int i2 = this.d + 1;
            this.d = i2;
            this.e = 0;
            this.f = 0.0f;
            if (i2 >= this.b.size()) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList arrayList) {
        float f;
        ArrayList arrayList2;
        boolean z;
        boolean z2;
        if (!this.b.isEmpty() && this.d >= this.b.size()) {
            int size = this.b.size() - 1;
            this.d = size;
            Layout a = ((jg7) this.b.get(size)).a();
            int max = Math.max(0, a == null ? 0 : a.getLineCount() - 1);
            this.e = max;
            this.f = a == null ? 0.0f : a.getLineWidth(max);
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.b = arrayList;
        if (arrayList.isEmpty()) {
            f = 0.0f;
        } else {
            int i = this.d;
            f = 0.0f;
            while (i < this.b.size()) {
                Layout a2 = ((jg7) this.b.get(i)).a();
                if (a2 != null) {
                    int min = i == this.d ? Math.min(Math.max(this.e, 0), Math.max(0, a2.getLineCount() - 1)) : 0;
                    for (int i2 = min; i2 < a2.getLineCount(); i2++) {
                        float h = h(a2, i2);
                        if (h > 0.001f) {
                            if (i == this.d && i2 == min) {
                                h -= this.f;
                                if (h <= 0.001f) {
                                }
                            }
                            f += h;
                        }
                    }
                }
                i++;
            }
        }
        float L = gl.L(40.0f);
        if (f <= 0.001f) {
            this.s = L;
        } else {
            this.s = Math.max(L, f / 1.05f);
        }
        this.n = f();
        while (true) {
            arrayList2 = this.c;
            if (arrayList2.size() <= this.b.size()) {
                break;
            } else {
                tb4.v(1, arrayList2);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            int size3 = this.b.size();
            z = this.n;
            if (size2 >= size3) {
                break;
            }
            arrayList2.add(Float.valueOf((z || size2 <= this.d) ? 1.0f : 0.0f));
            size2++;
        }
        if (!z && !(z2 = this.h) && !z2) {
            this.h = true;
            if (f()) {
                this.n = true;
            }
            this.r = 0L;
            this.a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }
}
