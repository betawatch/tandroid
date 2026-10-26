package kg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bh.b0;
import c3.h0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o extends r {
    public float[] I1;
    public float[] J1;
    public float K1;
    public boolean L1;
    public int M1;
    public RectF N1;
    public TextPaint O1;
    public float P1;
    public float Q1;
    public String[] R1;
    public mg.g S1;
    public float T1;
    public int U1;
    public int V1;
    public int W1;

    @Override // kg.h
    public final void A(boolean z10, boolean z11, boolean z12) {
        super.A(z10, z11, z12);
        lg.b bVar = this.h0;
        if (bVar == null || ((lg.e) bVar).b == null) {
            return;
        }
        k kVar = this.g0;
        N(kVar.k, kVar.l, z11);
    }

    @Override // kg.h
    public final void C(int i10, int i11) {
        ArrayList arrayList;
        RectF rectF = this.N1;
        if (this.h0 == null || this.L1) {
            return;
        }
        RectF rectF2 = this.H0;
        float degrees = (float) (Math.toDegrees(Math.atan2((rectF2.centerY() + AndroidUtilities.dp(16.0f)) - i11, rectF2.centerX() - i10)) - 90.0d);
        float f7 = 0.0f;
        if (degrees < 0.0f) {
            degrees = (float) (degrees + 360.0d);
        }
        float f10 = degrees / 360.0f;
        float f11 = 0.0f;
        int i12 = 0;
        while (true) {
            arrayList = this.d;
            if (i12 >= arrayList.size()) {
                i12 = -1;
                f11 = 0.0f;
                break;
            }
            if (((p) arrayList.get(i12)).n || ((p) arrayList.get(i12)).o != 0.0f) {
                if (f10 > f11) {
                    float f12 = this.J1[i12] + f11;
                    if (f10 < f12) {
                        f7 = f12;
                        break;
                    }
                }
                f11 += this.J1[i12];
            }
            i12++;
        }
        if (this.M1 != i12 && i12 >= 0) {
            this.M1 = i12;
            invalidate();
            this.S1.setVisibility(0);
            mg.f fVar = (mg.f) arrayList.get(i12);
            mg.g gVar = this.S1;
            String str = fVar.a.d;
            int i13 = (int) this.I1[this.M1];
            int i14 = fVar.m;
            gVar.M.setText(str);
            TextView textView = gVar.N;
            textView.setText(Integer.toString(i13));
            textView.setTextColor(i14);
            this.S1.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            double width = rectF.width() / 2.0f;
            int min = (int) Math.min(rectF.centerX() + (Math.cos(Math.toRadians((f7 * 360.0f) - 90.0f)) * width), rectF.centerX() + (Math.cos(Math.toRadians((f11 * 360.0f) - 90.0f)) * width));
            int i15 = min >= 0 ? min : 0;
            if (this.S1.getMeasuredWidth() + i15 > getMeasuredWidth() - AndroidUtilities.dp(16.0f)) {
                i15 -= (this.S1.getMeasuredWidth() + i15) - (getMeasuredWidth() - AndroidUtilities.dp(16.0f));
            }
            int min2 = ((int) Math.min(rectF.centerY(), (int) Math.min((Math.sin(Math.toRadians(r7)) * width) + rectF.centerY(), (Math.sin(Math.toRadians(r13)) * width) + rectF.centerY()))) - AndroidUtilities.dp(50.0f);
            this.S1.setTranslationX(i15);
            this.S1.setTranslationY(min2);
            AndroidUtilities.vibrateCursor(this);
        }
        x((this.G0 * this.g0.k) - h.k1);
    }

    @Override // kg.h
    public final boolean D(lg.b bVar) {
        lg.e eVar = (lg.e) bVar;
        boolean D = super.D(eVar);
        if (eVar != null) {
            this.I1 = new float[eVar.d.size()];
            this.J1 = new float[eVar.d.size()];
            A(false, true, false);
        }
        return D;
    }

    @Override // kg.h
    public final void J(lg.b bVar, long j10) {
        int length = bVar.a.length;
        long j11 = j10 - (j10 % 86400000);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (j11 >= bVar.a[i11]) {
                i10 = i11;
            }
        }
        float length2 = bVar.b.length < 2 ? 0.5f : 1.0f / bVar.a.length;
        k kVar = this.g0;
        if (i10 == 0) {
            kVar.k = 0.0f;
            kVar.l = length2;
            return;
        }
        if (i10 >= bVar.a.length - 1) {
            kVar.k = 1.0f - length2;
            kVar.l = 1.0f;
            return;
        }
        float f7 = i10 * length2;
        kVar.k = f7;
        float f10 = f7 + length2;
        kVar.l = f10;
        if (f10 > 1.0f) {
            kVar.l = 1.0f;
        }
        A(true, true, false);
    }

    @Override // kg.r
    /* renamed from: L */
    public final mg.i h(lg.a aVar) {
        return new p(aVar);
    }

    public final void N(float f7, float f10, boolean z10) {
        if (this.I1 == null) {
            return;
        }
        int length = ((lg.e) this.h0).b.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < length; i13++) {
            float f11 = ((lg.e) this.h0).b[i13];
            if (f11 >= f7 && i12 == -1) {
                i12 = i13;
            }
            if (f11 <= f10) {
                i11 = i13;
            }
        }
        if (i11 < i12) {
            i12 = i11;
        }
        if (!z10 && this.W1 == i11 && this.V1 == i12) {
            return;
        }
        this.W1 = i11;
        this.V1 = i12;
        this.L1 = true;
        this.K1 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            this.I1[i14] = 0.0f;
        }
        while (i12 <= i11) {
            for (int i15 = 0; i15 < size; i15++) {
                float[] fArr = this.I1;
                fArr[i15] = fArr[i15] + ((lg.a) ((lg.e) this.h0).d.get(i15)).a[i12];
                this.K1 += ((lg.a) ((lg.e) this.h0).d.get(i15)).a[i12];
                if (this.L1 && ((p) arrayList.get(i15)).n && ((lg.a) ((lg.e) this.h0).d.get(i15)).a[i12] > 0) {
                    this.L1 = false;
                }
            }
            i12++;
        }
        if (z10) {
            while (i10 < size) {
                if (this.K1 == 0.0f) {
                    ((p) arrayList.get(i10)).r = 0.0f;
                } else {
                    ((p) arrayList.get(i10)).r = this.I1[i10] / this.K1;
                }
                i10++;
            }
            return;
        }
        while (i10 < size) {
            p pVar = (p) arrayList.get(i10);
            ValueAnimator valueAnimator = pVar.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = this.K1;
            ValueAnimator e = h.e(pVar.r, f12 == 0.0f ? 0.0f : this.I1[i10] / f12, new b0(7, this, pVar));
            pVar.s = e;
            e.start();
            i10++;
        }
    }

    @Override // kg.h, kg.j
    public final void a(float f7, float f10, boolean z10) {
        if (this.h0 == null) {
            return;
        }
        if (z10) {
            N(f7, f10, false);
        } else {
            H();
            invalidate();
        }
    }

    @Override // kg.h
    public final mg.e g() {
        mg.g gVar = new mg.g(getContext(), null);
        LinearLayout linearLayout = new LinearLayout(gVar.getContext());
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(gVar.getContext());
        gVar.M = textView;
        linearLayout.addView(textView);
        textView.getLayoutParams().width = AndroidUtilities.dp(96.0f);
        TextView textView2 = new TextView(gVar.getContext());
        gVar.N = textView2;
        linearLayout.addView(textView2);
        gVar.addView(linearLayout);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        gVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        gVar.f.setVisibility(8);
        gVar.F = false;
        this.S1 = gVar;
        return gVar;
    }

    @Override // kg.r, kg.h
    public final mg.f h(lg.a aVar) {
        return new p(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e0  */
    @Override // kg.r, kg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        int i10;
        u1.a aVar;
        float f7;
        float f10;
        RectF rectF;
        float f11;
        float f12;
        TextPaint textPaint;
        float f13;
        TextPaint textPaint2;
        float f14;
        int i11;
        float f15;
        int i12;
        int i13;
        float f16;
        TextPaint textPaint3 = this.O1;
        RectF rectF2 = this.N1;
        if (this.h0 == null) {
            return;
        }
        if (canvas != null) {
            canvas.save();
        }
        int i14 = 1;
        if (this.y0 == 1) {
            float f17 = this.z0.f;
            i10 = (int) (f17 * f17 * 255.0f);
        } else {
            i10 = 255;
        }
        float f18 = 0.0f;
        if (this.L1) {
            float f19 = this.T1;
            if (f19 != 0.0f) {
                float f20 = f19 - 0.12f;
                this.T1 = f20;
                if (f20 < 0.0f) {
                    this.T1 = 0.0f;
                }
                invalidate();
            }
        } else {
            float f21 = this.T1;
            if (f21 != 1.0f) {
                float f22 = f21 + 0.12f;
                this.T1 = f22;
                if (f22 > 1.0f) {
                    this.T1 = 1.0f;
                }
                invalidate();
            }
        }
        float f23 = this.T1;
        int i15 = (int) (i10 * f23);
        float f24 = (f23 * 0.6f) + 0.4f;
        RectF rectF3 = this.H0;
        if (canvas != null) {
            canvas.scale(f24, f24, rectF3.centerX(), rectF3.centerY());
        }
        float height = (int) ((rectF3.width() > rectF3.height() ? rectF3.height() : rectF3.width()) * 0.45f);
        rectF2.set(rectF3.centerX() - height, (rectF3.centerY() + AndroidUtilities.dp(16.0f)) - height, rectF3.centerX() + height, rectF3.centerY() + AndroidUtilities.dp(16.0f) + height);
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        float f25 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            f25 = (((p) arrayList.get(i16)).r * ((p) arrayList.get(i16)).o) + f25;
        }
        if (f25 == 0.0f) {
            if (canvas != null) {
                canvas.restore();
                return;
            }
            return;
        }
        float f26 = -90.0f;
        int i17 = 0;
        while (true) {
            aVar = h.C1;
            f7 = 2.0f;
            f10 = f18;
            if (i17 >= size) {
                break;
            }
            if (((p) arrayList.get(i17)).o > f10 || ((p) arrayList.get(i17)).n) {
                ((p) arrayList.get(i17)).c.setAlpha(i15);
                float f27 = (((p) arrayList.get(i17)).r / f25) * ((p) arrayList.get(i17)).o;
                this.J1[i17] = f27;
                if (f27 != f10) {
                    if (canvas != null) {
                        canvas.save();
                    }
                    i11 = i15;
                    double c10 = a1.g.c(f27, 2.0f, 360.0f, f26);
                    if (((p) arrayList.get(i17)).q > f10) {
                        float interpolation = aVar.getInterpolation(((p) arrayList.get(i17)).q);
                        if (canvas != null) {
                            i12 = i14;
                            double d = interpolation;
                            f15 = f26;
                            canvas.translate((float) (Math.cos(Math.toRadians(c10)) * AndroidUtilities.dp(8.0f) * d), (float) (Math.sin(Math.toRadians(c10)) * AndroidUtilities.dp(8.0f) * d));
                            ((p) arrayList.get(i17)).c.setStyle(Paint.Style.FILL_AND_STROKE);
                            ((p) arrayList.get(i17)).c.setStrokeWidth(1.0f);
                            ((p) arrayList.get(i17)).c.setAntiAlias(!h.A1);
                            if (canvas == null) {
                                i14 = i12;
                                if (this.y0 != i14) {
                                    Paint paint = ((p) arrayList.get(i17)).c;
                                    i13 = i17;
                                    f16 = f15;
                                    canvas.drawArc(rectF2, f16, f27 * 360.0f, true, paint);
                                    ((p) arrayList.get(i13)).c.setStyle(Paint.Style.STROKE);
                                    canvas.restore();
                                } else {
                                    i13 = i17;
                                    f16 = f15;
                                }
                            } else {
                                i13 = i17;
                                f16 = f15;
                                i14 = i12;
                            }
                            ((p) arrayList.get(i13)).c.setAlpha(255);
                            f26 = (f27 * 360.0f) + f16;
                            i17 = i13 + 1;
                            i15 = i11;
                            f18 = f10;
                        }
                    }
                    f15 = f26;
                    i12 = i14;
                    ((p) arrayList.get(i17)).c.setStyle(Paint.Style.FILL_AND_STROKE);
                    ((p) arrayList.get(i17)).c.setStrokeWidth(1.0f);
                    ((p) arrayList.get(i17)).c.setAntiAlias(!h.A1);
                    if (canvas == null) {
                    }
                    ((p) arrayList.get(i13)).c.setAlpha(255);
                    f26 = (f27 * 360.0f) + f16;
                    i17 = i13 + 1;
                    i15 = i11;
                    f18 = f10;
                }
            }
            i13 = i17;
            i11 = i15;
            i17 = i13 + 1;
            i15 = i11;
            f18 = f10;
        }
        float f28 = 360.0f;
        int i18 = i15;
        if (canvas != null) {
            float f29 = -90.0f;
            int i19 = 0;
            while (i19 < size) {
                if (((p) arrayList.get(i19)).o > f10 || ((p) arrayList.get(i19)).n) {
                    float f30 = (((p) arrayList.get(i19)).r * ((p) arrayList.get(i19)).o) / f25;
                    canvas.save();
                    double c11 = a1.g.c(f30, f7, f28, f29);
                    if (((p) arrayList.get(i19)).q > f10) {
                        f12 = f7;
                        textPaint = textPaint3;
                        double interpolation2 = aVar.getInterpolation(((p) arrayList.get(i19)).q);
                        rectF = rectF2;
                        f11 = f29;
                        canvas.translate((float) (Math.cos(Math.toRadians(c11)) * AndroidUtilities.dp(8.0f) * interpolation2), (float) (Math.sin(Math.toRadians(c11)) * AndroidUtilities.dp(8.0f) * interpolation2));
                    } else {
                        rectF = rectF2;
                        f11 = f29;
                        f12 = f7;
                        textPaint = textPaint3;
                    }
                    int i20 = (int) (100.0f * f30);
                    if (f30 < 0.02f || i20 <= 0 || i20 > 100) {
                        f13 = f30;
                        textPaint2 = textPaint;
                    } else {
                        float sqrt = (float) (Math.sqrt(1.0f - f30) * rectF.width() * 0.42f);
                        textPaint2 = textPaint;
                        textPaint2.setTextSize((this.Q1 * f30) + this.P1);
                        textPaint2.setAlpha((int) (i18 * ((p) arrayList.get(i19)).o));
                        f13 = f30;
                        double d10 = sqrt;
                        canvas.drawText(this.R1[i20], (float) ((Math.cos(Math.toRadians(c11)) * d10) + rectF.centerX()), ((float) ((Math.sin(Math.toRadians(c11)) * d10) + rectF.centerY())) - ((textPaint2.ascent() + textPaint2.descent()) / f12), textPaint2);
                    }
                    canvas.restore();
                    ((p) arrayList.get(i19)).c.setAlpha(255);
                    f28 = 360.0f;
                    f14 = (f13 * 360.0f) + f11;
                } else {
                    rectF = rectF2;
                    f14 = f29;
                    f12 = f7;
                    textPaint2 = textPaint3;
                }
                i19++;
                f29 = f14;
                textPaint3 = textPaint2;
                f7 = f12;
                rectF2 = rectF;
            }
            canvas.restore();
        }
    }

    @Override // kg.r, kg.h
    public final void n(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int i10;
        o oVar = this;
        lg.b bVar = oVar.h0;
        if (bVar != null) {
            int length = ((lg.e) bVar).b.length;
            ArrayList arrayList = oVar.d;
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((mg.f) arrayList.get(i12)).j = 0;
            }
            float length2 = (1.0f / ((lg.e) oVar.h0).b.length) * oVar.C0;
            int i13 = 0;
            while (i13 < length) {
                float z10 = h0.z(oVar.C0, length2, ((lg.e) oVar.h0).b[i13], length2 / 2.0f);
                int i14 = 1;
                int i15 = i11;
                int i16 = i15;
                boolean z11 = true;
                float f12 = 0.0f;
                while (i15 < size) {
                    mg.f fVar = (mg.f) arrayList.get(i15);
                    boolean z12 = fVar.n;
                    if (z12 || fVar.o != 0.0f) {
                        i10 = i13;
                        float f13 = fVar.a.a[i10] * fVar.o;
                        f12 += f13;
                        if (f13 > 0.0f) {
                            i16++;
                            if (z12) {
                                z11 = false;
                            }
                        }
                    } else {
                        i10 = i13;
                    }
                    i15++;
                    i13 = i10;
                }
                int i17 = i13;
                float f14 = 0.0f;
                int i18 = 0;
                while (i18 < size) {
                    mg.f fVar2 = (mg.f) arrayList.get(i18);
                    if (fVar2.n || fVar2.o != 0.0f) {
                        long[] jArr = fVar2.a.a;
                        if (i16 == i14) {
                            if (jArr[i17] != 0) {
                                f11 = fVar2.o;
                                int i19 = oVar.B0;
                                float f15 = f11 * i19;
                                float[] fArr = fVar2.k;
                                int i20 = fVar2.j;
                                int i21 = i20 + 1;
                                fVar2.j = i21;
                                fArr[i20] = z10;
                                int i22 = i20 + 2;
                                fVar2.j = i22;
                                fArr[i21] = (i19 - f15) - f14;
                                int i23 = i20 + 3;
                                fVar2.j = i23;
                                fArr[i22] = z10;
                                fVar2.j = i20 + 4;
                                fArr[i23] = i19 - f14;
                                f14 += f15;
                            }
                            f11 = 0.0f;
                            int i192 = oVar.B0;
                            float f152 = f11 * i192;
                            float[] fArr2 = fVar2.k;
                            int i202 = fVar2.j;
                            int i212 = i202 + 1;
                            fVar2.j = i212;
                            fArr2[i202] = z10;
                            int i222 = i202 + 2;
                            fVar2.j = i222;
                            fArr2[i212] = (i192 - f152) - f14;
                            int i232 = i202 + 3;
                            fVar2.j = i232;
                            fArr2[i222] = z10;
                            fVar2.j = i202 + 4;
                            fArr2[i232] = i192 - f14;
                            f14 += f152;
                        } else {
                            if (f12 != 0.0f) {
                                if (z11) {
                                    f10 = fVar2.o;
                                    f7 = (jArr[i17] / f12) * f10;
                                } else {
                                    f7 = jArr[i17] / f12;
                                    f10 = fVar2.o;
                                }
                                f11 = f7 * f10;
                                int i1922 = oVar.B0;
                                float f1522 = f11 * i1922;
                                float[] fArr22 = fVar2.k;
                                int i2022 = fVar2.j;
                                int i2122 = i2022 + 1;
                                fVar2.j = i2122;
                                fArr22[i2022] = z10;
                                int i2222 = i2022 + 2;
                                fVar2.j = i2222;
                                fArr22[i2122] = (i1922 - f1522) - f14;
                                int i2322 = i2022 + 3;
                                fVar2.j = i2322;
                                fArr22[i2222] = z10;
                                fVar2.j = i2022 + 4;
                                fArr22[i2322] = i1922 - f14;
                                f14 += f1522;
                            }
                            f11 = 0.0f;
                            int i19222 = oVar.B0;
                            float f15222 = f11 * i19222;
                            float[] fArr222 = fVar2.k;
                            int i20222 = fVar2.j;
                            int i21222 = i20222 + 1;
                            fVar2.j = i21222;
                            fArr222[i20222] = z10;
                            int i22222 = i20222 + 2;
                            fVar2.j = i22222;
                            fArr222[i21222] = (i19222 - f15222) - f14;
                            int i23222 = i20222 + 3;
                            fVar2.j = i23222;
                            fArr222[i22222] = z10;
                            fVar2.j = i20222 + 4;
                            fArr222[i23222] = i19222 - f14;
                            f14 += f15222;
                        }
                    }
                    i18++;
                    i14 = 1;
                    oVar = this;
                }
                i13 = i17 + 1;
                oVar = this;
                i11 = 0;
            }
            for (int i24 = 0; i24 < size; i24++) {
                mg.f fVar3 = (mg.f) arrayList.get(i24);
                Paint paint = fVar3.c;
                Paint paint2 = fVar3.c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(255);
                paint2.setAntiAlias(false);
                canvas.drawLines(fVar3.k, 0, fVar3.j, paint2);
            }
        }
    }

    @Override // kg.r, kg.h, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h0 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (i10 == this.M1) {
                    if (((p) arrayList.get(i10)).q < 1.0f) {
                        ((p) arrayList.get(i10)).q += 0.1f;
                        if (((p) arrayList.get(i10)).q > 1.0f) {
                            ((p) arrayList.get(i10)).q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((p) arrayList.get(i10)).q > 0.0f) {
                    ((p) arrayList.get(i10)).q -= 0.1f;
                    if (((p) arrayList.get(i10)).q < 0.0f) {
                        ((p) arrayList.get(i10)).q = 0.0f;
                    }
                    invalidate();
                }
                i10++;
            }
        }
        super.onDraw(canvas);
    }

    @Override // kg.h, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() != this.U1) {
            this.U1 = getMeasuredWidth();
            RectF rectF = this.H0;
            int height = (int) ((rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f);
            this.P1 = height / 13;
            this.Q1 = height / 7;
        }
    }

    @Override // kg.r, kg.h
    public final void q(mg.j jVar) {
        k(null);
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            float[] fArr = this.J1;
            if (i10 >= fArr.length) {
                return;
            }
            f7 += fArr[i10];
            jVar.k[i10] = (360.0f * f7) - 180.0f;
            i10++;
        }
    }

    @Override // kg.h
    public final void y() {
        this.M1 = -1;
        this.S1.setVisibility(8);
        invalidate();
    }

    @Override // kg.h
    public final void i(Canvas canvas) {
    }

    @Override // kg.h
    public final void j(Canvas canvas) {
    }

    @Override // kg.h
    public final void o(Canvas canvas) {
    }

    @Override // kg.h
    public final void l(Canvas canvas, mg.d dVar) {
    }

    @Override // kg.h
    public final void p(Canvas canvas, mg.d dVar) {
    }
}
