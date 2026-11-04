package org.telegram.ui;

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
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ng0 implements Choreographer.FrameCallback {
    public static final LinearGradient E;
    public static final Matrix F = new Matrix();
    public static final Paint y;
    public final Choreographer a = Choreographer.getInstance();
    public List b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public int e = 0;
    public float f = 0.0f;
    public boolean h = false;
    public boolean n = true;
    public long r = 0;
    public float s = org.telegram.messenger.g0.L(40.0f);
    public View w;
    public ci.i9 x;

    static {
        Paint paint = new Paint(1);
        y = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        E = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i3, float f10, mg0 mg0Var) {
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        if (i3 < 0 || i3 >= lineCount) {
            return;
        }
        mg0 urVar = mg0Var != null ? mg0Var : new ur(layout, 25);
        int width = layout.getWidth();
        layout.getHeight();
        int lineTop = layout.getLineTop(i3);
        int lineBottom = layout.getLineBottom(i3);
        if (lineTop > 0) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width, lineTop);
            urVar.d(canvas);
            canvas.restore();
        }
        float lineLeft = layout.getLineLeft(i3);
        float lineRight = layout.getLineRight(i3);
        float min = Math.min(lineLeft, lineRight);
        float max = Math.max(lineLeft, lineRight);
        if (max <= min) {
            return;
        }
        int paragraphDirection = layout.getParagraphDirection(i3);
        float f11 = max - min;
        float a10 = b8.be.a(f10, 0.0f, f11);
        float f12 = a10 / f11;
        if (a10 <= 0.0f) {
            return;
        }
        if (a10 >= f11) {
            canvas.save();
            canvas.clipRect(0.0f, lineTop, width, lineBottom);
            urVar.d(canvas);
            canvas.restore();
            return;
        }
        float T1 = org.telegram.messenger.g0.T1(-org.telegram.messenger.g0.L(50.0f), f11, f12);
        org.telegram.messenger.g0.L(50.0f);
        float f13 = lineTop;
        float f14 = lineBottom;
        int saveLayer = canvas.saveLayer(min, f13, max, f14, null);
        canvas.save();
        canvas.clipRect(min, f13, max, f14);
        urVar.d(canvas);
        canvas.restore();
        Matrix matrix = F;
        matrix.reset();
        if (paragraphDirection >= 0) {
            matrix.setScale(org.telegram.messenger.g0.L(50.0f), 1.0f);
            matrix.postTranslate(T1, 0.0f);
        } else {
            matrix.setScale(-org.telegram.messenger.g0.L(50.0f), 1.0f);
            matrix.postTranslate(f11 - T1, 0.0f);
        }
        E.setLocalMatrix(matrix);
        canvas.drawRect(min, f13, max, f14, y);
        canvas.restoreToCount(saveLayer);
    }

    public static float h(Layout layout, int i3) {
        float lineRight = layout.getLineRight(i3) - layout.getLineLeft(i3);
        return lineRight >= 0.0f ? lineRight : -lineRight;
    }

    public final void a(float f10) {
        int size = this.b.size();
        View view = null;
        int i3 = 0;
        while (i3 < size) {
            lg0 lg0Var = (lg0) this.b.get(i3);
            float f11 = (this.n || i3 <= this.d) ? 1.0f : 0.0f;
            ArrayList arrayList = this.c;
            float floatValue = i3 < arrayList.size() ? ((Float) arrayList.get(i3)).floatValue() : f11;
            if (floatValue == f11) {
                f11 = floatValue;
            } else if (f10 > 0.0f) {
                float f12 = f10 / 0.2f;
                f11 = f11 > floatValue ? Math.min(f11, f12 + floatValue) : Math.max(f11, floatValue - f12);
            }
            if (i3 < arrayList.size() && f11 != floatValue) {
                arrayList.set(i3, Float.valueOf(f11));
            }
            View e10 = lg0Var.e();
            if (e10 != null && e10 != view) {
                if (e10.getAlpha() != f11) {
                    e10.setAlpha(f11);
                }
                view = e10;
            }
            i3++;
        }
    }

    public final float c(lg0 lg0Var) {
        int d = d(lg0Var);
        if (d < 0) {
            return 1.0f;
        }
        ArrayList arrayList = this.c;
        if (d >= arrayList.size()) {
            return 1.0f;
        }
        return ((Float) arrayList.get(d)).floatValue();
    }

    public final int d(lg0 lg0Var) {
        int size = this.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.b.get(i3) == lg0Var) {
                return i3;
            }
        }
        return -1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        if (this.h) {
            float f10 = 0.0f;
            if (this.r != 0) {
                float f11 = (j10 - r0) * 1.0E-9f;
                if (this.b.isEmpty() || f11 <= 0.0f) {
                    this.n = this.b.isEmpty();
                } else {
                    float f12 = this.s * f11;
                    while (true) {
                        if (f12 <= 0.0f) {
                            break;
                        }
                        if (this.d >= this.b.size()) {
                            this.n = true;
                            break;
                        }
                        Layout a10 = ((lg0) this.b.get(this.d)).a();
                        if (a10 != null && a10.getLineCount() != 0) {
                            if (this.e >= a10.getLineCount()) {
                                int lineCount = a10.getLineCount() - 1;
                                this.e = lineCount;
                                this.f = h(a10, lineCount);
                            }
                            float h = h(a10, this.e);
                            if (h <= 0.001f) {
                                if (j(a10)) {
                                    break;
                                }
                            } else {
                                float f13 = this.f;
                                float f14 = h - f13;
                                if (f14 <= 0.001f) {
                                    if (j(a10)) {
                                        break;
                                    }
                                } else {
                                    if (f12 < f14) {
                                        f14 = f12;
                                    }
                                    float f15 = f13 + f14;
                                    this.f = f15;
                                    f12 -= f14;
                                    if (h - f15 <= 0.001f && !j(a10)) {
                                        f12 = 0.0f;
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
                f10 = f11;
            }
            this.r = j10;
            a(f10);
            e();
            if (!this.n) {
                this.a.postFrameCallback(this);
                return;
            }
            this.h = false;
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.set(i3, Float.valueOf(1.0f));
            }
            int size2 = this.b.size();
            View view = null;
            for (int i10 = 0; i10 < size2; i10++) {
                View e10 = ((lg0) this.b.get(i10)).e();
                if (e10 != null && e10 != view) {
                    if (e10.getAlpha() != 1.0f) {
                        e10.setAlpha(1.0f);
                    }
                    view = e10;
                }
            }
            ci.i9 i9Var = this.x;
            if (i9Var != null) {
                i9Var.run();
                this.x = null;
            }
        }
    }

    public final void e() {
        lg0 lg0Var;
        int i3 = this.d;
        View e10 = (i3 < 0 || i3 >= this.b.size() || (lg0Var = (lg0) this.b.get(this.d)) == null) ? null : lg0Var.e();
        if (e10 != null) {
            e10.invalidate();
            View view = this.w;
            if (view != null && view != e10) {
                view.invalidate();
            }
            this.w = e10;
        }
    }

    public final boolean f() {
        if (!this.b.isEmpty()) {
            int size = this.b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((lg0) this.b.get(size)).a();
                if (layout != null && layout.getLineCount() > 0) {
                    break;
                }
                size--;
            }
            if (size >= 0 && layout != null) {
                int i3 = this.d;
                if (i3 < size) {
                    return false;
                }
                if (i3 <= size) {
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

    public final boolean g(lg0 lg0Var) {
        Layout a10;
        return d(lg0Var) == this.d && (a10 = lg0Var.a()) != null && this.e < a10.getLineCount();
    }

    public final boolean i(lg0 lg0Var) {
        int d = d(lg0Var);
        if (d < 0 || this.b.isEmpty()) {
            return false;
        }
        int i3 = this.d;
        return d < i3 || d <= i3;
    }

    public final boolean j(Layout layout) {
        int i3 = this.e + 1;
        this.e = i3;
        this.f = 0.0f;
        if (i3 >= layout.getLineCount()) {
            int i10 = this.d + 1;
            this.d = i10;
            this.e = 0;
            this.f = 0.0f;
            if (i10 >= this.b.size()) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList arrayList) {
        float f10;
        ArrayList arrayList2;
        boolean z10;
        if (!this.b.isEmpty() && this.d >= this.b.size()) {
            int size = this.b.size() - 1;
            this.d = size;
            Layout a10 = ((lg0) this.b.get(size)).a();
            int max = Math.max(0, a10 == null ? 0 : a10.getLineCount() - 1);
            this.e = max;
            this.f = a10 == null ? 0.0f : a10.getLineWidth(max);
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.b = arrayList;
        if (arrayList.isEmpty()) {
            f10 = 0.0f;
        } else {
            int i3 = this.d;
            f10 = 0.0f;
            while (i3 < this.b.size()) {
                Layout a11 = ((lg0) this.b.get(i3)).a();
                if (a11 != null) {
                    int min = i3 == this.d ? Math.min(Math.max(this.e, 0), Math.max(0, a11.getLineCount() - 1)) : 0;
                    for (int i10 = min; i10 < a11.getLineCount(); i10++) {
                        float h = h(a11, i10);
                        if (h > 0.001f) {
                            if (i3 == this.d && i10 == min) {
                                h -= this.f;
                                if (h <= 0.001f) {
                                }
                            }
                            f10 += h;
                        }
                    }
                }
                i3++;
            }
        }
        float L = org.telegram.messenger.g0.L(40.0f);
        if (f10 <= 0.001f) {
            this.s = L;
        } else {
            this.s = Math.max(L, f10 / 1.05f);
        }
        this.n = f();
        while (true) {
            arrayList2 = this.c;
            if (arrayList2.size() <= this.b.size()) {
                break;
            } else {
                a1.g.y(1, arrayList2);
            }
        }
        int size2 = arrayList2.size();
        while (size2 < this.b.size()) {
            arrayList2.add(Float.valueOf((this.n || size2 <= this.d) ? 1.0f : 0.0f));
            size2++;
        }
        if (!this.n && !(z10 = this.h) && !z10) {
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

    public final void l(ci.i9 i9Var) {
        this.x = i9Var;
    }
}
