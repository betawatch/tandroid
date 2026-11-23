package ah;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ma;
import fi.u3;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class r extends yg.c implements b6 {
    public final ImageView E;
    public boolean F;
    public final ImageView G;
    public boolean H;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public TL_stories.TL_myBoost K;
    public final av0 L;
    public int M;
    public final boolean[] s;
    public final op w;
    public final ImageView x;
    public boolean y;

    public r(Context context, boolean z10, boolean z11, h6 h6Var, boolean z12) {
        super(context, h6Var);
        this.s = new boolean[1];
        this.H = true;
        this.L = new av0(this);
        this.d.setTypeface(g0.o());
        this.f.setVisibility(8);
        if (z11) {
            op opVar = new op(21, context, h6Var);
            this.w = opVar;
            opVar.b(m6.B5, m6.h5, m6.k7);
            opVar.setDrawUnchecked(false);
            opVar.setDrawBackgroundAsArc(3);
            boolean z13 = hd.a0;
            addView(opVar, ma.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 40.0f, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            op opVar2 = new op(21, context, h6Var);
            this.w = opVar2;
            if (z12) {
                opVar2.b(m6.i7, m6.j7, m6.C5);
            } else {
                opVar2.b(m6.B5, m6.j7, m6.C5);
            }
            opVar2.setDrawUnchecked(true);
            opVar2.setDrawBackgroundAsArc(10);
            addView(opVar2);
            opVar2.a(false, false);
            opVar2.setLayoutParams(ma.d(24, 24.0f, (hd.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.w = null;
        }
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int i7 = m6.rd;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        t6.s(imageView, i7, h6Var, mode);
        addView(imageView, ma.d(32, 32.0f, (hd.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i10 = m6.Fi;
        t6.s(imageView2, i10, h6Var, mode);
        boolean z14 = hd.a0;
        addView(imageView2, ma.d(32, 32.0f, (z14 ? 3 : 5) | 16, z14 ? 52.0f : 12.0f, 0.0f, z14 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        t6.s(imageView3, i10, h6Var, mode);
        addView(imageView3, ma.d(32, 32.0f, (hd.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView3.setVisibility(8);
    }

    public static String f(long j3) {
        long j10 = j3 / 3600000;
        long j11 = j3 % 3600000;
        long j12 = j11 / 60000;
        long j13 = (j11 % 60000) / 1000;
        StringBuilder sb2 = new StringBuilder();
        if (j10 > 0) {
            sb2.append(String.format("%02d", Long.valueOf(j10)));
            sb2.append(":");
        }
        sb2.append(String.format("%02d", Long.valueOf(j12)));
        sb2.append(":");
        sb2.append(String.format("%02d", Long.valueOf(j13)));
        return sb2.toString();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.z9));
    }

    @Override // yg.c
    public final boolean b() {
        op opVar = this.w;
        return opVar != null && opVar.getDrawUnchecked();
    }

    @Override // yg.c
    public final void c(boolean z10, boolean z11) {
        op opVar = this.w;
        if (opVar != null && opVar.getVisibility() == 0) {
            opVar.a(z10, z11);
        }
    }

    public final void g(boolean z10, boolean z11) {
        Runnable runnable;
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        float f10 = 0.0f;
        ImageView imageView = this.G;
        ImageView imageView2 = this.E;
        if (!z11) {
            imageView2.animate().cancel();
            imageView2.setAlpha((z10 && this.y) ? 1.0f : 0.0f);
            imageView2.setVisibility((z10 && this.y) ? 0 : 8);
            imageView.animate().cancel();
            if (z10 && this.F) {
                f10 = 1.0f;
            }
            imageView.setAlpha(f10);
            imageView.setVisibility((z10 && this.F) ? 0 : 8);
            return;
        }
        imageView2.setVisibility(0);
        ViewPropertyAnimator alpha = imageView2.animate().alpha((z10 && this.y) ? 1.0f : 0.0f);
        Runnable runnable2 = null;
        if (z10 && this.y) {
            runnable = null;
        } else {
            final int i7 = 0;
            runnable = new Runnable(this) { // from class: ah.p
                public final /* synthetic */ r b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            this.b.E.setVisibility(8);
                            break;
                        default:
                            this.b.G.setVisibility(8);
                            break;
                    }
                }
            };
        }
        alpha.withEndAction(runnable).start();
        imageView.setVisibility(0);
        ViewPropertyAnimator animate = imageView.animate();
        if (z10 && this.F) {
            f10 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate.alpha(f10);
        if (!z10 || !this.F) {
            final int i10 = 1;
            runnable2 = new Runnable(this) { // from class: ah.p
                public final /* synthetic */ r b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.b.E.setVisibility(8);
                            break;
                        default:
                            this.b.G.setVisibility(8);
                            break;
                    }
                }
            };
        }
        alpha2.withEndAction(runnable2).start();
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

    public final void h(int i7, TLRPC.Chat chat) {
        String N0;
        this.x.setVisibility(8);
        this.J = chat;
        this.I = null;
        b9 b9Var = this.b;
        b9Var.q(chat);
        int L = g0.L(v3.c0(chat) ? 12.0f : 20.0f);
        q9 q9Var = this.c;
        q9Var.setRoundRadius(L);
        q9Var.f(chat, b9Var);
        String str = chat.title;
        u3 u3Var = this.d;
        u3Var.k(str);
        u3Var.i(null);
        if (i7 <= 0) {
            i7 = chat.participants_count;
        }
        boolean V = v3.V(chat);
        if (i7 >= 1) {
            N0 = hd.G(i7, V ? "Subscribers" : "Members", new Object[0]);
        } else {
            N0 = hd.N0(V ? 2131751378 : 2131754876, null);
        }
        setSubtitle(N0);
        t6.X(this.e, m6.r5, this.a);
        i(false, i7 > 200 ? 0.3f : 1.0f);
    }

    public final void i(boolean z10, float f10) {
        op opVar = this.w;
        if (opVar == null) {
            return;
        }
        if (!z10) {
            opVar.animate().cancel();
            opVar.setAlpha(f10);
        } else if (Math.abs(opVar.getAlpha() - f10) > 0.1d) {
            opVar.animate().cancel();
            opVar.animate().alpha(f10).start();
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
        TLRPC.Chat O0 = np.u1(k10.t0).O0(Long.valueOf(-n5.o(tL_myBoost.peer)));
        this.J = O0;
        b9 b9Var = this.b;
        b9Var.q(O0);
        int L = g0.L(20.0f);
        q9 q9Var = this.c;
        q9Var.setRoundRadius(L);
        q9Var.f(this.J, b9Var);
        String str = this.J.title;
        u3 u3Var = this.d;
        u3Var.k(str);
        int i7 = m6.r5;
        h6 h6Var = this.a;
        m5 m5Var = this.e;
        t6.X(m5Var, i7, h6Var);
        setSubtitle(hd.a0(null, null, 2131753658, hd.E0().o0().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 <= 0) {
            u3Var.setAlpha(1.0f);
            m5Var.setAlpha(1.0f);
            i(false, 1.0f);
        } else {
            setSubtitle(hd.a0(null, null, 2131753591, f((i10 * 1000) - System.currentTimeMillis())));
            u3Var.setAlpha(0.65f);
            m5Var.setAlpha(0.65f);
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
        b9 b9Var = this.b;
        b9Var.r(user);
        int L = g0.L(20.0f);
        q9 q9Var = this.c;
        q9Var.setRoundRadius(L);
        q9Var.f(user, b9Var);
        String q10 = p10.q(user);
        u3 u3Var = this.d;
        u3Var.k(q10);
        boolean[] zArr = this.s;
        zArr[0] = false;
        if (p10.u(user)) {
            int i7 = user.bot_active_users;
            if (i7 > 0) {
                setSubtitle(hd.H(',', "BotUsers", i7));
            } else {
                setSubtitle(hd.N0(2131753153, null));
            }
        } else {
            setSubtitle(hd.d0(k10.t0, user, zArr, null));
        }
        t6.X(this.e, zArr[0] ? m6.n5 : m6.r5, this.a);
        op opVar = this.w;
        if (opVar != null) {
            opVar.setAlpha(1.0f);
        }
        int x02 = m6.x0(null, m6.z9, false);
        this.M = x02;
        u3Var.i(this.L.a(user, x02, false));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        av0 av0Var;
        u3 u3Var;
        int x02;
        try {
            if (this.I != null && (av0Var = this.L) != null && (u3Var = this.d) != null && (x02 = m6.x0(null, m6.z9, false)) != this.M) {
                this.M = x02;
                av0Var.a(this.I, x02, false);
                u3Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
