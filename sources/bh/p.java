package bh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import b8.mf;
import ei.e4;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p extends zg.c implements z5 {
    public final ImageView E;
    public boolean F;
    public final ImageView G;
    public boolean H;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public TL_stories.TL_myBoost K;
    public final mu0 L;
    public int M;
    public final boolean[] s;
    public final wo w;
    public final ImageView x;
    public boolean y;

    public p(Context context, boolean z10, boolean z11, e6 e6Var, boolean z12) {
        super(context, e6Var);
        this.s = new boolean[1];
        this.H = true;
        this.L = new mu0(this);
        this.d.setTypeface(g0.o());
        this.f.setVisibility(8);
        if (z11) {
            wo woVar = new wo(21, context, e6Var);
            this.w = woVar;
            woVar.b(k6.B5, k6.h5, k6.k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z13 = bd.a0;
            addView(woVar, mf.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 40.0f, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            wo woVar2 = new wo(21, context, e6Var);
            this.w = woVar2;
            if (z12) {
                woVar2.b(k6.i7, k6.j7, k6.C5);
            } else {
                woVar2.b(k6.B5, k6.j7, k6.C5);
            }
            woVar2.setDrawUnchecked(true);
            woVar2.setDrawBackgroundAsArc(10);
            addView(woVar2);
            woVar2.a(false, false);
            woVar2.setLayoutParams(mf.d(24, 24.0f, (bd.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.w = null;
        }
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int i3 = k6.od;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView, i3, e6Var, mode);
        addView(imageView, mf.d(32, 32.0f, (bd.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i10 = k6.Ci;
        r6.t(imageView2, i10, e6Var, mode);
        boolean z14 = bd.a0;
        addView(imageView2, mf.d(32, 32.0f, (z14 ? 3 : 5) | 16, z14 ? 52.0f : 12.0f, 0.0f, z14 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        r6.t(imageView3, i10, e6Var, mode);
        addView(imageView3, mf.d(32, 32.0f, (bd.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView3.setVisibility(8);
    }

    public static String f(long j10) {
        long j11 = j10 / 3600000;
        long j12 = j10 % 3600000;
        long j13 = j12 / 60000;
        long j14 = (j12 % 60000) / 1000;
        StringBuilder sb2 = new StringBuilder();
        if (j11 > 0) {
            sb2.append(String.format("%02d", Long.valueOf(j11)));
            sb2.append(":");
        }
        sb2.append(String.format("%02d", Long.valueOf(j13)));
        sb2.append(":");
        sb2.append(String.format("%02d", Long.valueOf(j14)));
        return sb2.toString();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.z9));
    }

    @Override // zg.c
    public final boolean b() {
        wo woVar = this.w;
        return woVar != null && woVar.getDrawUnchecked();
    }

    @Override // zg.c
    public final void c(boolean z10, boolean z11) {
        wo woVar = this.w;
        if (woVar != null && woVar.getVisibility() == 0) {
            woVar.a(z10, z11);
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
            final int i3 = 0;
            runnable = new Runnable(this) { // from class: bh.n
                public final /* synthetic */ p b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
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
            runnable2 = new Runnable(this) { // from class: bh.n
                public final /* synthetic */ p b;

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

    public final void h(int i3, TLRPC.Chat chat) {
        String M0;
        this.x.setVisibility(8);
        this.J = chat;
        this.I = null;
        u8 u8Var = this.b;
        u8Var.q(chat);
        int L = g0.L(t3.c0(chat) ? 12.0f : 20.0f);
        k9 k9Var = this.c;
        k9Var.setRoundRadius(L);
        k9Var.e(chat, u8Var);
        String str = chat.title;
        e4 e4Var = this.d;
        e4Var.k(str);
        e4Var.i(null);
        if (i3 <= 0) {
            i3 = chat.participants_count;
        }
        boolean V = t3.V(chat);
        if (i3 >= 1) {
            M0 = bd.G(i3, V ? "Subscribers" : "Members", new Object[0]);
        } else {
            M0 = bd.M0(V ? 2131751391 : 2131754876, null);
        }
        setSubtitle(M0);
        r6.Y(this.e, k6.r5, this.a);
        i(false, i3 > 200 ? 0.3f : 1.0f);
    }

    public final void i(boolean z10, float f10) {
        wo woVar = this.w;
        if (woVar == null) {
            return;
        }
        if (!z10) {
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
        TLRPC.Chat M0 = hp.s1(h10.t0).M0(Long.valueOf(-m5.o(tL_myBoost.peer)));
        this.J = M0;
        u8 u8Var = this.b;
        u8Var.q(M0);
        int L = g0.L(20.0f);
        k9 k9Var = this.c;
        k9Var.setRoundRadius(L);
        k9Var.e(this.J, u8Var);
        String str = this.J.title;
        e4 e4Var = this.d;
        e4Var.k(str);
        int i3 = k6.r5;
        e6 e6Var = this.a;
        k5 k5Var = this.e;
        r6.Y(k5Var, i3, e6Var);
        setSubtitle(bd.a0(null, null, 2131753661, bd.E0().o0().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 <= 0) {
            e4Var.setAlpha(1.0f);
            k5Var.setAlpha(1.0f);
            i(false, 1.0f);
        } else {
            setSubtitle(bd.a0(null, null, 2131753594, f((i10 * 1000) - System.currentTimeMillis())));
            e4Var.setAlpha(0.65f);
            k5Var.setAlpha(0.65f);
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
        u8 u8Var = this.b;
        u8Var.r(user);
        int L = g0.L(20.0f);
        k9 k9Var = this.c;
        k9Var.setRoundRadius(L);
        k9Var.e(user, u8Var);
        String p10 = l10.p(user);
        e4 e4Var = this.d;
        e4Var.k(p10);
        boolean[] zArr = this.s;
        zArr[0] = false;
        if (l10.t(user)) {
            int i3 = user.bot_active_users;
            if (i3 > 0) {
                setSubtitle(bd.H(',', "BotUsers", i3));
            } else {
                setSubtitle(bd.M0(2131753156, null));
            }
        } else {
            setSubtitle(bd.d0(h10.t0, user, zArr, null));
        }
        r6.Y(this.e, zArr[0] ? k6.n5 : k6.r5, this.a);
        wo woVar = this.w;
        if (woVar != null) {
            woVar.setAlpha(1.0f);
        }
        int x02 = k6.x0(null, k6.z9, false);
        this.M = x02;
        e4Var.i(this.L.a(user, x02, false));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        mu0 mu0Var;
        e4 e4Var;
        int x02;
        try {
            if (this.I != null && (mu0Var = this.L) != null && (e4Var = this.d) != null && (x02 = k6.x0(null, k6.z9, false)) != this.M) {
                this.M = x02;
                mu0Var.a(this.I, x02, false);
                e4Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
