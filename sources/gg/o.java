package gg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import h7.z5;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.y8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o extends eg.d {
    public final ImageView A;
    public boolean B;
    public TLRPC.User C;
    public TLRPC.Chat D;
    public TL_stories.TL_myBoost E;
    public final uv0 F;
    public final boolean[] r;
    public final bp s;
    public final ImageView v;
    public boolean w;
    public final ImageView x;
    public boolean y;

    public o(Context context, boolean z10, boolean z11, c6 c6Var, boolean z12) {
        super(context, c6Var);
        this.r = new boolean[1];
        this.B = true;
        this.F = new uv0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f.setVisibility(8);
        if (z11) {
            bp bpVar = new bp(context, 21, c6Var);
            this.s = bpVar;
            bpVar.b(g6.B5, g6.h5, g6.k7);
            bpVar.setDrawUnchecked(false);
            bpVar.setDrawBackgroundAsArc(3);
            boolean z13 = LocaleController.isRTL;
            addView(bpVar, z5.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 40.0f, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            bp bpVar2 = new bp(context, 21, c6Var);
            this.s = bpVar2;
            if (z12) {
                bpVar2.b(g6.i7, g6.j7, g6.C5);
            } else {
                bpVar2.b(g6.B5, g6.j7, g6.C5);
            }
            bpVar2.setDrawUnchecked(true);
            bpVar2.setDrawBackgroundAsArc(10);
            addView(bpVar2);
            bpVar2.a(false, false);
            bpVar2.setLayoutParams(z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.s = null;
        }
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int v02 = g6.v0(g6.Ac, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        addView(imageView, z5.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.x = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i10 = g6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), mode));
        boolean z14 = LocaleController.isRTL;
        addView(imageView2, z5.d(32, 32.0f, (z14 ? 3 : 5) | 16, z14 ? 52.0f : 12.0f, 0.0f, z14 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.A = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), mode));
        addView(imageView3, z5.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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

    @Override // eg.d
    public final boolean b() {
        bp bpVar = this.s;
        return bpVar != null && bpVar.getDrawUnchecked();
    }

    @Override // eg.d
    public final void c(boolean z10, boolean z11) {
        bp bpVar = this.s;
        if (bpVar != null && bpVar.getVisibility() == 0) {
            bpVar.a(z10, z11);
        }
    }

    public final void g(boolean z10, boolean z11) {
        Runnable runnable;
        if (this.B == z10) {
            return;
        }
        this.B = z10;
        float f10 = 0.0f;
        ImageView imageView = this.A;
        ImageView imageView2 = this.x;
        if (!z11) {
            imageView2.animate().cancel();
            imageView2.setAlpha((z10 && this.w) ? 1.0f : 0.0f);
            imageView2.setVisibility((z10 && this.w) ? 0 : 8);
            imageView.animate().cancel();
            if (z10 && this.y) {
                f10 = 1.0f;
            }
            imageView.setAlpha(f10);
            imageView.setVisibility((z10 && this.y) ? 0 : 8);
            return;
        }
        imageView2.setVisibility(0);
        ViewPropertyAnimator alpha = imageView2.animate().alpha((z10 && this.w) ? 1.0f : 0.0f);
        Runnable runnable2 = null;
        if (z10 && this.w) {
            runnable = null;
        } else {
            final int i10 = 0;
            runnable = new Runnable(this) { // from class: gg.m
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.b.x.setVisibility(8);
                            break;
                        default:
                            this.b.A.setVisibility(8);
                            break;
                    }
                }
            };
        }
        alpha.withEndAction(runnable).start();
        imageView.setVisibility(0);
        ViewPropertyAnimator animate = imageView.animate();
        if (z10 && this.y) {
            f10 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate.alpha(f10);
        if (!z10 || !this.y) {
            final int i11 = 1;
            runnable2 = new Runnable(this) { // from class: gg.m
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.b.x.setVisibility(8);
                            break;
                        default:
                            this.b.A.setVisibility(8);
                            break;
                    }
                }
            };
        }
        alpha2.withEndAction(runnable2).start();
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.E;
    }

    public TLRPC.Chat getChat() {
        return this.D;
    }

    public TLRPC.User getUser() {
        return this.C;
    }

    public final void h(int i10, TLRPC.Chat chat) {
        String string;
        this.v.setVisibility(8);
        this.D = chat;
        this.C = null;
        y8 y8Var = this.b;
        y8Var.q(chat);
        int dp = AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f);
        n9 n9Var = this.c;
        n9Var.setRoundRadius(dp);
        n9Var.e(chat, y8Var);
        String str = chat.title;
        eg.c cVar = this.d;
        cVar.k(str);
        cVar.i(null);
        if (i10 <= 0) {
            i10 = chat.participants_count;
        }
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (i10 >= 1) {
            string = LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", i10, new Object[0]);
        } else {
            string = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
        }
        setSubtitle(string);
        this.e.setTextColor(g6.v0(g6.r5, this.a));
        i(i10 > 200 ? 0.3f : 1.0f, false);
    }

    public final void i(float f10, boolean z10) {
        bp bpVar = this.s;
        if (bpVar == null) {
            return;
        }
        if (!z10) {
            bpVar.animate().cancel();
            bpVar.setAlpha(f10);
        } else if (Math.abs(bpVar.getAlpha() - f10) > 0.1d) {
            bpVar.animate().cancel();
            bpVar.animate().alpha(f10).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F.a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.v.setVisibility(8);
        this.E = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.D = chat;
        y8 y8Var = this.b;
        y8Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        n9 n9Var = this.c;
        n9Var.setRoundRadius(dp);
        n9Var.e(this.D, y8Var);
        String str = this.D.title;
        eg.c cVar = this.d;
        cVar.k(str);
        int v02 = g6.v0(g6.r5, this.a);
        h5 h5Var = this.e;
        h5Var.setTextColor(v02);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 <= 0) {
            cVar.setAlpha(1.0f);
            h5Var.setAlpha(1.0f);
            i(1.0f, false);
        } else {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i10 * 1000) - System.currentTimeMillis())));
            cVar.setAlpha(0.65f);
            h5Var.setAlpha(0.65f);
            i(0.3f, false);
        }
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.v;
        if (onClickListener == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setUser(TLRPC.User user) {
        this.v.setVisibility(8);
        this.C = user;
        this.D = null;
        y8 y8Var = this.b;
        y8Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        n9 n9Var = this.c;
        n9Var.setRoundRadius(dp);
        n9Var.e(user, y8Var);
        String userName = UserObject.getUserName(user);
        eg.c cVar = this.d;
        cVar.k(userName);
        boolean[] zArr = this.r;
        zArr[0] = false;
        if (UserObject.isBot(user)) {
            int i10 = user.bot_active_users;
            if (i10 > 0) {
                setSubtitle(LocaleController.formatPluralStringComma("BotUsers", i10, ','));
            } else {
                setSubtitle(LocaleController.getString(R.string.Bot));
            }
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
        }
        this.e.setTextColor(g6.v0(zArr[0] ? g6.n5 : g6.r5, this.a));
        bp bpVar = this.s;
        if (bpVar != null) {
            bpVar.setAlpha(1.0f);
        }
        int w02 = g6.w0(null, g6.z9, false);
        boolean u10 = com.google.android.recaptcha.internal.a.u(user);
        uv0 uv0Var = this.F;
        cVar.i(u10 ? uv0Var.a(user, null, w02, false) : uv0Var.a(null, null, w02, false));
    }
}
