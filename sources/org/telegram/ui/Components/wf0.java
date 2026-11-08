package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class wf0 extends FrameLayout {
    public final Paint a;
    public final Path b;
    public final vf0 c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public org.telegram.messenger.bs n;

    public wf0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT < 31 || org.telegram.messenger.iz.o() < 1) {
            this.c = new tf0(this);
        } else {
            this.c = new uf0(this, org.telegram.messenger.iz.o() == 2 ? 1.0f : 1.5f);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static /* synthetic */ void a(wf0 wf0Var, Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(32.0f));
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!this.h) {
            super.draw(canvas);
        } else {
            this.c.b(new bx(this, 13), canvas);
        }
    }

    public float getAvatarEndScale() {
        float min;
        int L;
        org.telegram.messenger.bs bsVar = this.n;
        if (bsVar == null) {
            return 0.8f;
        }
        if (bsVar.c) {
            min = bsVar.e.width() - org.telegram.messenger.g0.L(2.0f);
            L = org.telegram.messenger.g0.L(100.0f);
        } else {
            min = Math.min(bsVar.e.width(), this.n.e.height());
            L = org.telegram.messenger.g0.L(100.0f);
        }
        return Math.min(0.8f, min / L);
    }

    public float getHiddenAvatarSizeDp() {
        org.telegram.messenger.bs bsVar = this.n;
        if (bsVar == null || !bsVar.c) {
            return 24.0f;
        }
        return (bsVar.e.width() * 0.5f) / org.telegram.messenger.g0.p;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        org.telegram.messenger.bs bsVar;
        float f10;
        int i13;
        super.onSizeChanged(i7, i10, i11, i12);
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 28) {
            bsVar = new org.telegram.messenger.bs();
            int identifier = context.getResources().getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier != 0) {
                String string = context.getString(identifier);
                if (!string.isEmpty()) {
                    String trim = string.trim();
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    int i14 = displayMetrics.widthPixels;
                    float f11 = displayMetrics.density;
                    if (trim.endsWith("@right")) {
                        f10 = i14;
                        trim = trim.substring(0, trim.length() - 6).trim();
                        i13 = 5;
                    } else if (trim.endsWith("@left")) {
                        trim = trim.substring(0, trim.length() - 5).trim();
                        f10 = 0.0f;
                        i13 = 3;
                    } else {
                        f10 = i14 / 2.0f;
                        i13 = 17;
                    }
                    boolean endsWith = trim.endsWith("@dp");
                    if (endsWith) {
                        trim = com.google.android.recaptcha.internal.a.k(trim, 3, 0);
                    }
                    if (trim.contains("@bottom")) {
                        trim = trim.split("@bottom", 2)[0].trim();
                    }
                    try {
                        i0.d[] c10 = c8.i0.c(trim);
                        Path path = new Path();
                        i0.d.b(c10, path);
                        Matrix matrix = new Matrix();
                        if (endsWith) {
                            matrix.postScale(f11, f11);
                        }
                        matrix.postTranslate(f10, 0.0f);
                        path.transform(matrix);
                        bsVar.d = path;
                        RectF rectF = new RectF();
                        path.computeBounds(rectF, true);
                        bsVar.e = rectF;
                        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                        if (i13 != 17 && Math.abs(rectF.centerX() - (displayMetrics2.widthPixels / 2.0f)) <= org.telegram.messenger.g0.L(2.0f)) {
                            i13 = 17;
                        }
                        int i15 = (i13 != 17 || rectF.left >= ((float) displayMetrics2.widthPixels) / 4.0f) ? i13 : 3;
                        bsVar.a = (i15 != 17 || rectF.right <= (((float) displayMetrics2.widthPixels) / 4.0f) * 3.0f) ? i15 : 5;
                        bsVar.b = trim.contains("C") || trim.contains("S") || trim.contains("Q");
                        bsVar.c = rectF.width() <= ((float) org.telegram.messenger.g0.L(32.0f)) || rectF.width() <= rectF.height();
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.e("Failed to parse notch info", th2);
                    }
                    this.n = bsVar;
                    if ((bsVar != null && bsVar.a != 17) || getWidth() > getHeight()) {
                        this.n = null;
                    }
                    this.c.d(i7, i10);
                }
            }
        }
        bsVar = null;
        this.n = bsVar;
        if (bsVar != null) {
            this.n = null;
            this.c.d(i7, i10);
        }
        this.n = null;
        this.c.d(i7, i10);
    }

    public void setBlurIntensity(float f10) {
        this.f = f10;
        this.c.c(f10);
        invalidate();
    }

    public void setGooeyEnabled(boolean z9) {
        if (this.h == z9) {
            return;
        }
        this.h = z9;
        invalidate();
    }

    public void setHideProgress(float f10) {
        setPullProgress(f10);
        setBlurIntensity(Math.min((c8.j9.a(f10, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
        setGooeyEnabled(f10 > 0.0f && f10 < 1.0f);
        setVisibility(f10 >= 1.0f ? 8 : 0);
    }

    public void setIntensity(float f10) {
        this.d = f10;
        this.c.a(f10);
        invalidate();
    }

    public void setPullProgress(float f10) {
        this.e = f10;
        invalidate();
    }
}
