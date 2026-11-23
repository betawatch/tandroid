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
import c8.na;
import di.pb;
import di.za;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.w60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class m0 extends FrameLayout implements w60 {
    public final xh.l E;
    public final TextView F;
    public final TextView G;
    public final kq[] H;
    public final kq[] I;
    public int J;
    public ValueAnimator K;
    public r0 L;
    public final Paint M;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final za h;
    public final LinearLayout n;
    public final xh.l r;
    public final xh.l s;
    public CharSequence w;
    public final p9 x;
    public final org.telegram.ui.Components.a9 y;

    public m0(int i7, Context context, boolean z10) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.H = new kq[1];
        this.I = new kq[1];
        this.M = new Paint(1);
        this.c = i7;
        this.d = z10;
        za zaVar = new za(this, context);
        this.h = zaVar;
        zaVar.setOrientation(0);
        addView(zaVar, na.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.y = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        p9 p9Var = new p9(context);
        this.x = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        zaVar.addView(p9Var, na.q(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        zaVar.addView(linearLayout, na.q(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, na.o(-2, -2));
        xh.l lVar = new xh.l(context);
        this.r = lVar;
        lVar.setTextColor(-1);
        lVar.setTextSize(1, 14.0f);
        lVar.setGravity(3);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        linearLayout2.addView(lVar, na.q(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        xh.l lVar2 = new xh.l(context);
        this.s = lVar2;
        lVar2.setTextColor(org.telegram.ui.ActionBar.n6.r1(0.55f, -1));
        lVar2.setTextSize(1, 12.0f);
        lVar2.setGravity(5);
        linearLayout2.addView(lVar2, na.q(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        xh.l lVar3 = new xh.l(context);
        this.E = lVar3;
        lVar3.setTextColor(-1);
        lVar3.setTextSize(1, 14.0f);
        lVar3.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.n6.r1(0.6f, -16777216));
        ks.i(lVar3);
        linearLayout.addView(lVar3, na.o(-2, -2));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        textView.setVisibility(8);
        zaVar.addView(textView, na.q(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        zaVar.addView(textView2, na.q(-2, -2, 0.0f, 85, 0, 3, 10, 0));
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
        r0 r0Var = this.L;
        if (r0Var == null || this.e == null) {
            return;
        }
        this.J = r0Var.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 16));
        this.K.addListener(new ai.g0(this, 10));
        this.K.setDuration(350L);
        this.K.setInterpolator(kr.h);
        this.K.start();
    }

    @Override // org.telegram.ui.Components.w60
    public final void f(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // org.telegram.ui.Components.w60
    public final void g(Canvas canvas, float f10) {
        za zaVar = this.h;
        if (zaVar.getBackground() == null) {
            int r12 = org.telegram.ui.ActionBar.n6.r1(f10 * 0.5f, -16777216);
            Paint paint = this.M;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(zaVar.getX(), zaVar.getY(), zaVar.getX() + zaVar.getWidth(), zaVar.getY() + zaVar.getHeight());
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

    public void set(r0 r0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z10;
        int i7;
        boolean z11;
        String str2;
        int i10;
        CharSequence subSequence;
        int i11;
        this.L = r0Var;
        za zaVar = this.h;
        if ((r0Var == null || this.J != r0Var.a) && (valueAnimator = this.K) != null) {
            valueAnimator.cancel();
            this.K = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                zaVar.invalidate();
            }
        }
        long j3 = r0Var.c;
        p9 p9Var = this.x;
        org.telegram.ui.Components.a9 a9Var = this.y;
        int i12 = this.c;
        if (j3 >= 0) {
            TLRPC.User c22 = mp.u1(i12).c2(Long.valueOf(r0Var.c));
            a9Var.r(c22);
            p9Var.f(c22, a9Var);
            str = n10.l(c22);
        } else {
            TLRPC.Chat O0 = mp.u1(i12).O0(Long.valueOf(-r0Var.c));
            a9Var.q(O0);
            p9Var.f(O0, a9Var);
            str = O0 == null ? "" : O0.title;
        }
        int b10 = t.b(i12, (int) r0Var.g, 3);
        int b11 = t.b(i12, (int) r0Var.g, 4);
        int b12 = t.b(i12, (int) r0Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z12 = r0Var.b;
        String str3 = " ";
        boolean z13 = this.d;
        xh.l lVar = this.E;
        if (!z12 || r0Var.g > 0) {
            if (r0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + r0Var.h));
                z10 = z13;
                kq kqVar = new kq(0, new i0(getContext(), r0Var.h));
                kqVar.s = org.telegram.messenger.g0.L(1.0f);
                spannableStringBuilder.setSpan(kqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z13;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, lVar.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i7 = 33;
                spannableStringBuilder.setSpan(new k0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i7 = 33;
            }
            spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), i7);
            spannableStringBuilder.append((CharSequence) " ");
        } else {
            z10 = z13;
        }
        int b13 = t.b(i12, (int) r0Var.g, 1);
        int b14 = t.b(i12, (int) r0Var.g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = r0Var.f;
        if (tL_textWithEntities != null) {
            CharSequence j02 = fj.j0(tL_textWithEntities, false, false, lVar.getPaint());
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
            if (subSequence.length() <= b13 || r0Var.b) {
                i11 = 0;
            } else {
                i11 = 0;
                this.w = this.w.subSequence(0, b13);
            }
            CharSequence charSequence = this.w;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spannable.getSpans(i11, charSequence.length(), org.telegram.ui.Components.x5.class);
                org.telegram.messenger.g6[] g6VarArr = (org.telegram.messenger.g6[]) spannable.getSpans(i11, this.w.length(), org.telegram.messenger.g6.class);
                if (x5VarArr.length + g6VarArr.length > b14 && !r0Var.b) {
                    ArrayList arrayList = new ArrayList();
                    int i15 = 0;
                    while (i15 < x5VarArr.length) {
                        org.telegram.ui.Components.x5[] x5VarArr2 = x5VarArr;
                        int i16 = i15;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(x5VarArr2[i15])), Integer.valueOf(spannable.getSpanEnd(x5VarArr2[i16]))));
                        i15 = i16 + 1;
                        x5VarArr = x5VarArr2;
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
            if (!r0Var.b) {
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
        this.n.setVisibility((!r0Var.b || r0Var.g > 0) ? 8 : 0);
        long j10 = r0Var.g;
        TextView textView = this.G;
        TextView textView2 = this.F;
        if (j10 > 0) {
            boolean z14 = j10 >= 250 ? z11 : false;
            this.a = z14;
            zaVar.setWillNotDraw(!z14);
            zaVar.invalidate();
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int L = org.telegram.messenger.g0.L(13.0f);
            int i19 = org.telegram.ui.ActionBar.n6.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(L);
            this.e = gradientDrawable;
            zaVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            float f10 = z10 ? 1.0f : 0.65f;
            this.f = f10;
            drawable2.setAlpha((int) (f10 * 255.0f));
            if (r0Var.e) {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(13.0f), org.telegram.ui.ActionBar.n6.r1(0.25f, b12)));
                textView2.setText(pb.Y0(false, i5.c.l(r0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, org.telegram.messenger.g0.L(0.66f), 1.0f));
                kq kqVar2 = this.H[0];
                if (kqVar2 != null) {
                    kqVar2.a = this.b;
                }
            } else {
                textView.setVisibility(0);
                textView.setText(pb.Y0(false, i5.c.l(r0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.I, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            }
        } else if (r0Var.b) {
            this.a = false;
            zaVar.setWillNotDraw(z11);
            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(13.0f), -16777216);
            this.e = d02;
            zaVar.setBackground(d02);
            Drawable drawable3 = this.e;
            this.f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            lVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.n5.l(i12, r0Var.c));
            spannableStringBuilder2.append((CharSequence) str2);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) gd.N0(2131748632, null));
            spannableStringBuilder2.setSpan(new j0(0), length2, spannableStringBuilder2.length(), 33);
            this.r.setText(spannableStringBuilder2);
            this.s.setText(gd.N0(2131748635, null));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.a = false;
            zaVar.setWillNotDraw(true);
            lVar.setShadowLayer(org.telegram.messenger.g0.L(2.5f), 0.0f, org.telegram.messenger.g0.L(1.5f), org.telegram.ui.ActionBar.n6.r1(0.6f, -16777216));
            this.e = null;
            zaVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        zaVar.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.b = z10;
        kq kqVar = this.H[0];
        if (kqVar == null || kqVar.a == z10) {
            return;
        }
        kqVar.a = z10;
        this.F.invalidate();
    }

    @Override // org.telegram.ui.Components.w60
    public /* bridge */ /* synthetic */ void setScrimHidden(boolean z10) {
        org.telegram.ui.Cells.c0.d(this, z10);
    }
}
