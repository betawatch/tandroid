package fg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import g7.e6;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p extends dg.d {
    public final ImageView A;
    public boolean B;
    public TLRPC.User C;
    public TLRPC.Chat D;
    public TL_stories.TL_myBoost E;
    public final sv0 F;
    public final boolean[] r;
    public final dp s;
    public final ImageView v;
    public boolean w;
    public final ImageView x;
    public boolean y;

    public p(Context context, boolean z10, boolean z11, b6 b6Var, boolean z12) {
        super(context, b6Var);
        this.r = new boolean[1];
        this.B = true;
        this.F = new sv0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f.setVisibility(8);
        if (z11) {
            dp dpVar = new dp(context, 21, b6Var);
            this.s = dpVar;
            dpVar.b(f6.B5, f6.h5, f6.k7);
            dpVar.setDrawUnchecked(false);
            dpVar.setDrawBackgroundAsArc(3);
            boolean z13 = LocaleController.isRTL;
            addView(dpVar, e6.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 40.0f, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            dp dpVar2 = new dp(context, 21, b6Var);
            this.s = dpVar2;
            if (z12) {
                dpVar2.b(f6.i7, f6.j7, f6.C5);
            } else {
                dpVar2.b(f6.B5, f6.j7, f6.C5);
            }
            dpVar2.setDrawUnchecked(true);
            dpVar2.setDrawBackgroundAsArc(10);
            addView(dpVar2);
            dpVar2.a(false, false);
            dpVar2.setLayoutParams(e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.s = null;
        }
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int v02 = f6.v0(f6.Ac, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        addView(imageView, e6.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.x = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i9 = f6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(i9, b6Var), mode));
        boolean z14 = LocaleController.isRTL;
        addView(imageView2, e6.d(32, 32.0f, (z14 ? 3 : 5) | 16, z14 ? 52.0f : 12.0f, 0.0f, z14 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.A = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(f6.v0(i9, b6Var), mode));
        addView(imageView3, e6.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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

    @Override // dg.d
    public final boolean b() {
        dp dpVar = this.s;
        return dpVar != null && dpVar.getDrawUnchecked();
    }

    @Override // dg.d
    public final void c(boolean z10, boolean z11) {
        dp dpVar = this.s;
        if (dpVar != null && dpVar.getVisibility() == 0) {
            dpVar.a(z10, z11);
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
            final int i9 = 0;
            runnable = new Runnable(this) { // from class: fg.n
                public final /* synthetic */ p b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
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
            final int i10 = 1;
            runnable2 = new Runnable(this) { // from class: fg.n
                public final /* synthetic */ p b;

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

    public final void h(int i9, TLRPC.Chat chat) {
        String string;
        this.v.setVisibility(8);
        this.D = chat;
        this.C = null;
        z8 z8Var = this.b;
        z8Var.q(chat);
        int dp = AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f);
        o9 o9Var = this.c;
        o9Var.setRoundRadius(dp);
        o9Var.e(chat, z8Var);
        String str = chat.title;
        dg.c cVar = this.d;
        cVar.k(str);
        cVar.i(null);
        if (i9 <= 0) {
            i9 = chat.participants_count;
        }
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (i9 >= 1) {
            string = LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", i9, new Object[0]);
        } else {
            string = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
        }
        setSubtitle(string);
        this.e.setTextColor(f6.v0(f6.r5, this.a));
        i(i9 > 200 ? 0.3f : 1.0f, false);
    }

    public final void i(float f10, boolean z10) {
        dp dpVar = this.s;
        if (dpVar == null) {
            return;
        }
        if (!z10) {
            dpVar.animate().cancel();
            dpVar.setAlpha(f10);
        } else if (Math.abs(dpVar.getAlpha() - f10) > 0.1d) {
            dpVar.animate().cancel();
            dpVar.animate().alpha(f10).start();
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
        z8 z8Var = this.b;
        z8Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        o9 o9Var = this.c;
        o9Var.setRoundRadius(dp);
        o9Var.e(this.D, z8Var);
        String str = this.D.title;
        dg.c cVar = this.d;
        cVar.k(str);
        int v02 = f6.v0(f6.r5, this.a);
        h5 h5Var = this.e;
        h5Var.setTextColor(v02);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i9 = tL_myBoost.cooldown_until_date;
        if (i9 <= 0) {
            cVar.setAlpha(1.0f);
            h5Var.setAlpha(1.0f);
            i(1.0f, false);
        } else {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i9 * 1000) - System.currentTimeMillis())));
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
        z8 z8Var = this.b;
        z8Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        o9 o9Var = this.c;
        o9Var.setRoundRadius(dp);
        o9Var.e(user, z8Var);
        String userName = UserObject.getUserName(user);
        dg.c cVar = this.d;
        cVar.k(userName);
        boolean[] zArr = this.r;
        zArr[0] = false;
        if (UserObject.isBot(user)) {
            int i9 = user.bot_active_users;
            if (i9 > 0) {
                setSubtitle(LocaleController.formatPluralStringComma("BotUsers", i9, ','));
            } else {
                setSubtitle(LocaleController.getString(R.string.Bot));
            }
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
        }
        this.e.setTextColor(f6.v0(zArr[0] ? f6.n5 : f6.r5, this.a));
        dp dpVar = this.s;
        if (dpVar != null) {
            dpVar.setAlpha(1.0f);
        }
        int w02 = f6.w0(null, f6.z9, false);
        boolean v = e2.c.v(user);
        sv0 sv0Var = this.F;
        cVar.i(v ? sv0Var.a(user, null, w02, false) : sv0Var.a(null, null, w02, false));
    }
}
