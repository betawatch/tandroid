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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j21 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public org.telegram.ui.e5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int a;
    public final org.telegram.ui.ActionBar.p6 b;
    public fo0 c;
    public final p80 d;
    public final e6 e;
    public final ih.c f;
    public final ImageView h;
    public boolean n;
    public final t5 r;
    public boolean s;
    public int w;
    public long x;
    public boolean y;

    public j21(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.r = new t5(this, 360L, gr.h);
        this.s = false;
        this.y = false;
        this.D = false;
        this.I = org.telegram.ui.ActionBar.t6.U8;
        this.L = 0;
        this.a = i10;
        this.b = p6Var;
        setClipChildren(false);
        setClipToPadding(false);
        p80 p80Var = new p80(context, p6Var);
        this.d = p80Var;
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTypeface(org.telegram.messenger.i0.o());
        addView(p80Var, w7.b6.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        w7.e6.a(p80Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, w7.b6.e(34, 34, 17));
        e6 e6Var = new e6(false, false, false);
        this.e = e6Var;
        e6Var.w(org.telegram.messenger.i0.L(11.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.M = org.telegram.messenger.i0.q.x;
        e6Var.b = 17;
        ih.c cVar = new ih.c(this, context, p6Var);
        this.f = cVar;
        addView(cVar, w7.b6.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        w7.e6.a(cVar);
        h();
    }

    private int getMeasuringWidth() {
        float L = org.telegram.messenger.i0.L(16.66f);
        e6 e6Var = this.e;
        return org.telegram.messenger.i0.L(11.0f) + this.d.getMeasuredWidth() + org.telegram.messenger.i0.L(11.0f) + (e6Var.d > 0.0f ? org.telegram.messenger.i0.L(4.66f) + ((int) Math.max(L, e6Var.d + org.telegram.messenger.i0.L(10.0f))) : 0) + this.L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        int i10 = org.telegram.ui.ActionBar.t6.z6;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        return i0.b.f(this.y ? 1.0f : this.F, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
    }

    private void setLayout(boolean z10) {
        if (this.D == z10) {
            return;
        }
        this.D = z10;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(false);
        long j11 = this.x;
        long j12 = tL_forumTopic.id;
        boolean z11 = j11 == j12;
        this.x = j12;
        this.h.setVisibility(8);
        p80 p80Var = this.d;
        p80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
            dq dqVar = new dq(R.drawable.msg_filled_general, 0);
            dqVar.H = 0.66f;
            dqVar.I = 0.66f;
            spannableStringBuilder.setSpan(dqVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new o5(tL_forumTopic.icon_emoji_id, p80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        p80Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, org.telegram.messenger.vp.r1(this.a).q2(j10, this.x, null), z11);
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
        p80 p80Var = this.d;
        p80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new dq(R.drawable.menu_topic_add, 0), 0, 1, 33);
        p80Var.setText(spannableStringBuilder);
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
        int i10 = z10 ? 0 : 8;
        ImageView imageView = this.h;
        imageView.setVisibility(i10);
        if (z10) {
            g21 g21Var = new g21(getContext());
            g21Var.b.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.b));
            imageView.setImageDrawable(g21Var);
        }
        String L0 = org.telegram.messenger.cd.L0(z10 ? 2131753064 : 2131754289, null);
        p80 p80Var = this.d;
        p80Var.setText(L0);
        p80Var.setVisibility(z10 ? 8 : 0);
        setSelected(z12);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.d) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float d = this.r.d(this.n);
        if (d > 0.0f) {
            if (this.c == null) {
                this.c = new fo0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.c.a(canvas, d);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e(int i10, boolean z10, boolean z11) {
        e6 e6Var = this.e;
        int i11 = 1;
        if (i10 > 0) {
            this.I = z10 ? org.telegram.ui.ActionBar.t6.V8 : org.telegram.ui.ActionBar.t6.U8;
            e6Var.t(org.telegram.messenger.cd.E(i10, ','), z11, true);
        } else {
            this.I = org.telegram.ui.ActionBar.t6.V8;
            e6Var.t("", z11, true);
        }
        if (z11 && this.J < i10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new h21(this, 0));
            this.K.addListener(new p11(this, i11));
            org.telegram.messenger.z20.j(2.0f, this.K);
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i10;
        this.f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.x = -1L;
        this.h.setVisibility(8);
        p80 p80Var = this.d;
        p80Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        u80 u80Var = new u80(org.telegram.messenger.i0.L(42.0f), p80Var);
        u80Var.e = 0.95f;
        spannableStringBuilder.setSpan(u80Var, 0, 1, 33);
        p80Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(true);
        long o10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
        boolean z11 = this.x == o10;
        this.x = o10;
        this.h.setVisibility(8);
        p80 p80Var = this.d;
        p80Var.setVisibility(0);
        org.telegram.ui.e5 e5Var = this.E;
        int i10 = this.a;
        if (e5Var == null) {
            org.telegram.ui.e5 e5Var2 = new org.telegram.ui.e5(18.0f, i10, p80Var);
            this.E = e5Var2;
            e5Var2.w = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject d22 = org.telegram.messenger.vp.r1(i10).d2(o10);
        if (d22 != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.e5 e5Var3 = this.E;
            r8 r8Var = e5Var3.c;
            r8Var.p(d22);
            e5Var3.b.i0(d22, r8Var, null);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.o5.l(org.telegram.messenger.d20.s0, o10));
        p80Var.setText(TextUtils.ellipsize(spannableStringBuilder, p80Var.getPaint(), org.telegram.messenger.i0.L(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, org.telegram.messenger.vp.r1(i10).q2(j10, o10, null), z11);
        if (this.s) {
            this.s = false;
        }
    }

    public long getTopicId() {
        return this.x;
    }

    public final void h() {
        int textColor = getTextColor();
        p80 p80Var = this.d;
        p80Var.setTextColor(textColor);
        p80Var.setEmojiColor(textColor);
        this.f.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        ImageView imageView = this.h;
        int measuredWidth = (i14 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int L = org.telegram.messenger.i0.L(11.0f);
        int i16 = i15 / 2;
        p80 p80Var = this.d;
        p80Var.layout(L, i16 - (p80Var.getMeasuredHeight() / 2), p80Var.getMeasuredWidth() + org.telegram.messenger.i0.L(11.0f), (p80Var.getMeasuredHeight() / 2) + i16);
        float f7 = this.e.d;
        ih.c cVar = this.f;
        if (f7 > 0.0f) {
            cVar.layout(((i14 - org.telegram.messenger.i0.L(11.0f)) - this.L) - cVar.getMeasuredWidth(), i16 - (cVar.getMeasuredHeight() / 2), (i14 - org.telegram.messenger.i0.L(11.0f)) - this.L, (cVar.getMeasuredHeight() / 2) + i16);
        } else {
            cVar.layout(org.telegram.messenger.i0.L(4.66f) + p80Var.getMeasuredWidth() + org.telegram.messenger.i0.L(11.0f), i16 - (cVar.getMeasuredHeight() / 2), cVar.getMeasuredWidth() + org.telegram.messenger.i0.L(4.66f) + p80Var.getMeasuredWidth() + org.telegram.messenger.i0.L(11.0f), (cVar.getMeasuredHeight() / 2) + i16);
        }
        if (this.w != 0 && cVar.getLeft() != this.w) {
            cVar.setTranslationX((-cVar.getLeft()) + this.w);
            cVar.animate().translationX(0.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
        this.w = cVar.getLeft();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.d.measure(i10, i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(36.0f), TLObject.FLAG_30));
    }

    public void setReorder(boolean z10) {
        this.n = z10;
        invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        if (this.G == z10) {
            return;
        }
        this.G = z10;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, z10 ? 1.0f : 0.0f);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new h21(this, 1));
        this.H.addListener(new ha0(8, this, z10));
        this.H.setInterpolator(gr.h);
        this.H.setDuration(320L);
        this.H.start();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            if (this.d != null && this.f != null) {
                h();
            }
            ImageView imageView = this.h;
            if (imageView == null || !(imageView.getDrawable() instanceof g21)) {
                return;
            }
            g21 g21Var = (g21) imageView.getDrawable();
            g21Var.b.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.b));
            imageView.invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
