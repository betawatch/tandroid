package fi;

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
import c8.ja;
import di.lb;
import di.va;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n0 extends FrameLayout implements l60 {
    public final xh.l E;
    public final TextView F;
    public final TextView G;
    public final eq[] H;
    public final eq[] I;
    public int J;
    public ValueAnimator K;
    public s0 L;
    public final Paint M;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final va h;
    public final LinearLayout n;
    public final xh.l r;
    public final xh.l s;
    public CharSequence w;
    public final org.telegram.ui.Components.i9 x;
    public final org.telegram.ui.Components.t8 y;

    public n0(int i7, Context context, boolean z10) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.H = new eq[1];
        this.I = new eq[1];
        this.M = new Paint(1);
        this.c = i7;
        this.d = z10;
        va vaVar = new va(this, context);
        this.h = vaVar;
        vaVar.setOrientation(0);
        addView(vaVar, ja.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.y = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.x = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        vaVar.addView(i9Var, ja.q(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        vaVar.addView(linearLayout, ja.q(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, ja.o(-2, -2));
        xh.l lVar = new xh.l(context);
        this.r = lVar;
        lVar.setTextColor(-1);
        lVar.setTextSize(1, 14.0f);
        lVar.setGravity(3);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        linearLayout2.addView(lVar, ja.q(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        xh.l lVar2 = new xh.l(context);
        this.s = lVar2;
        lVar2.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.55f, -1));
        lVar2.setTextSize(1, 12.0f);
        lVar2.setGravity(5);
        linearLayout2.addView(lVar2, ja.q(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        xh.l lVar3 = new xh.l(context);
        this.E = lVar3;
        lVar3.setTextColor(-1);
        lVar3.setTextSize(1, 14.0f);
        lVar3.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.j6.r1(0.6f, -16777216));
        ns.i(lVar3);
        linearLayout.addView(lVar3, ja.o(-2, -2));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        textView.setVisibility(8);
        vaVar.addView(textView, ja.q(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        vaVar.addView(textView2, ja.q(-2, -2, 0.0f, 85, 0, 3, 10, 0));
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
        s0 s0Var = this.L;
        if (s0Var == null || this.e == null) {
            return;
        }
        this.J = s0Var.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 16));
        this.K.addListener(new ai.j0(this, 10));
        this.K.setDuration(350L);
        this.K.setInterpolator(er.h);
        this.K.start();
    }

    @Override // org.telegram.ui.Components.l60
    public final void f(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // org.telegram.ui.Components.l60
    public final void h(Canvas canvas, float f10) {
        va vaVar = this.h;
        if (vaVar.getBackground() == null) {
            int r12 = org.telegram.ui.ActionBar.j6.r1(f10 * 0.5f, -16777216);
            Paint paint = this.M;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(vaVar.getX(), vaVar.getY(), vaVar.getX() + vaVar.getWidth(), vaVar.getY() + vaVar.getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), paint);
        }
        draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(s0 s0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z10;
        int i7;
        boolean z11;
        String str2;
        int i10;
        CharSequence subSequence;
        int i11;
        this.L = s0Var;
        va vaVar = this.h;
        if ((s0Var == null || this.J != s0Var.a) && (valueAnimator = this.K) != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                vaVar.invalidate();
            }
        }
        long j3 = s0Var.c;
        org.telegram.ui.Components.i9 i9Var = this.x;
        org.telegram.ui.Components.t8 t8Var = this.y;
        int i12 = this.c;
        if (j3 >= 0) {
            TLRPC.User a22 = np.s1(i12).a2(Long.valueOf(s0Var.c));
            t8Var.r(a22);
            i9Var.f(a22, t8Var);
            str = q10.k(a22);
        } else {
            TLRPC.Chat M0 = np.s1(i12).M0(Long.valueOf(-s0Var.c));
            t8Var.q(M0);
            i9Var.f(M0, t8Var);
            str = M0 == null ? "" : M0.title;
        }
        int b10 = t.b(i12, (int) s0Var.g, 3);
        int b11 = t.b(i12, (int) s0Var.g, 4);
        int b12 = t.b(i12, (int) s0Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z12 = s0Var.b;
        String str3 = " ";
        boolean z13 = this.d;
        xh.l lVar = this.E;
        if (!z12 || s0Var.g > 0) {
            if (s0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + s0Var.h));
                z10 = z13;
                eq eqVar = new eq(0, new j0(getContext(), s0Var.h));
                eqVar.s = org.telegram.messenger.g0.L(1.0f);
                spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z13;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, lVar.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i7 = 33;
                spannableStringBuilder.setSpan(new l0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i7 = 33;
            }
            spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), i7);
            spannableStringBuilder.append((CharSequence) " ");
        } else {
            z10 = z13;
        }
        int b13 = t.b(i12, (int) s0Var.g, 1);
        int b14 = t.b(i12, (int) s0Var.g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = s0Var.f;
        if (tL_textWithEntities != null) {
            CharSequence j02 = gj.j0(tL_textWithEntities, false, false, lVar.getPaint());
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
            if (subSequence.length() <= b13 || s0Var.b) {
                i11 = 0;
            } else {
                i11 = 0;
                this.w = this.w.subSequence(0, b13);
            }
            CharSequence charSequence = this.w;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannable.getSpans(i11, charSequence.length(), org.telegram.ui.Components.p5.class);
                org.telegram.messenger.g6[] g6VarArr = (org.telegram.messenger.g6[]) spannable.getSpans(i11, this.w.length(), org.telegram.messenger.g6.class);
                if (p5VarArr.length + g6VarArr.length > b14 && !s0Var.b) {
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
                    while (i17 < g6VarArr.length) {
                        int i18 = i17;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(g6VarArr[i17])), Integer.valueOf(spannable.getSpanEnd(g6VarArr[i18]))));
                        i17 = i18 + 1;
                    }
                    Collections.sort(arrayList, new a3.c(23));
                    if (!(this.w instanceof SpannableStringBuilder)) {
                        this.w = new SpannableStringBuilder(this.w);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.w).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!s0Var.b) {
                this.w = org.telegram.messenger.g0.N2(this.w);
            }
            spannableStringBuilder.append(this.w);
        } else {
            z11 = true;
            str2 = " ";
            this.w = "";
        }
        lVar.setText(org.telegram.messenger.j6.m(spannableStringBuilder, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        this.e = null;
        this.n.setVisibility((!s0Var.b || s0Var.g > 0) ? 8 : 0);
        long j10 = s0Var.g;
        TextView textView = this.G;
        TextView textView2 = this.F;
        if (j10 > 0) {
            boolean z14 = j10 >= 250 ? z11 : false;
            this.a = z14;
            vaVar.setWillNotDraw(!z14);
            vaVar.invalidate();
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int L = org.telegram.messenger.g0.L(13.0f);
            int i19 = org.telegram.ui.ActionBar.j6.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(L);
            this.e = gradientDrawable;
            vaVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            float f10 = z10 ? 1.0f : 0.65f;
            this.f = f10;
            drawable2.setAlpha((int) (f10 * 255.0f));
            if (s0Var.e) {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(13.0f), org.telegram.ui.ActionBar.j6.r1(0.25f, b12)));
                textView2.setText(lb.X0(false, i5.c.l(s0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, org.telegram.messenger.g0.L(0.66f), 1.0f));
                eq eqVar2 = this.H[0];
                if (eqVar2 != null) {
                    eqVar2.a = this.b;
                }
            } else {
                textView.setVisibility(0);
                textView.setText(lb.X0(false, i5.c.l(s0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.I, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            }
        } else if (s0Var.b) {
            this.a = false;
            vaVar.setWillNotDraw(z11);
            ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(13.0f), -16777216);
            this.e = d02;
            vaVar.setBackground(d02);
            Drawable drawable3 = this.e;
            this.f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.m5.l(i12, s0Var.c));
            spannableStringBuilder2.append((CharSequence) str2);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) hd.M0(2131748825, null));
            spannableStringBuilder2.setSpan(new k0(0), length2, spannableStringBuilder2.length(), 33);
            this.r.setText(spannableStringBuilder2);
            this.s.setText(hd.M0(2131748828, null));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.a = false;
            vaVar.setWillNotDraw(true);
            lVar.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.j6.r1(0.6f, -16777216));
            this.e = null;
            vaVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        vaVar.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.b = z10;
        eq eqVar = this.H[0];
        if (eqVar == null || eqVar.a == z10) {
            return;
        }
        eqVar.a = z10;
        this.F.invalidate();
    }
}
