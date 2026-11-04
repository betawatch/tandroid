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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f11 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
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
    public w70 R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public final int a;
    public ValueAnimator a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public hn0 c;
    public final gi.y4 d;
    public final FrameLayout.LayoutParams e;
    public final g6 f;
    public final ci.l1 h;
    public final k9 n;
    public y01 r;
    public final u8 s;
    public final TextView w;
    public final ImageView x;
    public boolean y;

    public f11(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.E = false;
        this.F = false;
        this.G = org.telegram.ui.ActionBar.k6.U8;
        this.M = 1.0f;
        this.O = 0L;
        this.P = false;
        this.Q = false;
        this.a = i3;
        this.b = e6Var;
        gi.y4 y4Var = new gi.y4(this, context);
        this.d = y4Var;
        y4Var.setWillNotDraw(false);
        y4Var.setOrientation(1);
        addView(y4Var, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 1.0f, 0.0f, 0.0f, 0.0f));
        b8.pf.a(y4Var);
        g6 g6Var = new g6(false, false, false);
        this.f = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W8, e6Var));
        g6Var.M = org.telegram.messenger.g0.q.x;
        g6Var.b = 17;
        ci.l1 l1Var = new ci.l1(this, context, e6Var);
        this.h = l1Var;
        l1Var.setWillNotDraw(false);
        l1Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        y4Var.addView(l1Var, b8.mf.r(-1, -2, 17));
        k9 k9Var = new k9(context);
        this.n = k9Var;
        FrameLayout.LayoutParams e10 = b8.mf.e(34, 34, 17);
        this.e = e10;
        l1Var.addView(k9Var, e10);
        this.s = new u8((org.telegram.ui.ActionBar.e6) null);
        TextView textView = new TextView(context);
        this.w = textView;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, e6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        textView.setTextColor(i0.a.f(this.V, w02, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        y4Var.addView(textView, b8.mf.t(-1, -2, 17, 4, 0, 4, 0));
        y4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(2.33f), org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(imageView, d02, N, null, e6Var);
        addView(imageView, b8.mf.d(6, -1.0f, org.telegram.messenger.hs.A1, -3.0f, 3.0f, 0.0f, 3.0f));
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

    public final void a(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        setLayout(false);
        long j11 = this.O;
        long j12 = tL_forumTopic.id;
        boolean z11 = j11 == j12;
        this.Q = false;
        this.O = j12;
        this.P = false;
        String str = tL_forumTopic.title;
        TextView textView = this.w;
        textView.setText(str);
        textView.setVisibility(0);
        int i3 = tL_forumTopic.id;
        k9 k9Var = this.n;
        if (i3 == 1) {
            this.Q = true;
            k9Var.b();
            k9Var.setAnimatedEmojiDrawable(null);
            k9Var.setImageResource(R.drawable.msg_filled_general);
            k9Var.setScaleX(0.66f);
            k9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            k9Var.b();
            k9Var.setAnimatedEmojiDrawable(g5.m(org.telegram.messenger.h10.t0, tL_forumTopic.icon_emoji_id, null, 3));
            k9Var.setScaleX(1.0f);
            k9Var.setScaleY(1.0f);
        } else {
            k9Var.setAnimatedEmojiDrawable(null);
            k9Var.setImageDrawable(rg.c.e(tL_forumTopic));
            k9Var.setScaleX(1.0f);
            k9Var.setScaleY(1.0f);
        }
        setSelected(z10);
        g();
        d(tL_forumTopic.unread_count, org.telegram.messenger.hp.s1(this.a).r2(j10, tL_forumTopic.id, null), tL_forumTopic.unread_mentions_count > 0, tL_forumTopic.unread_reactions_count > 0, z11);
        boolean z12 = tL_forumTopic.pinned;
        if (this.F != z12) {
            this.F = z12;
        }
        h();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
    }

    public final void b(boolean z10, boolean z11) {
        setLayout(z10);
        this.Q = true;
        this.P = true;
        String M0 = org.telegram.messenger.bd.M0(2131748259, null);
        TextView textView = this.w;
        textView.setText(M0);
        textView.setVisibility(0);
        k9 k9Var = this.n;
        k9Var.b();
        k9Var.setAnimatedEmojiDrawable(null);
        k9Var.setImageResource(R.drawable.emoji_tabs_new3);
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
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
        String M0 = org.telegram.messenger.bd.M0(z10 ? 2131753064 : 2131754288, null);
        TextView textView = this.w;
        textView.setText(M0);
        textView.setVisibility(z10 ? 8 : 0);
        k9 k9Var = this.n;
        k9Var.b();
        k9Var.setAnimatedEmojiDrawable(null);
        if (z10) {
            y01 y01Var = new y01(getContext());
            y01Var.b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.b));
            k9Var.setImageDrawable(y01Var);
            this.r = y01Var;
        } else {
            k9Var.setImageResource(R.drawable.other_chats);
            this.r = null;
        }
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        setSelected(z12);
        g();
        h();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
    }

    public final void d(int i3, boolean z10, boolean z11, boolean z12, boolean z13) {
        g6 g6Var = this.f;
        int i10 = 1;
        if (z12) {
            this.G = org.telegram.ui.ActionBar.k6.Z5;
            if (this.I == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                wp wpVar = new wp(R.drawable.mini_like_filled, 0);
                wpVar.I = 0.8f;
                wpVar.J = 0.8f;
                wpVar.H = 0.5f;
                wpVar.r = -org.telegram.messenger.g0.L(3.0f);
                wpVar.s = 0.0f;
                spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
                this.I = spannableStringBuilder;
            }
            g6Var.t(this.I, z13, true);
        } else if (z11) {
            this.G = z10 ? org.telegram.ui.ActionBar.k6.V8 : org.telegram.ui.ActionBar.k6.U8;
            if (this.H == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                wp wpVar2 = new wp(R.drawable.mini_mention_filled_16, 0);
                wpVar2.I = 0.8f;
                wpVar2.J = 0.8f;
                wpVar2.H = 0.5f;
                wpVar2.r = -org.telegram.messenger.g0.L(3.0f);
                wpVar2.s = 0.0f;
                spannableStringBuilder2.setSpan(wpVar2, 0, 1, 33);
                this.H = spannableStringBuilder2;
            }
            g6Var.t(this.H, z13, true);
        } else if (i3 > 0) {
            this.G = z10 ? org.telegram.ui.ActionBar.k6.V8 : org.telegram.ui.ActionBar.k6.U8;
            g6Var.t(org.telegram.messenger.bd.E(i3, ','), z13, true);
        } else {
            this.G = org.telegram.ui.ActionBar.k6.V8;
            g6Var.t("", z13, true);
        }
        if (z13 && (this.J < i3 || ((!this.K && z11) || (!this.L && z12)))) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.N = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new d11(this, i10));
            this.N.addListener(new j01(this, 2));
            org.telegram.messenger.camera.q.i(2.0f, this.N);
            this.N.setDuration(200L);
            this.N.start();
        }
        this.J = i3;
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
        x70 x70Var = new x70(L, textView);
        x70Var.e = 0.75f;
        spannableStringBuilder.setSpan(x70Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        k9 k9Var = this.n;
        k9Var.b();
        k9Var.setAnimatedEmojiDrawable(null);
        if (this.R == null) {
            org.telegram.ui.ActionBar.e6 e6Var = this.b;
            w70 w70Var = new w70(e6Var);
            this.R = w70Var;
            w70Var.k(38.0f);
            this.R.setCallback(k9Var);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, e6Var);
            this.R.g(org.telegram.ui.ActionBar.k6.r1(0.15f, w02), org.telegram.ui.ActionBar.k6.r1(0.5f, w02), org.telegram.ui.ActionBar.k6.r1(0.6f, w02), org.telegram.ui.ActionBar.k6.r1(0.15f, w02));
            this.R.n = false;
        }
        k9Var.setImageDrawable(this.R);
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
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
        long o10 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        boolean z11 = o10 == this.O;
        this.O = o10;
        String l10 = org.telegram.messenger.m5.l(org.telegram.messenger.h10.t0, o10);
        TextView textView = this.w;
        textView.setText(l10);
        textView.setVisibility(0);
        int i3 = this.a;
        k9 k9Var = this.n;
        u8 u8Var = this.s;
        if (o10 >= 0) {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(o10));
            u8Var.r(a22);
            k9Var.e(a22, u8Var);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-o10));
            u8Var.q(M0);
            k9Var.e(M0, u8Var);
        }
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        h();
        setSelected(z10);
        d(tL_forumTopic.unread_count, false, false, tL_forumTopic.unread_reactions_count > 0, z11);
        if (this.F) {
            this.F = false;
        }
    }

    public final void g() {
        int i3 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        int f10 = i0.a.f(this.P ? 1.0f : this.V, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
        this.S = true;
        this.U = f10;
        boolean z10 = this.Q;
        this.T = z10;
        k9 k9Var = this.n;
        if (z10) {
            k9Var.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        } else {
            k9Var.setColorFilter(null);
        }
        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        k9Var.invalidate();
    }

    public final void h() {
        float f10 = (1.0f - this.V) * (-org.telegram.messenger.g0.L(3.0f));
        ImageView imageView = this.x;
        imageView.setTranslationX(f10);
        imageView.setVisibility(this.V <= 0.0f ? 8 : 0);
        int i3 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        this.w.setTextColor(i0.a.f(this.P ? 1.0f : this.V, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
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
        ofFloat.addUpdateListener(new d11(this, 0));
        this.a0.addListener(new s9(23, this, z10));
        this.a0.setInterpolator(xq.h);
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
                textView.setTextColor(i0.a.f(this.P ? 1.0f : this.V, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var)));
            }
            k9 k9Var = this.n;
            if (k9Var != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, e6Var);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
                if (!this.P) {
                    f10 = this.V;
                }
                int f11 = i0.a.f(f10, w02, w03);
                if (!this.S || f11 != this.U || this.Q != this.T) {
                    g();
                }
            }
            y01 y01Var = this.r;
            if (y01Var != null) {
                y01Var.b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
                if (k9Var != null) {
                    k9Var.invalidate();
                }
            }
            if (this.R != null) {
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, e6Var);
                this.R.g(org.telegram.ui.ActionBar.k6.r1(0.15f, w04), org.telegram.ui.ActionBar.k6.r1(0.5f, w04), org.telegram.ui.ActionBar.k6.r1(0.6f, w04), org.telegram.ui.ActionBar.k6.r1(0.15f, w04));
                this.R.n = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
