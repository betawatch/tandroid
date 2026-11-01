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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class zg0 extends FrameLayout {
    public final Paint a;
    public final Path b;
    public final yg0 c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public org.telegram.messenger.ls n;

    public zg0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT < 31 || org.telegram.messenger.uz.o() < 1) {
            this.c = new wg0(this);
        } else {
            this.c = new xg0(this, org.telegram.messenger.uz.o() == 2 ? 1.0f : 1.5f);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static /* synthetic */ void a(zg0 zg0Var, Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.i0.L(32.0f));
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!this.h) {
            super.draw(canvas);
        } else {
            this.c.b(new px(this, 13), canvas);
        }
    }

    public float getAvatarEndScale() {
        float min;
        int L;
        org.telegram.messenger.ls lsVar = this.n;
        if (lsVar == null) {
            return 0.8f;
        }
        if (lsVar.c) {
            min = lsVar.e.width() - org.telegram.messenger.i0.L(2.0f);
            L = org.telegram.messenger.i0.L(100.0f);
        } else {
            min = Math.min(lsVar.e.width(), this.n.e.height());
            L = org.telegram.messenger.i0.L(100.0f);
        }
        return Math.min(0.8f, min / L);
    }

    public float getHiddenAvatarSizeDp() {
        org.telegram.messenger.ls lsVar = this.n;
        if (lsVar == null || !lsVar.c) {
            return 24.0f;
        }
        return (lsVar.e.width() * 0.5f) / org.telegram.messenger.i0.p;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        org.telegram.messenger.ls lsVar;
        float f7;
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 28) {
            lsVar = new org.telegram.messenger.ls();
            int identifier = context.getResources().getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier != 0) {
                String string = context.getString(identifier);
                if (!string.isEmpty()) {
                    String trim = string.trim();
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    int i15 = displayMetrics.widthPixels;
                    float f10 = displayMetrics.density;
                    if (trim.endsWith("@right")) {
                        f7 = i15;
                        trim = trim.substring(0, trim.length() - 6).trim();
                        i14 = 5;
                    } else if (trim.endsWith("@left")) {
                        trim = trim.substring(0, trim.length() - 5).trim();
                        f7 = 0.0f;
                        i14 = 3;
                    } else {
                        f7 = i15 / 2.0f;
                        i14 = 17;
                    }
                    boolean endsWith = trim.endsWith("@dp");
                    if (endsWith) {
                        trim = c3.i0.m(3, 0, trim);
                    }
                    if (trim.contains("@bottom")) {
                        trim = trim.split("@bottom", 2)[0].trim();
                    }
                    try {
                        i0.e[] c10 = v7.w7.c(trim);
                        Path path = new Path();
                        i0.e.b(c10, path);
                        Matrix matrix = new Matrix();
                        if (endsWith) {
                            matrix.postScale(f10, f10);
                        }
                        matrix.postTranslate(f7, 0.0f);
                        path.transform(matrix);
                        lsVar.d = path;
                        RectF rectF = new RectF();
                        path.computeBounds(rectF, true);
                        lsVar.e = rectF;
                        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                        if (i14 != 17 && Math.abs(rectF.centerX() - (displayMetrics2.widthPixels / 2.0f)) <= org.telegram.messenger.i0.L(2.0f)) {
                            i14 = 17;
                        }
                        int i16 = (i14 != 17 || rectF.left >= ((float) displayMetrics2.widthPixels) / 4.0f) ? i14 : 3;
                        lsVar.a = (i16 != 17 || rectF.right <= (((float) displayMetrics2.widthPixels) / 4.0f) * 3.0f) ? i16 : 5;
                        lsVar.b = trim.contains("C") || trim.contains("S") || trim.contains("Q");
                        lsVar.c = rectF.width() <= ((float) org.telegram.messenger.i0.L(32.0f)) || rectF.width() <= rectF.height();
                    } catch (Throwable th2) {
                        org.telegram.messenger.f8.e("Failed to parse notch info", th2);
                    }
                    this.n = lsVar;
                    if ((lsVar != null && lsVar.a != 17) || getWidth() > getHeight()) {
                        this.n = null;
                    }
                    this.c.d(i10, i11);
                }
            }
        }
        lsVar = null;
        this.n = lsVar;
        if (lsVar != null) {
            this.n = null;
            this.c.d(i10, i11);
        }
        this.n = null;
        this.c.d(i10, i11);
    }

    public void setBlurIntensity(float f7) {
        this.f = f7;
        this.c.c(f7);
        invalidate();
    }

    public void setGooeyEnabled(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setHideProgress(float f7) {
        setPullProgress(f7);
        setBlurIntensity(Math.min((w7.u.a(f7, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
        setGooeyEnabled(f7 > 0.0f && f7 < 1.0f);
        setVisibility(f7 >= 1.0f ? 8 : 0);
    }

    public void setIntensity(float f7) {
        this.d = f7;
        this.c.a(f7);
        invalidate();
    }

    public void setPullProgress(float f7) {
        this.e = f7;
        invalidate();
    }
}
