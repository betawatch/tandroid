// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class k1c extends FrameLayout implements snb {
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
    public va6 R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public final int a;
    public ValueAnimator a0;
    public final vnb b;
    public sca c;
    public final g7 d;
    public final FrameLayout.LayoutParams e;
    public final hn f;
    public final gb0 h;
    public final de0 n;
    public d1c r;
    public final rb0 s;
    public final TextView w;
    public final ImageView x;
    public boolean y;

    public k1c(int i, vnb vnbVar, Context context) {
        super(context);
        this.E = false;
        this.F = false;
        this.G = aob.U8;
        this.M = 1.0f;
        this.O = 0L;
        this.P = false;
        this.Q = false;
        this.a = i;
        this.b = vnbVar;
        g7 g7Var = new g7(this, context);
        this.d = g7Var;
        g7Var.setWillNotDraw(false);
        g7Var.setOrientation(1);
        addView(g7Var, tre.d(-1, -1.0f, jn7.D1, 1.0f, 0.0f, 0.0f, 0.0f));
        iye.a(g7Var);
        hn hnVar = new hn(false, false, false);
        this.f = hnVar;
        hnVar.w(hl.L(11.0f));
        hnVar.x(hl.o());
        hnVar.u(aob.v0(aob.W8, vnbVar));
        hnVar.N = hl.q.x;
        hnVar.b = 17;
        gb0 gb0Var = new gb0(this, context, vnbVar);
        this.h = gb0Var;
        gb0Var.setWillNotDraw(false);
        gb0Var.setPadding(0, hl.L(4.0f), 0, 0);
        g7Var.addView(gb0Var, tre.r(-1, -2, 17));
        de0 de0Var = new de0(context);
        this.n = de0Var;
        FrameLayout.LayoutParams e = tre.e(34, 34, 17);
        this.e = e;
        gb0Var.addView(de0Var, e);
        this.s = new rb0((vnb) null);
        TextView textView = new TextView(context);
        this.w = textView;
        int v0 = aob.v0(aob.z6, vnbVar);
        int i2 = aob.Fi;
        textView.setTextColor(vm2.f(this.V, v0, aob.v0(i2, vnbVar)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(hl.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        g7Var.addView(textView, tre.t(-1, -2, 17, 4, 0, 4, 0));
        g7Var.setPadding(0, 0, 0, hl.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ShapeDrawable b0 = aob.b0(hl.L(2.33f), aob.v0(i2, vnbVar));
        uob M = yob.M(i2);
        imageView.setBackground(b0);
        yob.j(imageView, b0, M, null, vnbVar);
        addView(imageView, tre.d(6, -1.0f, jn7.z1, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-hl.L(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
        this.n.setRoundRadius(hl.L(z ? 36.0f : 3.0f));
        this.h.setPadding(0, hl.L(z ? 7.0f : 4.0f), 0, 0);
        int L = z ? hl.L(28.0f) : hl.L(30.0f);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = L;
        layoutParams.height = z ? hl.L(28.0f) : hl.L(30.0f);
    }

    public final void a(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        setLayout(false);
        long j2 = this.O;
        long j3 = tL_forumTopic.id;
        boolean z2 = j2 == j3;
        this.Q = false;
        this.O = j3;
        this.P = false;
        String str = tL_forumTopic.title;
        TextView textView = this.w;
        textView.setText(str);
        textView.setVisibility(0);
        int i = tL_forumTopic.id;
        de0 de0Var = this.n;
        if (i == 1) {
            this.Q = true;
            de0Var.b();
            de0Var.setAnimatedEmojiDrawable(null);
            de0Var.setImageResource(R.drawable.msg_filled_general);
            de0Var.setScaleX(0.66f);
            de0Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            de0Var.b();
            de0Var.setAnimatedEmojiDrawable(wl.m(yac.t0, tL_forumTopic.icon_emoji_id, null, 3));
            de0Var.setScaleX(1.0f);
            de0Var.setScaleY(1.0f);
        } else {
            de0Var.setAnimatedEmojiDrawable(null);
            de0Var.setImageDrawable(ro4.f(tL_forumTopic));
            de0Var.setScaleX(1.0f);
            de0Var.setScaleY(1.0f);
        }
        setSelected(z);
        g();
        d(tL_forumTopic.unread_count, uc7.s1(this.a).p2(j, tL_forumTopic.id, null), tL_forumTopic.unread_mentions_count > 0, tL_forumTopic.unread_reactions_count > 0, z2);
        boolean z3 = tL_forumTopic.pinned;
        if (this.F != z3) {
            this.F = z3;
        }
        h();
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.z6));
    }

    public final void b(boolean z, boolean z2) {
        setLayout(z);
        this.Q = true;
        this.P = true;
        String M0 = ob6.M0(2131748005, null);
        TextView textView = this.w;
        textView.setText(M0);
        textView.setVisibility(0);
        de0 de0Var = this.n;
        de0Var.b();
        de0Var.setAnimatedEmojiDrawable(null);
        de0Var.setImageResource(R.drawable.emoji_tabs_new3);
        de0Var.setScaleX(1.0f);
        de0Var.setScaleY(1.0f);
        setSelected(z2);
        g();
        h();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        setLayout(z2);
        this.O = -1L;
        this.Q = true;
        this.P = false;
        String M0 = ob6.M0(z ? 2131753057 : 2131754281, null);
        TextView textView = this.w;
        textView.setText(M0);
        textView.setVisibility(z ? 8 : 0);
        de0 de0Var = this.n;
        de0Var.b();
        de0Var.setAnimatedEmojiDrawable(null);
        if (z) {
            d1c d1cVar = new d1c(getContext());
            d1cVar.b.setColor(aob.v0(aob.Fi, this.b));
            de0Var.setImageDrawable(d1cVar);
            this.r = d1cVar;
        } else {
            de0Var.setImageResource(R.drawable.other_chats);
            this.r = null;
        }
        de0Var.setScaleX(1.0f);
        de0Var.setScaleY(1.0f);
        setSelected(z3);
        g();
        h();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
    }

    public final void d(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        hn hnVar = this.f;
        byte b = 1;
        if (z3) {
            this.G = aob.Z5;
            SpannableStringBuilder spannableStringBuilder = this.I;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder("❤️");
                wm2 wm2Var = new wm2(R.drawable.mini_like_filled, 0);
                wm2Var.I = 0.8f;
                wm2Var.J = 0.8f;
                wm2Var.H = 0.5f;
                wm2Var.r = -hl.L(3.0f);
                wm2Var.s = 0.0f;
                spannableStringBuilder.setSpan(wm2Var, 0, spannableStringBuilder.length(), 33);
                this.I = spannableStringBuilder;
            }
            hnVar.t(spannableStringBuilder, z4, true);
        } else if (z2) {
            this.G = z ? aob.V8 : aob.U8;
            SpannableStringBuilder spannableStringBuilder2 = this.H;
            if (spannableStringBuilder2 == null) {
                spannableStringBuilder2 = new SpannableStringBuilder("@");
                wm2 wm2Var2 = new wm2(R.drawable.mini_mention_filled_16, 0);
                wm2Var2.I = 0.8f;
                wm2Var2.J = 0.8f;
                wm2Var2.H = 0.5f;
                wm2Var2.r = -hl.L(3.0f);
                wm2Var2.s = 0.0f;
                spannableStringBuilder2.setSpan(wm2Var2, 0, 1, 33);
                this.H = spannableStringBuilder2;
            }
            hnVar.t(spannableStringBuilder2, z4, true);
        } else if (i > 0) {
            this.G = z ? aob.V8 : aob.U8;
            hnVar.t(ob6.E(i, ','), z4, true);
        } else {
            this.G = aob.V8;
            hnVar.t("", z4, true);
        }
        if (z4 && (this.J < i || ((!this.K && z2) || (!this.L && z3)))) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.N = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new i1c(this, b));
            this.N.addListener(new omb(this, (byte) 7));
            c00.o(2.0f, this.N);
            this.N.setDuration(200L);
            this.N.start();
        }
        this.J = i;
        this.K = z2;
        this.L = z3;
        this.h.invalidate();
    }

    public final void e() {
        setLayout(false);
        this.O = -1L;
        this.Q = true;
        this.P = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        int L = hl.L(38.0f);
        TextView textView = this.w;
        ya6 ya6Var = new ya6(L, textView);
        ya6Var.e = 0.75f;
        spannableStringBuilder.setSpan(ya6Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        de0 de0Var = this.n;
        de0Var.b();
        de0Var.setAnimatedEmojiDrawable(null);
        va6 va6Var = this.R;
        if (va6Var == null) {
            vnb vnbVar = this.b;
            va6 va6Var2 = new va6(vnbVar);
            this.R = va6Var2;
            va6Var2.j(38.0f);
            this.R.setCallback(de0Var);
            int v0 = aob.v0(aob.z6, vnbVar);
            this.R.g(aob.p1(0.15f, v0), aob.p1(0.5f, v0), aob.p1(0.6f, v0), aob.p1(0.15f, v0));
            va6Var = this.R;
            va6Var.n = false;
        }
        de0Var.setImageDrawable(va6Var);
        de0Var.setScaleX(1.0f);
        de0Var.setScaleY(1.0f);
        setSelected(false);
        g();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
        h();
    }

    public final void f(TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        setLayout(true);
        this.P = false;
        this.Q = false;
        long n = wf3.n(tL_forumTopic.from_id);
        boolean z2 = n == this.O;
        this.O = n;
        String k = wf3.k(yac.t0, n);
        TextView textView = this.w;
        textView.setText(k);
        textView.setVisibility(0);
        de0 de0Var = this.n;
        rb0 rb0Var = this.s;
        int i = this.a;
        if (n >= 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(n));
            rb0Var.q(X1);
            de0Var.f(X1, rb0Var);
        } else {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-n));
            rb0Var.p(M0);
            de0Var.f(M0, rb0Var);
        }
        de0Var.setScaleX(1.0f);
        de0Var.setScaleY(1.0f);
        h();
        setSelected(z);
        d(tL_forumTopic.unread_count, false, false, tL_forumTopic.unread_reactions_count > 0, z2);
        if (this.F) {
            this.F = false;
        }
    }

    public final void g() {
        int i = aob.z6;
        vnb vnbVar = this.b;
        int f = vm2.f(this.P ? 1.0f : this.V, aob.v0(i, vnbVar), aob.v0(aob.Fi, vnbVar));
        this.S = true;
        this.U = f;
        boolean z = this.Q;
        this.T = z;
        de0 de0Var = this.n;
        if (z) {
            de0Var.setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
        } else {
            de0Var.setColorFilter(null);
        }
        de0Var.setEmojiColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
        de0Var.invalidate();
    }

    public final void h() {
        float f = (1.0f - this.V) * (-hl.L(3.0f));
        ImageView imageView = this.x;
        imageView.setTranslationX(f);
        imageView.setVisibility(this.V <= 0.0f ? 8 : 0);
        int i = aob.z6;
        vnb vnbVar = this.b;
        this.w.setTextColor(vm2.f(this.P ? 1.0f : this.V, aob.v0(i, vnbVar), aob.v0(aob.Fi, vnbVar)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(64.0f), TLObject.FLAG_30), i2);
    }

    public void setReorder(boolean z) {
        this.y = z;
        this.d.invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        if (this.W == z) {
            return;
        }
        this.W = z;
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, z ? 1.0f : 0.0f);
        this.a0 = ofFloat;
        ofFloat.addUpdateListener(new i1c(this, (byte) 0));
        this.a0.addListener(new i1a((byte) 11, this, z));
        this.a0.setInterpolator(k43.h);
        this.a0.setDuration(320L);
        this.a0.start();
    }

    @Override // snb
    public final void updateColors() {
        try {
            TextView textView = this.w;
            vnb vnbVar = this.b;
            if (textView != null) {
                textView.setTextColor(vm2.f(this.P ? 1.0f : this.V, aob.v0(aob.z6, vnbVar), aob.v0(aob.Fi, vnbVar)));
            }
            de0 de0Var = this.n;
            if (de0Var != null) {
                int f = vm2.f(this.P ? 1.0f : this.V, aob.v0(aob.z6, vnbVar), aob.v0(aob.Fi, vnbVar));
                if (!this.S || f != this.U || this.Q != this.T) {
                    g();
                }
            }
            d1c d1cVar = this.r;
            if (d1cVar != null) {
                d1cVar.b.setColor(aob.v0(aob.Fi, vnbVar));
                if (de0Var != null) {
                    de0Var.invalidate();
                }
            }
            if (this.R != null) {
                int v0 = aob.v0(aob.z6, vnbVar);
                this.R.g(aob.p1(0.15f, v0), aob.p1(0.5f, v0), aob.p1(0.6f, v0), aob.p1(0.15f, v0));
                this.R.n = false;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
