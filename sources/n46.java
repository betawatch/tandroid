// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n46 extends k34 {
    public final /* synthetic */ byte n = 3;
    public final Paint r;
    public final Path s;

    public n46(o46 o46Var, Context context) {
        super(o46Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // k34
    public final int a(float f, float f2) {
        switch (this.n) {
            case 0:
                float L = gl.L(1.0f);
                float L2 = gl.L(19.5f);
                float f3 = L + L2;
                float f4 = f3 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f4;
                float z = oo1.z(getMeasuredHeight(), f4, 2.0f, f3);
                if (f <= f3 - L2 || f2 <= z - L2 || f >= f3 + L2 || f2 >= z + L2) {
                    float f5 = f3 + measuredWidth;
                    if (f <= f5 - L2 || f2 <= z - L2 || f >= f5 + L2 || f2 >= z + L2) {
                    }
                }
                break;
            case 1:
                float L3 = gl.L(1.0f);
                float L4 = gl.L(19.5f);
                float f6 = L3 + L4;
                float f7 = f6 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f7;
                float z2 = oo1.z(getMeasuredHeight(), f7, 2.0f, f6);
                if (f <= f6 - L4 || f2 <= z2 - L4 || f >= f6 + L4 || f2 >= z2 + L4) {
                    float f8 = f6 + measuredWidth2;
                    if (f <= f8 - L4 || f2 <= z2 - L4 || f >= f8 + L4 || f2 >= z2 + L4) {
                    }
                }
                break;
            case 2:
                float L5 = gl.L(1.0f);
                float L6 = gl.L(19.5f);
                float f9 = L5 + L6;
                float f10 = f9 * 2.0f;
                float measuredWidth3 = getMeasuredWidth() - f10;
                float measuredHeight = getMeasuredHeight() - f10;
                float f11 = (measuredHeight / 2.0f) + f9;
                if (f <= f9 - L6 || f2 <= f11 - L6 || f >= f9 + L6 || f2 >= f11 + L6) {
                    float f12 = f9 + measuredWidth3;
                    if (f <= f12 - L6 || f2 <= f11 - L6 || f >= f12 + L6 || f2 >= f11 + L6) {
                        if (f <= f9 || f >= measuredWidth3 || f2 <= f9 || f2 >= measuredHeight) {
                        }
                    }
                }
                break;
            case 3:
                float L7 = gl.L(1.0f);
                float L8 = gl.L(19.5f);
                float f13 = L7 + L8;
                float f14 = f13 * 2.0f;
                float measuredWidth4 = getMeasuredWidth() - f14;
                float measuredHeight2 = getMeasuredHeight() - f14;
                float f15 = (measuredHeight2 / 2.0f) + f13;
                if (f <= f13 - L8 || f2 <= f15 - L8 || f >= f13 + L8 || f2 >= f15 + L8) {
                    float f16 = f13 + measuredWidth4;
                    if (f <= f16 - L8 || f2 <= f15 - L8 || f >= f16 + L8 || f2 >= f15 + L8) {
                        if (f <= f13 || f >= measuredWidth4 || f2 <= f13 || f2 >= measuredHeight2) {
                        }
                    }
                }
                break;
            case 4:
                float L9 = gl.L(1.0f);
                float L10 = gl.L(19.5f);
                float f17 = L9 + L10;
                float f18 = f17 * 2.0f;
                float measuredWidth5 = getMeasuredWidth() - f18;
                float z3 = oo1.z(getMeasuredHeight(), f18, 2.0f, f17);
                if (f <= f17 - L10 || f2 <= z3 - L10 || f >= f17 + L10 || f2 >= z3 + L10) {
                    float f19 = f17 + measuredWidth5;
                    if (f <= f19 - L10 || f2 <= z3 - L10 || f >= f19 + L10 || f2 >= z3 + L10) {
                    }
                }
                break;
            default:
                float L11 = gl.L(1.0f);
                float L12 = gl.L(19.5f);
                float f20 = L11 + L12;
                float f21 = f20 * 2.0f;
                float measuredWidth6 = getMeasuredWidth() - f21;
                float z4 = oo1.z(getMeasuredHeight(), f21, 2.0f, f20);
                if (f <= f20 - L12 || f2 <= z4 - L12 || f >= f20 + L12 || f2 >= z4 + L12) {
                    float f22 = f20 + measuredWidth6;
                    if (f <= f22 - L12 || f2 <= z4 - L12 || f >= f22 + L12 || f2 >= z4 + L12) {
                    }
                }
                break;
        }
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        n46 n46Var;
        Canvas canvas3;
        n46 n46Var2;
        int i;
        Paint paint;
        Paint paint2;
        float f;
        float f2;
        float f3;
        float f4;
        Canvas canvas4;
        byte b = this.n;
        Path path = this.s;
        Paint paint3 = this.c;
        Paint paint4 = this.b;
        Paint paint5 = this.r;
        switch (b) {
            case 0:
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        int i2 = (int) (showAlpha * 255.0f);
                        canvas2 = canvas;
                        n46Var = this;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i2, 31);
                    } else {
                        canvas2 = canvas;
                        n46Var = this;
                    }
                    float L = gl.L(2.0f);
                    float N = gl.N(5.66f);
                    float L2 = L + N + gl.L(15.0f);
                    float f5 = L2 * 2.0f;
                    float measuredWidth = n46Var.getMeasuredWidth() - f5;
                    float measuredHeight = n46Var.getMeasuredHeight() - f5;
                    RectF rectF = gl.P;
                    float f6 = L2 + measuredWidth;
                    float f7 = L2 + measuredHeight;
                    rectF.set(L2, L2, f6, f7);
                    float L3 = gl.L(12.0f);
                    float min = Math.min(L3, measuredWidth / 2.0f);
                    float f8 = measuredHeight / 2.0f;
                    float min2 = Math.min(L3, f8);
                    path.rewind();
                    float f9 = min * 2.0f;
                    float f10 = L2 + f9;
                    float f11 = min2 * 2.0f;
                    float f12 = L2 + f11;
                    rectF.set(L2, L2, f10, f12);
                    path.arcTo(rectF, 180.0f, 90.0f);
                    float f13 = f6 - f9;
                    rectF.set(f13, L2, f6, f12);
                    path.arcTo(rectF, 270.0f, 90.0f);
                    Paint paint6 = n46Var.a;
                    canvas2.drawPath(path, paint6);
                    path.rewind();
                    float f14 = f7 - f11;
                    rectF.set(L2, f14, f10, f7);
                    path.arcTo(rectF, 180.0f, -90.0f);
                    rectF.set(f13, f14, f6, f7);
                    path.arcTo(rectF, 90.0f, -90.0f);
                    canvas2.drawPath(path, paint6);
                    float f15 = L2 + f8;
                    canvas2.drawCircle(L2, f15, N, paint3);
                    canvas2.drawCircle(L2, f15, (N - gl.L(1.0f)) + 1.0f, paint4);
                    canvas2.drawCircle(f6, f15, N, paint3);
                    canvas2.drawCircle(f6, f15, (N - gl.L(1.0f)) + 1.0f, paint4);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
                    float f16 = L2 + min2;
                    float f17 = f7 - min2;
                    canvas.drawLine(L2, f16, L2, f17, paint6);
                    canvas.drawLine(f6, f16, f6, f17, paint6);
                    canvas.drawCircle(f6, f15, (gl.L(1.0f) + N) - 1.0f, paint5);
                    canvas.drawCircle(L2, f15, (N + gl.L(1.0f)) - 1.0f, paint5);
                    canvas.restoreToCount(saveCount);
                    break;
                }
                break;
            case 1:
                super.onDraw(canvas);
                int saveCount2 = canvas.getSaveCount();
                float showAlpha2 = getShowAlpha();
                if (showAlpha2 > 0.0f) {
                    if (showAlpha2 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha2 * 255.0f), 31);
                    }
                    float L4 = gl.L(2.0f);
                    float N2 = gl.N(5.66f);
                    float L5 = L4 + N2 + gl.L(15.0f);
                    float f18 = L5 * 2.0f;
                    float measuredWidth2 = getMeasuredWidth() - f18;
                    float measuredHeight2 = getMeasuredHeight() - f18;
                    RectF rectF2 = gl.P;
                    float f19 = L5 + measuredWidth2;
                    float f20 = L5 + measuredHeight2;
                    rectF2.set(L5, L5, f19, f20);
                    float L6 = gl.L(12.0f);
                    float min3 = Math.min(L6, measuredWidth2 / 2.0f);
                    float f21 = measuredHeight2 / 2.0f;
                    float min4 = Math.min(L6, f21);
                    path.rewind();
                    float f22 = min3 * 2.0f;
                    float f23 = L5 + f22;
                    float f24 = min4 * 2.0f;
                    float f25 = L5 + f24;
                    rectF2.set(L5, L5, f23, f25);
                    path.arcTo(rectF2, 180.0f, 90.0f);
                    float f26 = f19 - f22;
                    rectF2.set(f26, L5, f19, f25);
                    path.arcTo(rectF2, 270.0f, 90.0f);
                    Paint paint7 = this.a;
                    canvas.drawPath(path, paint7);
                    path.rewind();
                    float f27 = f20 - f24;
                    rectF2.set(L5, f27, f23, f20);
                    path.arcTo(rectF2, 180.0f, -90.0f);
                    rectF2.set(f26, f27, f19, f20);
                    path.arcTo(rectF2, 90.0f, -90.0f);
                    canvas.drawPath(path, paint7);
                    float f28 = L5 + f21;
                    canvas.drawCircle(L5, f28, N2, paint3);
                    canvas.drawCircle(L5, f28, (N2 - gl.L(1.0f)) + 1.0f, paint4);
                    canvas.drawCircle(f19, f28, N2, paint3);
                    canvas.drawCircle(f19, f28, (N2 - gl.L(1.0f)) + 1.0f, paint4);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
                    float f29 = L5 + min4;
                    float f30 = f20 - min4;
                    canvas.drawLine(L5, f29, L5, f30, paint7);
                    canvas.drawLine(f19, f29, f19, f30, paint7);
                    canvas.drawCircle(f19, f28, (gl.L(1.0f) + N2) - 1.0f, paint5);
                    canvas.drawCircle(L5, f28, (N2 + gl.L(1.0f)) - 1.0f, paint5);
                    canvas.restoreToCount(saveCount2);
                    break;
                }
                break;
            case 2:
                super.onDraw(canvas);
                int saveCount3 = canvas.getSaveCount();
                float showAlpha3 = getShowAlpha();
                if (showAlpha3 > 0.0f) {
                    if (showAlpha3 < 1.0f) {
                        int i3 = (int) (showAlpha3 * 255.0f);
                        canvas3 = canvas;
                        n46Var2 = this;
                        canvas3.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i3, 31);
                    } else {
                        canvas3 = canvas;
                        n46Var2 = this;
                    }
                    float L7 = gl.L(2.0f);
                    float N3 = gl.N(5.66f);
                    float L8 = L7 + N3 + gl.L(15.0f);
                    float f31 = L8 * 2.0f;
                    float measuredWidth3 = n46Var2.getMeasuredWidth() - f31;
                    float measuredHeight3 = n46Var2.getMeasuredHeight() - f31;
                    RectF rectF3 = gl.P;
                    float f32 = L8 + measuredWidth3;
                    float f33 = L8 + measuredHeight3;
                    rectF3.set(L8, L8, f32, f33);
                    float L9 = gl.L(12.0f);
                    float min5 = Math.min(L9, measuredWidth3 / 2.0f);
                    float f34 = measuredHeight3 / 2.0f;
                    float min6 = Math.min(L9, f34);
                    path.rewind();
                    float f35 = min5 * 2.0f;
                    float f36 = L8 + f35;
                    float f37 = min6 * 2.0f;
                    float f38 = L8 + f37;
                    rectF3.set(L8, L8, f36, f38);
                    path.arcTo(rectF3, 180.0f, 90.0f);
                    float f39 = f32 - f35;
                    rectF3.set(f39, L8, f32, f38);
                    path.arcTo(rectF3, 270.0f, 90.0f);
                    Paint paint8 = n46Var2.a;
                    canvas3.drawPath(path, paint8);
                    path.rewind();
                    float f40 = f33 - f37;
                    rectF3.set(L8, f40, f36, f33);
                    path.arcTo(rectF3, 180.0f, -90.0f);
                    rectF3.set(f39, f40, f32, f33);
                    path.arcTo(rectF3, 90.0f, -90.0f);
                    canvas3.drawPath(path, paint8);
                    float f41 = L8 + f34;
                    canvas3.drawCircle(L8, f41, N3, paint3);
                    canvas3.drawCircle(L8, f41, (N3 - gl.L(1.0f)) + 1.0f, paint4);
                    canvas3.drawCircle(f32, f41, N3, paint3);
                    canvas3.drawCircle(f32, f41, (N3 - gl.L(1.0f)) + 1.0f, paint4);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
                    float f42 = L8 + min6;
                    float f43 = f33 - min6;
                    canvas.drawLine(L8, f42, L8, f43, paint8);
                    canvas.drawLine(f32, f42, f32, f43, paint8);
                    canvas.drawCircle(f32, f41, (gl.L(1.0f) + N3) - 1.0f, paint5);
                    canvas.drawCircle(L8, f41, (N3 + gl.L(1.0f)) - 1.0f, paint5);
                    canvas.restoreToCount(saveCount3);
                    break;
                }
                break;
            case 3:
                super.onDraw(canvas);
                int saveCount4 = canvas.getSaveCount();
                float showAlpha4 = getShowAlpha();
                if (showAlpha4 > 0.0f) {
                    if (showAlpha4 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha4 * 255.0f), 31);
                    }
                    float L10 = gl.L(2.0f);
                    float N4 = gl.N(5.66f);
                    float L11 = L10 + N4 + gl.L(15.0f);
                    float f44 = L11 * 2.0f;
                    float measuredWidth4 = getMeasuredWidth() - f44;
                    float measuredHeight4 = getMeasuredHeight() - f44;
                    RectF rectF4 = gl.P;
                    float f45 = L11 + measuredWidth4;
                    float f46 = L11 + measuredHeight4;
                    rectF4.set(L11, L11, f45, f46);
                    float L12 = gl.L(12.0f);
                    float min7 = Math.min(L12, measuredWidth4 / 2.0f);
                    float f47 = measuredHeight4 / 2.0f;
                    float min8 = Math.min(L12, f47);
                    path.rewind();
                    float f48 = min7 * 2.0f;
                    float f49 = L11 + f48;
                    float f50 = min8 * 2.0f;
                    float f51 = L11 + f50;
                    rectF4.set(L11, L11, f49, f51);
                    path.arcTo(rectF4, 180.0f, 90.0f);
                    float f52 = f45 - f48;
                    rectF4.set(f52, L11, f45, f51);
                    path.arcTo(rectF4, 270.0f, 90.0f);
                    Paint paint9 = this.a;
                    canvas.drawPath(path, paint9);
                    path.rewind();
                    float f53 = f46 - f50;
                    rectF4.set(L11, f53, f49, f46);
                    path.arcTo(rectF4, 180.0f, -90.0f);
                    rectF4.set(f52, f53, f45, f46);
                    path.arcTo(rectF4, 90.0f, -90.0f);
                    canvas.drawPath(path, paint9);
                    float f54 = L11 + f47;
                    canvas.drawCircle(L11, f54, N4, paint3);
                    canvas.drawCircle(L11, f54, (N4 - gl.L(1.0f)) + 1.0f, paint4);
                    canvas.drawCircle(f45, f54, N4, paint3);
                    canvas.drawCircle(f45, f54, (N4 - gl.L(1.0f)) + 1.0f, paint4);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
                    float f55 = L11 + min8;
                    float f56 = f46 - min8;
                    canvas.drawLine(L11, f55, L11, f56, paint9);
                    canvas.drawLine(f45, f55, f45, f56, paint9);
                    canvas.drawCircle(f45, f54, (gl.L(1.0f) + N4) - 1.0f, paint5);
                    canvas.drawCircle(L11, f54, (N4 + gl.L(1.0f)) - 1.0f, paint5);
                    canvas.restoreToCount(saveCount4);
                    break;
                }
                break;
            case 4:
                super.onDraw(canvas);
                int saveCount5 = canvas.getSaveCount();
                float showAlpha5 = getShowAlpha();
                if (showAlpha5 > 0.0f) {
                    if (showAlpha5 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha5 * 255.0f), 31);
                    }
                    float L13 = gl.L(2.0f);
                    float N5 = gl.N(5.66f);
                    float L14 = L13 + N5 + gl.L(15.0f);
                    float f57 = L14 * 2.0f;
                    float measuredWidth5 = getMeasuredWidth() - f57;
                    float measuredHeight5 = getMeasuredHeight() - f57;
                    RectF rectF5 = gl.P;
                    float f58 = L14 + measuredWidth5;
                    float f59 = L14 + measuredHeight5;
                    rectF5.set(L14, L14, f58, f59);
                    float L15 = gl.L(12.0f);
                    float min9 = Math.min(L15, measuredWidth5 / 2.0f);
                    float f60 = measuredHeight5 / 2.0f;
                    float min10 = Math.min(L15, f60);
                    path.rewind();
                    float f61 = min9 * 2.0f;
                    float f62 = L14 + f61;
                    float f63 = min10 * 2.0f;
                    float f64 = L14 + f63;
                    rectF5.set(L14, L14, f62, f64);
                    path.arcTo(rectF5, 180.0f, 90.0f);
                    float f65 = f58 - f61;
                    rectF5.set(f65, L14, f58, f64);
                    path.arcTo(rectF5, 270.0f, 90.0f);
                    Paint paint10 = this.a;
                    canvas.drawPath(path, paint10);
                    path.rewind();
                    float f66 = f59 - f63;
                    rectF5.set(L14, f66, f62, f59);
                    path.arcTo(rectF5, 180.0f, -90.0f);
                    rectF5.set(f65, f66, f58, f59);
                    path.arcTo(rectF5, 90.0f, -90.0f);
                    canvas.drawPath(path, paint10);
                    float f67 = L14 + f60;
                    canvas.drawCircle(L14, f67, N5, paint3);
                    canvas.drawCircle(L14, f67, (N5 - gl.L(1.0f)) + 1.0f, paint4);
                    canvas.drawCircle(f58, f67, N5, paint3);
                    canvas.drawCircle(f58, f67, (N5 - gl.L(1.0f)) + 1.0f, paint4);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
                    float f68 = L14 + min10;
                    float f69 = f59 - min10;
                    canvas.drawLine(L14, f68, L14, f69, paint10);
                    canvas.drawLine(f58, f68, f58, f69, paint10);
                    canvas.drawCircle(f58, f67, (gl.L(1.0f) + N5) - 1.0f, paint5);
                    canvas.drawCircle(L14, f67, (N5 + gl.L(1.0f)) - 1.0f, paint5);
                    canvas.restoreToCount(saveCount5);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                int saveCount6 = canvas.getSaveCount();
                float showAlpha6 = getShowAlpha();
                if (showAlpha6 > 0.0f) {
                    if (showAlpha6 < 1.0f) {
                        int i4 = (int) (showAlpha6 * 255.0f);
                        i = saveCount6;
                        f = 1.0f;
                        paint2 = paint4;
                        paint = paint3;
                        f2 = 5.66f;
                        f3 = 2.0f;
                        f4 = 15.0f;
                        canvas4 = canvas;
                        canvas4.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i4, 31);
                    } else {
                        i = saveCount6;
                        paint = paint3;
                        paint2 = paint4;
                        f = 1.0f;
                        f2 = 5.66f;
                        f3 = 2.0f;
                        f4 = 15.0f;
                        canvas4 = canvas;
                    }
                    float L16 = gl.L(f3);
                    float N6 = gl.N(f2);
                    float L17 = L16 + N6 + gl.L(f4);
                    float f70 = L17 * f3;
                    float measuredWidth6 = getMeasuredWidth() - f70;
                    float measuredHeight6 = getMeasuredHeight() - f70;
                    RectF rectF6 = gl.P;
                    float f71 = L17 + measuredWidth6;
                    float f72 = L17 + measuredHeight6;
                    rectF6.set(L17, L17, f71, f72);
                    float L18 = gl.L(12.0f);
                    float min11 = Math.min(L18, measuredWidth6 / f3);
                    float f73 = measuredHeight6 / f3;
                    float min12 = Math.min(L18, f73);
                    path.rewind();
                    float f74 = min11 * f3;
                    float f75 = L17 + f74;
                    float f76 = min12 * f3;
                    float f77 = L17 + f76;
                    rectF6.set(L17, L17, f75, f77);
                    path.arcTo(rectF6, 180.0f, 90.0f);
                    float f78 = f71 - f74;
                    rectF6.set(f78, L17, f71, f77);
                    path.arcTo(rectF6, 270.0f, 90.0f);
                    Paint paint11 = this.a;
                    canvas4.drawPath(path, paint11);
                    path.rewind();
                    float f79 = f72 - f76;
                    rectF6.set(L17, f79, f75, f72);
                    path.arcTo(rectF6, 180.0f, -90.0f);
                    rectF6.set(f78, f79, f71, f72);
                    path.arcTo(rectF6, 90.0f, -90.0f);
                    canvas4.drawPath(path, paint11);
                    float f80 = L17 + f73;
                    canvas4.drawCircle(L17, f80, N6, paint);
                    Paint paint12 = paint2;
                    canvas4.drawCircle(L17, f80, (N6 - gl.L(f)) + f, paint12);
                    canvas4.drawCircle(f71, f80, N6, paint);
                    canvas4.drawCircle(f71, f80, (N6 - gl.L(f)) + f, paint12);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
                    float f81 = L17 + min12;
                    float f82 = f72 - min12;
                    canvas.drawLine(L17, f81, L17, f82, paint11);
                    canvas.drawLine(f71, f81, f71, f82, paint11);
                    canvas.drawCircle(f71, f80, (gl.L(f) + N6) - f, paint5);
                    canvas.drawCircle(L17, f80, (N6 + gl.L(f)) - f, paint5);
                    canvas.restoreToCount(i);
                    break;
                }
                break;
        }
    }

    public n46(hsc hscVar, Context context) {
        super(hscVar, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public n46(ob6 ob6Var, Context context) {
        super(ob6Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public n46(vhb vhbVar, Context context) {
        super(vhbVar, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public n46(e68 e68Var, Context context) {
        super(e68Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public n46(u17 u17Var, Context context) {
        super(u17Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
