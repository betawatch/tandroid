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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class lg0 extends FrameLayout {
    public final Paint a;
    public final Path b;
    public final kg0 c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public bi.c2 n;

    public lg0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT < 31 || org.telegram.messenger.cz.o() < 1) {
            this.c = new ig0(this);
        } else {
            this.c = new jg0(this, org.telegram.messenger.cz.o() == 2 ? 1.0f : 1.5f);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static /* synthetic */ void a(lg0 lg0Var, Canvas canvas) {
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
            this.c.c(new ky(this, 12), canvas);
        }
    }

    public float getAvatarEndScale() {
        float min;
        int L;
        bi.c2 c2Var = this.n;
        if (c2Var == null) {
            return 0.8f;
        }
        if (c2Var.c) {
            min = ((RectF) c2Var.e).width() - org.telegram.messenger.g0.L(2.0f);
            L = org.telegram.messenger.g0.L(100.0f);
        } else {
            min = Math.min(((RectF) c2Var.e).width(), ((RectF) this.n.e).height());
            L = org.telegram.messenger.g0.L(100.0f);
        }
        return Math.min(0.8f, min / L);
    }

    public float getHiddenAvatarSizeDp() {
        bi.c2 c2Var = this.n;
        if (c2Var == null || !c2Var.c) {
            return 24.0f;
        }
        return (((RectF) c2Var.e).width() * 0.5f) / org.telegram.messenger.g0.p;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        bi.c2 c2Var;
        float f10;
        int i13;
        super.onSizeChanged(i7, i10, i11, i12);
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 28) {
            c2Var = new bi.c2();
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
                        trim = com.google.android.gms.internal.vision.e2.k(trim, 3, 0);
                    }
                    if (trim.contains("@bottom")) {
                        trim = trim.split("@bottom", 2)[0].trim();
                    }
                    try {
                        i0.d[] c10 = c8.l0.c(trim);
                        Path path = new Path();
                        i0.d.b(c10, path);
                        Matrix matrix = new Matrix();
                        if (endsWith) {
                            matrix.postScale(f11, f11);
                        }
                        matrix.postTranslate(f10, 0.0f);
                        path.transform(matrix);
                        c2Var.d = path;
                        RectF rectF = new RectF();
                        path.computeBounds(rectF, true);
                        c2Var.e = rectF;
                        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                        if (i13 != 17 && Math.abs(rectF.centerX() - (displayMetrics2.widthPixels / 2.0f)) <= org.telegram.messenger.g0.L(2.0f)) {
                            i13 = 17;
                        }
                        int i15 = (i13 != 17 || rectF.left >= ((float) displayMetrics2.widthPixels) / 4.0f) ? i13 : 3;
                        c2Var.a = (i15 != 17 || rectF.right <= (((float) displayMetrics2.widthPixels) / 4.0f) * 3.0f) ? i15 : 5;
                        c2Var.b = trim.contains("C") || trim.contains("S") || trim.contains("Q");
                        c2Var.c = rectF.width() <= ((float) org.telegram.messenger.g0.L(32.0f)) || rectF.width() <= rectF.height();
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.e("Failed to parse notch info", th2);
                    }
                    this.n = c2Var;
                    if ((c2Var != null && c2Var.a != 17) || getWidth() > getHeight()) {
                        this.n = null;
                    }
                    this.c.d(i7, i10);
                }
            }
        }
        c2Var = null;
        this.n = c2Var;
        if (c2Var != null) {
            this.n = null;
            this.c.d(i7, i10);
        }
        this.n = null;
        this.c.d(i7, i10);
    }

    public void setBlurIntensity(float f10) {
        this.f = f10;
        this.c.b(f10);
        invalidate();
    }

    public void setGooeyEnabled(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setHideProgress(float f10) {
        setPullProgress(f10);
        setBlurIntensity(Math.min((c8.l9.a(f10, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
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
