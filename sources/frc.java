// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class frc extends FrameLayout implements fn7 {
    public static Typeface k0;
    public static Typeface l0;
    public final zqc E;
    public final FrameLayout F;
    public View.OnClickListener G;
    public final fx0 H;
    public final nf9 I;
    public final Paint J;
    public float K;
    public final mm L;
    public final View M;
    public final LinearLayout N;
    public final crc O;
    public final crc P;
    public final FrameLayout.LayoutParams Q;
    public String R;
    public int S;
    public final byte T;
    public float U;
    public float V;
    public int W;
    public boolean a;
    public c a0;
    public float b;
    public float[] b0;
    public final Matrix c;
    public int c0;
    public final Matrix d;
    public int d0;
    public final Matrix e;
    public float e0;
    public final RectF f;
    public float f0;
    public final mm g0;
    public float h;
    public final mm h0;
    public orc i0;
    public boolean j0;
    public boolean n;
    public float r;
    public float s;
    public final Matrix w;
    public final Matrix x;
    public final Matrix y;

    /* JADX WARN: Multi-variable type inference failed */
    public frc(Context context, int i, int i2) {
        super(context);
        this.b = 1.0f;
        this.c = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = new RectF();
        this.s = 1.0f;
        this.w = new Matrix();
        this.x = new Matrix();
        this.y = new Matrix();
        this.J = new Paint(jn7.W2);
        final byte b = 0;
        Runnable runnable = new Runnable(this) { // from class: arc
            public final /* synthetic */ frc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                frc frcVar = this.b;
                switch (b2) {
                    case 0:
                        frcVar.I.invalidate();
                        break;
                    case 1:
                        frcVar.O.invalidate();
                        frcVar.P.invalidate();
                        break;
                    default:
                        frcVar.H.invalidate();
                        break;
                }
            }
        };
        k43 k43Var = k43.h;
        this.L = new mm(runnable, 240L, k43Var, 0);
        this.W = yac.t0;
        final byte b2 = 1;
        this.g0 = new mm(new Runnable(this) { // from class: arc
            public final /* synthetic */ frc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                frc frcVar = this.b;
                switch (b22) {
                    case 0:
                        frcVar.I.invalidate();
                        break;
                    case 1:
                        frcVar.O.invalidate();
                        frcVar.P.invalidate();
                        break;
                    default:
                        frcVar.H.invalidate();
                        break;
                }
            }
        }, 240L, k43Var, 0);
        final byte b3 = 2;
        this.h0 = new mm(new Runnable(this) { // from class: arc
            public final /* synthetic */ frc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                frc frcVar = this.b;
                switch (b22) {
                    case 0:
                        frcVar.I.invalidate();
                        break;
                    case 1:
                        frcVar.O.invalidate();
                        frcVar.P.invalidate();
                        break;
                    default:
                        frcVar.H.invalidate();
                        break;
                }
            }
        }, 240L, k43Var, 0);
        this.S = i;
        this.T = i2;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
        zqc zqcVar = new zqc(getContext(), this.S, i2);
        this.E = zqcVar;
        this.F = zqcVar.getFrontFace();
        float[] fArr = this.b0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.r);
        setUseGyroscope(this.s);
        this.E.setOnClickListener(this.G);
        addView(this.E, 0, tre.c(-2.0f, -1));
        fx0 fx0Var = new fx0((byte) 9, context, this);
        this.H = fx0Var;
        Typeface typeface = l0;
        if (typeface == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                gk.e();
                typeface = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
                l0 = typeface;
            } else {
                typeface = hl.n1("fonts/rmono.ttf");
                l0 = typeface;
            }
        }
        fx0Var.setTypeface(typeface);
        fx0Var.setTextColor(-1);
        fx0Var.setTextSize(1, 13.0f);
        fx0Var.setEllipsize(TextUtils.TruncateAt.END);
        fx0Var.setMaxLines(1);
        fx0Var.setSingleLine();
        this.F.addView(fx0Var, tre.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        nf9 nf9Var = new nf9((byte) 16, context, this);
        this.I = nf9Var;
        this.F.addView(nf9Var, tre.c(-1.0f, -1));
        View view = new View(context);
        this.M = view;
        this.F.addView(view, tre.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = tre.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.Q = d;
        this.F.addView(linearLayout, d);
        crc crcVar = new crc(this, context, b);
        this.O = crcVar;
        crcVar.getDrawable().N = hl.L(4096.0f);
        crcVar.c.m(0.35f, 320L, 3.5f, k43Var);
        crcVar.setScaleProperty(0.6f);
        crcVar.setTypeface(hl.n1("fonts/gram.ttf"));
        crcVar.setTextSize(hl.L(23.0f));
        crcVar.setTextColor(-1);
        crcVar.setIgnoreRTL(true);
        linearLayout.addView(crcVar, tre.o(-1, 28));
        crc crcVar2 = new crc(this, context, b2);
        this.P = crcVar2;
        crcVar2.c.m(0.35f, 320L, 3.5f, k43Var);
        crcVar2.setScaleProperty(0.6f);
        crcVar2.setTypeface(hl.n1("fonts/gram.ttf"));
        crcVar2.setTextSize(hl.L(14.0f));
        crcVar2.setTextColor(-7868417);
        crcVar2.setLayoutDirection(0);
        crcVar2.setTextDirection(3);
        crcVar2.setGravity(19);
        crcVar2.setIgnoreRTL(true);
        linearLayout.addView(crcVar2, tre.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder((str.length() / 4) + str.length());
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i % 4 == 0) {
                sb.append(' ');
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static SpannableStringBuilder e(long j) {
        return c.u(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(c.t(j, false))), 0.8f);
    }

    public static String f(String str) {
        String[] split = str.split(" ");
        if (split.length < 2) {
            return str;
        }
        int length = split.length / 2;
        StringBuilder sb = new StringBuilder(str.length() + 1);
        int i = 0;
        while (i < split.length) {
            if (i > 0) {
                sb.append(i == length ? '\n' : ' ');
            }
            sb.append(split[i]);
            i++;
        }
        return sb.toString();
    }

    public static void k(View view, Matrix matrix) {
        if (!(view.getParent() instanceof View)) {
            matrix.reset();
            return;
        }
        k((View) view.getParent(), matrix);
        matrix.preTranslate(view.getLeft() - r0.getScrollX(), view.getTop() - r0.getScrollY());
        matrix.preConcat(view.getMatrix());
    }

    public final float a() {
        float c = this.O.getDrawable().c();
        float max = Math.max(0.0f, (((((336.0f - this.T) - 48.0f) * this.F.getWidth()) / 336.0f) - this.Q.leftMargin) - hl.L(8.0f));
        if (c > 0.0f) {
            return Math.min(1.0f, max / c);
        }
        return 1.0f;
    }

    public final void b(final Canvas canvas, float f) {
        float width = getFrontFace().getWidth();
        float height = getFrontFace().getHeight();
        float f2 = width / 1640.0f;
        Context context = getContext();
        Typeface typeface = k0;
        if (typeface == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                gk.e();
                typeface = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
                k0 = typeface;
            } else {
                typeface = hl.n1("fonts/rmono.ttf");
                k0 = typeface;
            }
        }
        Paint paint = this.J;
        paint.setTypeface(typeface);
        paint.setTextSize(47.345238f * f2);
        paint.setTextAlign(Paint.Align.CENTER);
        float[] fArr = this.b0;
        paint.setColor(vm2.f((fArr == null || fArr.length < 18) ? 0.0f : fArr[8], lsc.b(0, fArr), lsc.b(1, fArr)));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        final float f3 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        final float f4 = f2 * 27.333332f;
        final String[] split = f(this.R).split("\\n");
        canvas.save();
        canvas.translate(f2 * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        c(f, new ftb(this, (byte) 15), new Runnable() { // from class: brc
            @Override // java.lang.Runnable
            public final void run() {
                frc frcVar = frc.this;
                frcVar.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f5 = f4;
                float f6 = f3;
                Paint paint2 = frcVar.J;
                Canvas canvas2 = canvas;
                canvas2.drawText(str, 0.0f, (-f5) + f6, paint2);
                if (strArr.length > 1) {
                    canvas2.drawText(strArr[1], 0.0f, f5 + f6, paint2);
                }
            }
        });
        canvas.restore();
    }

    public final void c(float f, erc ercVar, Runnable runnable) {
        ercVar.b(f > 0.0f ? hl.L(5.0f) : 0.0f, hl.L(1.0f), Color.argb((int) (89.0f * f), 0, 0, 0));
        runnable.run();
        if (f <= 0.0f) {
            return;
        }
        ercVar.b(hl.N(1.5f), 0.0f, Color.argb((int) (f * 140.0f), 0, 0, 0));
        this.j0 = true;
        runnable.run();
        this.j0 = false;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.d4) {
            Object obj = objArr[0];
            c cVar = this.a0;
            if (obj == cVar) {
                l(cVar);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (!isAttachedToWindow() || !view.isAttachedToWindow() || getRootView() != view.getRootView()) {
            return false;
        }
        FrameLayout frameLayout = this.F;
        View view2 = (View) ((View) frameLayout.getParent()).getParent();
        zqc zqcVar = this.E;
        Matrix matrix2 = (Matrix) zqcVar.e.d;
        Matrix matrix3 = this.w;
        matrix3.set(matrix2);
        h8b h8bVar = zqcVar.f;
        matrix3.preTranslate(h8bVar.getLeft(), h8bVar.getTop());
        k(view2, matrix);
        matrix.preConcat(matrix3);
        matrix.preTranslate(frameLayout.getLeft() - r1.getScrollX(), frameLayout.getTop() - r1.getScrollY());
        matrix.preConcat(frameLayout.getMatrix());
        Matrix matrix4 = this.x;
        k(view, matrix4);
        Matrix matrix5 = this.y;
        if (!matrix4.invert(matrix5)) {
            return false;
        }
        matrix.postConcat(matrix5);
        return true;
    }

    public View getBalanceAnchor() {
        return this.M;
    }

    public LinearLayout getBalanceLayout() {
        return this.N;
    }

    public in getBalanceView() {
        return this.O;
    }

    public TextView getCardHolderView() {
        return this.H;
    }

    public float getCardRotationX() {
        return this.E.getCardRotationX();
    }

    public float getCardRotationY() {
        return this.E.getCardRotationY();
    }

    public FrameLayout getFrontFace() {
        return this.F;
    }

    public int getStickerLayerIndex() {
        int indexOfChild = this.F.indexOfChild(this.H);
        int indexOfChild2 = this.F.indexOfChild(this.N);
        return indexOfChild < 0 ? indexOfChild2 < 0 ? this.F.getChildCount() : indexOfChild2 : indexOfChild2 < 0 ? indexOfChild : Math.min(indexOfChild, indexOfChild2);
    }

    public ArrayList<RectF> getStickerObstacles() {
        ArrayList<RectF> arrayList = new ArrayList<>();
        FrameLayout frameLayout = this.F;
        float width = frameLayout.getWidth() / 336.0f;
        float a = a();
        float c = this.O.getDrawable().c() * a;
        float c2 = this.P.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.Q;
        float f = layoutParams.leftMargin;
        float f2 = layoutParams.topMargin;
        float bottom = ((r4.getBottom() + r4.getTop()) / 2.0f) + f2;
        float height = (r4.getHeight() * a) / 2.0f;
        arrayList.add(new RectF(f, bottom - height, c + f, bottom + height));
        fx0 fx0Var = this.H;
        arrayList.add(new RectF(fx0Var.getLeft(), fx0Var.getTop(), fx0Var.getLeft() + Math.min(fx0Var.getWidth(), fx0Var.getPaint().measureText(fx0Var.getText().toString())), fx0Var.getBottom()));
        arrayList.add(new RectF(frameLayout.getWidth() - (34.0f * width), 18.0f * width, frameLayout.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, frameLayout.getWidth(), frameLayout.getHeight());
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        arrayList.add(rectF);
        arrayList.add(new RectF(f, r6.getTop() + f2, c2 + f, f2 + r6.getBottom()));
        arrayList.add(this.a ? new RectF(this.f) : new RectF());
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.b0;
    }

    public in getUsdBalanceView() {
        return this.P;
    }

    public final void h(Path path, float f, float f2) {
        path.rewind();
        float f3 = 336 - this.T;
        path.addRoundRect(((f3 - 48.0f) * f) / 336.0f, 0.36097562f * f2, (f3 * f) / 336.0f, 0.5365854f * f2, (f * 8.0f) / 336.0f, 0.03902439f * f2, Path.Direction.CW);
    }

    public final void i(float f, float f2) {
        if (this.U == f && this.V == f2) {
            return;
        }
        this.U = f;
        if (f == 0.0f) {
            this.n = false;
        }
        this.V = f2;
        this.O.invalidate();
        this.P.invalidate();
    }

    public final void j(int i, long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new drc(this), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ob6.M0(2131749287, null));
        spannableStringBuilder.setSpan(new zk(this, (byte) 4), length, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        long round = Math.round((j / 1.0E9d) * uc7.s1(i).k4.k.i * 100.0d);
        crc crcVar = this.P;
        di0.h();
        crcVar.setText(di0.f("USD", 2, round, round % 100 == 0));
    }

    public final void l(c cVar) {
        if (cVar != null) {
            int i = cVar.a;
            setCardHolder(lbc.r(yac.h(i).f()).toUpperCase());
            if (cVar.x() != null) {
                setCardNumber(d(cVar.x().toUpperCase()));
            }
            if (cVar.M()) {
                j(i, cVar.z());
            }
        }
    }

    public final void m() {
        int i;
        float f;
        if (this.i0 != null) {
            float[] fArr = this.b0;
            char c = '\t';
            int i2 = 2;
            boolean z = true;
            float f2 = 0.0f;
            if (fArr == null) {
                fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
            }
            float[] fArr2 = lsc.c;
            float[] fArr3 = new float[42];
            int i3 = 0;
            while (true) {
                char c2 = c;
                if (i3 >= i2) {
                    break;
                }
                int i4 = i3 << 2;
                int i5 = i4 + 10;
                boolean z2 = z;
                if (fArr.length < 18 || fArr[i5] < f2) {
                    f = f2;
                    System.arraycopy(lsc.b, 0, fArr3, i3 * 12, 12);
                    fArr3[i3 + 28] = 1.0f;
                    System.arraycopy(fArr2, 0, fArr3, (i3 * 3) + 30, 3);
                } else {
                    fArr3[i3 + 28] = 0.6f;
                    int i6 = (int) fArr[i5];
                    int i7 = i3 * 3;
                    int i8 = i7 + 30;
                    float f3 = ((i6 >> 16) & jn7.d4) / 255.0f;
                    f = f2;
                    float f4 = ((i6 >> 8) & jn7.d4) / 255.0f;
                    float f5 = (i6 & jn7.d4) / 255.0f;
                    float min = Math.min(f3, Math.min(f4, f5));
                    float max = Math.max(f3, Math.max(f4, f5)) - min;
                    float f6 = (fArr2[i2] * 0.0722f) + (fArr2[z2 ? 1 : 0] * 0.7152f) + (fArr2[0] * 0.2126f);
                    float min2 = Math.min(1.0f, max / 0.15f);
                    fArr3[i8] = qd4.A(max > f ? (f3 - min) / max : f, f6, min2, f6);
                    fArr3[i7 + 31] = qd4.A(max > f ? (f4 - min) / max : f, f6, min2, f6);
                    fArr3[i7 + 32] = qd4.A(max > f ? (f5 - min) / max : f, f6, min2, f6);
                    int i9 = (int) fArr[i5];
                    int i10 = (int) fArr[i4 + 11];
                    int n = lsc.n(-16216082, i9, i10);
                    int n2 = lsc.n(-15291399, i9, i10);
                    for (int i11 = 0; i11 < 3; i11++) {
                        int i12 = 16 - (i11 << 3);
                        float h = lsc.h(n, i12) * 0.73f;
                        float h2 = lsc.h(n2, i12) * 0.73f;
                        int i13 = i3 * 12;
                        fArr3[i13 + i11] = (h + h2) / 2.0f;
                        fArr3[i13 + 3 + i11] = h;
                        fArr3[i13 + 6 + i11] = h2;
                        fArr3[i13 + 9 + i11] = h;
                    }
                }
                i3++;
                c = c2;
                z = z2 ? 1 : 0;
                f2 = f;
                i2 = 2;
            }
            boolean z3 = z;
            float f7 = f2;
            int i14 = 0;
            for (int i15 = i2; i14 < i15; i15 = 2) {
                int i16 = i14 << 2;
                int f8 = (fArr.length < 18 || fArr[i16 + 10] < f7) ? vm2.f(0.2f, -16611884, -16748084) : vm2.f(0.2f, ((int) fArr[i16 + 12]) | (-16777216), ((int) fArr[i16 + 11]) | (-16777216));
                int i17 = i14 * 3;
                fArr3[i17 + 36] = ((f8 >> 16) & jn7.d4) / 255.0f;
                fArr3[i17 + 37] = ((f8 >> 8) & jn7.d4) / 255.0f;
                fArr3[i17 + 38] = (f8 & jn7.d4) / 255.0f;
                i14++;
            }
            System.arraycopy(fArr, 6, fArr3, 24, 4);
            float[] fArr4 = this.b0;
            float max2 = (fArr4 == null || fArr4.length <= 8) ? 1.0f : Math.max(f7, Math.min(1.0f, fArr4[8]));
            orc orcVar = this.i0;
            float R1 = hl.R1(fArr3[30], fArr3[33], max2);
            float R12 = hl.R1(fArr3[31], fArr3[34], max2);
            float R13 = hl.R1(fArr3[32], fArr3[35], max2);
            float[] fArr5 = orc.j;
            float[] a = orc.a(R1, R12, R13);
            float f9 = a[0];
            float f10 = a[z3 ? 1 : 0];
            float f11 = a[2];
            if (f9 == orcVar.e && f10 == orcVar.f && f11 == orcVar.g) {
                return;
            }
            orcVar.e = f9;
            orcVar.f = f10;
            orcVar.g = f11;
            float[] fArr6 = orc.k;
            if (fArr6 == null) {
                fArr6 = orc.a(0.0f, 0.47809f, 1.0f);
                orc.k = fArr6;
            }
            float f12 = fArr6[0];
            float f13 = fArr6[z3 ? 1 : 0];
            double d = (f12 - f13) / 1.4142135623730951d;
            double d2 = ((f12 + f13) - (fArr6[2] * 2.0f)) / 2.449489742783178d;
            double d3 = (f9 - f10) / 1.4142135623730951d;
            double d4 = ((f9 + f10) - (f11 * 2.0f)) / 2.449489742783178d;
            int i18 = 0;
            double IEEEremainder = Math.IEEEremainder(Math.atan2(d4, d3) - Math.atan2(d2, d), 6.283185307179586d);
            double min3 = ((Math.min(1.0d, Math.abs(IEEEremainder) / 1.0471975511965976d) * (-0.30000001192092896d)) + 1.0d) * (Math.hypot(d3, d4) / Math.hypot(d, d2));
            double cos = Math.cos(IEEEremainder);
            double sin = Math.sin(IEEEremainder) / 1.7320508075688772d;
            double d5 = ((cos - (cos * 0.3333333333333333d)) * min3) + 0.3333333333333333d;
            double d6 = 0.3333333333333333d - ((cos * min3) * 0.3333333333333333d);
            float[] fArr7 = new float[20];
            int i19 = 0;
            while (true) {
                i = 3;
                if (i19 >= 3) {
                    break;
                }
                int i20 = i18;
                while (i20 < i) {
                    double d7 = i19 == i20 ? d5 : d6;
                    if (i20 == (i19 + 1) % 3) {
                        d7 -= min3 * sin;
                    } else if (i20 == (i19 + 2) % 3) {
                        d7 = (min3 * sin) + d7;
                    }
                    int i21 = i18;
                    double d8 = sin;
                    fArr7[(i19 * 5) + i20] = (float) d7;
                    i20++;
                    i18 = i21;
                    sin = d8;
                    i = 3;
                }
                i19++;
            }
            int i22 = i18;
            int i23 = i22;
            while (i23 < i) {
                float f14 = (fArr5[2] * fArr7[i23 + 10]) + (fArr5[z3 ? 1 : 0] * fArr7[i23 + 5]) + (fArr5[i22] * fArr7[i23]);
                for (int i24 = i22; i24 < 3; i24++) {
                    int i25 = (i24 * 5) + i23;
                    fArr7[i25] = (fArr5[i23] - f14) + fArr7[i25];
                }
                i23++;
                i = 3;
            }
            fArr7[18] = 1.0f;
            orcVar.d.setColorFilter(new ColorMatrixColorFilter(fArr7));
            orcVar.invalidateSelf();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (view != null) {
            view.setTranslationZ(hl.L(16.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
        if (this.a0 != null) {
            jn7.f(this.W).b(this, jn7.d4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (view != null) {
            view.setTranslationZ(0.0f);
        }
        super.onDetachedFromWindow();
        if (this.a0 != null) {
            jn7.f(this.W).n(this, jn7.d4);
        }
    }

    public void setAdditionalTilt(float f) {
        this.r = f;
        this.E.setAdditionalTilt(f);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.H.setText(charSequence);
    }

    public void setCardIcon(int i) {
        this.S = i;
        this.E.setCardIcon(i);
    }

    public void setCardNumber(String str) {
        if (str == null || str.equals(this.R)) {
            return;
        }
        this.R = str;
        this.E.setHasCardNumber(true);
        this.I.invalidate();
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.G = onClickListener;
        this.E.setOnClickListener(onClickListener);
    }

    public void setDiamondOnCard(boolean z) {
        this.a = z;
        this.O.invalidate();
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setStickerImpact(float f) {
        this.E.setScaleX(f);
        this.E.setScaleY(f);
    }

    public void setStickerStyle(float[] fArr) {
        this.b0 = fArr;
        m();
        this.O.invalidate();
        this.I.invalidate();
        this.E.setStickerStyle(fArr);
        this.P.setTextColor(vm2.f(fArr[8], lsc.p(-7868417, 0, fArr), lsc.p(-7868417, 3, fArr)));
        this.H.invalidate();
    }

    public void setUseGyroscope(float f) {
        this.s = f;
        this.E.setUseGyroscope(f);
    }

    public frc(Context context) {
        this(context, R.drawable.wallet_card_qr, 46);
    }
}
