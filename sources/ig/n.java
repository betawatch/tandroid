package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import i7.f6;
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
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n extends gg.d {
    public final ImageView A;
    public boolean B;
    public TLRPC.User C;
    public TLRPC.Chat D;
    public TL_stories.TL_myBoost E;
    public final cw0 F;
    public final boolean[] r;
    public final hp s;
    public final ImageView v;
    public boolean w;
    public final ImageView x;
    public boolean y;

    public n(Context context, boolean z10, boolean z11, c6 c6Var, boolean z12) {
        super(context, c6Var);
        this.r = new boolean[1];
        this.B = true;
        this.F = new cw0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f.setVisibility(8);
        if (z11) {
            hp hpVar = new hp(context, 21, c6Var);
            this.s = hpVar;
            hpVar.b(g6.B5, g6.h5, g6.k7);
            hpVar.setDrawUnchecked(false);
            hpVar.setDrawBackgroundAsArc(3);
            boolean z13 = LocaleController.isRTL;
            addView(hpVar, f6.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 40.0f, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            hp hpVar2 = new hp(context, 21, c6Var);
            this.s = hpVar2;
            if (z12) {
                hpVar2.b(g6.i7, g6.j7, g6.C5);
            } else {
                hpVar2.b(g6.B5, g6.j7, g6.C5);
            }
            hpVar2.setDrawUnchecked(true);
            hpVar2.setDrawBackgroundAsArc(10);
            addView(hpVar2);
            hpVar2.a(false, false);
            hpVar2.setLayoutParams(f6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
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
        addView(imageView, f6.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.x = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i10 = g6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), mode));
        boolean z14 = LocaleController.isRTL;
        addView(imageView2, f6.d(32, 32.0f, (z14 ? 3 : 5) | 16, z14 ? 52.0f : 12.0f, 0.0f, z14 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.A = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), mode));
        addView(imageView3, f6.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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

    @Override // gg.d
    public final boolean b() {
        hp hpVar = this.s;
        return hpVar != null && hpVar.getDrawUnchecked();
    }

    @Override // gg.d
    public final void c(boolean z10, boolean z11) {
        hp hpVar = this.s;
        if (hpVar != null && hpVar.getVisibility() == 0) {
            hpVar.a(z10, z11);
        }
    }

    public final void g(boolean z10, boolean z11) {
        Runnable runnable;
        if (this.B == z10) {
            return;
        }
        this.B = z10;
        float f9 = 0.0f;
        ImageView imageView = this.A;
        ImageView imageView2 = this.x;
        if (!z11) {
            imageView2.animate().cancel();
            imageView2.setAlpha((z10 && this.w) ? 1.0f : 0.0f);
            imageView2.setVisibility((z10 && this.w) ? 0 : 8);
            imageView.animate().cancel();
            if (z10 && this.y) {
                f9 = 1.0f;
            }
            imageView.setAlpha(f9);
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
            runnable = new Runnable(this) { // from class: ig.l
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
            f9 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate.alpha(f9);
        if (!z10 || !this.y) {
            final int i11 = 1;
            runnable2 = new Runnable(this) { // from class: ig.l
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
        e9 e9Var = this.b;
        e9Var.q(chat);
        int dp = AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f);
        t9 t9Var = this.c;
        t9Var.setRoundRadius(dp);
        t9Var.e(chat, e9Var);
        String str = chat.title;
        gg.c cVar = this.d;
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

    public final void i(float f9, boolean z10) {
        hp hpVar = this.s;
        if (hpVar == null) {
            return;
        }
        if (!z10) {
            hpVar.animate().cancel();
            hpVar.setAlpha(f9);
        } else if (Math.abs(hpVar.getAlpha() - f9) > 0.1d) {
            hpVar.animate().cancel();
            hpVar.animate().alpha(f9).start();
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
        e9 e9Var = this.b;
        e9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        t9 t9Var = this.c;
        t9Var.setRoundRadius(dp);
        t9Var.e(this.D, e9Var);
        String str = this.D.title;
        gg.c cVar = this.d;
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
        e9 e9Var = this.b;
        e9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        t9 t9Var = this.c;
        t9Var.setRoundRadius(dp);
        t9Var.e(user, e9Var);
        String userName = UserObject.getUserName(user);
        gg.c cVar = this.d;
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
        hp hpVar = this.s;
        if (hpVar != null) {
            hpVar.setAlpha(1.0f);
        }
        int w02 = g6.w0(null, g6.z9, false);
        boolean u10 = com.google.android.recaptcha.internal.a.u(user);
        cw0 cw0Var = this.F;
        cVar.i(u10 ? cw0Var.a(user, null, w02, false) : cw0Var.a(null, null, w02, false));
    }
}
