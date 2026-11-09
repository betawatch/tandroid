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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i11 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean D;
    public org.telegram.ui.f5 E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public int I;
    public int J;
    public ValueAnimator K;
    public int L;
    public final int a;
    public final org.telegram.ui.ActionBar.g6 b;
    public fn0 c;
    public final x70 d;
    public final i6 e;
    public final di.b3 f;
    public final ImageView h;
    public boolean n;
    public final w5 r;
    public boolean s;
    public int w;
    public long x;
    public boolean y;

    public i11(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.r = new w5(this, 360L, xq.h);
        this.s = false;
        this.y = false;
        this.D = false;
        this.I = org.telegram.ui.ActionBar.l6.U8;
        this.L = 0;
        this.a = i7;
        this.b = g6Var;
        setClipChildren(false);
        setClipToPadding(false);
        x70 x70Var = new x70(context, g6Var);
        this.d = x70Var;
        x70Var.setTextSize(1, 14.0f);
        x70Var.setTypeface(org.telegram.messenger.g0.o());
        addView(x70Var, c8.ha.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        c8.ka.a(x70Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, c8.ha.e(34, 34, 17));
        i6 i6Var = new i6(false, false, false);
        this.e = i6Var;
        i6Var.w(org.telegram.messenger.g0.L(11.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.M = org.telegram.messenger.g0.q.x;
        i6Var.b = 17;
        di.b3 b3Var = new di.b3(this, context, g6Var);
        this.f = b3Var;
        addView(b3Var, c8.ha.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        c8.ka.a(b3Var);
        h();
    }

    private int getMeasuringWidth() {
        float L = org.telegram.messenger.g0.L(16.66f);
        i6 i6Var = this.e;
        return org.telegram.messenger.g0.L(11.0f) + this.d.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f) + (i6Var.d > 0.0f ? org.telegram.messenger.g0.L(4.66f) + ((int) Math.max(L, i6Var.d + org.telegram.messenger.g0.L(10.0f))) : 0) + this.L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        int i7 = org.telegram.ui.ActionBar.l6.z6;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        return i0.a.f(this.y ? 1.0f : this.F, org.telegram.ui.ActionBar.l6.w0(i7, g6Var), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var));
    }

    private void setLayout(boolean z9) {
        if (this.D == z9) {
            return;
        }
        this.D = z9;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ci));
    }

    public final void b(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        setLayout(false);
        long j10 = this.x;
        long j11 = tL_forumTopic.id;
        boolean z10 = j10 == j11;
        this.x = j11;
        this.h.setVisibility(8);
        x70 x70Var = this.d;
        x70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
            wp wpVar = new wp(R.drawable.msg_filled_general, 0);
            wpVar.H = 0.66f;
            wpVar.I = 0.66f;
            spannableStringBuilder.setSpan(wpVar, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new r5(tL_forumTopic.icon_emoji_id, x70Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        x70Var.setText(spannableStringBuilder);
        setSelected(z9);
        h();
        e(tL_forumTopic.unread_count, org.telegram.messenger.qp.s1(this.a).r2(j3, this.x, null), z10);
        boolean z11 = tL_forumTopic.pinned;
        if (this.s != z11) {
            this.s = z11;
        }
    }

    public final void c() {
        setLayout(false);
        this.x = 0L;
        this.y = true;
        this.h.setVisibility(8);
        x70 x70Var = this.d;
        x70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new wp(R.drawable.menu_topic_add, 0), 0, 1, 33);
        x70Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void d(boolean z9, boolean z10, boolean z11) {
        setLayout(z10);
        this.x = 0L;
        this.y = false;
        int i7 = z9 ? 0 : 8;
        ImageView imageView = this.h;
        imageView.setVisibility(i7);
        if (z9) {
            e11 e11Var = new e11(getContext());
            e11Var.b.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, this.b));
            imageView.setImageDrawable(e11Var);
        }
        String M0 = org.telegram.messenger.id.M0(z9 ? 2131753064 : 2131754289, null);
        x70 x70Var = this.d;
        x70Var.setText(M0);
        x70Var.setVisibility(z9 ? 8 : 0);
        setSelected(z11);
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
                this.c = new fn0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.c.a(canvas, d);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e(int i7, boolean z9, boolean z10) {
        i6 i6Var = this.e;
        if (i7 > 0) {
            this.I = z9 ? org.telegram.ui.ActionBar.l6.V8 : org.telegram.ui.ActionBar.l6.U8;
            i6Var.t(org.telegram.messenger.id.E(i7, ','), z10, true);
        } else {
            this.I = org.telegram.ui.ActionBar.l6.V8;
            i6Var.t("", z10, true);
        }
        if (z10 && this.J < i7) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            int i10 = 0;
            ofFloat.addUpdateListener(new f11(this, i10));
            this.K.addListener(new g11(this, i10));
            org.telegram.messenger.camera.q.i(2.0f, this.K);
            this.K.setDuration(200L);
            this.K.start();
        }
        this.J = i7;
        this.f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.x = -1L;
        this.h.setVisibility(8);
        x70 x70Var = this.d;
        x70Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        c80 c80Var = new c80(org.telegram.messenger.g0.L(42.0f), x70Var);
        c80Var.e = 0.95f;
        spannableStringBuilder.setSpan(c80Var, 0, 1, 33);
        x70Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void g(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        setLayout(true);
        long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        boolean z10 = this.x == o4;
        this.x = o4;
        this.h.setVisibility(8);
        x70 x70Var = this.d;
        x70Var.setVisibility(0);
        org.telegram.ui.f5 f5Var = this.E;
        int i7 = this.a;
        if (f5Var == null) {
            org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(18.0f, i7, x70Var);
            this.E = f5Var2;
            f5Var2.w = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject e22 = org.telegram.messenger.qp.s1(i7).e2(o4);
        if (e22 != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            org.telegram.ui.f5 f5Var3 = this.E;
            w8 w8Var = f5Var3.c;
            w8Var.p(e22);
            f5Var3.b.i0(e22, w8Var, null);
            spannableStringBuilder.setSpan(this.E, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.m5.l(org.telegram.messenger.p10.s0, o4));
        x70Var.setText(TextUtils.ellipsize(spannableStringBuilder, x70Var.getPaint(), org.telegram.messenger.g0.L(150.0f), TextUtils.TruncateAt.END));
        setSelected(z9);
        e(tL_forumTopic.unread_count, org.telegram.messenger.qp.s1(i7).r2(j3, o4, null), z10);
        if (this.s) {
            this.s = false;
        }
    }

    public long getTopicId() {
        return this.x;
    }

    public final void h() {
        int textColor = getTextColor();
        x70 x70Var = this.d;
        x70Var.setTextColor(textColor);
        x70Var.setEmojiColor(textColor);
        this.f.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        ImageView imageView = this.h;
        int measuredWidth = (i13 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int L = org.telegram.messenger.g0.L(11.0f);
        int i15 = i14 / 2;
        x70 x70Var = this.d;
        x70Var.layout(L, i15 - (x70Var.getMeasuredHeight() / 2), x70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f), (x70Var.getMeasuredHeight() / 2) + i15);
        float f10 = this.e.d;
        di.b3 b3Var = this.f;
        if (f10 > 0.0f) {
            b3Var.layout(((i13 - org.telegram.messenger.g0.L(11.0f)) - this.L) - b3Var.getMeasuredWidth(), i15 - (b3Var.getMeasuredHeight() / 2), (i13 - org.telegram.messenger.g0.L(11.0f)) - this.L, (b3Var.getMeasuredHeight() / 2) + i15);
        } else {
            b3Var.layout(org.telegram.messenger.g0.L(4.66f) + x70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f), i15 - (b3Var.getMeasuredHeight() / 2), b3Var.getMeasuredWidth() + org.telegram.messenger.g0.L(4.66f) + x70Var.getMeasuredWidth() + org.telegram.messenger.g0.L(11.0f), (b3Var.getMeasuredHeight() / 2) + i15);
        }
        if (this.w != 0 && b3Var.getLeft() != this.w) {
            b3Var.setTranslationX((-b3Var.getLeft()) + this.w);
            b3Var.animate().translationX(0.0f).setDuration(320L).setInterpolator(xq.h).start();
        }
        this.w = b3Var.getLeft();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.d.measure(i7, i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), TLObject.FLAG_30));
    }

    public void setReorder(boolean z9) {
        this.n = z9;
        invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z9) {
        if (this.G == z9) {
            return;
        }
        this.G = z9;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, z9 ? 1.0f : 0.0f);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new f11(this, 1));
        this.H.addListener(new t9(22, this, z9));
        this.H.setInterpolator(xq.h);
        this.H.setDuration(320L);
        this.H.start();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            if (this.d != null && this.f != null) {
                h();
            }
            ImageView imageView = this.h;
            if (imageView == null || !(imageView.getDrawable() instanceof e11)) {
                return;
            }
            e11 e11Var = (e11) imageView.getDrawable();
            e11Var.b.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, this.b));
            imageView.invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
