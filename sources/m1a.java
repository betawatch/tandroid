// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m1a extends gg0 implements vlb {
    public final ImageView E;
    public boolean F;
    public final ImageView G;
    public boolean H;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public TL_stories.TL_myBoost K;
    public final d0b L;
    public int M;
    public final boolean[] s;
    public final jh2 w;
    public final ImageView x;
    public boolean y;

    public m1a(Context context, boolean z, boolean z2, ylb ylbVar, boolean z3) {
        super(context, ylbVar);
        this.s = new boolean[1];
        this.H = true;
        this.L = new d0b(this);
        this.d.setTypeface(gm.o());
        this.f.setVisibility(8);
        if (z2) {
            jh2 jh2Var = new jh2(21, ylbVar, context);
            this.w = jh2Var;
            jh2Var.b(cmb.A5, cmb.g5, cmb.j7);
            jh2Var.setDrawUnchecked(false);
            jh2Var.setDrawBackgroundAsArc(3);
            boolean z4 = jb6.a0;
            addView(jh2Var, qoe.d(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 40.0f, 33.0f, z4 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z) {
            jh2 jh2Var2 = new jh2(21, ylbVar, context);
            this.w = jh2Var2;
            if (z3) {
                jh2Var2.b(cmb.h7, cmb.i7, cmb.B5);
            } else {
                jh2Var2.b(cmb.A5, cmb.i7, cmb.B5);
            }
            jh2Var2.setDrawUnchecked(true);
            jh2Var2.setDrawBackgroundAsArc(10);
            addView(jh2Var2);
            jh2Var2.a(false, false);
            jh2Var2.setLayoutParams(qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.w = null;
        }
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int i = cmb.qd;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView, i, ylbVar, mode);
        addView(imageView, qoe.d(32, 32.0f, (jb6.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i2 = cmb.Ei;
        anb.s(imageView2, i2, ylbVar, mode);
        boolean z5 = jb6.a0;
        addView(imageView2, qoe.d(32, 32.0f, (z5 ? 3 : 5) | 16, z5 ? 52.0f : 12.0f, 0.0f, z5 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        anb.s(imageView3, i2, ylbVar, mode);
        addView(imageView3, qoe.d(32, 32.0f, (jb6.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView3.setVisibility(8);
    }

    public static String f(long j) {
        long j2 = j / 3600000;
        long j3 = j % 3600000;
        long j4 = j3 / 60000;
        long j5 = (j3 % 60000) / 1000;
        StringBuilder sb = new StringBuilder();
        if (j2 > 0) {
            sb.append(String.format("%02d", Long.valueOf(j2)));
            sb.append(":");
        }
        sb.append(String.format("%02d", Long.valueOf(j4)));
        sb.append(":");
        sb.append(String.format("%02d", Long.valueOf(j5)));
        return sb.toString();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y9));
    }

    @Override // gg0
    public final boolean b() {
        jh2 jh2Var = this.w;
        return jh2Var != null && jh2Var.getDrawUnchecked();
    }

    @Override // gg0
    public final void c(boolean z, boolean z2) {
        jh2 jh2Var = this.w;
        if (jh2Var == null || jh2Var.getVisibility() != 0) {
            return;
        }
        jh2Var.a(z, z2);
    }

    public final void g(boolean z, boolean z2) {
        if (this.H == z) {
            return;
        }
        this.H = z;
        float f = 0.0f;
        ImageView imageView = this.E;
        ImageView imageView2 = this.G;
        if (!z2) {
            imageView.animate().cancel();
            imageView.setAlpha((z && this.y) ? 1.0f : 0.0f);
            imageView.setVisibility((z && this.y) ? 0 : 8);
            imageView2.animate().cancel();
            if (z && this.F) {
                f = 1.0f;
            }
            imageView2.setAlpha(f);
            imageView2.setVisibility((z && this.F) ? (byte) 0 : (byte) 8);
            return;
        }
        imageView.setVisibility(0);
        ViewPropertyAnimator alpha = imageView.animate().alpha((z && this.y) ? 1.0f : 0.0f);
        Runnable runnable = null;
        alpha.withEndAction((z && this.y) ? null : new Runnable(this) { // from class: k1a
            public final /* synthetic */ m1a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b = r2;
                m1a m1aVar = this.b;
                switch (b) {
                    case 0:
                        m1aVar.E.setVisibility(8);
                        break;
                    default:
                        m1aVar.G.setVisibility(8);
                        break;
                }
            }
        }).start();
        imageView2.setVisibility(0);
        ViewPropertyAnimator animate = imageView2.animate();
        if (z && this.F) {
            f = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate.alpha(f);
        if (!z || !this.F) {
            final byte b = 1;
            runnable = new Runnable(this) { // from class: k1a
                public final /* synthetic */ m1a b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    m1a m1aVar = this.b;
                    switch (b2) {
                        case 0:
                            m1aVar.E.setVisibility(8);
                            break;
                        default:
                            m1aVar.G.setVisibility(8);
                            break;
                    }
                }
            };
        }
        alpha2.withEndAction(runnable).start();
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.K;
    }

    public TLRPC.Chat getChat() {
        return this.J;
    }

    public TLRPC.User getUser() {
        return this.I;
    }

    public final void h(int i, TLRPC.Chat chat) {
        String M0;
        this.x.setVisibility(8);
        this.J = chat;
        this.I = null;
        pc0 pc0Var = this.b;
        pc0Var.p(chat);
        int L = gm.L(sd2.c0(chat) ? 12.0f : 20.0f);
        bf0 bf0Var = this.c;
        bf0Var.setRoundRadius(L);
        bf0Var.f(chat, pc0Var);
        String str = chat.title;
        dg0 dg0Var = this.d;
        dg0Var.k(str);
        dg0Var.i(null);
        if (i <= 0) {
            i = chat.participants_count;
        }
        boolean V = sd2.V(chat);
        if (i >= 1) {
            M0 = jb6.G(i, V ? "Subscribers" : "Members", new Object[0]);
        } else {
            M0 = jb6.M0(V ? 2131751327 : 2131754876, null);
        }
        setSubtitle(M0);
        anb.W(this.e, cmb.q5, this.a);
        i(false, i > 200 ? 0.3f : 1.0f);
    }

    public final void i(boolean z, float f) {
        jh2 jh2Var = this.w;
        if (jh2Var != null) {
            if (!z) {
                jh2Var.animate().cancel();
                jh2Var.setAlpha(f);
            } else if (Math.abs(jh2Var.getAlpha() - f) > 0.1d) {
                jh2Var.animate().cancel();
                jh2Var.animate().alpha(f).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L.a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.x.setVisibility(8);
        this.K = tL_myBoost;
        TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(-pg3.n(tL_myBoost.peer)));
        this.J = L0;
        pc0 pc0Var = this.b;
        pc0Var.p(L0);
        int L = gm.L(20.0f);
        bf0 bf0Var = this.c;
        bf0Var.setRoundRadius(L);
        bf0Var.f(this.J, pc0Var);
        String str = this.J.title;
        dg0 dg0Var = this.d;
        dg0Var.k(str);
        int i = cmb.q5;
        ylb ylbVar = this.a;
        lka lkaVar = this.e;
        anb.W(lkaVar, i, ylbVar);
        setSubtitle(jb6.a0(null, null, 2131753626, jb6.D0().n0().format(new Date(tL_myBoost.expires * 1000))));
        int i2 = tL_myBoost.cooldown_until_date;
        if (i2 <= 0) {
            dg0Var.setAlpha(1.0f);
            lkaVar.setAlpha(1.0f);
            i(false, 1.0f);
        } else {
            setSubtitle(jb6.a0(null, null, 2131753559, f((i2 * 1000) - System.currentTimeMillis())));
            dg0Var.setAlpha(0.65f);
            lkaVar.setAlpha(0.65f);
            i(false, 0.3f);
        }
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.x;
        if (onClickListener == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setUser(TLRPC.User user) {
        this.x.setVisibility(8);
        this.I = user;
        this.J = null;
        pc0 pc0Var = this.b;
        pc0Var.q(user);
        int L = gm.L(20.0f);
        bf0 bf0Var = this.c;
        bf0Var.setRoundRadius(L);
        bf0Var.f(user, pc0Var);
        String r = m9c.r(user);
        dg0 dg0Var = this.d;
        dg0Var.k(r);
        boolean[] zArr = this.s;
        zArr[0] = false;
        if (m9c.v(user)) {
            int i = user.bot_active_users;
            if (i > 0) {
                setSubtitle(jb6.H(',', "BotUsers", i));
            } else {
                setSubtitle(jb6.M0(2131753121, null));
            }
        } else {
            setSubtitle(jb6.d0(z8c.t0, user, zArr, null));
        }
        anb.W(this.e, zArr[0] ? cmb.m5 : cmb.q5, this.a);
        jh2 jh2Var = this.w;
        if (jh2Var != null) {
            jh2Var.setAlpha(1.0f);
        }
        int w0 = cmb.w0(null, cmb.y9, false);
        this.M = w0;
        dg0Var.i(this.L.a(user, w0, false));
    }

    @Override // vlb
    public final void updateColors() {
        d0b d0bVar;
        dg0 dg0Var;
        int w0;
        try {
            if (this.I == null || (d0bVar = this.L) == null || (dg0Var = this.d) == null || (w0 = cmb.w0(null, cmb.y9, false)) == this.M) {
                return;
            }
            this.M = w0;
            d0bVar.a(this.I, w0, false);
            dg0Var.invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
