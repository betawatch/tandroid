package ei;

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
import b8.mf;
import ci.gb;
import ci.wb;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p0 extends FrameLayout implements e60 {
    public final yh.l E;
    public final TextView F;
    public final TextView G;
    public final wp[] H;
    public final wp[] I;
    public int J;
    public ValueAnimator K;
    public u0 L;
    public final Paint M;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final gb h;
    public final LinearLayout n;
    public final yh.l r;
    public final yh.l s;
    public CharSequence w;
    public final org.telegram.ui.Components.k9 x;
    public final org.telegram.ui.Components.u8 y;

    public p0(int i3, Context context, boolean z10) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.H = new wp[1];
        this.I = new wp[1];
        this.M = new Paint(1);
        this.c = i3;
        this.d = z10;
        gb gbVar = new gb(this, context);
        this.h = gbVar;
        gbVar.setOrientation(0);
        addView(gbVar, mf.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.y = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.x = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        gbVar.addView(k9Var, mf.q(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        gbVar.addView(linearLayout, mf.q(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, mf.o(-2, -2));
        yh.l lVar = new yh.l(context);
        this.r = lVar;
        lVar.setTextColor(-1);
        lVar.setTextSize(1, 14.0f);
        lVar.setGravity(3);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        linearLayout2.addView(lVar, mf.q(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        yh.l lVar2 = new yh.l(context);
        this.s = lVar2;
        lVar2.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.55f, -1));
        lVar2.setTextSize(1, 12.0f);
        lVar2.setGravity(5);
        linearLayout2.addView(lVar2, mf.q(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        yh.l lVar3 = new yh.l(context);
        this.E = lVar3;
        lVar3.setTextColor(-1);
        lVar3.setTextSize(1, 14.0f);
        lVar3.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.k6.r1(0.6f, -16777216));
        hs.i(lVar3);
        linearLayout.addView(lVar3, mf.o(-2, -2));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        textView.setVisibility(8);
        gbVar.addView(textView, mf.q(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        gbVar.addView(textView2, mf.q(-2, -2, 0.0f, 85, 0, 3, 10, 0));
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
        u0 u0Var = this.L;
        if (u0Var == null || this.e == null) {
            return;
        }
        this.J = u0Var.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new bh.f(this, 15));
        this.K.addListener(new ai.e1(this, 9));
        this.K.setDuration(350L);
        this.K.setInterpolator(xq.h);
        this.K.start();
    }

    @Override // org.telegram.ui.Components.e60
    public final void g(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // org.telegram.ui.Components.e60
    public final void h(Canvas canvas, float f10) {
        gb gbVar = this.h;
        if (gbVar.getBackground() == null) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(f10 * 0.5f, -16777216);
            Paint paint = this.M;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(gbVar.getX(), gbVar.getY(), gbVar.getX() + gbVar.getWidth(), gbVar.getY() + gbVar.getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), paint);
        }
        draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(u0 u0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z10;
        int i3;
        boolean z11;
        String str2;
        int i10;
        CharSequence subSequence;
        int i11;
        this.L = u0Var;
        gb gbVar = this.h;
        if ((u0Var == null || this.J != u0Var.a) && (valueAnimator = this.K) != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                gbVar.invalidate();
            }
        }
        long j10 = u0Var.c;
        org.telegram.ui.Components.k9 k9Var = this.x;
        org.telegram.ui.Components.u8 u8Var = this.y;
        int i12 = this.c;
        if (j10 >= 0) {
            TLRPC.User a22 = hp.s1(i12).a2(Long.valueOf(u0Var.c));
            u8Var.r(a22);
            k9Var.e(a22, u8Var);
            str = l10.k(a22);
        } else {
            TLRPC.Chat M0 = hp.s1(i12).M0(Long.valueOf(-u0Var.c));
            u8Var.q(M0);
            k9Var.e(M0, u8Var);
            str = M0 == null ? "" : M0.title;
        }
        int b10 = u.b(i12, (int) u0Var.g, 3);
        int b11 = u.b(i12, (int) u0Var.g, 4);
        int b12 = u.b(i12, (int) u0Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z12 = u0Var.b;
        String str3 = " ";
        boolean z13 = this.d;
        yh.l lVar = this.E;
        if (!z12 || u0Var.g > 0) {
            if (u0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + u0Var.h));
                z10 = z13;
                wp wpVar = new wp(0, new l0(getContext(), u0Var.h));
                wpVar.s = org.telegram.messenger.g0.L(1.0f);
                spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z13;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, lVar.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i3 = 33;
                spannableStringBuilder.setSpan(new n0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i3 = 33;
            }
            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), i3);
            spannableStringBuilder.append((CharSequence) " ");
        } else {
            z10 = z13;
        }
        int b13 = u.b(i12, (int) u0Var.g, 1);
        int b14 = u.b(i12, (int) u0Var.g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = u0Var.f;
        if (tL_textWithEntities != null) {
            CharSequence j02 = zi.j0(tL_textWithEntities, false, false, lVar.getPaint());
            this.w = j02;
            Typeface typeface = org.telegram.messenger.g0.a;
            if (j02 == null) {
                z11 = true;
                str2 = " ";
                subSequence = null;
            } else {
                int length = j02.length();
                z11 = true;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        i10 = length;
                        break;
                    }
                    char charAt = j02.charAt(i13);
                    if (!Character.isWhitespace(charAt)) {
                        i10 = length;
                        if (charAt != 10240 && charAt != 12644 && charAt != 65440) {
                            break;
                        }
                    } else {
                        i10 = length;
                    }
                    i13++;
                    length = i10;
                }
                int i14 = i10;
                while (true) {
                    if (i13 >= i14) {
                        str2 = str3;
                        break;
                    }
                    char charAt2 = j02.charAt(i14 - 1);
                    if (!Character.isWhitespace(charAt2)) {
                        str2 = str3;
                        if (charAt2 != 10240 && charAt2 != 12644) {
                            if (charAt2 != 65440) {
                                break;
                            }
                            i14--;
                            str3 = str2;
                        }
                    } else {
                        str2 = str3;
                    }
                    i14--;
                    str3 = str2;
                }
                subSequence = (i13 > 0 || i14 < j02.length()) ? j02.subSequence(i13, i14) : j02;
            }
            this.w = subSequence;
            if (subSequence.length() <= b13 || u0Var.b) {
                i11 = 0;
            } else {
                i11 = 0;
                this.w = this.w.subSequence(0, b13);
            }
            CharSequence charSequence = this.w;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannable.getSpans(i11, charSequence.length(), org.telegram.ui.Components.p5.class);
                org.telegram.messenger.f6[] f6VarArr = (org.telegram.messenger.f6[]) spannable.getSpans(i11, this.w.length(), org.telegram.messenger.f6.class);
                if (p5VarArr.length + f6VarArr.length > b14 && !u0Var.b) {
                    ArrayList arrayList = new ArrayList();
                    int i15 = 0;
                    while (i15 < p5VarArr.length) {
                        org.telegram.ui.Components.p5[] p5VarArr2 = p5VarArr;
                        int i16 = i15;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(p5VarArr2[i15])), Integer.valueOf(spannable.getSpanEnd(p5VarArr2[i16]))));
                        i15 = i16 + 1;
                        p5VarArr = p5VarArr2;
                    }
                    int i17 = 0;
                    while (i17 < f6VarArr.length) {
                        int i18 = i17;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(f6VarArr[i17])), Integer.valueOf(spannable.getSpanEnd(f6VarArr[i18]))));
                        i17 = i18 + 1;
                    }
                    Collections.sort(arrayList, new a3.u(13));
                    if (!(this.w instanceof SpannableStringBuilder)) {
                        this.w = new SpannableStringBuilder(this.w);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.w).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!u0Var.b) {
                this.w = org.telegram.messenger.g0.N2(this.w);
            }
            spannableStringBuilder.append(this.w);
        } else {
            z11 = true;
            str2 = " ";
            this.w = "";
        }
        lVar.setText(org.telegram.messenger.i6.m(spannableStringBuilder, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        this.e = null;
        this.n.setVisibility((!u0Var.b || u0Var.g > 0) ? 8 : 0);
        long j11 = u0Var.g;
        TextView textView = this.G;
        TextView textView2 = this.F;
        if (j11 > 0) {
            boolean z14 = j11 >= 250 ? z11 : false;
            this.a = z14;
            gbVar.setWillNotDraw(!z14);
            gbVar.invalidate();
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int L = org.telegram.messenger.g0.L(13.0f);
            int i19 = org.telegram.ui.ActionBar.k6.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(L);
            this.e = gradientDrawable;
            gbVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            float f10 = z10 ? 1.0f : 0.65f;
            this.f = f10;
            drawable2.setAlpha((int) (f10 * 255.0f));
            if (u0Var.e) {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(13.0f), org.telegram.ui.ActionBar.k6.r1(0.25f, b12)));
                textView2.setText(wb.X0(false, k2.p1.l(u0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, org.telegram.messenger.g0.L(0.66f), 1.0f));
                wp wpVar2 = this.H[0];
                if (wpVar2 != null) {
                    wpVar2.a = this.b;
                }
            } else {
                textView.setVisibility(0);
                textView.setText(wb.X0(false, k2.p1.l(u0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.I, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            }
        } else if (u0Var.b) {
            this.a = false;
            gbVar.setWillNotDraw(z11);
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(13.0f), -16777216);
            this.e = d02;
            gbVar.setBackground(d02);
            Drawable drawable3 = this.e;
            this.f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.m5.l(i12, u0Var.c));
            spannableStringBuilder2.append((CharSequence) str2);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) bd.M0(2131748833, null));
            spannableStringBuilder2.setSpan(new m0(0), length2, spannableStringBuilder2.length(), 33);
            this.r.setText(spannableStringBuilder2);
            this.s.setText(bd.M0(2131748836, null));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.a = false;
            gbVar.setWillNotDraw(true);
            lVar.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.k6.r1(0.6f, -16777216));
            this.e = null;
            gbVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        gbVar.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.b = z10;
        wp wpVar = this.H[0];
        if (wpVar == null || wpVar.a == z10) {
            return;
        }
        wpVar.a = z10;
        this.F.invalidate();
    }
}
