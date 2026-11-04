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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class tl0 extends FrameLayout implements org.telegram.messenger.cs {
    public static org.telegram.ui.ActionBar.s1 I;
    public final long E;
    public float F;
    public float G;
    public ValueAnimator H;
    public final int a;
    public final org.telegram.ui.ActionBar.d2 b;
    public final org.telegram.ui.ActionBar.e6 c;
    public final ci.j1 d;
    public final ci.r4 e;
    public LinearLayout f;
    public long h;
    public final ArrayList n;
    public final ArrayList r;
    public boolean s;
    public eh.c w;
    public hh.e x;
    public final Paint y;

    public tl0(Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.y = new Paint(1);
        this.a = i3;
        this.b = d2Var;
        this.c = e6Var;
        this.E = j10;
        dh.o0.n(e6Var);
        ci.j1 j1Var = new ci.j1(this, context, e6Var, 24);
        this.d = j1Var;
        j1Var.setPadding(org.telegram.messenger.g0.L(5.66f), 0, org.telegram.messenger.g0.L(5.66f), 0);
        j1Var.setClipToPadding(false);
        u4.b0 b0Var = new u4.b0();
        b0Var.j1(0);
        j1Var.setLayoutManager(b0Var);
        ci.r4 r4Var = new ci.r4(this, 4);
        this.e = r4Var;
        j1Var.setAdapter(r4Var);
        j1Var.setOverScrollMode(2);
        addView(j1Var, b8.mf.c(-1.0f, -1));
        j1Var.setOnItemClickListener(new ll0(this, i3, d2Var, 0));
        j1Var.setOnItemLongClickListener(new cg.e0(this, i3, d2Var, e6Var, 4));
        ml0 ml0Var = new ml0();
        ml0Var.o(xq.h);
        ml0Var.n(320L);
        j1Var.setItemAnimator(ml0Var);
        org.telegram.messenger.li.b0(i3).Z0(false);
        h(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public static void c(Context context, int i3, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.e6 e6Var) {
        CharSequence charSequence;
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        final int i10 = 0;
        boolean z10 = Q != null && (Q.getFragmentView() instanceof qt0) && ((qt0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        ?? u1Var = z10 ? new org.telegram.ui.ActionBar.u1(0, context, e6Var) : new AlertDialog$Builder(0, context, e6Var);
        String K1 = org.telegram.messenger.hp.s1(i3).K1(reaction);
        dh.n0 d = dh.n0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20));
        if (TextUtils.isEmpty(d.f)) {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new p5(d.g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        } else {
            charSequence = org.telegram.messenger.i6.m(d.f, textPaint.getFontMetricsInt(), false, null, 0);
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.bd.M0(TextUtils.isEmpty(K1) ? 2131745891 : 2131745879, null));
        org.telegram.ui.ActionBar.s1 s1Var = u1Var.a;
        s1Var.S = append;
        final nl0 nl0Var = new nl0(context, e6Var);
        nl0Var.setOnEditorActionListener(new ol0(nl0Var, i3, reaction, s1VarArr, currentFocus));
        org.telegram.messenger.li.b0(i3).M(org.telegram.messenger.g0.G0(), true);
        nl0Var.setTextSize(1, 18.0f);
        if (K1 == null) {
            K1 = "";
        }
        nl0Var.setText(K1);
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(nl0Var, i11, e6Var);
        org.telegram.ui.ActionBar.r6.m(nl0Var, 34, org.telegram.ui.ActionBar.k6.Li, e6Var);
        nl0Var.setHintText(org.telegram.messenger.bd.M0(2131745892, null));
        nl0Var.setSingleLine(true);
        nl0Var.setFocusable(true);
        nl0Var.setInputType(TLObject.FLAG_14);
        org.telegram.ui.ActionBar.r6.G(nl0Var, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, e6Var);
        nl0Var.setImeOptions(6);
        nl0Var.setBackgroundDrawable(null);
        nl0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, i11, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.bd.M0(2131745890, null));
        f10.addView(textView, b8.mf.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(nl0Var, b8.mf.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        u1Var.o(f10);
        s1Var.a = org.telegram.messenger.g0.L(292.0f);
        int i12 = 9;
        u1Var.k(org.telegram.messenger.bd.M0(2131745956, null), new k2.y(nl0Var, i3, reaction, i12));
        u1Var.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(1));
        if (z10) {
            I = s1Var;
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new p0(currentFocus, 8));
            I.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.kl0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i10) {
                        case 0:
                            nl0 nl0Var2 = nl0Var;
                            nl0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(nl0Var2);
                            break;
                        default:
                            nl0 nl0Var3 = nl0Var;
                            nl0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(nl0Var3);
                            break;
                    }
                }
            });
            I.r(250L);
        } else {
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new p0(nl0Var, i12));
            final int i13 = 1;
            s1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.kl0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            nl0 nl0Var2 = nl0Var;
                            nl0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(nl0Var2);
                            break;
                        default:
                            nl0 nl0Var3 = nl0Var;
                            nl0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(nl0Var3);
                            break;
                    }
                }
            });
            s1VarArr[0].show();
        }
        s1VarArr[0].k0 = false;
        nl0Var.setSelection(nl0Var.getText().length());
    }

    public final boolean a() {
        return !this.r.isEmpty() || this.s;
    }

    public abstract void b(boolean z10);

    public final void d(eh.c cVar, hh.e eVar) {
        this.w = cVar;
        this.x = eVar;
        float N = org.telegram.messenger.g0.N(1.0f);
        Paint paint = this.y;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            gh.g c2 = cVar.c(linearLayout, null, false);
            c2.p(b8.cd.p(this.c));
            c2.s(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(9.0f));
            c2.u(org.telegram.messenger.g0.L(5.0f));
            c2.q(org.telegram.messenger.g0.L(4.0f));
            linearLayout.setBackground(c2);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.h3) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.E) {
                h(true);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.i4) {
            invalidate();
            org.telegram.messenger.g0.d0(this.d, new ei.e(27));
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout;
        if (view != this.d || (linearLayout = this.f) == null) {
            return super.drawChild(canvas, view, j10);
        }
        if (linearLayout.getAlpha() >= 1.0f) {
            return false;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f.getAlpha()) * 255.0f), 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e(dh.n0 n0Var, boolean z10) {
        ci.r4 r4Var = this.e;
        if (n0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            r4Var.f();
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i3 >= arrayList.size()) {
                return;
            }
            ql0 ql0Var = (ql0) arrayList.get(i3);
            long j10 = n0Var.h;
            dh.n0 n0Var2 = ql0Var.a;
            long j11 = n0Var2.h;
            if (j10 == j11) {
                this.h = j11;
                if (z10) {
                    f(n0Var2);
                }
                r4Var.f();
                this.d.v0(i3);
                return;
            }
            i3++;
        }
    }

    public abstract boolean f(dh.n0 n0Var);

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
        ofFloat.addUpdateListener(new y50(this, 15));
        this.H.setInterpolator(xq.h);
        this.H.setDuration(320L);
        this.H.addListener(new s9(18, this, z10));
        this.H.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.F);
    }

    public void h(boolean z10) {
        boolean z11;
        int i3;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList arrayList2 = this.r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = this.a;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i10);
        long j10 = this.E;
        TLRPC.TL_messages_savedReactionsTags I1 = s12.I1(j10, false);
        if (I1 != null) {
            int i11 = 0;
            z11 = false;
            while (i11 < I1.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = I1.tags.get(i11);
                dh.n0 d = dh.n0.d(tL_savedReactionTag.reaction);
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = I1;
                if (hashSet.contains(Long.valueOf(d.h)) || (j10 != 0 && tL_savedReactionTag.count <= 0)) {
                    i3 = i11;
                } else {
                    int i12 = tL_savedReactionTag.count;
                    String K1 = j10 != 0 ? s12.K1(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    ql0 ql0Var = new ql0();
                    ql0Var.a = d;
                    ql0Var.b = i12;
                    ql0Var.c = K1;
                    ql0Var.d = K1 == null ? -233 : K1.hashCode();
                    i3 = i11;
                    if (ql0Var.a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(ql0Var);
                    hashSet.add(Long.valueOf(d.h));
                }
                i11 = i3 + 1;
                I1 = tL_messages_savedReactionsTags;
            }
        } else {
            z11 = false;
        }
        if (!z11 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        ci.r4 r4Var = this.e;
        if (z10) {
            u4.o.c(new pl0(this), true).c(r4Var);
        } else {
            r4Var.f();
        }
        boolean q10 = org.telegram.messenger.h10.i(i10).q();
        this.s = !q10;
        if (q10) {
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                if (z10) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new jb0(this, 20)).start();
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
            linearLayout2.setOnClickListener(new ga0(this, 10));
            this.f.setOrientation(0);
            b8.pf.b(this.f, 0.03f, 1.25f);
            org.telegram.ui.q9 q9Var = new org.telegram.ui.q9(this, getContext());
            int i13 = org.telegram.ui.ActionBar.k6.o6;
            org.telegram.ui.ActionBar.e6 e6Var = this.c;
            org.telegram.ui.ActionBar.r6.V(q9Var, i13, e6Var);
            q9Var.setTextSize(1, 12.0f);
            q9Var.setTypeface(org.telegram.messenger.g0.o());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i14 = org.telegram.ui.ActionBar.k6.Uc;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mutate.setColorFilter(new PorterDuffColorFilter(i14, mode));
            wp wpVar = new wp(0, mutate);
            wpVar.s = 0.0f;
            wpVar.r = 0.0f;
            wpVar.I = 0.94f;
            wpVar.J = 0.94f;
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(wpVar, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.bd.M0(2131754381, null));
            q9Var.setText(spannableStringBuilder);
            q9Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
            TextView textView = new TextView(getContext());
            org.telegram.ui.ActionBar.r6.V(textView, i13, e6Var);
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131754380, null));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(i14, mode));
            wp wpVar2 = new wp(0, mutate2);
            wpVar2.I = 0.76f;
            wpVar2.J = 0.76f;
            wpVar2.r = -org.telegram.messenger.g0.L(1.0f);
            wpVar2.s = org.telegram.messenger.g0.L(1.0f);
            spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(org.telegram.messenger.g0.L(5.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
            this.f.addView(q9Var, b8.mf.r(-2, -2, 16));
            this.f.addView(textView, b8.mf.r(-2, -2, 16));
            this.f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, 0, 0);
            this.f.setClipToPadding(false);
            addView(this.f, b8.mf.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
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
        int i3 = this.a;
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.h3);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.a;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.h3);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.i4);
    }

    public void setShown(float f10) {
        this.F = f10;
        ci.j1 j1Var = this.d;
        j1Var.setPivotX(j1Var.getWidth() / 2.0f);
        j1Var.setPivotY(0.0f);
        j1Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        j1Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        setAlpha(f10);
        invalidate();
    }
}
