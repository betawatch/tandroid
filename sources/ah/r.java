package ah;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ha;
import di.e4;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class r extends yg.c implements b6 {
    public final ImageView D;
    public boolean E;
    public final ImageView F;
    public boolean G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public TL_stories.TL_myBoost J;
    public final pu0 K;
    public int L;
    public final boolean[] s;
    public final wo w;
    public final ImageView x;
    public boolean y;

    public r(Context context, boolean z9, boolean z10, g6 g6Var, boolean z11) {
        super(context, g6Var);
        this.s = new boolean[1];
        this.G = true;
        this.K = new pu0(this);
        this.d.setTypeface(g0.o());
        this.f.setVisibility(8);
        if (z10) {
            wo woVar = new wo(21, context, g6Var);
            this.w = woVar;
            woVar.b(l6.B5, l6.h5, l6.k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z12 = id.a0;
            addView(woVar, ha.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 40.0f, 33.0f, z12 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z9) {
            wo woVar2 = new wo(21, context, g6Var);
            this.w = woVar2;
            if (z11) {
                woVar2.b(l6.i7, l6.j7, l6.C5);
            } else {
                woVar2.b(l6.B5, l6.j7, l6.C5);
            }
            woVar2.setDrawUnchecked(true);
            woVar2.setDrawBackgroundAsArc(10);
            addView(woVar2);
            woVar2.a(false, false);
            woVar2.setLayoutParams(ha.d(24, 24.0f, (id.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.w = null;
        }
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int i7 = l6.od;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        s6.s(imageView, i7, g6Var, mode);
        addView(imageView, ha.d(32, 32.0f, (id.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.D = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i10 = l6.Ci;
        s6.s(imageView2, i10, g6Var, mode);
        boolean z13 = id.a0;
        addView(imageView2, ha.d(32, 32.0f, (z13 ? 3 : 5) | 16, z13 ? 52.0f : 12.0f, 0.0f, z13 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        s6.s(imageView3, i10, g6Var, mode);
        addView(imageView3, ha.d(32, 32.0f, (id.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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
        hashSet.add(Integer.valueOf(l6.z9));
    }

    @Override // yg.c
    public final boolean b() {
        wo woVar = this.w;
        return woVar != null && woVar.getDrawUnchecked();
    }

    @Override // yg.c
    public final void c(boolean z9, boolean z10) {
        wo woVar = this.w;
        if (woVar != null && woVar.getVisibility() == 0) {
            woVar.a(z9, z10);
        }
    }

    public final void g(boolean z9, boolean z10) {
        Runnable runnable;
        if (this.G == z9) {
            return;
        }
        this.G = z9;
        float f10 = 0.0f;
        ImageView imageView = this.F;
        ImageView imageView2 = this.D;
        if (!z10) {
            imageView2.animate().cancel();
            imageView2.setAlpha((z9 && this.y) ? 1.0f : 0.0f);
            imageView2.setVisibility((z9 && this.y) ? 0 : 8);
            imageView.animate().cancel();
            if (z9 && this.E) {
                f10 = 1.0f;
            }
            imageView.setAlpha(f10);
            imageView.setVisibility((z9 && this.E) ? 0 : 8);
            return;
        }
        imageView2.setVisibility(0);
        ViewPropertyAnimator alpha = imageView2.animate().alpha((z9 && this.y) ? 1.0f : 0.0f);
        Runnable runnable2 = null;
        if (z9 && this.y) {
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
                            this.b.D.setVisibility(8);
                            break;
                        default:
                            this.b.F.setVisibility(8);
                            break;
                    }
                }
            };
        }
        alpha.withEndAction(runnable).start();
        imageView.setVisibility(0);
        ViewPropertyAnimator animate = imageView.animate();
        if (z9 && this.E) {
            f10 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate.alpha(f10);
        if (!z9 || !this.E) {
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
                            this.b.D.setVisibility(8);
                            break;
                        default:
                            this.b.F.setVisibility(8);
                            break;
                    }
                }
            };
        }
        alpha2.withEndAction(runnable2).start();
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.J;
    }

    public TLRPC.Chat getChat() {
        return this.I;
    }

    public TLRPC.User getUser() {
        return this.H;
    }

    public final void h(int i7, TLRPC.Chat chat) {
        String M0;
        this.x.setVisibility(8);
        this.I = chat;
        this.H = null;
        w8 w8Var = this.b;
        w8Var.q(chat);
        int L = g0.L(t3.c0(chat) ? 12.0f : 20.0f);
        l9 l9Var = this.c;
        l9Var.setRoundRadius(L);
        l9Var.e(chat, w8Var);
        String str = chat.title;
        e4 e4Var = this.d;
        e4Var.k(str);
        e4Var.i(null);
        if (i7 <= 0) {
            i7 = chat.participants_count;
        }
        boolean V = t3.V(chat);
        if (i7 >= 1) {
            M0 = id.G(i7, V ? "Subscribers" : "Members", new Object[0]);
        } else {
            M0 = id.M0(V ? 2131751390 : 2131754876, null);
        }
        setSubtitle(M0);
        s6.X(this.e, l6.r5, this.a);
        i(false, i7 > 200 ? 0.3f : 1.0f);
    }

    public final void i(boolean z9, float f10) {
        wo woVar = this.w;
        if (woVar == null) {
            return;
        }
        if (!z9) {
            woVar.animate().cancel();
            woVar.setAlpha(f10);
        } else if (Math.abs(woVar.getAlpha() - f10) > 0.1d) {
            woVar.animate().cancel();
            woVar.animate().alpha(f10).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K.a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.x.setVisibility(8);
        this.J = tL_myBoost;
        TLRPC.Chat M0 = qp.s1(p10.s0).M0(Long.valueOf(-m5.o(tL_myBoost.peer)));
        this.I = M0;
        w8 w8Var = this.b;
        w8Var.q(M0);
        int L = g0.L(20.0f);
        l9 l9Var = this.c;
        l9Var.setRoundRadius(L);
        l9Var.e(this.I, w8Var);
        String str = this.I.title;
        e4 e4Var = this.d;
        e4Var.k(str);
        int i7 = l6.r5;
        g6 g6Var = this.a;
        l5 l5Var = this.e;
        s6.X(l5Var, i7, g6Var);
        setSubtitle(id.a0(null, null, 2131753661, id.E0().o0().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 <= 0) {
            e4Var.setAlpha(1.0f);
            l5Var.setAlpha(1.0f);
            i(false, 1.0f);
        } else {
            setSubtitle(id.a0(null, null, 2131753594, f((i10 * 1000) - System.currentTimeMillis())));
            e4Var.setAlpha(0.65f);
            l5Var.setAlpha(0.65f);
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
        this.H = user;
        this.I = null;
        w8 w8Var = this.b;
        w8Var.r(user);
        int L = g0.L(20.0f);
        l9 l9Var = this.c;
        l9Var.setRoundRadius(L);
        l9Var.e(user, w8Var);
        String p10 = t10.p(user);
        e4 e4Var = this.d;
        e4Var.k(p10);
        boolean[] zArr = this.s;
        zArr[0] = false;
        if (t10.t(user)) {
            int i7 = user.bot_active_users;
            if (i7 > 0) {
                setSubtitle(id.H(',', "BotUsers", i7));
            } else {
                setSubtitle(id.M0(2131753156, null));
            }
        } else {
            setSubtitle(id.d0(p10.s0, user, zArr, null));
        }
        s6.X(this.e, zArr[0] ? l6.n5 : l6.r5, this.a);
        wo woVar = this.w;
        if (woVar != null) {
            woVar.setAlpha(1.0f);
        }
        int x02 = l6.x0(null, l6.z9, false);
        this.L = x02;
        e4Var.i(this.K.a(user, x02, false));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        pu0 pu0Var;
        e4 e4Var;
        int x02;
        try {
            if (this.H != null && (pu0Var = this.K) != null && (e4Var = this.d) != null && (x02 = l6.x0(null, l6.z9, false)) != this.L) {
                this.L = x02;
                pu0Var.a(this.H, x02, false);
                e4Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
