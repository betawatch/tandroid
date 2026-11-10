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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l11 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
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
    public a80 Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public boolean V;
    public ValueAnimator W;
    public final int a;
    public final org.telegram.ui.ActionBar.h6 b;
    public en0 c;
    public final fi.a5 d;
    public final FrameLayout.LayoutParams e;
    public final h6 f;
    public final bi.s1 h;
    public final k9 n;
    public d11 r;
    public final v8 s;
    public final TextView w;
    public final ImageView x;
    public boolean y;

    public l11(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.D = false;
        this.E = false;
        this.F = org.telegram.ui.ActionBar.m6.U8;
        this.L = 1.0f;
        this.N = 0L;
        this.O = false;
        this.P = false;
        this.a = i7;
        this.b = h6Var;
        fi.a5 a5Var = new fi.a5(this, context);
        this.d = a5Var;
        a5Var.setWillNotDraw(false);
        a5Var.setOrientation(1);
        addView(a5Var, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 1.0f, 0.0f, 0.0f, 0.0f));
        c8.ka.a(a5Var);
        h6 h6Var2 = new h6(false, false, false);
        this.f = h6Var2;
        h6Var2.w(org.telegram.messenger.g0.L(11.0f));
        h6Var2.x(org.telegram.messenger.g0.o());
        h6Var2.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W8, h6Var));
        h6Var2.M = org.telegram.messenger.g0.q.x;
        h6Var2.b = 17;
        bi.s1 s1Var = new bi.s1(this, context, h6Var);
        this.h = s1Var;
        s1Var.setWillNotDraw(false);
        s1Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        a5Var.addView(s1Var, c8.ha.r(-1, -2, 17));
        k9 k9Var = new k9(context);
        this.n = k9Var;
        FrameLayout.LayoutParams e10 = c8.ha.e(34, 34, 17);
        this.e = e10;
        s1Var.addView(k9Var, e10);
        this.s = new v8((org.telegram.ui.ActionBar.h6) null);
        TextView textView = new TextView(context);
        this.w = textView;
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z6, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.Ci;
        textView.setTextColor(i0.a.f(this.U, w02, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        a5Var.addView(textView, c8.ha.t(-1, -2, 17, 4, 0, 4, 0));
        a5Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(2.33f), org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(imageView, d02, M, null, h6Var);
        addView(imageView, c8.ha.d(6, -1.0f, org.telegram.messenger.qs.A1, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-org.telegram.messenger.g0.L(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z9) {
        if (this.D == z9) {
            return;
        }
        this.D = z9;
        this.n.setRoundRadius(org.telegram.messenger.g0.L(z9 ? 36.0f : 3.0f));
        this.h.setPadding(0, org.telegram.messenger.g0.L(z9 ? 7.0f : 4.0f), 0, 0);
        int L = z9 ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(30.0f);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = L;
        layoutParams.height = z9 ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(30.0f);
    }

    public final void a(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        setLayout(false);
        long j10 = this.N;
        long j11 = tL_forumTopic.id;
        boolean z10 = j10 == j11;
        this.P = false;
        this.N = j11;
        this.O = false;
        String str = tL_forumTopic.title;
        TextView textView = this.w;
        textView.setText(str);
        textView.setVisibility(0);
        int i7 = tL_forumTopic.id;
        k9 k9Var = this.n;
        if (i7 == 1) {
            this.P = true;
            k9Var.b();
            k9Var.setAnimatedEmojiDrawable(null);
            k9Var.setImageResource(R.drawable.msg_filled_general);
            k9Var.setScaleX(0.66f);
            k9Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            k9Var.b();
            k9Var.setAnimatedEmojiDrawable(h5.m(org.telegram.messenger.p10.s0, tL_forumTopic.icon_emoji_id, null, 3));
            k9Var.setScaleX(1.0f);
            k9Var.setScaleY(1.0f);
        } else {
            k9Var.setAnimatedEmojiDrawable(null);
            k9Var.setImageDrawable(qg.d.e(tL_forumTopic));
            k9Var.setScaleX(1.0f);
            k9Var.setScaleY(1.0f);
        }
        setSelected(z9);
        g();
        d(tL_forumTopic.unread_count, org.telegram.messenger.qp.s1(this.a).r2(j3, tL_forumTopic.id, null), tL_forumTopic.unread_mentions_count > 0, tL_forumTopic.unread_reactions_count > 0, z10);
        boolean z11 = tL_forumTopic.pinned;
        if (this.E != z11) {
            this.E = z11;
        }
        h();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
    }

    public final void b(boolean z9, boolean z10) {
        setLayout(z9);
        this.P = true;
        this.O = true;
        String M0 = org.telegram.messenger.id.M0(2131748251, null);
        TextView textView = this.w;
        textView.setText(M0);
        textView.setVisibility(0);
        k9 k9Var = this.n;
        k9Var.b();
        k9Var.setAnimatedEmojiDrawable(null);
        k9Var.setImageResource(R.drawable.emoji_tabs_new3);
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        setSelected(z10);
        g();
        h();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
    }

    public final void c(boolean z9, boolean z10, boolean z11) {
        setLayout(z10);
        this.N = -1L;
        this.P = true;
        this.O = false;
        String M0 = org.telegram.messenger.id.M0(z9 ? 2131753064 : 2131754288, null);
        TextView textView = this.w;
        textView.setText(M0);
        textView.setVisibility(z9 ? 8 : 0);
        k9 k9Var = this.n;
        k9Var.b();
        k9Var.setAnimatedEmojiDrawable(null);
        if (z9) {
            d11 d11Var = new d11(getContext());
            d11Var.b.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.b));
            k9Var.setImageDrawable(d11Var);
            this.r = d11Var;
        } else {
            k9Var.setImageResource(R.drawable.other_chats);
            this.r = null;
        }
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        setSelected(z11);
        g();
        h();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
    }

    public final void d(int i7, boolean z9, boolean z10, boolean z11, boolean z12) {
        h6 h6Var = this.f;
        int i10 = 1;
        if (z11) {
            this.F = org.telegram.ui.ActionBar.m6.Z5;
            if (this.H == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                wp wpVar = new wp(R.drawable.mini_like_filled, 0);
                wpVar.H = 0.8f;
                wpVar.I = 0.8f;
                wpVar.G = 0.5f;
                wpVar.r = -org.telegram.messenger.g0.L(3.0f);
                wpVar.s = 0.0f;
                spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
                this.H = spannableStringBuilder;
            }
            h6Var.t(this.H, z12, true);
        } else if (z10) {
            this.F = z9 ? org.telegram.ui.ActionBar.m6.V8 : org.telegram.ui.ActionBar.m6.U8;
            if (this.G == null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                wp wpVar2 = new wp(R.drawable.mini_mention_filled_16, 0);
                wpVar2.H = 0.8f;
                wpVar2.I = 0.8f;
                wpVar2.G = 0.5f;
                wpVar2.r = -org.telegram.messenger.g0.L(3.0f);
                wpVar2.s = 0.0f;
                spannableStringBuilder2.setSpan(wpVar2, 0, 1, 33);
                this.G = spannableStringBuilder2;
            }
            h6Var.t(this.G, z12, true);
        } else if (i7 > 0) {
            this.F = z9 ? org.telegram.ui.ActionBar.m6.V8 : org.telegram.ui.ActionBar.m6.U8;
            h6Var.t(org.telegram.messenger.id.E(i7, ','), z12, true);
        } else {
            this.F = org.telegram.ui.ActionBar.m6.V8;
            h6Var.t("", z12, true);
        }
        if (z12 && (this.I < i7 || ((!this.J && z10) || (!this.K && z11)))) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new j11(this, i10));
            this.M.addListener(new f11(this, i10));
            org.telegram.messenger.camera.q.i(2.0f, this.M);
            this.M.setDuration(200L);
            this.M.start();
        }
        this.I = i7;
        this.J = z10;
        this.K = z11;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.N = -1L;
        this.P = true;
        this.O = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int L = org.telegram.messenger.g0.L(38.0f);
        TextView textView = this.w;
        b80 b80Var = new b80(L, textView);
        b80Var.e = 0.75f;
        spannableStringBuilder.setSpan(b80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        k9 k9Var = this.n;
        k9Var.b();
        k9Var.setAnimatedEmojiDrawable(null);
        if (this.Q == null) {
            org.telegram.ui.ActionBar.h6 h6Var = this.b;
            a80 a80Var = new a80(h6Var);
            this.Q = a80Var;
            a80Var.k(38.0f);
            this.Q.setCallback(k9Var);
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z6, h6Var);
            this.Q.g(org.telegram.ui.ActionBar.m6.r1(0.15f, w02), org.telegram.ui.ActionBar.m6.r1(0.5f, w02), org.telegram.ui.ActionBar.m6.r1(0.6f, w02), org.telegram.ui.ActionBar.m6.r1(0.15f, w02));
            this.Q.n = false;
        }
        k9Var.setImageDrawable(this.Q);
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.E) {
            this.E = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        setLayout(true);
        this.O = false;
        this.P = false;
        long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        boolean z10 = o4 == this.N;
        this.N = o4;
        String l10 = org.telegram.messenger.m5.l(org.telegram.messenger.p10.s0, o4);
        TextView textView = this.w;
        textView.setText(l10);
        textView.setVisibility(0);
        int i7 = this.a;
        k9 k9Var = this.n;
        v8 v8Var = this.s;
        if (o4 >= 0) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(o4));
            v8Var.r(a22);
            k9Var.e(a22, v8Var);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-o4));
            v8Var.q(M0);
            k9Var.e(M0, v8Var);
        }
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        h();
        setSelected(z9);
        d(tL_forumTopic.unread_count, false, false, tL_forumTopic.unread_reactions_count > 0, z10);
        if (this.E) {
            this.E = false;
        }
    }

    public final void g() {
        int i7 = org.telegram.ui.ActionBar.m6.z6;
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        int f10 = i0.a.f(this.O ? 1.0f : this.U, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var));
        this.R = true;
        this.T = f10;
        boolean z9 = this.P;
        this.S = z9;
        k9 k9Var = this.n;
        if (z9) {
            k9Var.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        } else {
            k9Var.setColorFilter(null);
        }
        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        k9Var.invalidate();
    }

    public final void h() {
        float f10 = (1.0f - this.U) * (-org.telegram.messenger.g0.L(3.0f));
        ImageView imageView = this.x;
        imageView.setTranslationX(f10);
        imageView.setVisibility(this.U <= 0.0f ? 8 : 0);
        int i7 = org.telegram.ui.ActionBar.m6.z6;
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        this.w.setTextColor(i0.a.f(this.O ? 1.0f : this.U, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), TLObject.FLAG_30), i10);
    }

    public void setReorder(boolean z9) {
        this.y = z9;
        this.d.invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z9) {
        if (this.V == z9) {
            return;
        }
        this.V = z9;
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, z9 ? 1.0f : 0.0f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new j11(this, 0));
        this.W.addListener(new s9(23, this, z9));
        this.W.setInterpolator(wq.h);
        this.W.setDuration(320L);
        this.W.start();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            TextView textView = this.w;
            float f10 = 1.0f;
            org.telegram.ui.ActionBar.h6 h6Var = this.b;
            if (textView != null) {
                textView.setTextColor(i0.a.f(this.O ? 1.0f : this.U, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z6, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var)));
            }
            k9 k9Var = this.n;
            if (k9Var != null) {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z6, h6Var);
                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var);
                if (!this.O) {
                    f10 = this.U;
                }
                int f11 = i0.a.f(f10, w02, w03);
                if (!this.R || f11 != this.T || this.P != this.S) {
                    g();
                }
            }
            d11 d11Var = this.r;
            if (d11Var != null) {
                d11Var.b.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var));
                if (k9Var != null) {
                    k9Var.invalidate();
                }
            }
            if (this.Q != null) {
                int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z6, h6Var);
                this.Q.g(org.telegram.ui.ActionBar.m6.r1(0.15f, w04), org.telegram.ui.ActionBar.m6.r1(0.5f, w04), org.telegram.ui.ActionBar.m6.r1(0.6f, w04), org.telegram.ui.ActionBar.m6.r1(0.15f, w04));
                this.Q.n = false;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
