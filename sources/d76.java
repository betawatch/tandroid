// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d76 extends FrameLayout implements bs5 {
    public final wla E;
    public final TextView F;
    public final TextView G;
    public final cm2[] H;
    public final cm2[] I;
    public int J;
    public ValueAnimator K;
    public i76 L;
    public final Paint M;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final zf2 h;
    public final LinearLayout n;
    public final wla r;
    public final wla s;
    public CharSequence w;
    public final be0 x;
    public final pb0 y;

    public d76(int i, Context context, boolean z) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.H = new cm2[1];
        this.I = new cm2[1];
        this.M = new Paint(1);
        this.c = i;
        this.d = z;
        zf2 zf2Var = new zf2(this, context);
        this.h = zf2Var;
        zf2Var.setOrientation(0);
        addView(zf2Var, nme.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.y = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.x = be0Var;
        be0Var.setRoundRadius(gl.L(11.0f));
        zf2Var.addView(be0Var, nme.q(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        zf2Var.addView(linearLayout, nme.q(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, nme.o(-2, -2));
        wla wlaVar = new wla(context);
        this.r = wlaVar;
        wlaVar.setTextColor(-1);
        wlaVar.setTextSize(1, 14.0f);
        wlaVar.setGravity(3);
        wlaVar.setTypeface(gl.o());
        linearLayout2.addView(wlaVar, nme.q(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        wla wlaVar2 = new wla(context);
        this.s = wlaVar2;
        wlaVar2.setTextColor(bkb.p1(0.55f, -1));
        wlaVar2.setTextSize(1, 12.0f);
        wlaVar2.setGravity(5);
        linearLayout2.addView(wlaVar2, nme.q(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        wla wlaVar3 = new wla(context);
        this.E = wlaVar3;
        wlaVar3.setTextColor(-1);
        wlaVar3.setTextSize(1, 14.0f);
        wlaVar3.setShadowLayer(gl.L(2.5f), 0.0f, gl.L(1.5f), bkb.p1(0.6f, -16777216));
        kk7.i(wlaVar3);
        linearLayout.addView(wlaVar3, nme.o(-2, -2));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(gl.L(4.66f), 0, gl.L(4.66f), 0);
        textView.setVisibility(8);
        zf2Var.addView(textView, nme.q(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        zf2Var.addView(textView2, nme.q(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                this.h.invalidate();
            }
        }
        i76 i76Var = this.L;
        if (i76Var == null || this.e == null) {
            return;
        }
        this.J = i76Var.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new ni4(this, (byte) 20));
        this.K.addListener(new v85(this, (byte) 12));
        this.K.setDuration(350L);
        this.K.setInterpolator(s33.h);
        this.K.start();
    }

    @Override // bs5
    public final void e(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // bs5
    public final void g(Canvas canvas, float f) {
        zf2 zf2Var = this.h;
        if (zf2Var.getBackground() == null) {
            int p1 = bkb.p1(f * 0.5f, -16777216);
            Paint paint = this.M;
            paint.setColor(p1);
            RectF rectF = gl.P;
            rectF.set(zf2Var.getX(), zf2Var.getY(), zf2Var.getX() + zf2Var.getWidth(), zf2Var.getY() + zf2Var.getHeight());
            canvas.drawRoundRect(rectF, gl.L(13.0f), gl.L(13.0f), paint);
        }
        draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(i76 i76Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z;
        int i;
        boolean z2;
        String str2;
        int i2;
        CharSequence subSequence;
        int i3;
        this.L = i76Var;
        zf2 zf2Var = this.h;
        if ((i76Var == null || this.J != i76Var.a) && (valueAnimator = this.K) != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                zf2Var.invalidate();
            }
        }
        long j = i76Var.c;
        be0 be0Var = this.x;
        pb0 pb0Var = this.y;
        int i4 = this.c;
        if (j >= 0) {
            TLRPC.User V1 = na7.q1(i4).V1(Long.valueOf(i76Var.c));
            pb0Var.q(V1);
            be0Var.f(V1, pb0Var);
            str = l7c.l(V1);
        } else {
            TLRPC.Chat K0 = na7.q1(i4).K0(Long.valueOf(-i76Var.c));
            pb0Var.p(K0);
            be0Var.f(K0, pb0Var);
            str = K0 == null ? "" : K0.title;
        }
        int b = de5.b(i4, (int) i76Var.g, 3);
        int b2 = de5.b(i4, (int) i76Var.g, 4);
        int b3 = de5.b(i4, (int) i76Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z3 = i76Var.b;
        String str3 = " ";
        boolean z4 = this.d;
        wla wlaVar = this.E;
        if (!z3 || i76Var.g > 0) {
            if (i76Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + i76Var.h));
                z = z4;
                cm2 cm2Var = new cm2(0, new vd1(getContext(), i76Var.h));
                cm2Var.s = gl.L(1.0f);
                spannableStringBuilder.setSpan(cm2Var, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z = z4;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, wlaVar.getPaint(), gl.L(100.0f), TextUtils.TruncateAt.END));
            if (z) {
                i = 33;
                spannableStringBuilder.setSpan(new b76(), 0, spannableStringBuilder.length(), 33);
            } else {
                i = 33;
            }
            spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), i);
            spannableStringBuilder.append((CharSequence) " ");
        } else {
            z = z4;
        }
        int b4 = de5.b(i4, (int) i76Var.g, 1);
        int b5 = de5.b(i4, (int) i76Var.g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = i76Var.f;
        if (tL_textWithEntities != null) {
            CharSequence j0 = k27.j0(tL_textWithEntities, false, false, wlaVar.getPaint());
            this.w = j0;
            Typeface typeface = gl.a;
            if (j0 == null) {
                z2 = true;
                str2 = " ";
                subSequence = null;
            } else {
                int length = j0.length();
                z2 = true;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        i2 = length;
                        break;
                    }
                    char charAt = j0.charAt(i5);
                    if (!Character.isWhitespace(charAt)) {
                        i2 = length;
                        if (charAt != 10240 && charAt != 12644 && charAt != 65440) {
                            break;
                        }
                    } else {
                        i2 = length;
                    }
                    i5++;
                    length = i2;
                }
                int i6 = i2;
                while (true) {
                    if (i5 >= i6) {
                        str2 = str3;
                        break;
                    }
                    char charAt2 = j0.charAt(i6 - 1);
                    if (!Character.isWhitespace(charAt2)) {
                        str2 = str3;
                        if (charAt2 != 10240 && charAt2 != 12644 && charAt2 != 65440) {
                            break;
                        }
                    } else {
                        str2 = str3;
                    }
                    i6--;
                    str3 = str2;
                }
                subSequence = (i5 > 0 || i6 < j0.length()) ? j0.subSequence(i5, i6) : j0;
            }
            this.w = subSequence;
            if (subSequence.length() <= b4 || i76Var.b) {
                i3 = 0;
            } else {
                i3 = 0;
                this.w = this.w.subSequence(0, b4);
            }
            CharSequence charSequence = this.w;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                gm[] gmVarArr = (gm[]) spannable.getSpans(i3, charSequence.length(), gm.class);
                su3[] su3VarArr = (su3[]) spannable.getSpans(i3, this.w.length(), su3.class);
                if (gmVarArr.length + su3VarArr.length > b5 && !i76Var.b) {
                    ArrayList arrayList = new ArrayList();
                    int i7 = 0;
                    while (i7 < gmVarArr.length) {
                        gm[] gmVarArr2 = gmVarArr;
                        int i8 = i7;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(gmVarArr2[i7])), Integer.valueOf(spannable.getSpanEnd(gmVarArr2[i8]))));
                        i7 = i8 + 1;
                        gmVarArr = gmVarArr2;
                    }
                    int i9 = 0;
                    while (i9 < su3VarArr.length) {
                        int i10 = i9;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(su3VarArr[i9])), Integer.valueOf(spannable.getSpanEnd(su3VarArr[i10]))));
                        i9 = i10 + 1;
                    }
                    Collections.sort(arrayList, new mz2((byte) 27));
                    if (!(this.w instanceof SpannableStringBuilder)) {
                        this.w = new SpannableStringBuilder(this.w);
                    }
                    for (int size = arrayList.size() - 1; size >= b5; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.w).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!i76Var.b) {
                this.w = gl.J2(this.w);
            }
            spannableStringBuilder.append(this.w);
        } else {
            z2 = true;
            str2 = " ";
            this.w = "";
        }
        wlaVar.setText(vu3.m(spannableStringBuilder, wlaVar.getPaint().getFontMetricsInt(), false, null, 0));
        this.e = null;
        this.n.setVisibility((!i76Var.b || i76Var.g > 0) ? 8 : 0);
        long j2 = i76Var.g;
        TextView textView = this.G;
        TextView textView2 = this.F;
        if (j2 > 0) {
            boolean z5 = j2 >= 250 ? z2 : false;
            this.a = z5;
            zf2Var.setWillNotDraw(!z5);
            zf2Var.invalidate();
            wlaVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int L = gl.L(13.0f);
            int i11 = bkb.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b, b2});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(L);
            this.e = gradientDrawable;
            zf2Var.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            float f = z ? 1.0f : 0.65f;
            this.f = f;
            drawable2.setAlpha((int) (f * 255.0f));
            if (i76Var.e) {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(bkb.b0(gl.L(13.0f), bkb.p1(0.25f, b3)));
                textView2.setText(jva.X0(false, "⭐️ ".concat(k96.E(i76Var.g, ',')), 0.75f, this.H, gl.L(0.66f), 1.0f));
                cm2 cm2Var2 = this.H[0];
                if (cm2Var2 != null) {
                    cm2Var2.a = this.b;
                }
            } else {
                textView.setVisibility(0);
                textView.setText(jva.X0(false, "⭐️ ".concat(k96.E(i76Var.g, ',')), 0.75f, this.I, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            }
        } else if (i76Var.b) {
            this.a = false;
            zf2Var.setWillNotDraw(z2);
            ShapeDrawable b0 = bkb.b0(gl.L(13.0f), -16777216);
            this.e = b0;
            zf2Var.setBackground(b0);
            Drawable drawable3 = this.e;
            this.f = 0.5f;
            drawable3.setAlpha(kk7.K1);
            wlaVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) cf3.k(i4, i76Var.c));
            spannableStringBuilder2.append((CharSequence) str2);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) k96.M0(2131748633, null));
            spannableStringBuilder2.setSpan(new a76((byte) 0), length2, spannableStringBuilder2.length(), 33);
            this.r.setText(spannableStringBuilder2);
            this.s.setText(k96.M0(2131748636, null));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.a = false;
            zf2Var.setWillNotDraw(true);
            wlaVar.setShadowLayer(gl.L(2.5f), 0.0f, gl.L(1.5f), bkb.p1(0.6f, -16777216));
            this.e = null;
            zf2Var.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        zf2Var.invalidate();
    }

    public void setDrawStar(boolean z) {
        this.b = z;
        cm2 cm2Var = this.H[0];
        if (cm2Var == null || cm2Var.a == z) {
            return;
        }
        cm2Var.a = z;
        this.F.invalidate();
    }

    @Override // bs5
    public /* bridge */ /* synthetic */ void setScrimHidden(boolean z) {
        tb4.a(this, z);
    }
}
