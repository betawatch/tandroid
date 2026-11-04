package mg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.uc;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n extends q {
    public float[] J1;
    public float[] K1;
    public float L1;
    public boolean M1;
    public int N1;
    public RectF O1;
    public TextPaint P1;
    public float Q1;
    public float R1;
    public String[] S1;
    public og.g T1;
    public float U1;
    public int V1;
    public int W1;
    public int X1;

    @Override // mg.g
    public final void A(boolean z10, boolean z11, boolean z12) {
        super.A(z10, z11, z12);
        ng.b bVar = this.i0;
        if (bVar == null || ((ng.e) bVar).b == null) {
            return;
        }
        j jVar = this.h0;
        N(jVar.k, jVar.l, z11);
    }

    @Override // mg.g
    public final void C(int i3, int i10) {
        ArrayList arrayList;
        RectF rectF = this.O1;
        if (this.i0 == null || this.M1) {
            return;
        }
        RectF rectF2 = this.I0;
        float degrees = (float) (Math.toDegrees(Math.atan2((rectF2.centerY() + g0.L(16.0f)) - i10, rectF2.centerX() - i3)) - 90.0d);
        float f10 = 0.0f;
        if (degrees < 0.0f) {
            degrees = (float) (degrees + 360.0d);
        }
        float f11 = degrees / 360.0f;
        float f12 = 0.0f;
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                f12 = 0.0f;
                break;
            }
            if (((o) arrayList.get(i11)).n || ((o) arrayList.get(i11)).o != 0.0f) {
                if (f11 > f12) {
                    float f13 = this.K1[i11] + f12;
                    if (f11 < f13) {
                        f10 = f13;
                        break;
                    }
                }
                f12 += this.K1[i11];
            }
            i11++;
        }
        if (this.N1 != i11 && i11 >= 0) {
            this.N1 = i11;
            invalidate();
            this.T1.setVisibility(0);
            og.f fVar = (og.f) arrayList.get(i11);
            og.g gVar = this.T1;
            String str = fVar.a.d;
            int i12 = (int) this.J1[this.N1];
            int i13 = fVar.m;
            gVar.N.setText(str);
            TextView textView = gVar.O;
            textView.setText(Integer.toString(i12));
            textView.setTextColor(i13);
            this.T1.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            double width = rectF.width() / 2.0f;
            int min = (int) Math.min(rectF.centerX() + (Math.cos(Math.toRadians((f10 * 360.0f) - 90.0f)) * width), rectF.centerX() + (Math.cos(Math.toRadians((f12 * 360.0f) - 90.0f)) * width));
            int i14 = min >= 0 ? min : 0;
            if (this.T1.getMeasuredWidth() + i14 > getMeasuredWidth() - g0.L(16.0f)) {
                i14 -= (this.T1.getMeasuredWidth() + i14) - (getMeasuredWidth() - g0.L(16.0f));
            }
            int min2 = ((int) Math.min(rectF.centerY(), (int) Math.min((Math.sin(Math.toRadians(r7)) * width) + rectF.centerY(), (Math.sin(Math.toRadians(r13)) * width) + rectF.centerY()))) - g0.L(50.0f);
            this.T1.setTranslationX(i14);
            this.T1.setTranslationY(min2);
            g0.c4(this);
        }
        x((this.H0 * this.h0.k) - g.l1);
    }

    @Override // mg.g
    public final boolean D(ng.b bVar) {
        ng.e eVar = (ng.e) bVar;
        boolean D = super.D(eVar);
        if (eVar != null) {
            this.J1 = new float[eVar.d.size()];
            this.K1 = new float[eVar.d.size()];
            A(false, true, false);
        }
        return D;
    }

    @Override // mg.g
    public final void J(ng.b bVar, long j10) {
        int length = bVar.a.length;
        long j11 = j10 - (j10 % 86400000);
        int i3 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (j11 >= bVar.a[i10]) {
                i3 = i10;
            }
        }
        float length2 = bVar.b.length < 2 ? 0.5f : 1.0f / bVar.a.length;
        j jVar = this.h0;
        if (i3 == 0) {
            jVar.k = 0.0f;
            jVar.l = length2;
            return;
        }
        if (i3 >= bVar.a.length - 1) {
            jVar.k = 1.0f - length2;
            jVar.l = 1.0f;
            return;
        }
        float f10 = i3 * length2;
        jVar.k = f10;
        float f11 = f10 + length2;
        jVar.l = f11;
        if (f11 > 1.0f) {
            jVar.l = 1.0f;
        }
        A(true, true, false);
    }

    @Override // mg.q
    /* renamed from: L */
    public final og.i h(ng.a aVar) {
        return new o(aVar);
    }

    public final void N(float f10, float f11, boolean z10) {
        if (this.J1 == null) {
            return;
        }
        int length = ((ng.e) this.i0).b.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float f12 = ((ng.e) this.i0).b[i12];
            if (f12 >= f10 && i11 == -1) {
                i11 = i12;
            }
            if (f12 <= f11) {
                i10 = i12;
            }
        }
        if (i10 < i11) {
            i11 = i10;
        }
        if (!z10 && this.X1 == i10 && this.W1 == i11) {
            return;
        }
        this.X1 = i10;
        this.W1 = i11;
        this.M1 = true;
        this.L1 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            this.J1[i13] = 0.0f;
        }
        while (i11 <= i10) {
            for (int i14 = 0; i14 < size; i14++) {
                float[] fArr = this.J1;
                fArr[i14] = fArr[i14] + ((ng.a) ((ng.e) this.i0).d.get(i14)).a[i11];
                this.L1 += ((ng.a) ((ng.e) this.i0).d.get(i14)).a[i11];
                if (this.M1 && ((o) arrayList.get(i14)).n && ((ng.a) ((ng.e) this.i0).d.get(i14)).a[i11] > 0) {
                    this.M1 = false;
                }
            }
            i11++;
        }
        if (z10) {
            while (i3 < size) {
                if (this.L1 == 0.0f) {
                    ((o) arrayList.get(i3)).r = 0.0f;
                } else {
                    ((o) arrayList.get(i3)).r = this.J1[i3] / this.L1;
                }
                i3++;
            }
            return;
        }
        while (i3 < size) {
            o oVar = (o) arrayList.get(i3);
            ValueAnimator valueAnimator = oVar.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f13 = this.L1;
            ValueAnimator e10 = g.e(oVar.r, f13 == 0.0f ? 0.0f : this.J1[i3] / f13, new uc(7, this, oVar));
            oVar.s = e10;
            e10.start();
            i3++;
        }
    }

    @Override // mg.g, mg.i
    public final void a(float f10, float f11, boolean z10) {
        if (this.i0 == null) {
            return;
        }
        if (z10) {
            N(f10, f11, false);
        } else {
            H();
            invalidate();
        }
    }

    @Override // mg.g
    public final og.e g() {
        og.g gVar = new og.g(getContext(), null);
        LinearLayout linearLayout = new LinearLayout(gVar.getContext());
        linearLayout.setPadding(g0.L(4.0f), g0.L(2.0f), g0.L(4.0f), g0.L(2.0f));
        TextView textView = new TextView(gVar.getContext());
        gVar.N = textView;
        linearLayout.addView(textView);
        textView.getLayoutParams().width = g0.L(96.0f);
        TextView textView2 = new TextView(gVar.getContext());
        gVar.O = textView2;
        linearLayout.addView(textView2);
        gVar.addView(linearLayout);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        gVar.setPadding(g0.L(12.0f), g0.L(12.0f), g0.L(12.0f), g0.L(12.0f));
        gVar.f.setVisibility(8);
        gVar.G = false;
        this.T1 = gVar;
        return gVar;
    }

    @Override // mg.q, mg.g
    public final og.f h(ng.a aVar) {
        return new o(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e0  */
    @Override // mg.q, mg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        int i3;
        w1.a aVar;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        float f13;
        TextPaint textPaint;
        float f14;
        TextPaint textPaint2;
        float f15;
        int i10;
        float f16;
        int i11;
        int i12;
        float f17;
        TextPaint textPaint3 = this.P1;
        RectF rectF2 = this.O1;
        if (this.i0 == null) {
            return;
        }
        if (canvas != null) {
            canvas.save();
        }
        int i13 = 1;
        if (this.z0 == 1) {
            float f18 = this.A0.f;
            i3 = (int) (f18 * f18 * 255.0f);
        } else {
            i3 = hs.e4;
        }
        float f19 = 0.0f;
        if (this.M1) {
            float f20 = this.U1;
            if (f20 != 0.0f) {
                float f21 = f20 - 0.12f;
                this.U1 = f21;
                if (f21 < 0.0f) {
                    this.U1 = 0.0f;
                }
                invalidate();
            }
        } else {
            float f22 = this.U1;
            if (f22 != 1.0f) {
                float f23 = f22 + 0.12f;
                this.U1 = f23;
                if (f23 > 1.0f) {
                    this.U1 = 1.0f;
                }
                invalidate();
            }
        }
        float f24 = this.U1;
        int i14 = (int) (i3 * f24);
        float f25 = (f24 * 0.6f) + 0.4f;
        RectF rectF3 = this.I0;
        if (canvas != null) {
            canvas.scale(f25, f25, rectF3.centerX(), rectF3.centerY());
        }
        float height = (int) ((rectF3.width() > rectF3.height() ? rectF3.height() : rectF3.width()) * 0.45f);
        rectF2.set(rectF3.centerX() - height, (rectF3.centerY() + g0.L(16.0f)) - height, rectF3.centerX() + height, rectF3.centerY() + g0.L(16.0f) + height);
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        float f26 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            f26 = (((o) arrayList.get(i15)).r * ((o) arrayList.get(i15)).o) + f26;
        }
        if (f26 == 0.0f) {
            if (canvas != null) {
                canvas.restore();
                return;
            }
            return;
        }
        float f27 = -90.0f;
        int i16 = 0;
        while (true) {
            aVar = g.D1;
            f10 = 2.0f;
            f11 = f19;
            if (i16 >= size) {
                break;
            }
            if (((o) arrayList.get(i16)).o > f11 || ((o) arrayList.get(i16)).n) {
                ((o) arrayList.get(i16)).c.setAlpha(i14);
                float f28 = (((o) arrayList.get(i16)).r / f26) * ((o) arrayList.get(i16)).o;
                this.K1[i16] = f28;
                if (f28 != f11) {
                    if (canvas != null) {
                        canvas.save();
                    }
                    i10 = i14;
                    double A = a1.g.A(f28, 2.0f, 360.0f, f27);
                    if (((o) arrayList.get(i16)).q > f11) {
                        float interpolation = aVar.getInterpolation(((o) arrayList.get(i16)).q);
                        if (canvas != null) {
                            i11 = i13;
                            double d = interpolation;
                            f16 = f27;
                            canvas.translate((float) (Math.cos(Math.toRadians(A)) * g0.L(8.0f) * d), (float) (Math.sin(Math.toRadians(A)) * g0.L(8.0f) * d));
                            ((o) arrayList.get(i16)).c.setStyle(Paint.Style.FILL_AND_STROKE);
                            ((o) arrayList.get(i16)).c.setStrokeWidth(1.0f);
                            ((o) arrayList.get(i16)).c.setAntiAlias(!g.B1);
                            if (canvas == null) {
                                i13 = i11;
                                if (this.z0 != i13) {
                                    Paint paint = ((o) arrayList.get(i16)).c;
                                    i12 = i16;
                                    f17 = f16;
                                    canvas.drawArc(rectF2, f17, f28 * 360.0f, true, paint);
                                    ((o) arrayList.get(i12)).c.setStyle(Paint.Style.STROKE);
                                    canvas.restore();
                                } else {
                                    i12 = i16;
                                    f17 = f16;
                                }
                            } else {
                                i12 = i16;
                                f17 = f16;
                                i13 = i11;
                            }
                            ((o) arrayList.get(i12)).c.setAlpha(hs.e4);
                            f27 = (f28 * 360.0f) + f17;
                            i16 = i12 + 1;
                            i14 = i10;
                            f19 = f11;
                        }
                    }
                    f16 = f27;
                    i11 = i13;
                    ((o) arrayList.get(i16)).c.setStyle(Paint.Style.FILL_AND_STROKE);
                    ((o) arrayList.get(i16)).c.setStrokeWidth(1.0f);
                    ((o) arrayList.get(i16)).c.setAntiAlias(!g.B1);
                    if (canvas == null) {
                    }
                    ((o) arrayList.get(i12)).c.setAlpha(hs.e4);
                    f27 = (f28 * 360.0f) + f17;
                    i16 = i12 + 1;
                    i14 = i10;
                    f19 = f11;
                }
            }
            i12 = i16;
            i10 = i14;
            i16 = i12 + 1;
            i14 = i10;
            f19 = f11;
        }
        float f29 = 360.0f;
        int i17 = i14;
        if (canvas != null) {
            float f30 = -90.0f;
            int i18 = 0;
            while (i18 < size) {
                if (((o) arrayList.get(i18)).o > f11 || ((o) arrayList.get(i18)).n) {
                    float f31 = (((o) arrayList.get(i18)).r * ((o) arrayList.get(i18)).o) / f26;
                    canvas.save();
                    double A2 = a1.g.A(f31, f10, f29, f30);
                    if (((o) arrayList.get(i18)).q > f11) {
                        f13 = f10;
                        textPaint = textPaint3;
                        double interpolation2 = aVar.getInterpolation(((o) arrayList.get(i18)).q);
                        rectF = rectF2;
                        f12 = f30;
                        canvas.translate((float) (Math.cos(Math.toRadians(A2)) * g0.L(8.0f) * interpolation2), (float) (Math.sin(Math.toRadians(A2)) * g0.L(8.0f) * interpolation2));
                    } else {
                        rectF = rectF2;
                        f12 = f30;
                        f13 = f10;
                        textPaint = textPaint3;
                    }
                    int i19 = (int) (100.0f * f31);
                    if (f31 < 0.02f || i19 <= 0 || i19 > 100) {
                        f14 = f31;
                        textPaint2 = textPaint;
                    } else {
                        float sqrt = (float) (Math.sqrt(1.0f - f31) * rectF.width() * 0.42f);
                        textPaint2 = textPaint;
                        textPaint2.setTextSize((this.R1 * f31) + this.Q1);
                        textPaint2.setAlpha((int) (i17 * ((o) arrayList.get(i18)).o));
                        f14 = f31;
                        double d10 = sqrt;
                        canvas.drawText(this.S1[i19], (float) ((Math.cos(Math.toRadians(A2)) * d10) + rectF.centerX()), ((float) ((Math.sin(Math.toRadians(A2)) * d10) + rectF.centerY())) - ((textPaint2.ascent() + textPaint2.descent()) / f13), textPaint2);
                    }
                    canvas.restore();
                    ((o) arrayList.get(i18)).c.setAlpha(hs.e4);
                    f29 = 360.0f;
                    f15 = (f14 * 360.0f) + f12;
                } else {
                    rectF = rectF2;
                    f15 = f30;
                    f13 = f10;
                    textPaint2 = textPaint3;
                }
                i18++;
                f30 = f15;
                textPaint3 = textPaint2;
                f10 = f13;
                rectF2 = rectF;
            }
            canvas.restore();
        }
    }

    @Override // mg.q, mg.g
    public final void n(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i3;
        n nVar = this;
        ng.b bVar = nVar.i0;
        if (bVar != null) {
            int length = ((ng.e) bVar).b.length;
            ArrayList arrayList = nVar.d;
            int size = arrayList.size();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((og.f) arrayList.get(i11)).j = 0;
            }
            float length2 = (1.0f / ((ng.e) nVar.i0).b.length) * nVar.D0;
            int i12 = 0;
            while (i12 < length) {
                float y9 = com.google.android.recaptcha.internal.a.y(nVar.D0, length2, ((ng.e) nVar.i0).b[i12], length2 / 2.0f);
                int i13 = 1;
                int i14 = i10;
                int i15 = i14;
                boolean z10 = true;
                float f13 = 0.0f;
                while (i14 < size) {
                    og.f fVar = (og.f) arrayList.get(i14);
                    boolean z11 = fVar.n;
                    if (z11 || fVar.o != 0.0f) {
                        i3 = i12;
                        float f14 = fVar.a.a[i3] * fVar.o;
                        f13 += f14;
                        if (f14 > 0.0f) {
                            i15++;
                            if (z11) {
                                z10 = false;
                            }
                        }
                    } else {
                        i3 = i12;
                    }
                    i14++;
                    i12 = i3;
                }
                int i16 = i12;
                float f15 = 0.0f;
                int i17 = 0;
                while (i17 < size) {
                    og.f fVar2 = (og.f) arrayList.get(i17);
                    if (fVar2.n || fVar2.o != 0.0f) {
                        long[] jArr = fVar2.a.a;
                        if (i15 == i13) {
                            if (jArr[i16] != 0) {
                                f12 = fVar2.o;
                                int i18 = nVar.C0;
                                float f16 = f12 * i18;
                                float[] fArr = fVar2.k;
                                int i19 = fVar2.j;
                                int i20 = i19 + 1;
                                fVar2.j = i20;
                                fArr[i19] = y9;
                                int i21 = i19 + 2;
                                fVar2.j = i21;
                                fArr[i20] = (i18 - f16) - f15;
                                int i22 = i19 + 3;
                                fVar2.j = i22;
                                fArr[i21] = y9;
                                fVar2.j = i19 + 4;
                                fArr[i22] = i18 - f15;
                                f15 += f16;
                            }
                            f12 = 0.0f;
                            int i182 = nVar.C0;
                            float f162 = f12 * i182;
                            float[] fArr2 = fVar2.k;
                            int i192 = fVar2.j;
                            int i202 = i192 + 1;
                            fVar2.j = i202;
                            fArr2[i192] = y9;
                            int i212 = i192 + 2;
                            fVar2.j = i212;
                            fArr2[i202] = (i182 - f162) - f15;
                            int i222 = i192 + 3;
                            fVar2.j = i222;
                            fArr2[i212] = y9;
                            fVar2.j = i192 + 4;
                            fArr2[i222] = i182 - f15;
                            f15 += f162;
                        } else {
                            if (f13 != 0.0f) {
                                if (z10) {
                                    f11 = fVar2.o;
                                    f10 = (jArr[i16] / f13) * f11;
                                } else {
                                    f10 = jArr[i16] / f13;
                                    f11 = fVar2.o;
                                }
                                f12 = f10 * f11;
                                int i1822 = nVar.C0;
                                float f1622 = f12 * i1822;
                                float[] fArr22 = fVar2.k;
                                int i1922 = fVar2.j;
                                int i2022 = i1922 + 1;
                                fVar2.j = i2022;
                                fArr22[i1922] = y9;
                                int i2122 = i1922 + 2;
                                fVar2.j = i2122;
                                fArr22[i2022] = (i1822 - f1622) - f15;
                                int i2222 = i1922 + 3;
                                fVar2.j = i2222;
                                fArr22[i2122] = y9;
                                fVar2.j = i1922 + 4;
                                fArr22[i2222] = i1822 - f15;
                                f15 += f1622;
                            }
                            f12 = 0.0f;
                            int i18222 = nVar.C0;
                            float f16222 = f12 * i18222;
                            float[] fArr222 = fVar2.k;
                            int i19222 = fVar2.j;
                            int i20222 = i19222 + 1;
                            fVar2.j = i20222;
                            fArr222[i19222] = y9;
                            int i21222 = i19222 + 2;
                            fVar2.j = i21222;
                            fArr222[i20222] = (i18222 - f16222) - f15;
                            int i22222 = i19222 + 3;
                            fVar2.j = i22222;
                            fArr222[i21222] = y9;
                            fVar2.j = i19222 + 4;
                            fArr222[i22222] = i18222 - f15;
                            f15 += f16222;
                        }
                    }
                    i17++;
                    i13 = 1;
                    nVar = this;
                }
                i12 = i16 + 1;
                nVar = this;
                i10 = 0;
            }
            for (int i23 = 0; i23 < size; i23++) {
                og.f fVar3 = (og.f) arrayList.get(i23);
                Paint paint = fVar3.c;
                Paint paint2 = fVar3.c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(hs.e4);
                paint2.setAntiAlias(false);
                canvas.drawLines(fVar3.k, 0, fVar3.j, paint2);
            }
        }
    }

    @Override // mg.q, mg.g, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.i0 != null) {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i3 >= arrayList.size()) {
                    break;
                }
                if (i3 == this.N1) {
                    if (((o) arrayList.get(i3)).q < 1.0f) {
                        ((o) arrayList.get(i3)).q += 0.1f;
                        if (((o) arrayList.get(i3)).q > 1.0f) {
                            ((o) arrayList.get(i3)).q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((o) arrayList.get(i3)).q > 0.0f) {
                    ((o) arrayList.get(i3)).q -= 0.1f;
                    if (((o) arrayList.get(i3)).q < 0.0f) {
                        ((o) arrayList.get(i3)).q = 0.0f;
                    }
                    invalidate();
                }
                i3++;
            }
        }
        super.onDraw(canvas);
    }

    @Override // mg.g, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (getMeasuredWidth() != this.V1) {
            this.V1 = getMeasuredWidth();
            RectF rectF = this.I0;
            int height = (int) ((rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f);
            this.Q1 = height / 13;
            this.R1 = height / 7;
        }
    }

    @Override // mg.q, mg.g
    public final void q(og.j jVar) {
        k(null);
        float f10 = 0.0f;
        int i3 = 0;
        while (true) {
            float[] fArr = this.K1;
            if (i3 >= fArr.length) {
                return;
            }
            f10 += fArr[i3];
            jVar.k[i3] = (360.0f * f10) - 180.0f;
            i3++;
        }
    }

    @Override // mg.g
    public final void y() {
        this.N1 = -1;
        this.T1.setVisibility(8);
        invalidate();
    }

    @Override // mg.g
    public final void i(Canvas canvas) {
    }

    @Override // mg.g
    public final void j(Canvas canvas) {
    }

    @Override // mg.g
    public final void o(Canvas canvas) {
    }

    @Override // mg.g
    public final void l(Canvas canvas, og.d dVar) {
    }

    @Override // mg.g
    public final void p(Canvas canvas, og.d dVar) {
    }
}
