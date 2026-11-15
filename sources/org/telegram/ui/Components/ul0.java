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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class ul0 extends FrameLayout implements org.telegram.messenger.is {
    public static org.telegram.ui.ActionBar.t1 I;
    public final long E;
    public float F;
    public float G;
    public ValueAnimator H;
    public final int a;
    public final org.telegram.ui.ActionBar.e2 b;
    public final org.telegram.ui.ActionBar.e6 c;
    public final di.c1 d;
    public final di.i4 e;
    public LinearLayout f;
    public long h;
    public final ArrayList n;
    public final ArrayList r;
    public boolean s;
    public dh.c w;
    public gh.e x;
    public final Paint y;

    public ul0(Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.y = new Paint(1);
        this.a = i7;
        this.b = e2Var;
        this.c = e6Var;
        this.E = j3;
        ch.q0.n(e6Var);
        di.c1 c1Var = new di.c1(this, context, e6Var, 24);
        this.d = c1Var;
        c1Var.setPadding(org.telegram.messenger.g0.L(5.66f), 0, org.telegram.messenger.g0.L(5.66f), 0);
        c1Var.setClipToPadding(false);
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        c1Var.setLayoutManager(b0Var);
        di.i4 i4Var = new di.i4(this, 4);
        this.e = i4Var;
        c1Var.setAdapter(i4Var);
        c1Var.setOverScrollMode(2);
        addView(c1Var, c8.ja.c(-1.0f, -1));
        c1Var.setOnItemClickListener(new ml0(this, i7, e2Var, 0));
        c1Var.setOnItemLongClickListener(new bg.f0(this, i7, e2Var, e6Var, 4));
        nl0 nl0Var = new nl0();
        nl0Var.o(er.h);
        nl0Var.n(320L);
        c1Var.setItemAnimator(nl0Var);
        org.telegram.messenger.si.b0(i7).Z0(false);
        h(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public static void c(Context context, int i7, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.e6 e6Var) {
        CharSequence charSequence;
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        final int i10 = 0;
        boolean z10 = Q != null && (Q.getFragmentView() instanceof st0) && ((st0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        ?? v1Var = z10 ? new org.telegram.ui.ActionBar.v1(0, context, e6Var) : new AlertDialog$Builder(0, context, e6Var);
        String K1 = org.telegram.messenger.np.s1(i7).K1(reaction);
        ch.p0 d = ch.p0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20));
        if (TextUtils.isEmpty(d.f)) {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new p5(d.g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        } else {
            charSequence = org.telegram.messenger.j6.m(d.f, textPaint.getFontMetricsInt(), false, null, 0);
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.M0(TextUtils.isEmpty(K1) ? 2131745881 : 2131745869, null));
        org.telegram.ui.ActionBar.t1 t1Var = v1Var.a;
        t1Var.S = append;
        final ol0 ol0Var = new ol0(context, e6Var);
        ol0Var.setOnEditorActionListener(new pl0(ol0Var, i7, reaction, t1VarArr, currentFocus));
        org.telegram.messenger.si.b0(i7).M(org.telegram.messenger.g0.G0(), true);
        ol0Var.setTextSize(1, 18.0f);
        if (K1 == null) {
            K1 = "";
        }
        ol0Var.setText(K1);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(ol0Var, i11, e6Var);
        org.telegram.ui.ActionBar.q6.l(ol0Var, 34, org.telegram.ui.ActionBar.j6.Oi, e6Var);
        ol0Var.setHintText(org.telegram.messenger.hd.M0(2131745882, null));
        ol0Var.setSingleLine(true);
        ol0Var.setFocusable(true);
        ol0Var.setInputType(TLObject.FLAG_14);
        org.telegram.ui.ActionBar.q6.F(ol0Var, org.telegram.ui.ActionBar.j6.k6, org.telegram.ui.ActionBar.j6.l6, org.telegram.ui.ActionBar.j6.p7, e6Var);
        ol0Var.setImeOptions(6);
        ol0Var.setBackgroundDrawable(null);
        ol0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView, i11, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.hd.M0(2131745880, null));
        f10.addView(textView, c8.ja.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(ol0Var, c8.ja.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        v1Var.o(f10);
        t1Var.a = org.telegram.messenger.g0.L(292.0f);
        int i12 = 8;
        v1Var.k(org.telegram.messenger.hd.M0(2131745946, null), new ai.q1(ol0Var, i7, reaction, i12));
        v1Var.h(org.telegram.messenger.hd.M0(2131752589, null), new rb0(4));
        if (z10) {
            I = t1Var;
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new m0(currentFocus, 7));
            I.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.ll0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i10) {
                        case 0:
                            ol0 ol0Var2 = ol0Var;
                            ol0Var2.requestFocus();
                            org.telegram.messenger.g0.J3(ol0Var2);
                            break;
                        default:
                            ol0 ol0Var3 = ol0Var;
                            ol0Var3.requestFocus();
                            org.telegram.messenger.g0.J3(ol0Var3);
                            break;
                    }
                }
            });
            I.r(250L);
        } else {
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new m0(ol0Var, i12));
            final int i13 = 1;
            t1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.ll0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            ol0 ol0Var2 = ol0Var;
                            ol0Var2.requestFocus();
                            org.telegram.messenger.g0.J3(ol0Var2);
                            break;
                        default:
                            ol0 ol0Var3 = ol0Var;
                            ol0Var3.requestFocus();
                            org.telegram.messenger.g0.J3(ol0Var3);
                            break;
                    }
                }
            });
            t1VarArr[0].show();
        }
        t1VarArr[0].k0 = false;
        ol0Var.setSelection(ol0Var.getText().length());
    }

    public final boolean a() {
        return !this.r.isEmpty() || this.s;
    }

    public abstract void b(boolean z10);

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

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.h3) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.E) {
                h(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.i4) {
            invalidate();
            org.telegram.messenger.g0.d0(this.d, new pg.c(0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.F < 0.5f) {
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

    public final void e(ch.p0 p0Var, boolean z10) {
        di.i4 i4Var = this.e;
        if (p0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            i4Var.f();
            return;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i7 >= arrayList.size()) {
                return;
            }
            rl0 rl0Var = (rl0) arrayList.get(i7);
            long j3 = p0Var.h;
            ch.p0 p0Var2 = rl0Var.a;
            long j10 = p0Var2.h;
            if (j3 == j10) {
                this.h = j10;
                if (z10) {
                    f(p0Var2);
                }
                i4Var.f();
                this.d.v0(i7);
                return;
            }
            i7++;
        }
    }

    public abstract boolean f(ch.p0 p0Var);

    public final void g(boolean z10) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            this.H = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, z10 ? 1.0f : 0.0f);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new f60(this, 14));
        this.H.setInterpolator(er.h);
        this.H.setDuration(320L);
        this.H.addListener(new org.telegram.ui.nn(19, this, z10));
        this.H.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.F);
    }

    public void h(boolean z10) {
        boolean z11;
        int i7;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList arrayList2 = this.r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = this.a;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i10);
        long j3 = this.E;
        TLRPC.TL_messages_savedReactionsTags I1 = s12.I1(j3, false);
        if (I1 != null) {
            int i11 = 0;
            z11 = false;
            while (i11 < I1.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = I1.tags.get(i11);
                ch.p0 d = ch.p0.d(tL_savedReactionTag.reaction);
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = I1;
                if (hashSet.contains(Long.valueOf(d.h)) || (j3 != 0 && tL_savedReactionTag.count <= 0)) {
                    i7 = i11;
                } else {
                    int i12 = tL_savedReactionTag.count;
                    String K1 = j3 != 0 ? s12.K1(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    rl0 rl0Var = new rl0();
                    rl0Var.a = d;
                    rl0Var.b = i12;
                    rl0Var.c = K1;
                    rl0Var.d = K1 == null ? -233 : K1.hashCode();
                    i7 = i11;
                    if (rl0Var.a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(rl0Var);
                    hashSet.add(Long.valueOf(d.h));
                }
                i11 = i7 + 1;
                I1 = tL_messages_savedReactionsTags;
            }
        } else {
            z11 = false;
        }
        if (!z11 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        di.i4 i4Var = this.e;
        if (z10) {
            v4.o.c(new ql0(this), true).c(i4Var);
        } else {
            i4Var.f();
        }
        boolean q10 = org.telegram.messenger.m10.i(i10).q();
        this.s = !q10;
        if (q10) {
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                if (z10) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new wa0(this, 21)).start();
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
            linearLayout2.setOnClickListener(new y60(this, 10));
            this.f.setOrientation(0);
            c8.na.b(this.f, 0.03f, 1.25f);
            org.telegram.ui.r9 r9Var = new org.telegram.ui.r9(this, getContext());
            int i13 = org.telegram.ui.ActionBar.j6.o6;
            org.telegram.ui.ActionBar.e6 e6Var = this.c;
            org.telegram.ui.ActionBar.q6.U(r9Var, i13, e6Var);
            r9Var.setTextSize(1, 12.0f);
            r9Var.setTypeface(org.telegram.messenger.g0.o());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i14 = org.telegram.ui.ActionBar.j6.Xc;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mutate.setColorFilter(new PorterDuffColorFilter(i14, mode));
            eq eqVar = new eq(0, mutate);
            eqVar.s = 0.0f;
            eqVar.r = 0.0f;
            eqVar.I = 0.94f;
            eqVar.J = 0.94f;
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(eqVar, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.hd.M0(2131754381, null));
            r9Var.setText(spannableStringBuilder);
            r9Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
            TextView textView = new TextView(getContext());
            org.telegram.ui.ActionBar.q6.U(textView, i13, e6Var);
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131754380, null));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(i14, mode));
            eq eqVar2 = new eq(0, mutate2);
            eqVar2.I = 0.76f;
            eqVar2.J = 0.76f;
            eqVar2.r = -org.telegram.messenger.g0.L(1.0f);
            eqVar2.s = org.telegram.messenger.g0.L(1.0f);
            spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(org.telegram.messenger.g0.L(5.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
            this.f.addView(r9Var, c8.ja.r(-2, -2, 16));
            this.f.addView(textView, c8.ja.r(-2, -2, 16));
            this.f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, 0, 0);
            this.f.setClipToPadding(false);
            addView(this.f, c8.ja.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
        }
        if (z10) {
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
        org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.h3);
        org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.h3);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.i4);
    }

    public void setShown(float f10) {
        this.F = f10;
        di.c1 c1Var = this.d;
        c1Var.setPivotX(c1Var.getWidth() / 2.0f);
        c1Var.setPivotY(0.0f);
        c1Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        c1Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        setAlpha(f10);
        invalidate();
    }
}
