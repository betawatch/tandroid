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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ej0 implements Choreographer.FrameCallback {
    public static final Matrix A = new Matrix();
    public static final Paint x;
    public static final LinearGradient y;
    public final Choreographer a = Choreographer.getInstance();
    public List b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public int e = 0;
    public float f = 0.0f;
    public boolean h = false;
    public boolean n = true;
    public long r = 0;
    public float s = AndroidUtilities.dp(40.0f);
    public View v;
    public gh.e9 w;

    static {
        Paint paint = new Paint(1);
        x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        y = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i9, float f10, dj0 dj0Var) {
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        if (i9 < 0 || i9 >= lineCount) {
            return;
        }
        dj0 wtVar = dj0Var != null ? dj0Var : new wt(layout, 24);
        int width = layout.getWidth();
        layout.getHeight();
        int lineTop = layout.getLineTop(i9);
        int lineBottom = layout.getLineBottom(i9);
        if (lineTop > 0) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width, lineTop);
            wtVar.b(canvas);
            canvas.restore();
        }
        float lineLeft = layout.getLineLeft(i9);
        float lineRight = layout.getLineRight(i9);
        float min = Math.min(lineLeft, lineRight);
        float max = Math.max(lineLeft, lineRight);
        if (max <= min) {
            return;
        }
        int paragraphDirection = layout.getParagraphDirection(i9);
        float f11 = max - min;
        float a2 = g7.n.a(f10, 0.0f, f11);
        float f12 = a2 / f11;
        if (a2 <= 0.0f) {
            return;
        }
        if (a2 >= f11) {
            canvas.save();
            canvas.clipRect(0.0f, lineTop, width, lineBottom);
            wtVar.b(canvas);
            canvas.restore();
            return;
        }
        float lerp = AndroidUtilities.lerp(-AndroidUtilities.dp(50.0f), f11, f12);
        AndroidUtilities.dp(50.0f);
        float f13 = lineTop;
        float f14 = lineBottom;
        int saveLayer = canvas.saveLayer(min, f13, max, f14, null);
        canvas.save();
        canvas.clipRect(min, f13, max, f14);
        wtVar.b(canvas);
        canvas.restore();
        Matrix matrix = A;
        matrix.reset();
        if (paragraphDirection >= 0) {
            matrix.setScale(AndroidUtilities.dp(50.0f), 1.0f);
            matrix.postTranslate(lerp, 0.0f);
        } else {
            matrix.setScale(-AndroidUtilities.dp(50.0f), 1.0f);
            matrix.postTranslate(f11 - lerp, 0.0f);
        }
        y.setLocalMatrix(matrix);
        canvas.drawRect(min, f13, max, f14, x);
        canvas.restoreToCount(saveLayer);
    }

    public static float i(Layout layout, int i9) {
        float lineRight = layout.getLineRight(i9) - layout.getLineLeft(i9);
        return lineRight >= 0.0f ? lineRight : -lineRight;
    }

    public final void a(float f10) {
        int size = this.b.size();
        View view = null;
        int i9 = 0;
        while (i9 < size) {
            cj0 cj0Var = (cj0) this.b.get(i9);
            float f11 = (this.n || i9 <= this.d) ? 1.0f : 0.0f;
            ArrayList arrayList = this.c;
            float floatValue = i9 < arrayList.size() ? ((Float) arrayList.get(i9)).floatValue() : f11;
            if (floatValue == f11) {
                f11 = floatValue;
            } else if (f10 > 0.0f) {
                float f12 = f10 / 0.2f;
                f11 = f11 > floatValue ? Math.min(f11, f12 + floatValue) : Math.max(f11, floatValue - f12);
            }
            if (i9 < arrayList.size() && f11 != floatValue) {
                arrayList.set(i9, Float.valueOf(f11));
            }
            View parentView = cj0Var.getParentView();
            if (parentView != null && parentView != view) {
                if (parentView.getAlpha() != f11) {
                    parentView.setAlpha(f11);
                }
                view = parentView;
            }
            i9++;
        }
    }

    public final float c(cj0 cj0Var) {
        int d = d(cj0Var);
        if (d < 0) {
            return 1.0f;
        }
        ArrayList arrayList = this.c;
        if (d >= arrayList.size()) {
            return 1.0f;
        }
        return ((Float) arrayList.get(d)).floatValue();
    }

    public final int d(cj0 cj0Var) {
        int size = this.b.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.b.get(i9) == cj0Var) {
                return i9;
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
                        Layout layout = ((cj0) this.b.get(this.d)).getLayout();
                        if (layout != null && layout.getLineCount() != 0) {
                            if (this.e >= layout.getLineCount()) {
                                int lineCount = layout.getLineCount() - 1;
                                this.e = lineCount;
                                this.f = i(layout, lineCount);
                            }
                            float i9 = i(layout, this.e);
                            if (i9 <= 0.001f) {
                                if (k(layout)) {
                                    break;
                                }
                            } else {
                                float f13 = this.f;
                                float f14 = i9 - f13;
                                if (f14 <= 0.001f) {
                                    if (k(layout)) {
                                        break;
                                    }
                                } else {
                                    if (f12 < f14) {
                                        f14 = f12;
                                    }
                                    float f15 = f13 + f14;
                                    this.f = f15;
                                    f12 -= f14;
                                    if (i9 - f15 <= 0.001f && !k(layout)) {
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
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.set(i10, Float.valueOf(1.0f));
            }
            int size2 = this.b.size();
            View view = null;
            for (int i11 = 0; i11 < size2; i11++) {
                View parentView = ((cj0) this.b.get(i11)).getParentView();
                if (parentView != null && parentView != view) {
                    if (parentView.getAlpha() != 1.0f) {
                        parentView.setAlpha(1.0f);
                    }
                    view = parentView;
                }
            }
            gh.e9 e9Var = this.w;
            if (e9Var != null) {
                e9Var.run();
                this.w = null;
            }
        }
    }

    public final void e() {
        cj0 cj0Var;
        int i9 = this.d;
        View parentView = (i9 < 0 || i9 >= this.b.size() || (cj0Var = (cj0) this.b.get(this.d)) == null) ? null : cj0Var.getParentView();
        if (parentView != null) {
            parentView.invalidate();
            View view = this.v;
            if (view != null && view != parentView) {
                view.invalidate();
            }
            this.v = parentView;
        }
    }

    public final boolean f() {
        if (!this.b.isEmpty()) {
            int size = this.b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((cj0) this.b.get(size)).getLayout();
                if (layout != null && layout.getLineCount() > 0) {
                    break;
                }
                size--;
            }
            if (size >= 0 && layout != null) {
                int i9 = this.d;
                if (i9 < size) {
                    return false;
                }
                if (i9 <= size) {
                    int lineCount = layout.getLineCount() - 1;
                    float i10 = i(layout, lineCount);
                    if (this.e < lineCount || this.f < i10 - 0.001f) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean g(cj0 cj0Var) {
        Layout layout;
        return d(cj0Var) == this.d && (layout = cj0Var.getLayout()) != null && this.e < layout.getLineCount();
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean j(cj0 cj0Var) {
        int d = d(cj0Var);
        if (d < 0 || this.b.isEmpty()) {
            return false;
        }
        int i9 = this.d;
        return d < i9 || d <= i9;
    }

    public final boolean k(Layout layout) {
        int i9 = this.e + 1;
        this.e = i9;
        this.f = 0.0f;
        if (i9 >= layout.getLineCount()) {
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

    public final void l(List list) {
        float f10;
        ArrayList arrayList;
        boolean z10;
        if (!this.b.isEmpty() && this.d >= this.b.size()) {
            int size = this.b.size() - 1;
            this.d = size;
            Layout layout = ((cj0) this.b.get(size)).getLayout();
            int max = Math.max(0, layout == null ? 0 : layout.getLineCount() - 1);
            this.e = max;
            this.f = layout == null ? 0.0f : layout.getLineWidth(max);
        }
        if (list == null) {
            list = new ArrayList();
        }
        this.b = list;
        if (list.isEmpty()) {
            f10 = 0.0f;
        } else {
            int i9 = this.d;
            f10 = 0.0f;
            while (i9 < this.b.size()) {
                Layout layout2 = ((cj0) this.b.get(i9)).getLayout();
                if (layout2 != null) {
                    int min = i9 == this.d ? Math.min(Math.max(this.e, 0), Math.max(0, layout2.getLineCount() - 1)) : 0;
                    for (int i10 = min; i10 < layout2.getLineCount(); i10++) {
                        float i11 = i(layout2, i10);
                        if (i11 > 0.001f) {
                            if (i9 == this.d && i10 == min) {
                                i11 -= this.f;
                                if (i11 <= 0.001f) {
                                }
                            }
                            f10 += i11;
                        }
                    }
                }
                i9++;
            }
        }
        float dp = AndroidUtilities.dp(40.0f);
        if (f10 <= 0.001f) {
            this.s = dp;
        } else {
            this.s = Math.max(dp, f10 / 1.05f);
        }
        this.n = f();
        while (true) {
            arrayList = this.c;
            if (arrayList.size() <= this.b.size()) {
                break;
            } else {
                aa.d.u(1, arrayList);
            }
        }
        int size2 = arrayList.size();
        while (size2 < this.b.size()) {
            arrayList.add(Float.valueOf((this.n || size2 <= this.d) ? 1.0f : 0.0f));
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

    public final void m(gh.e9 e9Var) {
        this.w = e9Var;
    }
}
