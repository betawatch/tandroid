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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class rm0 extends FrameLayout implements org.telegram.messenger.us {
    public static org.telegram.ui.ActionBar.x1 H;
    public final long D;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int a;
    public final org.telegram.ui.ActionBar.k2 b;
    public final org.telegram.ui.ActionBar.p6 c;
    public final ag.b1 d;
    public final kg.f e;
    public LinearLayout f;
    public long h;
    public final ArrayList n;
    public final ArrayList r;
    public boolean s;
    public tg.b w;
    public wg.d x;
    public final Paint y;

    public rm0(Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.y = new Paint(1);
        this.a = i10;
        this.b = k2Var;
        this.c = p6Var;
        this.D = j10;
        sg.p0.n(p6Var);
        ag.b1 b1Var = new ag.b1(this, context, p6Var, 19);
        this.d = b1Var;
        b1Var.setPadding(org.telegram.messenger.i0.L(5.66f), 0, org.telegram.messenger.i0.L(5.66f), 0);
        b1Var.setClipToPadding(false);
        s4.a0 a0Var = new s4.a0();
        a0Var.j1(0);
        b1Var.setLayoutManager(a0Var);
        kg.f fVar = new kg.f(this, 4);
        this.e = fVar;
        b1Var.setAdapter(fVar);
        b1Var.setOverScrollMode(2);
        addView(b1Var, w7.b6.c(-1.0f, -1));
        b1Var.setOnItemClickListener(new kg.o1(this, i10, k2Var, 1));
        b1Var.setOnItemLongClickListener(new mg.i0(this, i10, k2Var, p6Var, 4));
        km0 km0Var = new km0();
        km0Var.o(gr.h);
        km0Var.n(320L);
        b1Var.setItemAnimator(km0Var);
        org.telegram.messenger.ui.b0(i10).Z0(false);
        h(false);
    }

    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [boolean] */
    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.p6 p6Var) {
        boolean z10;
        CharSequence charSequence;
        ?? r10;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.i0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        boolean z11 = Q != null && (Q.getFragmentView() instanceof uu0) && ((uu0) Q.getFragmentView()).Q() > org.telegram.messenger.i0.L(20.0f);
        org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        AlertDialog$Builder a2Var = z11 ? new org.telegram.ui.ActionBar.a2(0, context, p6Var) : new AlertDialog$Builder(0, context, p6Var);
        String J1 = org.telegram.messenger.vp.r1(i10).J1(reaction);
        sg.o0 d = sg.o0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.i0.L(20));
        int i11 = 17;
        if (TextUtils.isEmpty(d.f)) {
            SpannableString spannableString = new SpannableString("😀");
            z10 = z11;
            spannableString.setSpan(new o5(d.g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        } else {
            charSequence = org.telegram.messenger.k6.m(d.f, textPaint.getFontMetricsInt(), false, null, 0);
            z10 = z11;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.cd.L0(TextUtils.isEmpty(J1) ? 2131745898 : 2131745886, null));
        org.telegram.ui.ActionBar.x1 x1Var = a2Var.a;
        x1Var.R = append;
        final lm0 lm0Var = new lm0(context, p6Var);
        lm0Var.setOnEditorActionListener(new mm0(lm0Var, i10, reaction, x1VarArr, currentFocus));
        org.telegram.messenger.ui.b0(i10).M(org.telegram.messenger.i0.G0(), true);
        lm0Var.setTextSize(1, 18.0f);
        if (J1 == null) {
            J1 = "";
        }
        lm0Var.setText(J1);
        int i12 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(lm0Var, i12, p6Var);
        org.telegram.ui.ActionBar.a7.m(lm0Var, 34, org.telegram.ui.ActionBar.t6.Li, p6Var);
        lm0Var.setHintText(org.telegram.messenger.cd.L0(2131745899, null));
        lm0Var.setSingleLine(true);
        lm0Var.setFocusable(true);
        lm0Var.setInputType(TLObject.FLAG_14);
        org.telegram.ui.ActionBar.a7.G(lm0Var, org.telegram.ui.ActionBar.t6.k6, org.telegram.ui.ActionBar.t6.l6, org.telegram.ui.ActionBar.t6.p7, p6Var);
        lm0Var.setImeOptions(6);
        lm0Var.setBackgroundDrawable(null);
        lm0Var.setPadding(0, 0, org.telegram.messenger.i0.L(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView, i12, p6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.cd.L0(2131745897, null));
        f7.addView(textView, w7.b6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(lm0Var, w7.b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        a2Var.o(f7);
        x1Var.a = org.telegram.messenger.i0.L(292.0f);
        int i13 = 8;
        a2Var.k(org.telegram.messenger.cd.L0(2131745963, null), new ag.b0(lm0Var, i10, reaction, i13));
        a2Var.h(org.telegram.messenger.cd.L0(2131752589, null), new au(i11));
        if (z10) {
            H = x1Var;
            r10 = 0;
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new r0(currentFocus, i13));
            org.telegram.ui.ActionBar.x1 x1Var2 = H;
            final boolean z12 = false ? 1 : 0;
            x1Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.jm0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (z12) {
                        case 0:
                            lm0 lm0Var2 = lm0Var;
                            lm0Var2.requestFocus();
                            org.telegram.messenger.i0.J3(lm0Var2);
                            break;
                        default:
                            lm0 lm0Var3 = lm0Var;
                            lm0Var3.requestFocus();
                            org.telegram.messenger.i0.J3(lm0Var3);
                            break;
                    }
                }
            });
            H.r(250L);
        } else {
            r10 = 0;
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new r0(lm0Var, 9));
            final int i14 = 1;
            x1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.jm0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i14) {
                        case 0:
                            lm0 lm0Var2 = lm0Var;
                            lm0Var2.requestFocus();
                            org.telegram.messenger.i0.J3(lm0Var2);
                            break;
                        default:
                            lm0 lm0Var3 = lm0Var;
                            lm0Var3.requestFocus();
                            org.telegram.messenger.i0.J3(lm0Var3);
                            break;
                    }
                }
            });
            x1VarArr[0].show();
        }
        x1VarArr[r10].j0 = r10;
        lm0Var.setSelection(lm0Var.getText().length());
    }

    public final boolean a() {
        return !this.r.isEmpty() || this.s;
    }

    public abstract void b(boolean z10);

    public final void d(tg.b bVar, wg.d dVar) {
        this.w = bVar;
        this.x = dVar;
        float N = org.telegram.messenger.i0.N(1.0f);
        Paint paint = this.y;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            vg.f c10 = bVar.c(linearLayout, null, false);
            c10.o(w7.b9.p(this.c));
            c10.r(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(9.0f));
            c10.t(org.telegram.messenger.i0.L(5.0f));
            c10.p(org.telegram.messenger.i0.L(4.0f));
            linearLayout.setBackground(c10);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.h3) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.D) {
                h(true);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.i4) {
            invalidate();
            org.telegram.messenger.i0.d0(this.d, new ag.z0(2));
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

    public final void e(sg.o0 o0Var, boolean z10) {
        kg.f fVar = this.e;
        if (o0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            fVar.f();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            om0 om0Var = (om0) arrayList.get(i10);
            long j10 = o0Var.h;
            sg.o0 o0Var2 = om0Var.a;
            long j11 = o0Var2.h;
            if (j10 == j11) {
                this.h = j11;
                if (z10) {
                    f(o0Var2);
                }
                fVar.f();
                this.d.v0(i10);
                return;
            }
            i10++;
        }
    }

    public abstract boolean f(sg.o0 o0Var);

    public final void g(boolean z10) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            this.G = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, z10 ? 1.0f : 0.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 15));
        this.G.setInterpolator(gr.h);
        this.G.setDuration(320L);
        this.G.addListener(new ha0(4, this, z10));
        this.G.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.E);
    }

    public void h(boolean z10) {
        boolean z11;
        int i10;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList arrayList2 = this.r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.a;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i11);
        long j10 = this.D;
        TLRPC.TL_messages_savedReactionsTags H1 = r12.H1(j10, false);
        if (H1 != null) {
            int i12 = 0;
            z11 = false;
            while (i12 < H1.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = H1.tags.get(i12);
                sg.o0 d = sg.o0.d(tL_savedReactionTag.reaction);
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = H1;
                if (hashSet.contains(Long.valueOf(d.h)) || (j10 != 0 && tL_savedReactionTag.count <= 0)) {
                    i10 = i12;
                } else {
                    int i13 = tL_savedReactionTag.count;
                    String J1 = j10 != 0 ? r12.J1(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    om0 om0Var = new om0();
                    om0Var.a = d;
                    om0Var.b = i13;
                    om0Var.c = J1;
                    om0Var.d = J1 == null ? -233 : J1.hashCode();
                    i10 = i12;
                    if (om0Var.a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(om0Var);
                    hashSet.add(Long.valueOf(d.h));
                }
                i12 = i10 + 1;
                H1 = tL_messages_savedReactionsTags;
            }
        } else {
            z11 = false;
        }
        if (!z11 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        kg.f fVar = this.e;
        if (z10) {
            s4.n.c(new nm0(this), true).c(fVar);
        } else {
            fVar.f();
        }
        boolean q6 = org.telegram.messenger.d20.i(i11).q();
        this.s = !q6;
        if (q6) {
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                if (z10) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new eb0(this, 23)).start();
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
            linearLayout2.setOnClickListener(new db0(this, 10));
            this.f.setOrientation(0);
            w7.e6.b(this.f, 0.03f, 1.25f);
            org.telegram.ui.r9 r9Var = new org.telegram.ui.r9(this, getContext());
            int i14 = org.telegram.ui.ActionBar.t6.o6;
            org.telegram.ui.ActionBar.p6 p6Var = this.c;
            org.telegram.ui.ActionBar.a7.V(r9Var, i14, p6Var);
            r9Var.setTextSize(1, 12.0f);
            r9Var.setTypeface(org.telegram.messenger.i0.o());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i15 = org.telegram.ui.ActionBar.t6.Uc;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mutate.setColorFilter(new PorterDuffColorFilter(i15, mode));
            dq dqVar = new dq(0, mutate);
            dqVar.s = 0.0f;
            dqVar.r = 0.0f;
            dqVar.H = 0.94f;
            dqVar.I = 0.94f;
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(dqVar, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.cd.L0(2131754381, null));
            r9Var.setText(spannableStringBuilder);
            r9Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(4.0f));
            TextView textView = new TextView(getContext());
            org.telegram.ui.ActionBar.a7.V(textView, i14, p6Var);
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(org.telegram.messenger.i0.o());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131754380, null));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(i15, mode));
            dq dqVar2 = new dq(0, mutate2);
            dqVar2.H = 0.76f;
            dqVar2.I = 0.76f;
            dqVar2.r = -org.telegram.messenger.i0.L(1.0f);
            dqVar2.s = org.telegram.messenger.i0.L(1.0f);
            spannableString2.setSpan(dqVar2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(org.telegram.messenger.i0.L(5.66f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(4.0f));
            this.f.addView(r9Var, w7.b6.r(-2, -2, 16));
            this.f.addView(textView, w7.b6.r(-2, -2, 16));
            this.f.setPadding(org.telegram.messenger.i0.L(7.0f), 0, 0, 0);
            this.f.setClipToPadding(false);
            addView(this.f, w7.b6.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
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
        int i10 = this.a;
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.h3);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.h3);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.i4);
    }

    public void setShown(float f7) {
        this.E = f7;
        ag.b1 b1Var = this.d;
        b1Var.setPivotX(b1Var.getWidth() / 2.0f);
        b1Var.setPivotY(0.0f);
        b1Var.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, f7));
        b1Var.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, f7));
        setAlpha(f7);
        invalidate();
    }
}
