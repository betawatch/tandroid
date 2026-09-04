package jg;

import ah.m0;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class n extends q {
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
    public lg.g S1;
    public float T1;
    public int U1;
    public int V1;
    public int W1;

    @Override // jg.g
    public final void A(boolean z10, boolean z11, boolean z12) {
        super.A(z10, z11, z12);
        kg.b bVar = this.h0;
        if (bVar == null || ((kg.e) bVar).b == null) {
            return;
        }
        j jVar = this.g0;
        N(jVar.k, jVar.l, z11);
    }

    @Override // jg.g
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
        int i12 = 0;
        float f11 = 0.0f;
        while (true) {
            arrayList = this.d;
            if (i12 >= arrayList.size()) {
                i12 = -1;
                f11 = 0.0f;
                break;
            }
            if (((o) arrayList.get(i12)).n || ((o) arrayList.get(i12)).o != 0.0f) {
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
            lg.f fVar = (lg.f) arrayList.get(i12);
            lg.g gVar = this.S1;
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
        x((this.G0 * this.g0.k) - g.k1);
    }

    @Override // jg.g
    public final boolean D(kg.b bVar) {
        kg.e eVar = (kg.e) bVar;
        boolean D = super.D(eVar);
        if (eVar != null) {
            this.I1 = new float[eVar.d.size()];
            this.J1 = new float[eVar.d.size()];
            A(false, true, false);
        }
        return D;
    }

    @Override // jg.g
    public final void J(kg.b bVar, long j3) {
        int length = bVar.a.length;
        long j10 = j3 - (j3 % 86400000);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (j10 >= bVar.a[i11]) {
                i10 = i11;
            }
        }
        float length2 = bVar.b.length < 2 ? 0.5f : 1.0f / bVar.a.length;
        j jVar = this.g0;
        if (i10 == 0) {
            jVar.k = 0.0f;
            jVar.l = length2;
            return;
        }
        if (i10 >= bVar.a.length - 1) {
            jVar.k = 1.0f - length2;
            jVar.l = 1.0f;
            return;
        }
        float f7 = i10 * length2;
        jVar.k = f7;
        float f10 = f7 + length2;
        jVar.l = f10;
        if (f10 > 1.0f) {
            jVar.l = 1.0f;
        }
        A(true, true, false);
    }

    @Override // jg.q
    /* renamed from: L */
    public final lg.i h(kg.a aVar) {
        return new o(aVar);
    }

    public final void N(float f7, float f10, boolean z10) {
        if (this.I1 == null) {
            return;
        }
        int length = ((kg.e) this.h0).b.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < length; i13++) {
            float f11 = ((kg.e) this.h0).b[i13];
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
                fArr[i15] = fArr[i15] + ((kg.a) ((kg.e) this.h0).d.get(i15)).a[i12];
                this.K1 += ((kg.a) ((kg.e) this.h0).d.get(i15)).a[i12];
                if (this.L1 && ((o) arrayList.get(i15)).n && ((kg.a) ((kg.e) this.h0).d.get(i15)).a[i12] > 0) {
                    this.L1 = false;
                }
            }
            i12++;
        }
        if (z10) {
            while (i10 < size) {
                if (this.K1 == 0.0f) {
                    ((o) arrayList.get(i10)).r = 0.0f;
                } else {
                    ((o) arrayList.get(i10)).r = this.I1[i10] / this.K1;
                }
                i10++;
            }
            return;
        }
        while (i10 < size) {
            o oVar = (o) arrayList.get(i10);
            ValueAnimator valueAnimator = oVar.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = this.K1;
            ValueAnimator e7 = g.e(oVar.r, f12 == 0.0f ? 0.0f : this.I1[i10] / f12, new m0(6, this, oVar));
            oVar.s = e7;
            e7.start();
            i10++;
        }
    }

    @Override // jg.g, jg.i
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

    @Override // jg.g
    public final lg.e g() {
        lg.g gVar = new lg.g(getContext(), null);
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

    @Override // jg.q, jg.g
    public final lg.f h(kg.a aVar) {
        return new o(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e7  */
    @Override // jg.q, jg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        int i10;
        u1.a aVar;
        float f7;
        RectF rectF;
        float f10;
        TextPaint textPaint;
        float f11;
        float f12;
        TextPaint textPaint2;
        float f13;
        int i11;
        float f14;
        int i12;
        float f15;
        TextPaint textPaint3 = this.O1;
        RectF rectF2 = this.N1;
        if (this.h0 == null) {
            return;
        }
        if (canvas != null) {
            canvas.save();
        }
        if (this.y0 == 1) {
            float f16 = this.z0.f;
            i10 = (int) (f16 * f16 * 255.0f);
        } else {
            i10 = 255;
        }
        if (this.L1) {
            float f17 = this.T1;
            if (f17 != 0.0f) {
                float f18 = f17 - 0.12f;
                this.T1 = f18;
                if (f18 < 0.0f) {
                    this.T1 = 0.0f;
                }
                invalidate();
            }
        } else {
            float f19 = this.T1;
            if (f19 != 1.0f) {
                float f20 = f19 + 0.12f;
                this.T1 = f20;
                if (f20 > 1.0f) {
                    this.T1 = 1.0f;
                }
                invalidate();
            }
        }
        float f21 = this.T1;
        int i13 = (int) (i10 * f21);
        float f22 = (f21 * 0.6f) + 0.4f;
        RectF rectF3 = this.H0;
        if (canvas != null) {
            canvas.scale(f22, f22, rectF3.centerX(), rectF3.centerY());
        }
        float height = (int) ((rectF3.width() > rectF3.height() ? rectF3.height() : rectF3.width()) * 0.45f);
        rectF2.set(rectF3.centerX() - height, (rectF3.centerY() + AndroidUtilities.dp(16.0f)) - height, rectF3.centerX() + height, rectF3.centerY() + AndroidUtilities.dp(16.0f) + height);
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        float f23 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            f23 = (((o) arrayList.get(i14)).r * ((o) arrayList.get(i14)).o) + f23;
        }
        if (f23 == 0.0f) {
            if (canvas != null) {
                canvas.restore();
                return;
            }
            return;
        }
        int i15 = 0;
        float f24 = -90.0f;
        while (true) {
            aVar = g.C1;
            f7 = 2.0f;
            if (i15 >= size) {
                break;
            }
            if (((o) arrayList.get(i15)).o > 0.0f || ((o) arrayList.get(i15)).n) {
                ((o) arrayList.get(i15)).c.setAlpha(i13);
                float f25 = (((o) arrayList.get(i15)).r / f23) * ((o) arrayList.get(i15)).o;
                this.J1[i15] = f25;
                if (f25 != 0.0f) {
                    if (canvas != null) {
                        canvas.save();
                    }
                    i11 = i13;
                    double e7 = a4.a.e(f25, 2.0f, 360.0f, f24);
                    if (((o) arrayList.get(i15)).q > 0.0f) {
                        float interpolation = aVar.getInterpolation(((o) arrayList.get(i15)).q);
                        if (canvas != null) {
                            double d = interpolation;
                            f14 = f24;
                            canvas.translate((float) (Math.cos(Math.toRadians(e7)) * AndroidUtilities.dp(8.0f) * d), (float) (Math.sin(Math.toRadians(e7)) * AndroidUtilities.dp(8.0f) * d));
                            ((o) arrayList.get(i15)).c.setStyle(Paint.Style.FILL_AND_STROKE);
                            ((o) arrayList.get(i15)).c.setStrokeWidth(1.0f);
                            ((o) arrayList.get(i15)).c.setAntiAlias(!g.A1);
                            if (canvas != null) {
                                i12 = i15;
                                f15 = f14;
                            } else if (this.y0 != 1) {
                                Paint paint = ((o) arrayList.get(i15)).c;
                                i12 = i15;
                                f15 = f14;
                                canvas.drawArc(rectF2, f15, f25 * 360.0f, true, paint);
                                ((o) arrayList.get(i12)).c.setStyle(Paint.Style.STROKE);
                                canvas.restore();
                            } else {
                                i12 = i15;
                                f15 = f14;
                            }
                            ((o) arrayList.get(i12)).c.setAlpha(255);
                            f24 = (f25 * 360.0f) + f15;
                            i15 = i12 + 1;
                            i13 = i11;
                        }
                    }
                    f14 = f24;
                    ((o) arrayList.get(i15)).c.setStyle(Paint.Style.FILL_AND_STROKE);
                    ((o) arrayList.get(i15)).c.setStrokeWidth(1.0f);
                    ((o) arrayList.get(i15)).c.setAntiAlias(!g.A1);
                    if (canvas != null) {
                    }
                    ((o) arrayList.get(i12)).c.setAlpha(255);
                    f24 = (f25 * 360.0f) + f15;
                    i15 = i12 + 1;
                    i13 = i11;
                }
            }
            i12 = i15;
            i11 = i13;
            i15 = i12 + 1;
            i13 = i11;
        }
        int i16 = i13;
        if (canvas != null) {
            float f26 = -90.0f;
            int i17 = 0;
            while (i17 < size) {
                if (((o) arrayList.get(i17)).o > 0.0f || ((o) arrayList.get(i17)).n) {
                    float f27 = (((o) arrayList.get(i17)).r * ((o) arrayList.get(i17)).o) / f23;
                    canvas.save();
                    double e10 = a4.a.e(f27, f7, 360.0f, f26);
                    if (((o) arrayList.get(i17)).q > 0.0f) {
                        textPaint = textPaint3;
                        f11 = 2.0f;
                        double interpolation2 = aVar.getInterpolation(((o) arrayList.get(i17)).q);
                        rectF = rectF2;
                        f10 = f26;
                        canvas.translate((float) (Math.cos(Math.toRadians(e10)) * AndroidUtilities.dp(8.0f) * interpolation2), (float) (Math.sin(Math.toRadians(e10)) * AndroidUtilities.dp(8.0f) * interpolation2));
                    } else {
                        rectF = rectF2;
                        f10 = f26;
                        textPaint = textPaint3;
                        f11 = 2.0f;
                    }
                    int i18 = (int) (100.0f * f27);
                    if (f27 < 0.02f || i18 <= 0 || i18 > 100) {
                        f12 = f27;
                        textPaint2 = textPaint;
                    } else {
                        float sqrt = (float) (Math.sqrt(1.0f - f27) * rectF.width() * 0.42f);
                        textPaint2 = textPaint;
                        textPaint2.setTextSize((this.Q1 * f27) + this.P1);
                        textPaint2.setAlpha((int) (i16 * ((o) arrayList.get(i17)).o));
                        f12 = f27;
                        double d10 = sqrt;
                        canvas.drawText(this.R1[i18], (float) ((Math.cos(Math.toRadians(e10)) * d10) + rectF.centerX()), ((float) ((Math.sin(Math.toRadians(e10)) * d10) + rectF.centerY())) - ((textPaint2.ascent() + textPaint2.descent()) / f11), textPaint2);
                    }
                    canvas.restore();
                    ((o) arrayList.get(i17)).c.setAlpha(255);
                    f13 = (f12 * 360.0f) + f10;
                } else {
                    rectF = rectF2;
                    f13 = f26;
                    textPaint2 = textPaint3;
                }
                i17++;
                f26 = f13;
                textPaint3 = textPaint2;
                rectF2 = rectF;
                f7 = 2.0f;
            }
            canvas.restore();
        }
    }

    @Override // jg.q, jg.g
    public final void n(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int i10;
        n nVar = this;
        kg.b bVar = nVar.h0;
        if (bVar != null) {
            int length = ((kg.e) bVar).b.length;
            ArrayList arrayList = nVar.d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((lg.f) arrayList.get(i11)).j = 0;
            }
            float length2 = (1.0f / ((kg.e) nVar.h0).b.length) * nVar.C0;
            int i12 = 0;
            while (i12 < length) {
                float z10 = e2.z(nVar.C0, length2, ((kg.e) nVar.h0).b[i12], length2 / 2.0f);
                int i13 = 1;
                int i14 = 0;
                float f12 = 0.0f;
                int i15 = 0;
                boolean z11 = true;
                while (i14 < size) {
                    lg.f fVar = (lg.f) arrayList.get(i14);
                    boolean z12 = fVar.n;
                    if (z12 || fVar.o != 0.0f) {
                        i10 = i12;
                        float f13 = fVar.a.a[i10] * fVar.o;
                        f12 += f13;
                        if (f13 > 0.0f) {
                            i15++;
                            if (z12) {
                                z11 = false;
                            }
                        }
                    } else {
                        i10 = i12;
                    }
                    i14++;
                    i12 = i10;
                }
                int i16 = i12;
                int i17 = 0;
                float f14 = 0.0f;
                while (i17 < size) {
                    lg.f fVar2 = (lg.f) arrayList.get(i17);
                    if (fVar2.n || fVar2.o != 0.0f) {
                        long[] jArr = fVar2.a.a;
                        if (i15 == i13) {
                            if (jArr[i16] != 0) {
                                f11 = fVar2.o;
                                int i18 = nVar.B0;
                                float f15 = f11 * i18;
                                float[] fArr = fVar2.k;
                                int i19 = fVar2.j;
                                int i20 = i19 + 1;
                                fVar2.j = i20;
                                fArr[i19] = z10;
                                int i21 = i19 + 2;
                                fVar2.j = i21;
                                fArr[i20] = (i18 - f15) - f14;
                                int i22 = i19 + 3;
                                fVar2.j = i22;
                                fArr[i21] = z10;
                                fVar2.j = i19 + 4;
                                fArr[i22] = i18 - f14;
                                f14 += f15;
                            }
                            f11 = 0.0f;
                            int i182 = nVar.B0;
                            float f152 = f11 * i182;
                            float[] fArr2 = fVar2.k;
                            int i192 = fVar2.j;
                            int i202 = i192 + 1;
                            fVar2.j = i202;
                            fArr2[i192] = z10;
                            int i212 = i192 + 2;
                            fVar2.j = i212;
                            fArr2[i202] = (i182 - f152) - f14;
                            int i222 = i192 + 3;
                            fVar2.j = i222;
                            fArr2[i212] = z10;
                            fVar2.j = i192 + 4;
                            fArr2[i222] = i182 - f14;
                            f14 += f152;
                        } else {
                            if (f12 != 0.0f) {
                                if (z11) {
                                    f10 = fVar2.o;
                                    f7 = (jArr[i16] / f12) * f10;
                                } else {
                                    f7 = jArr[i16] / f12;
                                    f10 = fVar2.o;
                                }
                                f11 = f7 * f10;
                                int i1822 = nVar.B0;
                                float f1522 = f11 * i1822;
                                float[] fArr22 = fVar2.k;
                                int i1922 = fVar2.j;
                                int i2022 = i1922 + 1;
                                fVar2.j = i2022;
                                fArr22[i1922] = z10;
                                int i2122 = i1922 + 2;
                                fVar2.j = i2122;
                                fArr22[i2022] = (i1822 - f1522) - f14;
                                int i2222 = i1922 + 3;
                                fVar2.j = i2222;
                                fArr22[i2122] = z10;
                                fVar2.j = i1922 + 4;
                                fArr22[i2222] = i1822 - f14;
                                f14 += f1522;
                            }
                            f11 = 0.0f;
                            int i18222 = nVar.B0;
                            float f15222 = f11 * i18222;
                            float[] fArr222 = fVar2.k;
                            int i19222 = fVar2.j;
                            int i20222 = i19222 + 1;
                            fVar2.j = i20222;
                            fArr222[i19222] = z10;
                            int i21222 = i19222 + 2;
                            fVar2.j = i21222;
                            fArr222[i20222] = (i18222 - f15222) - f14;
                            int i22222 = i19222 + 3;
                            fVar2.j = i22222;
                            fArr222[i21222] = z10;
                            fVar2.j = i19222 + 4;
                            fArr222[i22222] = i18222 - f14;
                            f14 += f15222;
                        }
                    }
                    i17++;
                    i13 = 1;
                    nVar = this;
                }
                i12 = i16 + 1;
                nVar = this;
            }
            for (int i23 = 0; i23 < size; i23++) {
                lg.f fVar3 = (lg.f) arrayList.get(i23);
                Paint paint = fVar3.c;
                Paint paint2 = fVar3.c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(255);
                paint2.setAntiAlias(false);
                canvas.drawLines(fVar3.k, 0, fVar3.j, paint2);
            }
        }
    }

    @Override // jg.q, jg.g, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h0 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (i10 == this.M1) {
                    if (((o) arrayList.get(i10)).q < 1.0f) {
                        ((o) arrayList.get(i10)).q += 0.1f;
                        if (((o) arrayList.get(i10)).q > 1.0f) {
                            ((o) arrayList.get(i10)).q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((o) arrayList.get(i10)).q > 0.0f) {
                    ((o) arrayList.get(i10)).q -= 0.1f;
                    if (((o) arrayList.get(i10)).q < 0.0f) {
                        ((o) arrayList.get(i10)).q = 0.0f;
                    }
                    invalidate();
                }
                i10++;
            }
        }
        super.onDraw(canvas);
    }

    @Override // jg.g, android.view.View
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

    @Override // jg.q, jg.g
    public final void q(lg.j jVar) {
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

    @Override // jg.g
    public final void y() {
        this.M1 = -1;
        this.S1.setVisibility(8);
        invalidate();
    }

    @Override // jg.g
    public final void i(Canvas canvas) {
    }

    @Override // jg.g
    public final void j(Canvas canvas) {
    }

    @Override // jg.g
    public final void o(Canvas canvas) {
    }

    @Override // jg.g
    public final void l(Canvas canvas, lg.d dVar) {
    }

    @Override // jg.g
    public final void p(Canvas canvas, lg.d dVar) {
    }
}
