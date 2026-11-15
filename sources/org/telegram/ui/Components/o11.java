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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o11 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
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
    public d80 R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public final int a;
    public ValueAnimator a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public in0 c;
    public final hi.y4 d;
    public final FrameLayout.LayoutParams e;
    public final g6 f;
    public final di.e1 h;
    public final i9 n;
    public g11 r;
    public final t8 s;
    public final TextView w;
    public final ImageView x;
    public boolean y;

    public o11(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = false;
        this.F = false;
        this.G = org.telegram.ui.ActionBar.j6.U8;
        this.M = 1.0f;
        this.O = 0L;
        this.P = false;
        this.Q = false;
        this.a = i7;
        this.b = e6Var;
        hi.y4 y4Var = new hi.y4(this, context);
        this.d = y4Var;
        y4Var.setWillNotDraw(false);
        y4Var.setOrientation(1);
        addView(y4Var, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 1.0f, 0.0f, 0.0f, 0.0f));
        c8.na.a(y4Var);
        g6 g6Var = new g6(false, false, false);
        this.f = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.u(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.W8, e6Var));
        g6Var.N = org.telegram.messenger.g0.q.x;
        g6Var.b = 17;
        di.e1 e1Var = new di.e1(this, context, e6Var);
        this.h = e1Var;
        e1Var.setWillNotDraw(false);
        e1Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        y4Var.addView(e1Var, c8.ja.r(-1, -2, 17));
        i9 i9Var = new i9(context);
        this.n = i9Var;
        FrameLayout.LayoutParams e10 = c8.ja.e(34, 34, 17);
        this.e = e10;
        e1Var.addView(i9Var, e10);
        this.s = new t8((org.telegram.ui.ActionBar.e6) null);
        TextView textView = new TextView(context);
        this.w = textView;
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.z6, e6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        textView.setTextColor(i0.a.f(this.V, w02, org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        y4Var.addView(textView, c8.ja.t(-1, -2, 17, 4, 0, 4, 0));
        y4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(2.33f), org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(imageView, d02, M, null, e6Var);
        addView(imageView, c8.ja.d(6, -1.0f, org.telegram.messenger.ns.A1, -3.0f, 3.0f, 0.0f, 3.0f));
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
        i9 i9Var = this.n;
        if (i7 == 1) {
            this.Q = true;
            i9Var.b();
            i9Var.setAnimatedEmojiDrawable(null);
            i9Var.setImageResource(R.drawable.msg_filled_general);
            i9Var.setScaleX(0.66f);
            i9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            i9Var.b();
            i9Var.setAnimatedEmojiDrawable(g5.m(org.telegram.messenger.m10.t0, tL_forumTopic.icon_emoji_id, null, 3));
            i9Var.setScaleX(1.0f);
            i9Var.setScaleY(1.0f);
        } else {
            i9Var.setAnimatedEmojiDrawable(null);
            i9Var.setImageDrawable(qg.c.e(tL_forumTopic));
            i9Var.setScaleX(1.0f);
            i9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        d(tL_forumTopic.unread_count, org.telegram.messenger.np.s1(this.a).r2(j3, tL_forumTopic.id, null), tL_forumTopic.unread_mentions_count > 0, tL_forumTopic.unread_reactions_count > 0, z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.F != z12) {
            this.F = z12;
        }
        h();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z6));
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.Q = true;
        this.P = true;
        String M0 = org.telegram.messenger.hd.M0(2131748251, null);
        TextView textView = this.w;
        textView.setText(M0);
        textView.setVisibility(0);
        i9 i9Var = this.n;
        i9Var.b();
        i9Var.setAnimatedEmojiDrawable(null);
        i9Var.setImageResource(R.drawable.emoji_tabs_new3);
        i9Var.setScaleX(1.0f);
        i9Var.setScaleY(1.0f);
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
        String M0 = org.telegram.messenger.hd.M0(z10 ? 2131753064 : 2131754288, null);
        TextView textView = this.w;
        textView.setText(M0);
        textView.setVisibility(z10 ? 8 : 0);
        i9 i9Var = this.n;
        i9Var.b();
        i9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            g11 g11Var = new g11(getContext());
            g11Var.b.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.b));
            i9Var.setImageDrawable(g11Var);
            this.r = g11Var;
        } else {
            i9Var.setImageResource(R.drawable.other_chats);
            this.r = null;
        }
        i9Var.setScaleX(1.0f);
        i9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
    }

    public final void d(int i7, boolean z10, boolean z11, boolean z12, boolean z13) {
        g6 g6Var = this.f;
        int i10 = 1;
        if (z12) {
            this.G = org.telegram.ui.ActionBar.j6.Z5;
            if (this.I == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                eq eqVar = new eq(R.drawable.mini_like_filled, 0);
                eqVar.I = 0.8f;
                eqVar.J = 0.8f;
                eqVar.H = 0.5f;
                eqVar.r = -org.telegram.messenger.g0.L(3.0f);
                eqVar.s = 0.0f;
                spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
                this.I = spannableStringBuilder;
            }
            g6Var.t(this.I, z13, true);
        } else if (z11) {
            this.G = z10 ? org.telegram.ui.ActionBar.j6.V8 : org.telegram.ui.ActionBar.j6.U8;
            if (this.H == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                eq eqVar2 = new eq(R.drawable.mini_mention_filled_16, 0);
                eqVar2.I = 0.8f;
                eqVar2.J = 0.8f;
                eqVar2.H = 0.5f;
                eqVar2.r = -org.telegram.messenger.g0.L(3.0f);
                eqVar2.s = 0.0f;
                spannableStringBuilder2.setSpan(eqVar2, 0, 1, 33);
                this.H = spannableStringBuilder2;
            }
            g6Var.t(this.H, z13, true);
        } else if (i7 > 0) {
            this.G = z10 ? org.telegram.ui.ActionBar.j6.V8 : org.telegram.ui.ActionBar.j6.U8;
            g6Var.t(org.telegram.messenger.hd.E(i7, ','), z13, true);
        } else {
            this.G = org.telegram.ui.ActionBar.j6.V8;
            g6Var.t("", z13, true);
        }
        if (z13 && (this.J < i7 || ((!this.K && z11) || (!this.L && z12)))) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.N = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new m11(this, i10));
            this.N.addListener(new i11(this, i10));
            org.telegram.messenger.i20.k(2.0f, this.N);
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
        e80 e80Var = new e80(L, textView);
        e80Var.e = 0.75f;
        spannableStringBuilder.setSpan(e80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        i9 i9Var = this.n;
        i9Var.b();
        i9Var.setAnimatedEmojiDrawable(null);
        if (this.R == null) {
            org.telegram.ui.ActionBar.e6 e6Var = this.b;
            d80 d80Var = new d80(e6Var);
            this.R = d80Var;
            d80Var.k(38.0f);
            this.R.setCallback(i9Var);
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.z6, e6Var);
            this.R.g(org.telegram.ui.ActionBar.j6.r1(0.15f, w02), org.telegram.ui.ActionBar.j6.r1(0.5f, w02), org.telegram.ui.ActionBar.j6.r1(0.6f, w02), org.telegram.ui.ActionBar.j6.r1(0.15f, w02));
            this.R.n = false;
        }
        i9Var.setImageDrawable(this.R);
        i9Var.setScaleX(1.0f);
        i9Var.setScaleY(1.0f);
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
        long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        boolean z11 = o4 == this.O;
        this.O = o4;
        String l10 = org.telegram.messenger.m5.l(org.telegram.messenger.m10.t0, o4);
        TextView textView = this.w;
        textView.setText(l10);
        textView.setVisibility(0);
        int i7 = this.a;
        i9 i9Var = this.n;
        t8 t8Var = this.s;
        if (o4 >= 0) {
            TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(o4));
            t8Var.r(a22);
            i9Var.f(a22, t8Var);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-o4));
            t8Var.q(M0);
            i9Var.f(M0, t8Var);
        }
        i9Var.setScaleX(1.0f);
        i9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        d(tL_forumTopic.unread_count, false, false, tL_forumTopic.unread_reactions_count > 0, z11);
        if (this.F) {
            this.F = false;
        }
    }

    public final void g() {
        int i7 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        int f10 = i0.a.f(this.P ? 1.0f : this.V, org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var));
        this.S = true;
        this.U = f10;
        boolean z10 = this.Q;
        this.T = z10;
        i9 i9Var = this.n;
        if (z10) {
            i9Var.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        } else {
            i9Var.setColorFilter(null);
        }
        i9Var.setEmojiColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        i9Var.invalidate();
    }

    public final void h() {
        float f10 = (1.0f - this.V) * (-org.telegram.messenger.g0.L(3.0f));
        ImageView imageView = this.x;
        imageView.setTranslationX(f10);
        imageView.setVisibility(this.V <= 0.0f ? 8 : 0);
        int i7 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        this.w.setTextColor(i0.a.f(this.P ? 1.0f : this.V, org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var)));
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
        ofFloat.addUpdateListener(new m11(this, 0));
        this.a0.addListener(new org.telegram.ui.nn(24, this, z10));
        this.a0.setInterpolator(er.h);
        this.a0.setDuration(320L);
        this.a0.start();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            TextView textView = this.w;
            float f10 = 1.0f;
            org.telegram.ui.ActionBar.e6 e6Var = this.b;
            if (textView != null) {
                textView.setTextColor(i0.a.f(this.P ? 1.0f : this.V, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.z6, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var)));
            }
            i9 i9Var = this.n;
            if (i9Var != null) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.z6, e6Var);
                int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var);
                if (!this.P) {
                    f10 = this.V;
                }
                int f11 = i0.a.f(f10, w02, w03);
                if (!this.S || f11 != this.U || this.Q != this.T) {
                    g();
                }
            }
            g11 g11Var = this.r;
            if (g11Var != null) {
                g11Var.b.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var));
                if (i9Var != null) {
                    i9Var.invalidate();
                }
            }
            if (this.R != null) {
                int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.z6, e6Var);
                this.R.g(org.telegram.ui.ActionBar.j6.r1(0.15f, w04), org.telegram.ui.ActionBar.j6.r1(0.5f, w04), org.telegram.ui.ActionBar.j6.r1(0.6f, w04), org.telegram.ui.ActionBar.j6.r1(0.15f, w04));
                this.R.n = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
