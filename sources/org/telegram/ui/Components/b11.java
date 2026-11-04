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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b11 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public org.telegram.ui.h5 F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public ValueAnimator L;
    public int M;
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public hn0 c;
    public final s70 d;
    public final g6 e;
    public final ei.e3 f;
    public final ImageView h;
    public boolean n;
    public final u5 r;
    public boolean s;
    public int w;
    public long x;
    public boolean y;

    public b11(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.r = new u5(this, 360L, xq.h);
        this.s = false;
        this.y = false;
        this.E = false;
        this.J = org.telegram.ui.ActionBar.k6.U8;
        this.M = 0;
        this.a = i3;
        this.b = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        s70 s70Var = new s70(context, e6Var);
        this.d = s70Var;
        s70Var.setTextSize(1, 14.0f);
        s70Var.setTypeface(org.telegram.messenger.g0.o());
        addView(s70Var, b8.mf.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        b8.pf.a(s70Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, b8.mf.e(34, 34, 17));
        g6 g6Var = new g6(false, false, false);
        this.e = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.M = org.telegram.messenger.g0.q.x;
        g6Var.b = 17;
        ei.e3 e3Var = new ei.e3(this, context, e6Var);
        this.f = e3Var;
        addView(e3Var, b8.mf.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        b8.pf.a(e3Var);
        h();
    }

    private int getMeasuringWidth() {
        float L = org.telegram.messenger.g0.L(16.66f);
        g6 g6Var = this.e;
        return org.telegram.messenger.g0.L(11.0f) + this.d.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f) + (g6Var.d > 0.0f ? org.telegram.messenger.g0.L(4.66f) + ((int) Math.max(L, g6Var.d + org.telegram.messenger.g0.L(10.0f))) : 0) + this.M;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        int i3 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        return i0.a.f(this.y ? 1.0f : this.G, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
    }

    private void setLayout(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
    }

    public final void b(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(false);
        long j11 = this.x;
        long j12 = tL_forumTopic.id;
        boolean z11 = j11 == j12;
        this.x = j12;
        this.h.setVisibility(8);
        s70 s70Var = this.d;
        s70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
            wp wpVar = new wp(R.drawable.msg_filled_general, 0);
            wpVar.I = 0.66f;
            wpVar.J = 0.66f;
            spannableStringBuilder.setSpan(wpVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new p5(tL_forumTopic.icon_emoji_id, s70Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        s70Var.setText(spannableStringBuilder);
        setSelected(z10);
        h();
        e(tL_forumTopic.unread_count, org.telegram.messenger.hp.s1(this.a).r2(j10, this.x, null), z11);
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
        s70 s70Var = this.d;
        s70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new wp(R.drawable.menu_topic_add, 0), 0, 1, 33);
        s70Var.setText(spannableStringBuilder);
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
        int i3 = z10 ? 0 : 8;
        ImageView imageView = this.h;
        imageView.setVisibility(i3);
        if (z10) {
            y01 y01Var = new y01(getContext());
            y01Var.b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.b));
            imageView.setImageDrawable(y01Var);
        }
        String M0 = org.telegram.messenger.bd.M0(z10 ? 2131753064 : 2131754289, null);
        s70 s70Var = this.d;
        s70Var.setText(M0);
        s70Var.setVisibility(z10 ? 8 : 0);
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
                this.c = new hn0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.c.a(canvas, d);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e(int i3, boolean z10, boolean z11) {
        g6 g6Var = this.e;
        int i10 = 1;
        if (i3 > 0) {
            this.J = z10 ? org.telegram.ui.ActionBar.k6.V8 : org.telegram.ui.ActionBar.k6.U8;
            g6Var.t(org.telegram.messenger.bd.E(i3, ','), z11, true);
        } else {
            this.J = org.telegram.ui.ActionBar.k6.V8;
            g6Var.t("", z11, true);
        }
        if (z11 && this.K < i3) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new z01(this, 0));
            this.L.addListener(new j01(this, i10));
            org.telegram.messenger.camera.q.i(2.0f, this.L);
            this.L.setDuration(200L);
            this.L.start();
        }
        this.K = i3;
        this.f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.x = -1L;
        this.h.setVisibility(8);
        s70 s70Var = this.d;
        s70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        x70 x70Var = new x70(org.telegram.messenger.g0.L(42.0f), s70Var);
        x70Var.e = 0.95f;
        spannableStringBuilder.setSpan(x70Var, 0, 1, 33);
        s70Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void g(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(true);
        long o10 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        boolean z11 = this.x == o10;
        this.x = o10;
        this.h.setVisibility(8);
        s70 s70Var = this.d;
        s70Var.setVisibility(0);
        org.telegram.ui.h5 h5Var = this.F;
        int i3 = this.a;
        if (h5Var == null) {
            org.telegram.ui.h5 h5Var2 = new org.telegram.ui.h5(18.0f, i3, s70Var);
            this.F = h5Var2;
            h5Var2.w = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject e22 = org.telegram.messenger.hp.s1(i3).e2(o10);
        if (e22 != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.h5 h5Var3 = this.F;
            u8 u8Var = h5Var3.c;
            u8Var.p(e22);
            h5Var3.b.i0(e22, u8Var, null);
            spannableStringBuilder.setSpan(this.F, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.m5.l(org.telegram.messenger.h10.t0, o10));
        s70Var.setText(TextUtils.ellipsize(spannableStringBuilder, s70Var.getPaint(), org.telegram.messenger.g0.L(150.0f), TextUtils.TruncateAt.END));
        setSelected(z10);
        e(tL_forumTopic.unread_count, org.telegram.messenger.hp.s1(i3).r2(j10, o10, null), z11);
        if (this.s) {
            this.s = false;
        }
    }

    public long getTopicId() {
        return this.x;
    }

    public final void h() {
        int textColor = getTextColor();
        s70 s70Var = this.d;
        s70Var.setTextColor(textColor);
        s70Var.setEmojiColor(textColor);
        this.f.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i11 - i3;
        int i14 = i12 - i10;
        ImageView imageView = this.h;
        int measuredWidth = (i13 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int L = org.telegram.messenger.g0.L(11.0f);
        int i15 = i14 / 2;
        s70 s70Var = this.d;
        s70Var.layout(L, i15 - (s70Var.getMeasuredHeight() / 2), s70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f), (s70Var.getMeasuredHeight() / 2) + i15);
        float f10 = this.e.d;
        ei.e3 e3Var = this.f;
        if (f10 > 0.0f) {
            e3Var.layout(((i13 - org.telegram.messenger.g0.L(11.0f)) - this.M) - e3Var.getMeasuredWidth(), i15 - (e3Var.getMeasuredHeight() / 2), (i13 - org.telegram.messenger.g0.L(11.0f)) - this.M, (e3Var.getMeasuredHeight() / 2) + i15);
        } else {
            e3Var.layout(org.telegram.messenger.g0.L(4.66f) + s70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f), i15 - (e3Var.getMeasuredHeight() / 2), e3Var.getMeasuredWidth() + org.telegram.messenger.g0.L(4.66f) + s70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f), (e3Var.getMeasuredHeight() / 2) + i15);
        }
        if (this.w != 0 && e3Var.getLeft() != this.w) {
            e3Var.setTranslationX((-e3Var.getLeft()) + this.w);
            e3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(xq.h).start();
        }
        this.w = e3Var.getLeft();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        this.d.measure(i3, i10);
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
        ofFloat.addUpdateListener(new z01(this, 1));
        this.I.addListener(new s9(22, this, z10));
        this.I.setInterpolator(xq.h);
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
            if (imageView == null || !(imageView.getDrawable() instanceof y01)) {
                return;
            }
            y01 y01Var = (y01) imageView.getDrawable();
            y01Var.b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.b));
            imageView.invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
