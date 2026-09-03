package lg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.Date;
import k7.c6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n extends jg.d {
    public final ImageView B;
    public boolean C;
    public TLRPC.User D;
    public TLRPC.Chat E;
    public TL_stories.TL_myBoost F;
    public final lw0 G;
    public final boolean[] r;
    public final np s;
    public final ImageView v;
    public boolean w;
    public final ImageView x;
    public boolean y;

    public n(Context context, boolean z4, boolean z10, g6 g6Var, boolean z11) {
        super(context, g6Var);
        this.r = new boolean[1];
        this.C = true;
        this.G = new lw0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f.setVisibility(8);
        if (z10) {
            np npVar = new np(context, 21, g6Var);
            this.s = npVar;
            npVar.b(k6.B5, k6.h5, k6.k7);
            npVar.setDrawUnchecked(false);
            npVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(npVar, c6.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 40.0f, 33.0f, z12 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z4) {
            np npVar2 = new np(context, 21, g6Var);
            this.s = npVar2;
            if (z11) {
                npVar2.b(k6.i7, k6.j7, k6.C5);
            } else {
                npVar2.b(k6.B5, k6.j7, k6.C5);
            }
            npVar2.setDrawUnchecked(true);
            npVar2.setDrawBackgroundAsArc(10);
            addView(npVar2);
            npVar2.a(false, false);
            npVar2.setLayoutParams(c6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.s = null;
        }
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int v02 = k6.v0(k6.Ac, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        addView(imageView, c6.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.x = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i10 = k6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(k6.v0(i10, g6Var), mode));
        boolean z13 = LocaleController.isRTL;
        addView(imageView2, c6.d(32, 32.0f, (z13 ? 3 : 5) | 16, z13 ? 52.0f : 12.0f, 0.0f, z13 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.B = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(k6.v0(i10, g6Var), mode));
        addView(imageView3, c6.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView3.setVisibility(8);
    }

    public static String f(long j10) {
        long j11 = j10 / 3600000;
        long j12 = j10 % 3600000;
        long j13 = j12 / 60000;
        long j14 = (j12 % 60000) / 1000;
        StringBuilder sb = new StringBuilder();
        if (j11 > 0) {
            sb.append(String.format("%02d", Long.valueOf(j11)));
            sb.append(":");
        }
        sb.append(String.format("%02d", Long.valueOf(j13)));
        sb.append(":");
        sb.append(String.format("%02d", Long.valueOf(j14)));
        return sb.toString();
    }

    @Override // jg.d
    public final boolean b() {
        np npVar = this.s;
        return npVar != null && npVar.getDrawUnchecked();
    }

    @Override // jg.d
    public final void c(boolean z4, boolean z10) {
        np npVar = this.s;
        if (npVar != null && npVar.getVisibility() == 0) {
            npVar.a(z4, z10);
        }
    }

    public final void g(boolean z4, boolean z10) {
        Runnable runnable;
        if (this.C == z4) {
            return;
        }
        this.C = z4;
        float f10 = 0.0f;
        ImageView imageView = this.B;
        ImageView imageView2 = this.x;
        if (!z10) {
            imageView2.animate().cancel();
            imageView2.setAlpha((z4 && this.w) ? 1.0f : 0.0f);
            imageView2.setVisibility((z4 && this.w) ? 0 : 8);
            imageView.animate().cancel();
            if (z4 && this.y) {
                f10 = 1.0f;
            }
            imageView.setAlpha(f10);
            imageView.setVisibility((z4 && this.y) ? 0 : 8);
            return;
        }
        imageView2.setVisibility(0);
        ViewPropertyAnimator alpha = imageView2.animate().alpha((z4 && this.w) ? 1.0f : 0.0f);
        Runnable runnable2 = null;
        if (z4 && this.w) {
            runnable = null;
        } else {
            final int i10 = 0;
            runnable = new Runnable(this) { // from class: lg.l
                public final /* synthetic */ n b;

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
                            this.b.B.setVisibility(8);
                            break;
                    }
                }
            };
        }
        alpha.withEndAction(runnable).start();
        imageView.setVisibility(0);
        ViewPropertyAnimator animate = imageView.animate();
        if (z4 && this.y) {
            f10 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate.alpha(f10);
        if (!z4 || !this.y) {
            final int i11 = 1;
            runnable2 = new Runnable(this) { // from class: lg.l
                public final /* synthetic */ n b;

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
                            this.b.B.setVisibility(8);
                            break;
                    }
                }
            };
        }
        alpha2.withEndAction(runnable2).start();
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.F;
    }

    public TLRPC.Chat getChat() {
        return this.E;
    }

    public TLRPC.User getUser() {
        return this.D;
    }

    public final void h(int i10, TLRPC.Chat chat) {
        String string;
        this.v.setVisibility(8);
        this.E = chat;
        this.D = null;
        z8 z8Var = this.b;
        z8Var.q(chat);
        int dp = AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f);
        p9 p9Var = this.c;
        p9Var.setRoundRadius(dp);
        p9Var.e(chat, z8Var);
        String str = chat.title;
        jg.c cVar = this.d;
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
        this.e.setTextColor(k6.v0(k6.r5, this.a));
        i(i10 > 200 ? 0.3f : 1.0f, false);
    }

    public final void i(float f10, boolean z4) {
        np npVar = this.s;
        if (npVar == null) {
            return;
        }
        if (!z4) {
            npVar.animate().cancel();
            npVar.setAlpha(f10);
        } else if (Math.abs(npVar.getAlpha() - f10) > 0.1d) {
            npVar.animate().cancel();
            npVar.animate().alpha(f10).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G.a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.v.setVisibility(8);
        this.F = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.E = chat;
        z8 z8Var = this.b;
        z8Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        p9 p9Var = this.c;
        p9Var.setRoundRadius(dp);
        p9Var.e(this.E, z8Var);
        String str = this.E.title;
        jg.c cVar = this.d;
        cVar.k(str);
        int v02 = k6.v0(k6.r5, this.a);
        l5 l5Var = this.e;
        l5Var.setTextColor(v02);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 <= 0) {
            cVar.setAlpha(1.0f);
            l5Var.setAlpha(1.0f);
            i(1.0f, false);
        } else {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i10 * 1000) - System.currentTimeMillis())));
            cVar.setAlpha(0.65f);
            l5Var.setAlpha(0.65f);
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
        this.D = user;
        this.E = null;
        z8 z8Var = this.b;
        z8Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        p9 p9Var = this.c;
        p9Var.setRoundRadius(dp);
        p9Var.e(user, z8Var);
        String userName = UserObject.getUserName(user);
        jg.c cVar = this.d;
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
        this.e.setTextColor(k6.v0(zArr[0] ? k6.n5 : k6.r5, this.a));
        np npVar = this.s;
        if (npVar != null) {
            npVar.setAlpha(1.0f);
        }
        int w02 = k6.w0(null, k6.z9, false);
        boolean s6 = e2.c.s(user);
        lw0 lw0Var = this.G;
        cVar.i(s6 ? lw0Var.a(user, null, w02, false) : lw0Var.a(null, null, w02, false));
    }
}
