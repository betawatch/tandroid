package ah;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ja;
import fi.w3;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.t8;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class r extends yg.c implements z5 {
    public final ImageView E;
    public boolean F;
    public final ImageView G;
    public boolean H;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public TL_stories.TL_myBoost K;
    public final pu0 L;
    public int M;
    public final boolean[] s;
    public final fp w;
    public final ImageView x;
    public boolean y;

    public r(Context context, boolean z10, boolean z11, e6 e6Var, boolean z12) {
        super(context, e6Var);
        this.s = new boolean[1];
        this.H = true;
        this.L = new pu0(this);
        this.d.setTypeface(g0.o());
        this.f.setVisibility(8);
        if (z11) {
            fp fpVar = new fp(21, context, e6Var);
            this.w = fpVar;
            fpVar.b(j6.B5, j6.h5, j6.k7);
            fpVar.setDrawUnchecked(false);
            fpVar.setDrawBackgroundAsArc(3);
            boolean z13 = hd.a0;
            addView(fpVar, ja.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 40.0f, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            fp fpVar2 = new fp(21, context, e6Var);
            this.w = fpVar2;
            if (z12) {
                fpVar2.b(j6.i7, j6.j7, j6.C5);
            } else {
                fpVar2.b(j6.B5, j6.j7, j6.C5);
            }
            fpVar2.setDrawUnchecked(true);
            fpVar2.setDrawBackgroundAsArc(10);
            addView(fpVar2);
            fpVar2.a(false, false);
            fpVar2.setLayoutParams(ja.d(24, 24.0f, (hd.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.w = null;
        }
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int i7 = j6.rd;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        q6.s(imageView, i7, e6Var, mode);
        addView(imageView, ja.d(32, 32.0f, (hd.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i10 = j6.Fi;
        q6.s(imageView2, i10, e6Var, mode);
        boolean z14 = hd.a0;
        addView(imageView2, ja.d(32, 32.0f, (z14 ? 3 : 5) | 16, z14 ? 52.0f : 12.0f, 0.0f, z14 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        q6.s(imageView3, i10, e6Var, mode);
        addView(imageView3, ja.d(32, 32.0f, (hd.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.z9));
    }

    @Override // yg.c
    public final boolean b() {
        fp fpVar = this.w;
        return fpVar != null && fpVar.getDrawUnchecked();
    }

    @Override // yg.c
    public final void c(boolean z10, boolean z11) {
        fp fpVar = this.w;
        if (fpVar != null && fpVar.getVisibility() == 0) {
            fpVar.a(z10, z11);
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
        String M0;
        this.x.setVisibility(8);
        this.J = chat;
        this.I = null;
        t8 t8Var = this.b;
        t8Var.q(chat);
        int L = g0.L(t3.c0(chat) ? 12.0f : 20.0f);
        i9 i9Var = this.c;
        i9Var.setRoundRadius(L);
        i9Var.f(chat, t8Var);
        String str = chat.title;
        w3 w3Var = this.d;
        w3Var.k(str);
        w3Var.i(null);
        if (i7 <= 0) {
            i7 = chat.participants_count;
        }
        boolean V = t3.V(chat);
        if (i7 >= 1) {
            M0 = hd.G(i7, V ? "Subscribers" : "Members", new Object[0]);
        } else {
            M0 = hd.M0(V ? 2131751390 : 2131754876, null);
        }
        setSubtitle(M0);
        q6.X(this.e, j6.r5, this.a);
        i(false, i7 > 200 ? 0.3f : 1.0f);
    }

    public final void i(boolean z10, float f10) {
        fp fpVar = this.w;
        if (fpVar == null) {
            return;
        }
        if (!z10) {
            fpVar.animate().cancel();
            fpVar.setAlpha(f10);
        } else if (Math.abs(fpVar.getAlpha() - f10) > 0.1d) {
            fpVar.animate().cancel();
            fpVar.animate().alpha(f10).start();
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
        TLRPC.Chat M0 = np.s1(m10.t0).M0(Long.valueOf(-m5.o(tL_myBoost.peer)));
        this.J = M0;
        t8 t8Var = this.b;
        t8Var.q(M0);
        int L = g0.L(20.0f);
        i9 i9Var = this.c;
        i9Var.setRoundRadius(L);
        i9Var.f(this.J, t8Var);
        String str = this.J.title;
        w3 w3Var = this.d;
        w3Var.k(str);
        int i7 = j6.r5;
        e6 e6Var = this.a;
        j5 j5Var = this.e;
        q6.X(j5Var, i7, e6Var);
        setSubtitle(hd.a0(null, null, 2131753661, hd.E0().o0().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 <= 0) {
            w3Var.setAlpha(1.0f);
            j5Var.setAlpha(1.0f);
            i(false, 1.0f);
        } else {
            setSubtitle(hd.a0(null, null, 2131753594, f((i10 * 1000) - System.currentTimeMillis())));
            w3Var.setAlpha(0.65f);
            j5Var.setAlpha(0.65f);
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
        t8 t8Var = this.b;
        t8Var.r(user);
        int L = g0.L(20.0f);
        i9 i9Var = this.c;
        i9Var.setRoundRadius(L);
        i9Var.f(user, t8Var);
        String p10 = q10.p(user);
        w3 w3Var = this.d;
        w3Var.k(p10);
        boolean[] zArr = this.s;
        zArr[0] = false;
        if (q10.t(user)) {
            int i7 = user.bot_active_users;
            if (i7 > 0) {
                setSubtitle(hd.H(',', "BotUsers", i7));
            } else {
                setSubtitle(hd.M0(2131753156, null));
            }
        } else {
            setSubtitle(hd.d0(m10.t0, user, zArr, null));
        }
        q6.X(this.e, zArr[0] ? j6.n5 : j6.r5, this.a);
        fp fpVar = this.w;
        if (fpVar != null) {
            fpVar.setAlpha(1.0f);
        }
        int x02 = j6.x0(null, j6.z9, false);
        this.M = x02;
        w3Var.i(this.L.a(user, x02, false));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        pu0 pu0Var;
        w3 w3Var;
        int x02;
        try {
            if (this.I != null && (pu0Var = this.L) != null && (w3Var = this.d) != null && (x02 = j6.x0(null, j6.z9, false)) != this.M) {
                this.M = x02;
                pu0Var.a(this.I, x02, false);
                w3Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
