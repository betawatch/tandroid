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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jxb extends FrameLayout implements tjb {
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
    public r86 R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public final int a;
    public ValueAnimator a0;
    public final wjb b;
    public c9a c;
    public final f7 d;
    public final FrameLayout.LayoutParams e;
    public final gn f;
    public final eb0 h;
    public final be0 n;
    public cxb r;
    public final pb0 s;
    public final TextView w;
    public final ImageView x;
    public boolean y;

    public jxb(int i, wjb wjbVar, Context context) {
        super(context);
        this.E = false;
        this.F = false;
        this.G = bkb.T8;
        this.M = 1.0f;
        this.O = 0L;
        this.P = false;
        this.Q = false;
        this.a = i;
        this.b = wjbVar;
        f7 f7Var = new f7(this, context);
        this.d = f7Var;
        f7Var.setWillNotDraw(false);
        f7Var.setOrientation(1);
        addView(f7Var, nme.d(-1, -1.0f, kk7.D1, 1.0f, 0.0f, 0.0f, 0.0f));
        ote.a(f7Var);
        gn gnVar = new gn(false, false, false);
        this.f = gnVar;
        gnVar.w(gl.L(11.0f));
        gnVar.x(gl.o());
        gnVar.u(bkb.v0(bkb.V8, wjbVar));
        gnVar.N = gl.q.x;
        gnVar.b = 17;
        eb0 eb0Var = new eb0(this, context, wjbVar);
        this.h = eb0Var;
        eb0Var.setWillNotDraw(false);
        eb0Var.setPadding(0, gl.L(4.0f), 0, 0);
        f7Var.addView(eb0Var, nme.r(-1, -2, 17));
        be0 be0Var = new be0(context);
        this.n = be0Var;
        FrameLayout.LayoutParams e = nme.e(34, 34, 17);
        this.e = e;
        eb0Var.addView(be0Var, e);
        this.s = new pb0((wjb) null);
        TextView textView = new TextView(context);
        this.w = textView;
        int v0 = bkb.v0(bkb.y6, wjbVar);
        int i2 = bkb.Ei;
        textView.setTextColor(bm2.f(this.V, v0, bkb.v0(i2, wjbVar)));
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTypeface(gl.o());
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f7Var.addView(textView, nme.t(-1, -2, 17, 4, 0, 4, 0));
        f7Var.setPadding(0, 0, 0, gl.L(4.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ShapeDrawable b0 = bkb.b0(gl.L(2.33f), bkb.v0(i2, wjbVar));
        vkb M = zkb.M(i2);
        imageView.setBackground(b0);
        zkb.j(imageView, b0, M, null, wjbVar);
        addView(imageView, nme.d(6, -1.0f, kk7.z1, -3.0f, 3.0f, 0.0f, 3.0f));
        imageView.setTranslationX(-gl.L(3.0f));
        imageView.setVisibility(8);
    }

    private void setLayout(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
        this.n.setRoundRadius(gl.L(z ? 36.0f : 3.0f));
        this.h.setPadding(0, gl.L(z ? 7.0f : 4.0f), 0, 0);
        int L = z ? gl.L(28.0f) : gl.L(30.0f);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = L;
        layoutParams.height = z ? gl.L(28.0f) : gl.L(30.0f);
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
        be0 be0Var = this.n;
        if (i == 1) {
            this.Q = true;
            be0Var.b();
            be0Var.setAnimatedEmojiDrawable(null);
            be0Var.setImageResource(R.drawable.msg_filled_general);
            be0Var.setScaleX(0.66f);
            be0Var.setScaleY(0.66f);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            be0Var.b();
            be0Var.setAnimatedEmojiDrawable(vl.m(y6c.t0, tL_forumTopic.icon_emoji_id, null, 3));
            be0Var.setScaleX(1.0f);
            be0Var.setScaleY(1.0f);
        } else {
            be0Var.setAnimatedEmojiDrawable(null);
            be0Var.setImageDrawable(mm4.f(tL_forumTopic));
            be0Var.setScaleX(1.0f);
            be0Var.setScaleY(1.0f);
        }
        setSelected(z);
        g();
        d(tL_forumTopic.unread_count, na7.q1(this.a).n2(j, tL_forumTopic.id, null), tL_forumTopic.unread_mentions_count > 0, tL_forumTopic.unread_reactions_count > 0, z2);
        boolean z3 = tL_forumTopic.pinned;
        if (this.F != z3) {
            this.F = z3;
        }
        h();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.y6));
    }

    public final void b(boolean z, boolean z2) {
        setLayout(z);
        this.Q = true;
        this.P = true;
        String M0 = k96.M0(2131748059, null);
        TextView textView = this.w;
        textView.setText(M0);
        textView.setVisibility(0);
        be0 be0Var = this.n;
        be0Var.b();
        be0Var.setAnimatedEmojiDrawable(null);
        be0Var.setImageResource(R.drawable.emoji_tabs_new3);
        be0Var.setScaleX(1.0f);
        be0Var.setScaleY(1.0f);
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
        String M0 = k96.M0(z ? 2131753061 : 2131754285, null);
        TextView textView = this.w;
        textView.setText(M0);
        textView.setVisibility(z ? 8 : 0);
        be0 be0Var = this.n;
        be0Var.b();
        be0Var.setAnimatedEmojiDrawable(null);
        if (z) {
            cxb cxbVar = new cxb(getContext());
            cxbVar.b.setColor(bkb.v0(bkb.Ei, this.b));
            be0Var.setImageDrawable(cxbVar);
            this.r = cxbVar;
        } else {
            be0Var.setImageResource(R.drawable.other_chats);
            this.r = null;
        }
        be0Var.setScaleX(1.0f);
        be0Var.setScaleY(1.0f);
        setSelected(z3);
        g();
        h();
        d(0, true, false, false, false);
        if (this.F) {
            this.F = false;
        }
    }

    public final void d(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        gn gnVar = this.f;
        byte b = 1;
        if (z3) {
            this.G = bkb.Y5;
            SpannableStringBuilder spannableStringBuilder = this.I;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder("❤️");
                cm2 cm2Var = new cm2(R.drawable.mini_like_filled, 0);
                cm2Var.I = 0.8f;
                cm2Var.J = 0.8f;
                cm2Var.H = 0.5f;
                cm2Var.r = -gl.L(3.0f);
                cm2Var.s = 0.0f;
                spannableStringBuilder.setSpan(cm2Var, 0, spannableStringBuilder.length(), 33);
                this.I = spannableStringBuilder;
            }
            gnVar.t(spannableStringBuilder, z4, true);
        } else if (z2) {
            this.G = z ? bkb.U8 : bkb.T8;
            SpannableStringBuilder spannableStringBuilder2 = this.H;
            if (spannableStringBuilder2 == null) {
                spannableStringBuilder2 = new SpannableStringBuilder("@");
                cm2 cm2Var2 = new cm2(R.drawable.mini_mention_filled_16, 0);
                cm2Var2.I = 0.8f;
                cm2Var2.J = 0.8f;
                cm2Var2.H = 0.5f;
                cm2Var2.r = -gl.L(3.0f);
                cm2Var2.s = 0.0f;
                spannableStringBuilder2.setSpan(cm2Var2, 0, 1, 33);
                this.H = spannableStringBuilder2;
            }
            gnVar.t(spannableStringBuilder2, z4, true);
        } else if (i > 0) {
            this.G = z ? bkb.U8 : bkb.T8;
            gnVar.t(k96.E(i, ','), z4, true);
        } else {
            this.G = bkb.U8;
            gnVar.t("", z4, true);
        }
        if (z4 && (this.J < i || ((!this.K && z2) || (!this.L && z3)))) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.N = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new hxb(this, b));
            this.N.addListener(new iab(this, (byte) 8));
            b00.n(2.0f, this.N);
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
        int L = gl.L(38.0f);
        TextView textView = this.w;
        u86 u86Var = new u86(L, textView);
        u86Var.e = 0.75f;
        spannableStringBuilder.setSpan(u86Var, 0, 1, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        be0 be0Var = this.n;
        be0Var.b();
        be0Var.setAnimatedEmojiDrawable(null);
        r86 r86Var = this.R;
        if (r86Var == null) {
            wjb wjbVar = this.b;
            r86 r86Var2 = new r86(wjbVar);
            this.R = r86Var2;
            r86Var2.j(38.0f);
            this.R.setCallback(be0Var);
            int v0 = bkb.v0(bkb.y6, wjbVar);
            this.R.g(bkb.p1(0.15f, v0), bkb.p1(0.5f, v0), bkb.p1(0.6f, v0), bkb.p1(0.15f, v0));
            r86Var = this.R;
            r86Var.n = false;
        }
        be0Var.setImageDrawable(r86Var);
        be0Var.setScaleX(1.0f);
        be0Var.setScaleY(1.0f);
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
        long n = cf3.n(tL_forumTopic.from_id);
        boolean z2 = n == this.O;
        this.O = n;
        String k = cf3.k(y6c.t0, n);
        TextView textView = this.w;
        textView.setText(k);
        textView.setVisibility(0);
        be0 be0Var = this.n;
        pb0 pb0Var = this.s;
        int i = this.a;
        if (n >= 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(n));
            pb0Var.q(V1);
            be0Var.f(V1, pb0Var);
        } else {
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-n));
            pb0Var.p(K0);
            be0Var.f(K0, pb0Var);
        }
        be0Var.setScaleX(1.0f);
        be0Var.setScaleY(1.0f);
        h();
        setSelected(z);
        d(tL_forumTopic.unread_count, false, false, tL_forumTopic.unread_reactions_count > 0, z2);
        if (this.F) {
            this.F = false;
        }
    }

    public final void g() {
        int i = bkb.y6;
        wjb wjbVar = this.b;
        int f = bm2.f(this.P ? 1.0f : this.V, bkb.v0(i, wjbVar), bkb.v0(bkb.Ei, wjbVar));
        this.S = true;
        this.U = f;
        boolean z = this.Q;
        this.T = z;
        be0 be0Var = this.n;
        if (z) {
            be0Var.setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
        } else {
            be0Var.setColorFilter(null);
        }
        be0Var.setEmojiColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
        be0Var.invalidate();
    }

    public final void h() {
        float f = (1.0f - this.V) * (-gl.L(3.0f));
        ImageView imageView = this.x;
        imageView.setTranslationX(f);
        imageView.setVisibility(this.V <= 0.0f ? 8 : 0);
        int i = bkb.y6;
        wjb wjbVar = this.b;
        this.w.setTextColor(bm2.f(this.P ? 1.0f : this.V, bkb.v0(i, wjbVar), bkb.v0(bkb.Ei, wjbVar)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(64.0f), TLObject.FLAG_30), i2);
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
        ofFloat.addUpdateListener(new hxb(this, (byte) 0));
        this.a0.addListener(new pu9((byte) 12, this, z));
        this.a0.setInterpolator(s33.h);
        this.a0.setDuration(320L);
        this.a0.start();
    }

    @Override // tjb
    public final void updateColors() {
        try {
            TextView textView = this.w;
            wjb wjbVar = this.b;
            if (textView != null) {
                textView.setTextColor(bm2.f(this.P ? 1.0f : this.V, bkb.v0(bkb.y6, wjbVar), bkb.v0(bkb.Ei, wjbVar)));
            }
            be0 be0Var = this.n;
            if (be0Var != null) {
                int f = bm2.f(this.P ? 1.0f : this.V, bkb.v0(bkb.y6, wjbVar), bkb.v0(bkb.Ei, wjbVar));
                if (!this.S || f != this.U || this.Q != this.T) {
                    g();
                }
            }
            cxb cxbVar = this.r;
            if (cxbVar != null) {
                cxbVar.b.setColor(bkb.v0(bkb.Ei, wjbVar));
                if (be0Var != null) {
                    be0Var.invalidate();
                }
            }
            if (this.R != null) {
                int v0 = bkb.v0(bkb.y6, wjbVar);
                this.R.g(bkb.p1(0.15f, v0), bkb.p1(0.5f, v0), bkb.p1(0.6f, v0), bkb.p1(0.15f, v0));
                this.R.n = false;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
