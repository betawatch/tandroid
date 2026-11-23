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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y11 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public boolean F;
    public int G;
    public SpannableStringBuilder H;
    public SpannableStringBuilder I;
    public int J;
    public boolean K;
    public boolean L;
    public float M;
    public ValueAnimator N;
    public long O;
    public boolean P;
    public boolean Q;
    public n80 R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public final int a;
    public ValueAnimator a0;
    public final org.telegram.ui.ActionBar.i6 b;
    public sn0 c;
    public final hi.i5 d;
    public final FrameLayout.LayoutParams e;
    public final m6 f;
    public final di.d1 h;
    public final p9 n;
    public q11 r;
    public final a9 s;
    public final TextView w;
    public final ImageView x;
    public boolean y;

    public y11(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.E = false;
        this.F = false;
        this.G = org.telegram.ui.ActionBar.n6.U8;
        this.M = 1.0f;
        this.O = 0L;
        this.P = false;
        this.Q = false;
        this.a = i7;
        this.b = i6Var;
        hi.i5 i5Var = new hi.i5(this, context);
        this.d = i5Var;
        i5Var.setWillNotDraw(false);
        i5Var.setOrientation(1);
        addView(i5Var, c8.na.d(-1, -1.0f, org.telegram.messenger.ks.E1, 1.0f, 0.0f, 0.0f, 0.0f));
        c8.sa.a(i5Var);
        m6 m6Var = new m6(false, false, false);
        this.f = m6Var;
        m6Var.w(org.telegram.messenger.g0.L(11.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.u(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.W8, i6Var));
        m6Var.N = org.telegram.messenger.g0.q.x;
        m6Var.b = 17;
        di.d1 d1Var = new di.d1(this, context, i6Var);
        this.h = d1Var;
        d1Var.setWillNotDraw(false);
        d1Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        i5Var.addView(d1Var, c8.na.r(-1, -2, 17));
        p9 p9Var = new p9(context);
        this.n = p9Var;
        FrameLayout.LayoutParams e10 = c8.na.e(34, 34, 17);
        this.e = e10;
        d1Var.addView(p9Var, e10);
        this.s = new a9((org.telegram.ui.ActionBar.i6) null);
        TextView textView = new TextView(context);
        this.w = textView;
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.z6, i6Var);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        textView.setTextColor(i0.a.f(this.V, w02, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        i5Var.addView(textView, c8.na.t(-1, -2, 17, 4, 0, 4, 0));
        i5Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(2.33f), org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(imageView, d02, M, null, i6Var);
        addView(imageView, c8.na.d(6, -1.0f, org.telegram.messenger.ks.A1, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        this.n.setRoundRadius(org.telegram.messenger.g0.L(z10 ? 36.0f : 3.0f));
        this.h.setPadding(0, org.telegram.messenger.g0.L(z10 ? 7.0f : 4.0f), 0, 0);
        int L = z10 ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(30.0f);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = L;
        layoutParams.height = z10 ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(30.0f);
    }

    public final void a(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(false);
        long j10 = this.O;
        long j11 = tL_forumTopic.id;
        boolean z11 = j10 == j11;
        this.Q = false;
        this.O = j11;
        this.P = false;
        String str = tL_forumTopic.title;
        TextView textView = this.w;
        textView.setText(str);
        textView.setVisibility(0);
        int i7 = tL_forumTopic.id;
        p9 p9Var = this.n;
        if (i7 == 1) {
            this.Q = true;
            p9Var.b();
            p9Var.setAnimatedEmojiDrawable(null);
            p9Var.setImageResource(R.drawable.msg_filled_general);
            p9Var.setScaleX(0.66f);
            p9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            p9Var.b();
            p9Var.setAnimatedEmojiDrawable(o5.m(org.telegram.messenger.i10.t0, tL_forumTopic.icon_emoji_id, null, 3));
            p9Var.setScaleX(1.0f);
            p9Var.setScaleY(1.0f);
        } else {
            p9Var.setAnimatedEmojiDrawable(null);
            p9Var.setImageDrawable(qg.c.f(tL_forumTopic));
            p9Var.setScaleX(1.0f);
            p9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        d(tL_forumTopic.unread_count, org.telegram.messenger.mp.u1(this.a).u2(j3, tL_forumTopic.id, null), tL_forumTopic.unread_mentions_count > 0, tL_forumTopic.unread_reactions_count > 0, z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.F != z12) {
            this.F = z12;
        }
        h();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.Q = true;
        this.P = true;
        String N0 = org.telegram.messenger.gd.N0(2131748058, null);
        TextView textView = this.w;
        textView.setText(N0);
        textView.setVisibility(0);
        p9 p9Var = this.n;
        p9Var.b();
        p9Var.setAnimatedEmojiDrawable(null);
        p9Var.setImageResource(R.drawable.emoji_tabs_new3);
        p9Var.setScaleX(1.0f);
        p9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        setLayout(z11);
        this.O = -1L;
        this.Q = true;
        this.P = false;
        String N0 = org.telegram.messenger.gd.N0(z10 ? 2131753061 : 2131754285, null);
        TextView textView = this.w;
        textView.setText(N0);
        textView.setVisibility(z10 ? 8 : 0);
        p9 p9Var = this.n;
        p9Var.b();
        p9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            q11 q11Var = new q11(getContext());
            q11Var.b.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.b));
            p9Var.setImageDrawable(q11Var);
            this.r = q11Var;
        } else {
            p9Var.setImageResource(R.drawable.other_chats);
            this.r = null;
        }
        p9Var.setScaleX(1.0f);
        p9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
    }

    public final void d(int i7, boolean z10, boolean z11, boolean z12, boolean z13) {
        m6 m6Var = this.f;
        int i10 = 1;
        if (z12) {
            this.G = org.telegram.ui.ActionBar.n6.Z5;
            if (this.I == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                kq kqVar = new kq(R.drawable.mini_like_filled, 0);
                kqVar.I = 0.8f;
                kqVar.J = 0.8f;
                kqVar.H = 0.5f;
                kqVar.r = -org.telegram.messenger.g0.L(3.0f);
                kqVar.s = 0.0f;
                spannableStringBuilder.setSpan(kqVar, 0, spannableStringBuilder.length(), 33);
                this.I = spannableStringBuilder;
            }
            m6Var.t(this.I, z13, true);
        } else if (z11) {
            this.G = z10 ? org.telegram.ui.ActionBar.n6.V8 : org.telegram.ui.ActionBar.n6.U8;
            if (this.H == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                kq kqVar2 = new kq(R.drawable.mini_mention_filled_16, 0);
                kqVar2.I = 0.8f;
                kqVar2.J = 0.8f;
                kqVar2.H = 0.5f;
                kqVar2.r = -org.telegram.messenger.g0.L(3.0f);
                kqVar2.s = 0.0f;
                spannableStringBuilder2.setSpan(kqVar2, 0, 1, 33);
                this.H = spannableStringBuilder2;
            }
            m6Var.t(this.H, z13, true);
        } else if (i7 > 0) {
            this.G = z10 ? org.telegram.ui.ActionBar.n6.V8 : org.telegram.ui.ActionBar.n6.U8;
            m6Var.t(org.telegram.messenger.gd.E(i7, ','), z13, true);
        } else {
            this.G = org.telegram.ui.ActionBar.n6.V8;
            m6Var.t("", z13, true);
        }
        if (z13 && (this.J < i7 || ((!this.K && z11) || (!this.L && z12)))) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.N = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new w11(this, i10));
            this.N.addListener(new s11(this, i10));
            org.telegram.ui.Cells.c0.q(2.0f, this.N);
            this.N.setDuration(200L);
            this.N.start();
        }
        this.J = i7;
        this.K = z11;
        this.L = z12;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.O = -1L;
        this.Q = true;
        this.P = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int L = org.telegram.messenger.g0.L(38.0f);
        TextView textView = this.w;
        o80 o80Var = new o80(L, textView);
        o80Var.e = 0.75f;
        spannableStringBuilder.setSpan(o80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        p9 p9Var = this.n;
        p9Var.b();
        p9Var.setAnimatedEmojiDrawable(null);
        if (this.R == null) {
            org.telegram.ui.ActionBar.i6 i6Var = this.b;
            n80 n80Var = new n80(i6Var);
            this.R = n80Var;
            n80Var.k(38.0f);
            this.R.setCallback(p9Var);
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.z6, i6Var);
            this.R.g(org.telegram.ui.ActionBar.n6.r1(0.15f, w02), org.telegram.ui.ActionBar.n6.r1(0.5f, w02), org.telegram.ui.ActionBar.n6.r1(0.6f, w02), org.telegram.ui.ActionBar.n6.r1(0.15f, w02));
            this.R.n = false;
        }
        p9Var.setImageDrawable(this.R);
        p9Var.setScaleX(1.0f);
        p9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(true);
        this.P = false;
        this.Q = false;
        long o4 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
        boolean z11 = o4 == this.O;
        this.O = o4;
        String l10 = org.telegram.messenger.n5.l(org.telegram.messenger.i10.t0, o4);
        TextView textView = this.w;
        textView.setText(l10);
        textView.setVisibility(0);
        int i7 = this.a;
        p9 p9Var = this.n;
        a9 a9Var = this.s;
        if (o4 >= 0) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(o4));
            a9Var.r(c22);
            p9Var.f(c22, a9Var);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-o4));
            a9Var.q(O0);
            p9Var.f(O0, a9Var);
        }
        p9Var.setScaleX(1.0f);
        p9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        d(tL_forumTopic.unread_count, false, false, tL_forumTopic.unread_reactions_count > 0, z11);
        if (this.F) {
            this.F = false;
        }
    }

    public final void g() {
        int i7 = org.telegram.ui.ActionBar.n6.z6;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        int f10 = i0.a.f(this.P ? 1.0f : this.V, org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
        this.S = true;
        this.U = f10;
        boolean z10 = this.Q;
        this.T = z10;
        p9 p9Var = this.n;
        if (z10) {
            p9Var.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        } else {
            p9Var.setColorFilter(null);
        }
        p9Var.setEmojiColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        p9Var.invalidate();
    }

    public final void h() {
        float f10 = (1.0f - this.V) * (-org.telegram.messenger.g0.L(3.0f));
        ImageView imageView = this.x;
        imageView.setTranslationX(f10);
        imageView.setVisibility(this.V <= 0.0f ? 8 : 0);
        int i7 = org.telegram.ui.ActionBar.n6.z6;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        this.w.setTextColor(i0.a.f(this.P ? 1.0f : this.V, org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), TLObject.FLAG_30), i10);
    }

    public void setReorder(boolean z10) {
        this.y = z10;
        this.d.invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, z10 ? 1.0f : 0.0f);
        this.a0 = ofFloat;
        ofFloat.addUpdateListener(new w11(this, 0));
        this.a0.addListener(new org.telegram.ui.on(24, this, z10));
        this.a0.setInterpolator(kr.h);
        this.a0.setDuration(320L);
        this.a0.start();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            TextView textView = this.w;
            float f10 = 1.0f;
            org.telegram.ui.ActionBar.i6 i6Var = this.b;
            if (textView != null) {
                textView.setTextColor(i0.a.f(this.P ? 1.0f : this.V, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.z6, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var)));
            }
            p9 p9Var = this.n;
            if (p9Var != null) {
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.z6, i6Var);
                int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var);
                if (!this.P) {
                    f10 = this.V;
                }
                int f11 = i0.a.f(f10, w02, w03);
                if (!this.S || f11 != this.U || this.Q != this.T) {
                    g();
                }
            }
            q11 q11Var = this.r;
            if (q11Var != null) {
                q11Var.b.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
                if (p9Var != null) {
                    p9Var.invalidate();
                }
            }
            if (this.R != null) {
                int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.z6, i6Var);
                this.R.g(org.telegram.ui.ActionBar.n6.r1(0.15f, w04), org.telegram.ui.ActionBar.n6.r1(0.5f, w04), org.telegram.ui.ActionBar.n6.r1(0.6f, w04), org.telegram.ui.ActionBar.n6.r1(0.15f, w04));
                this.R.n = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
