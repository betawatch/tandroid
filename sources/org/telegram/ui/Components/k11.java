package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k11 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public org.telegram.ui.f5 F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public ValueAnimator L;
    public int M;
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public in0 c;
    public final z70 d;
    public final g6 e;
    public final fi.w2 f;
    public final ImageView h;
    public boolean n;
    public final u5 r;
    public boolean s;
    public int w;
    public long x;
    public boolean y;

    public k11(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.r = new u5(this, 360L, er.h);
        this.s = false;
        this.y = false;
        this.E = false;
        this.J = org.telegram.ui.ActionBar.j6.U8;
        this.M = 0;
        this.a = i7;
        this.b = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        z70 z70Var = new z70(context, e6Var);
        this.d = z70Var;
        z70Var.setTextSize(1, 14.0f);
        z70Var.setTypeface(org.telegram.messenger.g0.o());
        addView(z70Var, c8.ja.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        c8.na.a(z70Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, c8.ja.e(34, 34, 17));
        g6 g6Var = new g6(false, false, false);
        this.e = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.N = org.telegram.messenger.g0.q.x;
        g6Var.b = 17;
        fi.w2 w2Var = new fi.w2(this, context, e6Var);
        this.f = w2Var;
        addView(w2Var, c8.ja.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        c8.na.a(w2Var);
        h();
    }

    private int getMeasuringWidth() {
        float L = org.telegram.messenger.g0.L(16.66f);
        g6 g6Var = this.e;
        return org.telegram.messenger.g0.L(11.0f) + this.d.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f) + (g6Var.d > 0.0f ? org.telegram.messenger.g0.L(4.66f) + ((int) Math.max(L, g6Var.d + org.telegram.messenger.g0.L(10.0f))) : 0) + this.M;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        int i7 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        return i0.a.f(this.y ? 1.0f : this.G, org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var));
    }

    private void setLayout(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fi));
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(false);
        long j10 = this.x;
        long j11 = tL_forumTopic.id;
        boolean z11 = j10 == j11;
        this.x = j11;
        this.h.setVisibility(8);
        z70 z70Var = this.d;
        z70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
            eq eqVar = new eq(R.drawable.msg_filled_general, 0);
            eqVar.I = 0.66f;
            eqVar.J = 0.66f;
            spannableStringBuilder.setSpan(eqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new p5(tL_forumTopic.icon_emoji_id, z70Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        z70Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, org.telegram.messenger.np.s1(this.a).r2(j3, this.x, null), z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.s != z12) {
            this.s = z12;
        }
    }

    public final void c() {
        setLayout(false);
        this.x = 0L;
        this.y = true;
        this.h.setVisibility(8);
        z70 z70Var = this.d;
        z70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new eq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        z70Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        setLayout(z11);
        this.x = 0L;
        this.y = false;
        int i7 = z10 ? 0 : 8;
        ImageView imageView = this.h;
        imageView.setVisibility(i7);
        if (z10) {
            g11 g11Var = new g11(getContext());
            g11Var.b.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.b));
            imageView.setImageDrawable(g11Var);
        }
        String M0 = org.telegram.messenger.hd.M0(z10 ? 2131753064 : 2131754289, null);
        z70 z70Var = this.d;
        z70Var.setText(M0);
        z70Var.setVisibility(z10 ? 8 : 0);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.d) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float d = this.r.d(this.n);
        if (d > 0.0f) {
            if (this.c == null) {
                this.c = new in0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.c.a(canvas, d);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e(int i7, boolean z10, boolean z11) {
        g6 g6Var = this.e;
        if (i7 > 0) {
            this.J = z10 ? org.telegram.ui.ActionBar.j6.V8 : org.telegram.ui.ActionBar.j6.U8;
            g6Var.t(org.telegram.messenger.hd.E(i7, ','), z11, true);
        } else {
            this.J = org.telegram.ui.ActionBar.j6.V8;
            g6Var.t("", z11, true);
        }
        if (z11 && this.K < i7) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            int i10 = 0;
            ofFloat.addUpdateListener(new h11(this, i10));
            this.L.addListener(new i11(this, i10));
            org.telegram.messenger.i20.k(2.0f, this.L);
            this.L.setDuration(200L);
            this.L.start();
        }
        this.K = i7;
        this.f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.x = -1L;
        this.h.setVisibility(8);
        z70 z70Var = this.d;
        z70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        e80 e80Var = new e80(org.telegram.messenger.g0.L(42.0f), z70Var);
        e80Var.e = 0.95f;
        spannableStringBuilder.setSpan(e80Var, 0, 1, 33);
        z70Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(true);
        long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        boolean z11 = this.x == o4;
        this.x = o4;
        this.h.setVisibility(8);
        z70 z70Var = this.d;
        z70Var.setVisibility(0);
        org.telegram.ui.f5 f5Var = this.F;
        int i7 = this.a;
        if (f5Var == null) {
            org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(18.0f, i7, z70Var);
            this.F = f5Var2;
            f5Var2.w = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject e22 = org.telegram.messenger.np.s1(i7).e2(o4);
        if (e22 != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.f5 f5Var3 = this.F;
            t8 t8Var = f5Var3.c;
            t8Var.p(e22);
            f5Var3.b.i0(e22, t8Var, null);
            spannableStringBuilder.setSpan(this.F, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.m5.l(org.telegram.messenger.m10.t0, o4));
        z70Var.setText(TextUtils.ellipsize(spannableStringBuilder, z70Var.getPaint(), org.telegram.messenger.g0.L(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, org.telegram.messenger.np.s1(i7).r2(j3, o4, null), z11);
        if (this.s) {
            this.s = false;
        }
    }

    public long getTopicId() {
        return this.x;
    }

    public final void h() {
        int textColor = getTextColor();
        z70 z70Var = this.d;
        z70Var.setTextColor(textColor);
        z70Var.setEmojiColor(textColor);
        this.f.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        ImageView imageView = this.h;
        int measuredWidth = (i13 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int L = org.telegram.messenger.g0.L(11.0f);
        int i15 = i14 / 2;
        z70 z70Var = this.d;
        z70Var.layout(L, i15 - (z70Var.getMeasuredHeight() / 2), z70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f), (z70Var.getMeasuredHeight() / 2) + i15);
        float f10 = this.e.d;
        fi.w2 w2Var = this.f;
        if (f10 > 0.0f) {
            w2Var.layout(((i13 - org.telegram.messenger.g0.L(11.0f)) - this.M) - w2Var.getMeasuredWidth(), i15 - (w2Var.getMeasuredHeight() / 2), (i13 - org.telegram.messenger.g0.L(11.0f)) - this.M, (w2Var.getMeasuredHeight() / 2) + i15);
        } else {
            w2Var.layout(org.telegram.messenger.g0.L(4.66f) + z70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f), i15 - (w2Var.getMeasuredHeight() / 2), w2Var.getMeasuredWidth() + org.telegram.messenger.g0.L(4.66f) + z70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f), (w2Var.getMeasuredHeight() / 2) + i15);
        }
        if (this.w != 0 && w2Var.getLeft() != this.w) {
            w2Var.setTranslationX((-w2Var.getLeft()) + this.w);
            w2Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(er.h).start();
        }
        this.w = w2Var.getLeft();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.d.measure(i7, i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), TLObject.FLAG_30));
    }

    public void setReorder(boolean z10) {
        this.n = z10;
        invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, z10 ? 1.0f : 0.0f);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new h11(this, 1));
        this.I.addListener(new org.telegram.ui.nn(23, this, z10));
        this.I.setInterpolator(er.h);
        this.I.setDuration(320L);
        this.I.start();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            if (this.d != null && this.f != null) {
                h();
            }
            ImageView imageView = this.h;
            if (imageView == null || !(imageView.getDrawable() instanceof g11)) {
                return;
            }
            g11 g11Var = (g11) imageView.getDrawable();
            g11Var.b.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.b));
            imageView.invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
