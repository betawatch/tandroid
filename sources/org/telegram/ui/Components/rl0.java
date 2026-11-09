package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class rl0 extends FrameLayout implements org.telegram.messenger.ls {
    public static org.telegram.ui.ActionBar.u1 H;
    public final long D;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int a;
    public final org.telegram.ui.ActionBar.f2 b;
    public final org.telegram.ui.ActionBar.g6 c;
    public final bi.q1 d;
    public final bi.k5 e;
    public LinearLayout f;
    public long h;
    public final ArrayList n;
    public final ArrayList r;
    public boolean s;
    public dh.c w;
    public gh.e x;
    public final Paint y;

    public rl0(Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, long j3, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.y = new Paint(1);
        this.a = i7;
        this.b = f2Var;
        this.c = g6Var;
        this.D = j3;
        ch.p0.n(g6Var);
        bi.q1 q1Var = new bi.q1(this, context, g6Var, 24);
        this.d = q1Var;
        q1Var.setPadding(org.telegram.messenger.g0.L(5.66f), 0, org.telegram.messenger.g0.L(5.66f), 0);
        q1Var.setClipToPadding(false);
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        q1Var.setLayoutManager(b0Var);
        bi.k5 k5Var = new bi.k5(this, 4);
        this.e = k5Var;
        q1Var.setAdapter(k5Var);
        q1Var.setOverScrollMode(2);
        addView(q1Var, c8.ha.c(-1.0f, -1));
        q1Var.setOnItemClickListener(new il0(this, i7, f2Var, 0));
        q1Var.setOnItemLongClickListener(new bg.f0(this, i7, f2Var, g6Var, 4));
        kl0 kl0Var = new kl0();
        kl0Var.o(xq.h);
        kl0Var.n(320L);
        q1Var.setItemAnimator(kl0Var);
        org.telegram.messenger.ui.b0(i7).Z0(false);
        h(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public static void c(Context context, int i7, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.g6 g6Var) {
        CharSequence charSequence;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        final int i10 = 0;
        boolean z9 = Q != null && (Q.getFragmentView() instanceof tt0) && ((tt0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        ?? w1Var = z9 ? new org.telegram.ui.ActionBar.w1(0, context, g6Var) : new AlertDialog$Builder(0, context, g6Var);
        String K1 = org.telegram.messenger.qp.s1(i7).K1(reaction);
        ch.o0 d = ch.o0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20));
        if (TextUtils.isEmpty(d.f)) {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new r5(d.g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        } else {
            charSequence = org.telegram.messenger.i6.m(d.f, textPaint.getFontMetricsInt(), false, null, 0);
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.id.M0(TextUtils.isEmpty(K1) ? 2131745881 : 2131745869, null));
        org.telegram.ui.ActionBar.u1 u1Var = w1Var.a;
        u1Var.R = append;
        final ll0 ll0Var = new ll0(context, g6Var);
        ll0Var.setOnEditorActionListener(new ml0(ll0Var, i7, reaction, u1VarArr, currentFocus));
        org.telegram.messenger.ui.b0(i7).M(org.telegram.messenger.g0.G0(), true);
        ll0Var.setTextSize(1, 18.0f);
        if (K1 == null) {
            K1 = "";
        }
        ll0Var.setText(K1);
        int i11 = org.telegram.ui.ActionBar.l6.j5;
        org.telegram.ui.ActionBar.s6.U(ll0Var, i11, g6Var);
        org.telegram.ui.ActionBar.s6.l(ll0Var, 34, org.telegram.ui.ActionBar.l6.Li, g6Var);
        ll0Var.setHintText(org.telegram.messenger.id.M0(2131745882, null));
        ll0Var.setSingleLine(true);
        ll0Var.setFocusable(true);
        ll0Var.setInputType(TLObject.FLAG_14);
        org.telegram.ui.ActionBar.s6.F(ll0Var, org.telegram.ui.ActionBar.l6.k6, org.telegram.ui.ActionBar.l6.l6, org.telegram.ui.ActionBar.l6.p7, g6Var);
        ll0Var.setImeOptions(6);
        ll0Var.setBackgroundDrawable(null);
        ll0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.s6.U(textView, i11, g6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.id.M0(2131745880, null));
        f10.addView(textView, c8.ha.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(ll0Var, c8.ha.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        w1Var.o(f10);
        u1Var.a = org.telegram.messenger.g0.L(292.0f);
        w1Var.k(org.telegram.messenger.id.M0(2131745946, null), new jg.a2(ll0Var, i7, reaction, 7));
        w1Var.h(org.telegram.messenger.id.M0(2131752589, null), new jl0(i10));
        if (z9) {
            H = u1Var;
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new p0(currentFocus, 8));
            H.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.hl0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i10) {
                        case 0:
                            ll0 ll0Var2 = ll0Var;
                            ll0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(ll0Var2);
                            break;
                        default:
                            ll0 ll0Var3 = ll0Var;
                            ll0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(ll0Var3);
                            break;
                    }
                }
            });
            H.r(250L);
        } else {
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new p0(ll0Var, 9));
            final int i12 = 1;
            u1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.hl0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            ll0 ll0Var2 = ll0Var;
                            ll0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(ll0Var2);
                            break;
                        default:
                            ll0 ll0Var3 = ll0Var;
                            ll0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(ll0Var3);
                            break;
                    }
                }
            });
            u1VarArr[0].show();
        }
        u1VarArr[0].j0 = false;
        ll0Var.setSelection(ll0Var.getText().length());
    }

    public final boolean a() {
        return !this.r.isEmpty() || this.s;
    }

    public abstract void b(boolean z9);

    public final void d(dh.c cVar, gh.e eVar) {
        this.w = cVar;
        this.x = eVar;
        float N = org.telegram.messenger.g0.N(1.0f);
        Paint paint = this.y;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            fh.g c10 = cVar.c(linearLayout, null, false);
            c10.p(c8.g0.o(this.c));
            c10.s(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(9.0f));
            c10.u(org.telegram.messenger.g0.L(5.0f));
            c10.q(org.telegram.messenger.g0.L(4.0f));
            linearLayout.setBackground(c10);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.h3) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.D) {
                h(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.i4) {
            invalidate();
            org.telegram.messenger.g0.d0(this.d, new pg.c(0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.E < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout;
        if (view != this.d || (linearLayout = this.f) == null) {
            return super.drawChild(canvas, view, j3);
        }
        if (linearLayout.getAlpha() >= 1.0f) {
            return false;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f.getAlpha()) * 255.0f), 31);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e(ch.o0 o0Var, boolean z9) {
        bi.k5 k5Var = this.e;
        if (o0Var == null) {
            this.h = 0L;
            if (z9) {
                f(null);
            }
            k5Var.f();
            return;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i7 >= arrayList.size()) {
                return;
            }
            ol0 ol0Var = (ol0) arrayList.get(i7);
            long j3 = o0Var.h;
            ch.o0 o0Var2 = ol0Var.a;
            long j10 = o0Var2.h;
            if (j3 == j10) {
                this.h = j10;
                if (z9) {
                    f(o0Var2);
                }
                k5Var.f();
                this.d.v0(i7);
                return;
            }
            i7++;
        }
    }

    public abstract boolean f(ch.o0 o0Var);

    public final void g(boolean z9) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            this.G = null;
            valueAnimator.cancel();
        }
        if (z9) {
            setVisibility(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, z9 ? 1.0f : 0.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new d60(this, 14));
        this.G.setInterpolator(xq.h);
        this.G.setDuration(320L);
        this.G.addListener(new t9(18, this, z9));
        this.G.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.E);
    }

    public void h(boolean z9) {
        boolean z10;
        int i7;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList arrayList2 = this.r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = this.a;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
        long j3 = this.D;
        TLRPC.TL_messages_savedReactionsTags I1 = s12.I1(j3, false);
        if (I1 != null) {
            int i11 = 0;
            z10 = false;
            while (i11 < I1.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = I1.tags.get(i11);
                ch.o0 d = ch.o0.d(tL_savedReactionTag.reaction);
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = I1;
                if (hashSet.contains(Long.valueOf(d.h)) || (j3 != 0 && tL_savedReactionTag.count <= 0)) {
                    i7 = i11;
                } else {
                    int i12 = tL_savedReactionTag.count;
                    String K1 = j3 != 0 ? s12.K1(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    ol0 ol0Var = new ol0();
                    ol0Var.a = d;
                    ol0Var.b = i12;
                    ol0Var.c = K1;
                    ol0Var.d = K1 == null ? -233 : K1.hashCode();
                    i7 = i11;
                    if (ol0Var.a.h == this.h) {
                        z10 = true;
                    }
                    arrayList2.add(ol0Var);
                    hashSet.add(Long.valueOf(d.h));
                }
                i11 = i7 + 1;
                I1 = tL_messages_savedReactionsTags;
            }
        } else {
            z10 = false;
        }
        if (!z10 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        bi.k5 k5Var = this.e;
        if (z9) {
            v4.o.c(new nl0(this), true).c(k5Var);
        } else {
            k5Var.f();
        }
        boolean q10 = org.telegram.messenger.p10.i(i10).q();
        this.s = !q10;
        if (q10) {
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                if (z9) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new pb0(this, 18)).start();
                    return;
                } else {
                    linearLayout.setAlpha(1.0f);
                    this.f.setVisibility(0);
                    return;
                }
            }
            return;
        }
        if (this.f == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.f = linearLayout2;
            linearLayout2.setOnClickListener(new ma0(this, 9));
            this.f.setOrientation(0);
            c8.ka.b(this.f, 0.03f, 1.25f);
            org.telegram.ui.q9 q9Var = new org.telegram.ui.q9(this, getContext());
            int i13 = org.telegram.ui.ActionBar.l6.o6;
            org.telegram.ui.ActionBar.g6 g6Var = this.c;
            org.telegram.ui.ActionBar.s6.U(q9Var, i13, g6Var);
            q9Var.setTextSize(1, 12.0f);
            q9Var.setTypeface(org.telegram.messenger.g0.o());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i14 = org.telegram.ui.ActionBar.l6.Uc;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mutate.setColorFilter(new PorterDuffColorFilter(i14, mode));
            wp wpVar = new wp(0, mutate);
            wpVar.s = 0.0f;
            wpVar.r = 0.0f;
            wpVar.H = 0.94f;
            wpVar.I = 0.94f;
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(wpVar, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.id.M0(2131754381, null));
            q9Var.setText(spannableStringBuilder);
            q9Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
            TextView textView = new TextView(getContext());
            org.telegram.ui.ActionBar.s6.U(textView, i13, g6Var);
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131754380, null));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(i14, mode));
            wp wpVar2 = new wp(0, mutate2);
            wpVar2.H = 0.76f;
            wpVar2.I = 0.76f;
            wpVar2.r = -org.telegram.messenger.g0.L(1.0f);
            wpVar2.s = org.telegram.messenger.g0.L(1.0f);
            spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(org.telegram.messenger.g0.L(5.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
            this.f.addView(q9Var, c8.ha.r(-2, -2, 16));
            this.f.addView(textView, c8.ha.r(-2, -2, 16));
            this.f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, 0, 0);
            this.f.setClipToPadding(false);
            addView(this.f, c8.ha.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
        }
        if (z9) {
            return;
        }
        this.f.setVisibility(0);
        this.f.setAlpha(0.0f);
        this.f.animate().alpha(1.0f).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.a;
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.h3);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.h3);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.i4);
    }

    public void setShown(float f10) {
        this.E = f10;
        bi.q1 q1Var = this.d;
        q1Var.setPivotX(q1Var.getWidth() / 2.0f);
        q1Var.setPivotY(0.0f);
        q1Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        q1Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        setAlpha(f10);
        invalidate();
    }
}
