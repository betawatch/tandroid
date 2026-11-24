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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kz9 extends gf0 implements tjb {
    public final ImageView E;
    public boolean F;
    public final ImageView G;
    public boolean H;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public TL_stories.TL_myBoost K;
    public final aya L;
    public int M;
    public final boolean[] s;
    public final wf2 w;
    public final ImageView x;
    public boolean y;

    public kz9(Context context, boolean z, boolean z2, wjb wjbVar, boolean z3) {
        super(context, wjbVar);
        this.s = new boolean[1];
        this.H = true;
        this.L = new aya(this);
        this.d.setTypeface(gl.o());
        this.f.setVisibility(8);
        if (z2) {
            wf2 wf2Var = new wf2(21, wjbVar, context);
            this.w = wf2Var;
            wf2Var.b(bkb.A5, bkb.g5, bkb.j7);
            wf2Var.setDrawUnchecked(false);
            wf2Var.setDrawBackgroundAsArc(3);
            boolean z4 = k96.a0;
            addView(wf2Var, nme.d(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 40.0f, 33.0f, z4 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z) {
            wf2 wf2Var2 = new wf2(21, wjbVar, context);
            this.w = wf2Var2;
            if (z3) {
                wf2Var2.b(bkb.h7, bkb.i7, bkb.B5);
            } else {
                wf2Var2.b(bkb.A5, bkb.i7, bkb.B5);
            }
            wf2Var2.setDrawUnchecked(true);
            wf2Var2.setDrawBackgroundAsArc(10);
            addView(wf2Var2);
            wf2Var2.a(false, false);
            wf2Var2.setLayoutParams(nme.d(24, 24.0f, (k96.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.w = null;
        }
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int i = bkb.qd;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.s(imageView, i, wjbVar, mode);
        addView(imageView, nme.d(32, 32.0f, (k96.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i2 = bkb.Ei;
        zkb.s(imageView2, i2, wjbVar, mode);
        boolean z5 = k96.a0;
        addView(imageView2, nme.d(32, 32.0f, (z5 ? 3 : 5) | 16, z5 ? 52.0f : 12.0f, 0.0f, z5 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        zkb.s(imageView3, i2, wjbVar, mode);
        addView(imageView3, nme.d(32, 32.0f, (k96.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.y9));
    }

    @Override // gf0
    public final boolean b() {
        wf2 wf2Var = this.w;
        return wf2Var != null && wf2Var.getDrawUnchecked();
    }

    @Override // gf0
    public final void c(boolean z, boolean z2) {
        wf2 wf2Var = this.w;
        if (wf2Var == null || wf2Var.getVisibility() != 0) {
            return;
        }
        wf2Var.a(z, z2);
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
        alpha.withEndAction((z && this.y) ? null : new Runnable(this) { // from class: iz9
            public final /* synthetic */ kz9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b = r2;
                kz9 kz9Var = this.b;
                switch (b) {
                    case 0:
                        kz9Var.E.setVisibility(8);
                        break;
                    default:
                        kz9Var.G.setVisibility(8);
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
            runnable = new Runnable(this) { // from class: iz9
                public final /* synthetic */ kz9 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    kz9 kz9Var = this.b;
                    switch (b2) {
                        case 0:
                            kz9Var.E.setVisibility(8);
                            break;
                        default:
                            kz9Var.G.setVisibility(8);
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
        pb0 pb0Var = this.b;
        pb0Var.p(chat);
        int L = gl.L(hc2.c0(chat) ? 12.0f : 20.0f);
        be0 be0Var = this.c;
        be0Var.setRoundRadius(L);
        be0Var.f(chat, pb0Var);
        String str = chat.title;
        df0 df0Var = this.d;
        df0Var.k(str);
        df0Var.i(null);
        if (i <= 0) {
            i = chat.participants_count;
        }
        boolean V = hc2.V(chat);
        if (i >= 1) {
            M0 = k96.G(i, V ? "Subscribers" : "Members", new Object[0]);
        } else {
            M0 = k96.M0(V ? 2131751378 : 2131754876, null);
        }
        setSubtitle(M0);
        zkb.W(this.e, bkb.q5, this.a);
        i(false, i > 200 ? 0.3f : 1.0f);
    }

    public final void i(boolean z, float f) {
        wf2 wf2Var = this.w;
        if (wf2Var != null) {
            if (!z) {
                wf2Var.animate().cancel();
                wf2Var.setAlpha(f);
            } else if (Math.abs(wf2Var.getAlpha() - f) > 0.1d) {
                wf2Var.animate().cancel();
                wf2Var.animate().alpha(f).start();
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
        TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(-cf3.n(tL_myBoost.peer)));
        this.J = K0;
        pb0 pb0Var = this.b;
        pb0Var.p(K0);
        int L = gl.L(20.0f);
        be0 be0Var = this.c;
        be0Var.setRoundRadius(L);
        be0Var.f(this.J, pb0Var);
        String str = this.J.title;
        df0 df0Var = this.d;
        df0Var.k(str);
        int i = bkb.q5;
        wjb wjbVar = this.a;
        jia jiaVar = this.e;
        zkb.W(jiaVar, i, wjbVar);
        setSubtitle(k96.a0(null, null, 2131753658, k96.D0().n0().format(new Date(tL_myBoost.expires * 1000))));
        int i2 = tL_myBoost.cooldown_until_date;
        if (i2 <= 0) {
            df0Var.setAlpha(1.0f);
            jiaVar.setAlpha(1.0f);
            i(false, 1.0f);
        } else {
            setSubtitle(k96.a0(null, null, 2131753591, f((i2 * 1000) - System.currentTimeMillis())));
            df0Var.setAlpha(0.65f);
            jiaVar.setAlpha(0.65f);
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
        pb0 pb0Var = this.b;
        pb0Var.q(user);
        int L = gl.L(20.0f);
        be0 be0Var = this.c;
        be0Var.setRoundRadius(L);
        be0Var.f(user, pb0Var);
        String q = l7c.q(user);
        df0 df0Var = this.d;
        df0Var.k(q);
        boolean[] zArr = this.s;
        zArr[0] = false;
        if (l7c.u(user)) {
            int i = user.bot_active_users;
            if (i > 0) {
                setSubtitle(k96.H(',', "BotUsers", i));
            } else {
                setSubtitle(k96.M0(2131753153, null));
            }
        } else {
            setSubtitle(k96.d0(y6c.t0, user, zArr, null));
        }
        zkb.W(this.e, zArr[0] ? bkb.m5 : bkb.q5, this.a);
        wf2 wf2Var = this.w;
        if (wf2Var != null) {
            wf2Var.setAlpha(1.0f);
        }
        int w0 = bkb.w0(null, bkb.y9, false);
        this.M = w0;
        df0Var.i(this.L.a(user, w0, false));
    }

    @Override // tjb
    public final void updateColors() {
        aya ayaVar;
        df0 df0Var;
        int w0;
        try {
            if (this.I == null || (ayaVar = this.L) == null || (df0Var = this.d) == null || (w0 = bkb.w0(null, bkb.y9, false)) == this.M) {
                return;
            }
            this.M = w0;
            ayaVar.a(this.I, w0, false);
            df0Var.invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
