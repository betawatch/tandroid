package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n21 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public boolean E;
    public int F;
    public SpannableStringBuilder G;
    public SpannableStringBuilder H;
    public int I;
    public boolean J;
    public boolean K;
    public float L;
    public ValueAnimator M;
    public long N;
    public boolean O;
    public boolean P;
    public t80 Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public boolean V;
    public ValueAnimator W;
    public final int a;
    public final org.telegram.ui.ActionBar.p6 b;
    public fo0 c;
    public final jg.d0 d;
    public final FrameLayout.LayoutParams e;
    public final e6 f;
    public final jg.a3 h;
    public final g9 n;
    public g21 r;
    public final r8 s;
    public final TextView w;
    public final ImageView x;
    public boolean y;

    public n21(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.D = false;
        this.E = false;
        this.F = org.telegram.ui.ActionBar.t6.U8;
        this.L = 1.0f;
        this.N = 0L;
        this.O = false;
        this.P = false;
        this.a = i10;
        this.b = p6Var;
        jg.d0 d0Var = new jg.d0(this, context);
        this.d = d0Var;
        d0Var.setWillNotDraw(false);
        d0Var.setOrientation(1);
        addView(d0Var, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 1.0f, 0.0f, 0.0f, 0.0f));
        w7.e6.a(d0Var);
        e6 e6Var = new e6(false, false, false);
        this.f = e6Var;
        e6Var.w(org.telegram.messenger.i0.L(11.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.u(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W8, p6Var));
        e6Var.M = org.telegram.messenger.i0.q.x;
        e6Var.b = 17;
        jg.a3 a3Var = new jg.a3(this, context, p6Var);
        this.h = a3Var;
        a3Var.setWillNotDraw(false);
        a3Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
        d0Var.addView(a3Var, w7.b6.r(-1, -2, 17));
        g9 g9Var = new g9(context);
        this.n = g9Var;
        FrameLayout.LayoutParams e = w7.b6.e(34, 34, 17);
        this.e = e;
        a3Var.addView(g9Var, e);
        this.s = new r8((org.telegram.ui.ActionBar.p6) null);
        TextView textView = new TextView(context);
        this.w = textView;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        textView.setTextColor(i0.b.f(this.U, w02, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        d0Var.addView(textView, w7.b6.t(-1, -2, 17, 4, 0, 4, 0));
        d0Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(2.33f), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(imageView, d02, N, null, p6Var);
        addView(imageView, w7.b6.d(6, -1.0f, org.telegram.messenger.zs.A1, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-org.telegram.messenger.i0.L(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        if (this.D == z10) {
            return;
        }
        this.D = z10;
        this.n.setRoundRadius(org.telegram.messenger.i0.L(z10 ? 36.0f : 3.0f));
        this.h.setPadding(0, org.telegram.messenger.i0.L(z10 ? 7.0f : 4.0f), 0, 0);
        int L = z10 ? org.telegram.messenger.i0.L(28.0f) : org.telegram.messenger.i0.L(30.0f);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = L;
        layoutParams.height = z10 ? org.telegram.messenger.i0.L(28.0f) : org.telegram.messenger.i0.L(30.0f);
    }

    public final void a(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(false);
        long j11 = this.N;
        long j12 = tL_forumTopic.id;
        boolean z11 = j11 == j12;
        this.P = false;
        this.N = j12;
        this.O = false;
        String str = tL_forumTopic.title;
        TextView textView = this.w;
        textView.setText(str);
        textView.setVisibility(0);
        int i10 = tL_forumTopic.id;
        g9 g9Var = this.n;
        if (i10 == 1) {
            this.P = true;
            g9Var.b();
            g9Var.setAnimatedEmojiDrawable(null);
            g9Var.setImageResource(R.drawable.msg_filled_general);
            g9Var.setScaleX(0.66f);
            g9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            g9Var.b();
            g9Var.setAnimatedEmojiDrawable(f5.m(org.telegram.messenger.d20.s0, tL_forumTopic.icon_emoji_id, null, 3));
            g9Var.setScaleX(1.0f);
            g9Var.setScaleY(1.0f);
        } else {
            g9Var.setAnimatedEmojiDrawable(null);
            g9Var.setImageDrawable(gg.e.e(tL_forumTopic));
            g9Var.setScaleX(1.0f);
            g9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        d(tL_forumTopic.unread_count, org.telegram.messenger.vp.r1(this.a).q2(j10, tL_forumTopic.id, null), tL_forumTopic.unread_mentions_count > 0, tL_forumTopic.unread_reactions_count > 0, z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.E != z12) {
            this.E = z12;
        }
        h();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.P = true;
        this.O = true;
        String L0 = org.telegram.messenger.cd.L0(2131748268, null);
        TextView textView = this.w;
        textView.setText(L0);
        textView.setVisibility(0);
        g9 g9Var = this.n;
        g9Var.b();
        g9Var.setAnimatedEmojiDrawable(null);
        g9Var.setImageResource(R.drawable.emoji_tabs_new3);
        g9Var.setScaleX(1.0f);
        g9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        setLayout(z11);
        this.N = -1L;
        this.P = true;
        this.O = false;
        String L0 = org.telegram.messenger.cd.L0(z10 ? 2131753064 : 2131754288, null);
        TextView textView = this.w;
        textView.setText(L0);
        textView.setVisibility(z10 ? 8 : 0);
        g9 g9Var = this.n;
        g9Var.b();
        g9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            g21 g21Var = new g21(getContext());
            g21Var.b.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.b));
            g9Var.setImageDrawable(g21Var);
            this.r = g21Var;
        } else {
            g9Var.setImageResource(R.drawable.other_chats);
            this.r = null;
        }
        g9Var.setScaleX(1.0f);
        g9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
    }

    public final void d(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        e6 e6Var = this.f;
        int i11 = 1;
        if (z12) {
            this.F = org.telegram.ui.ActionBar.t6.Z5;
            if (this.H == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                dq dqVar = new dq(R.drawable.mini_like_filled, 0);
                dqVar.H = 0.8f;
                dqVar.I = 0.8f;
                dqVar.G = 0.5f;
                dqVar.r = -org.telegram.messenger.i0.L(3.0f);
                dqVar.s = 0.0f;
                spannableStringBuilder.setSpan(dqVar, 0, spannableStringBuilder.length(), 33);
                this.H = spannableStringBuilder;
            }
            e6Var.t(this.H, z13, true);
        } else if (z11) {
            this.F = z10 ? org.telegram.ui.ActionBar.t6.V8 : org.telegram.ui.ActionBar.t6.U8;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                dq dqVar2 = new dq(R.drawable.mini_mention_filled_16, 0);
                dqVar2.H = 0.8f;
                dqVar2.I = 0.8f;
                dqVar2.G = 0.5f;
                dqVar2.r = -org.telegram.messenger.i0.L(3.0f);
                dqVar2.s = 0.0f;
                spannableStringBuilder2.setSpan(dqVar2, 0, 1, 33);
                this.G = spannableStringBuilder2;
            }
            e6Var.t(this.G, z13, true);
        } else if (i10 > 0) {
            this.F = z10 ? org.telegram.ui.ActionBar.t6.V8 : org.telegram.ui.ActionBar.t6.U8;
            e6Var.t(org.telegram.messenger.cd.E(i10, ','), z13, true);
        } else {
            this.F = org.telegram.ui.ActionBar.t6.V8;
            e6Var.t("", z13, true);
        }
        if (z13 && (this.I < i10 || ((!this.J && z11) || (!this.K && z12)))) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new l21(this, i11));
            this.M.addListener(new p11(this, 2));
            org.telegram.messenger.z20.j(2.0f, this.M);
            this.M.setDuration(200L);
            this.M.start();
        }
        this.I = i10;
        this.J = z11;
        this.K = z12;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.N = -1L;
        this.P = true;
        this.O = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int L = org.telegram.messenger.i0.L(38.0f);
        TextView textView = this.w;
        u80 u80Var = new u80(L, textView);
        u80Var.e = 0.75f;
        spannableStringBuilder.setSpan(u80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        g9 g9Var = this.n;
        g9Var.b();
        g9Var.setAnimatedEmojiDrawable(null);
        if (this.Q == null) {
            org.telegram.ui.ActionBar.p6 p6Var = this.b;
            t80 t80Var = new t80(p6Var);
            this.Q = t80Var;
            t80Var.k(38.0f);
            this.Q.setCallback(g9Var);
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var);
            this.Q.g(org.telegram.ui.ActionBar.t6.r1(0.15f, w02), org.telegram.ui.ActionBar.t6.r1(0.5f, w02), org.telegram.ui.ActionBar.t6.r1(0.6f, w02), org.telegram.ui.ActionBar.t6.r1(0.15f, w02));
            this.Q.n = false;
        }
        g9Var.setImageDrawable(this.Q);
        g9Var.setScaleX(1.0f);
        g9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(true);
        this.O = false;
        this.P = false;
        long o10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
        boolean z11 = o10 == this.N;
        this.N = o10;
        String l4 = org.telegram.messenger.o5.l(org.telegram.messenger.d20.s0, o10);
        TextView textView = this.w;
        textView.setText(l4);
        textView.setVisibility(0);
        int i10 = this.a;
        g9 g9Var = this.n;
        r8 r8Var = this.s;
        if (o10 >= 0) {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(o10));
            r8Var.r(Z1);
            g9Var.e(Z1, r8Var);
        } else {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-o10));
            r8Var.q(L0);
            g9Var.e(L0, r8Var);
        }
        g9Var.setScaleX(1.0f);
        g9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        d(tL_forumTopic.unread_count, false, false, tL_forumTopic.unread_reactions_count > 0, z11);
        if (this.E) {
            this.E = false;
        }
    }

    public final void g() {
        int i10 = org.telegram.ui.ActionBar.t6.z6;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        int f7 = i0.b.f(this.O ? 1.0f : this.U, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
        this.R = true;
        this.T = f7;
        boolean z10 = this.P;
        this.S = z10;
        g9 g9Var = this.n;
        if (z10) {
            g9Var.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
        } else {
            g9Var.setColorFilter(null);
        }
        g9Var.setEmojiColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
        g9Var.invalidate();
    }

    public final void h() {
        float f7 = (1.0f - this.U) * (-org.telegram.messenger.i0.L(3.0f));
        ImageView imageView = this.x;
        imageView.setTranslationX(f7);
        imageView.setVisibility(this.U <= 0.0f ? 8 : 0);
        int i10 = org.telegram.ui.ActionBar.t6.z6;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        this.w.setTextColor(i0.b.f(this.O ? 1.0f : this.U, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f), TLObject.FLAG_30), i11);
    }

    public void setReorder(boolean z10) {
        this.y = z10;
        this.d.invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, z10 ? 1.0f : 0.0f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new l21(this, 0));
        this.W.addListener(new ha0(9, this, z10));
        this.W.setInterpolator(gr.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            TextView textView = this.w;
            float f7 = 1.0f;
            org.telegram.ui.ActionBar.p6 p6Var = this.b;
            if (textView != null) {
                textView.setTextColor(i0.b.f(this.O ? 1.0f : this.U, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var)));
            }
            g9 g9Var = this.n;
            if (g9Var != null) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var);
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
                if (!this.O) {
                    f7 = this.U;
                }
                int f10 = i0.b.f(f7, w02, w03);
                if (!this.R || f10 != this.T || this.P != this.S) {
                    g();
                }
            }
            g21 g21Var = this.r;
            if (g21Var != null) {
                g21Var.b.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
                if (g9Var != null) {
                    g9Var.invalidate();
                }
            }
            if (this.Q != null) {
                int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var);
                this.Q.g(org.telegram.ui.ActionBar.t6.r1(0.15f, w04), org.telegram.ui.ActionBar.t6.r1(0.5f, w04), org.telegram.ui.ActionBar.t6.r1(0.6f, w04), org.telegram.ui.ActionBar.t6.r1(0.15f, w04));
                this.Q.n = false;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
