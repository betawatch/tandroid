package ig;

import ai.x;
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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    public kg.g S1;
    public float T1;
    public int U1;
    public int V1;
    public int W1;

    @Override // ig.g
    public final void A(boolean z10, boolean z11, boolean z12) {
        super.A(z10, z11, z12);
        jg.b bVar = this.h0;
        if (bVar == null || ((jg.e) bVar).b == null) {
            return;
        }
        j jVar = this.g0;
        N(jVar.k, jVar.l, z11);
    }

    @Override // ig.g
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
            kg.f fVar = (kg.f) arrayList.get(i12);
            kg.g gVar = this.S1;
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

    @Override // ig.g
    public final boolean D(jg.b bVar) {
        jg.e eVar = (jg.e) bVar;
        boolean D = super.D(eVar);
        if (eVar != null) {
            this.I1 = new float[eVar.d.size()];
            this.J1 = new float[eVar.d.size()];
            A(false, true, false);
        }
        return D;
    }

    @Override // ig.g
    public final void J(jg.b bVar, long j3) {
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

    @Override // ig.q
    /* renamed from: L */
    public final kg.i h(jg.a aVar) {
        return new o(aVar);
    }

    public final void N(float f7, float f10, boolean z10) {
        if (this.I1 == null) {
            return;
        }
        int length = ((jg.e) this.h0).b.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < length; i13++) {
            float f11 = ((jg.e) this.h0).b[i13];
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
                fArr[i15] = fArr[i15] + ((jg.a) ((jg.e) this.h0).d.get(i15)).a[i12];
                this.K1 += ((jg.a) ((jg.e) this.h0).d.get(i15)).a[i12];
                if (this.L1 && ((o) arrayList.get(i15)).n && ((jg.a) ((jg.e) this.h0).d.get(i15)).a[i12] > 0) {
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
            ValueAnimator e7 = g.e(oVar.r, f12 == 0.0f ? 0.0f : this.I1[i10] / f12, new x(5, this, oVar));
            oVar.s = e7;
            e7.start();
            i10++;
        }
    }

    @Override // ig.g, ig.i
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

    @Override // ig.g
    public final kg.e g() {
        kg.g gVar = new kg.g(getContext(), null);
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

    @Override // ig.q, ig.g
    public final kg.f h(jg.a aVar) {
        return new o(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e0  */
    @Override // ig.q, ig.g
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
            f25 = (((o) arrayList.get(i16)).r * ((o) arrayList.get(i16)).o) + f25;
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
            aVar = g.C1;
            f7 = 2.0f;
            f10 = f18;
            if (i17 >= size) {
                break;
            }
            if (((o) arrayList.get(i17)).o > f10 || ((o) arrayList.get(i17)).n) {
                ((o) arrayList.get(i17)).c.setAlpha(i15);
                float f27 = (((o) arrayList.get(i17)).r / f25) * ((o) arrayList.get(i17)).o;
                this.J1[i17] = f27;
                if (f27 != f10) {
                    if (canvas != null) {
                        canvas.save();
                    }
                    i11 = i15;
                    double e7 = a1.g.e(f27, 2.0f, 360.0f, f26);
                    if (((o) arrayList.get(i17)).q > f10) {
                        float interpolation = aVar.getInterpolation(((o) arrayList.get(i17)).q);
                        if (canvas != null) {
                            i12 = i14;
                            double d = interpolation;
                            f15 = f26;
                            canvas.translate((float) (Math.cos(Math.toRadians(e7)) * AndroidUtilities.dp(8.0f) * d), (float) (Math.sin(Math.toRadians(e7)) * AndroidUtilities.dp(8.0f) * d));
                            ((o) arrayList.get(i17)).c.setStyle(Paint.Style.FILL_AND_STROKE);
                            ((o) arrayList.get(i17)).c.setStrokeWidth(1.0f);
                            ((o) arrayList.get(i17)).c.setAntiAlias(!g.A1);
                            if (canvas == null) {
                                i14 = i12;
                                if (this.y0 != i14) {
                                    Paint paint = ((o) arrayList.get(i17)).c;
                                    i13 = i17;
                                    f16 = f15;
                                    canvas.drawArc(rectF2, f16, f27 * 360.0f, true, paint);
                                    ((o) arrayList.get(i13)).c.setStyle(Paint.Style.STROKE);
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
                            ((o) arrayList.get(i13)).c.setAlpha(255);
                            f26 = (f27 * 360.0f) + f16;
                            i17 = i13 + 1;
                            i15 = i11;
                            f18 = f10;
                        }
                    }
                    f15 = f26;
                    i12 = i14;
                    ((o) arrayList.get(i17)).c.setStyle(Paint.Style.FILL_AND_STROKE);
                    ((o) arrayList.get(i17)).c.setStrokeWidth(1.0f);
                    ((o) arrayList.get(i17)).c.setAntiAlias(!g.A1);
                    if (canvas == null) {
                    }
                    ((o) arrayList.get(i13)).c.setAlpha(255);
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
                if (((o) arrayList.get(i19)).o > f10 || ((o) arrayList.get(i19)).n) {
                    float f30 = (((o) arrayList.get(i19)).r * ((o) arrayList.get(i19)).o) / f25;
                    canvas.save();
                    double e10 = a1.g.e(f30, f7, f28, f29);
                    if (((o) arrayList.get(i19)).q > f10) {
                        f12 = f7;
                        textPaint = textPaint3;
                        double interpolation2 = aVar.getInterpolation(((o) arrayList.get(i19)).q);
                        rectF = rectF2;
                        f11 = f29;
                        canvas.translate((float) (Math.cos(Math.toRadians(e10)) * AndroidUtilities.dp(8.0f) * interpolation2), (float) (Math.sin(Math.toRadians(e10)) * AndroidUtilities.dp(8.0f) * interpolation2));
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
                        textPaint2.setAlpha((int) (i18 * ((o) arrayList.get(i19)).o));
                        f13 = f30;
                        double d10 = sqrt;
                        canvas.drawText(this.R1[i20], (float) ((Math.cos(Math.toRadians(e10)) * d10) + rectF.centerX()), ((float) ((Math.sin(Math.toRadians(e10)) * d10) + rectF.centerY())) - ((textPaint2.ascent() + textPaint2.descent()) / f12), textPaint2);
                    }
                    canvas.restore();
                    ((o) arrayList.get(i19)).c.setAlpha(255);
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

    @Override // ig.q, ig.g
    public final void n(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int i10;
        n nVar = this;
        jg.b bVar = nVar.h0;
        if (bVar != null) {
            int length = ((jg.e) bVar).b.length;
            ArrayList arrayList = nVar.d;
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((kg.f) arrayList.get(i12)).j = 0;
            }
            float length2 = (1.0f / ((jg.e) nVar.h0).b.length) * nVar.C0;
            int i13 = 0;
            while (i13 < length) {
                float y3 = e2.y(nVar.C0, length2, ((jg.e) nVar.h0).b[i13], length2 / 2.0f);
                int i14 = 1;
                int i15 = i11;
                int i16 = i15;
                boolean z10 = true;
                float f12 = 0.0f;
                while (i15 < size) {
                    kg.f fVar = (kg.f) arrayList.get(i15);
                    boolean z11 = fVar.n;
                    if (z11 || fVar.o != 0.0f) {
                        i10 = i13;
                        float f13 = fVar.a.a[i10] * fVar.o;
                        f12 += f13;
                        if (f13 > 0.0f) {
                            i16++;
                            if (z11) {
                                z10 = false;
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
                    kg.f fVar2 = (kg.f) arrayList.get(i18);
                    if (fVar2.n || fVar2.o != 0.0f) {
                        long[] jArr = fVar2.a.a;
                        if (i16 == i14) {
                            if (jArr[i17] != 0) {
                                f11 = fVar2.o;
                                int i19 = nVar.B0;
                                float f15 = f11 * i19;
                                float[] fArr = fVar2.k;
                                int i20 = fVar2.j;
                                int i21 = i20 + 1;
                                fVar2.j = i21;
                                fArr[i20] = y3;
                                int i22 = i20 + 2;
                                fVar2.j = i22;
                                fArr[i21] = (i19 - f15) - f14;
                                int i23 = i20 + 3;
                                fVar2.j = i23;
                                fArr[i22] = y3;
                                fVar2.j = i20 + 4;
                                fArr[i23] = i19 - f14;
                                f14 += f15;
                            }
                            f11 = 0.0f;
                            int i192 = nVar.B0;
                            float f152 = f11 * i192;
                            float[] fArr2 = fVar2.k;
                            int i202 = fVar2.j;
                            int i212 = i202 + 1;
                            fVar2.j = i212;
                            fArr2[i202] = y3;
                            int i222 = i202 + 2;
                            fVar2.j = i222;
                            fArr2[i212] = (i192 - f152) - f14;
                            int i232 = i202 + 3;
                            fVar2.j = i232;
                            fArr2[i222] = y3;
                            fVar2.j = i202 + 4;
                            fArr2[i232] = i192 - f14;
                            f14 += f152;
                        } else {
                            if (f12 != 0.0f) {
                                if (z10) {
                                    f10 = fVar2.o;
                                    f7 = (jArr[i17] / f12) * f10;
                                } else {
                                    f7 = jArr[i17] / f12;
                                    f10 = fVar2.o;
                                }
                                f11 = f7 * f10;
                                int i1922 = nVar.B0;
                                float f1522 = f11 * i1922;
                                float[] fArr22 = fVar2.k;
                                int i2022 = fVar2.j;
                                int i2122 = i2022 + 1;
                                fVar2.j = i2122;
                                fArr22[i2022] = y3;
                                int i2222 = i2022 + 2;
                                fVar2.j = i2222;
                                fArr22[i2122] = (i1922 - f1522) - f14;
                                int i2322 = i2022 + 3;
                                fVar2.j = i2322;
                                fArr22[i2222] = y3;
                                fVar2.j = i2022 + 4;
                                fArr22[i2322] = i1922 - f14;
                                f14 += f1522;
                            }
                            f11 = 0.0f;
                            int i19222 = nVar.B0;
                            float f15222 = f11 * i19222;
                            float[] fArr222 = fVar2.k;
                            int i20222 = fVar2.j;
                            int i21222 = i20222 + 1;
                            fVar2.j = i21222;
                            fArr222[i20222] = y3;
                            int i22222 = i20222 + 2;
                            fVar2.j = i22222;
                            fArr222[i21222] = (i19222 - f15222) - f14;
                            int i23222 = i20222 + 3;
                            fVar2.j = i23222;
                            fArr222[i22222] = y3;
                            fVar2.j = i20222 + 4;
                            fArr222[i23222] = i19222 - f14;
                            f14 += f15222;
                        }
                    }
                    i18++;
                    i14 = 1;
                    nVar = this;
                }
                i13 = i17 + 1;
                nVar = this;
                i11 = 0;
            }
            for (int i24 = 0; i24 < size; i24++) {
                kg.f fVar3 = (kg.f) arrayList.get(i24);
                Paint paint = fVar3.c;
                Paint paint2 = fVar3.c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(255);
                paint2.setAntiAlias(false);
                canvas.drawLines(fVar3.k, 0, fVar3.j, paint2);
            }
        }
    }

    @Override // ig.q, ig.g, android.view.View
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

    @Override // ig.g, android.view.View
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

    @Override // ig.q, ig.g
    public final void q(kg.j jVar) {
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

    @Override // ig.g
    public final void y() {
        this.M1 = -1;
        this.S1.setVisibility(8);
        invalidate();
    }

    @Override // ig.g
    public final void i(Canvas canvas) {
    }

    @Override // ig.g
    public final void j(Canvas canvas) {
    }

    @Override // ig.g
    public final void o(Canvas canvas) {
    }

    @Override // ig.g
    public final void l(Canvas canvas, kg.d dVar) {
    }

    @Override // ig.g
    public final void p(Canvas canvas, kg.d dVar) {
    }
}
