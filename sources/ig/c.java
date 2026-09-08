package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import bi.v7;
import di.nb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.v51;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public or a;
    public org.telegram.ui.ActionBar.v0 b;
    public d61 c;
    public a0 d;
    public boolean e;
    public boolean f;
    public int h;
    public TL_account.TL_businessAwayMessage n;
    public int r;
    public boolean s;
    public boolean v;
    public boolean w;
    public int x;
    public int y;

    public static void U(c cVar, ArrayList arrayList, v51 v51Var) {
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        h51 h51Var = new h51(2);
        h51Var.l = string;
        h51Var.o = string2;
        h51Var.m = "RestrictedEmoji";
        h51Var.n = "💤";
        arrayList.add(h51Var);
        h51 i10 = h51.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(cVar.s);
        arrayList.add(i10);
        arrayList.add(h51.B(null));
        if (cVar.s) {
            a2 d = b2.f(cVar.currentAccount).d("away");
            if (d != null) {
                h51 h51Var2 = new h51(17);
                h51Var2.G = d;
                arrayList.add(h51Var2);
            } else {
                h51 c10 = h51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(h51.B(null));
            i2.g.p(R.string.BusinessAwaySchedule, arrayList);
            h51 w10 = h51.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            w10.K(cVar.x == 0);
            arrayList.add(w10);
            if (cVar.e) {
                h51 w11 = h51.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                w11.K(cVar.x == 1);
                arrayList.add(w11);
            }
            h51 w12 = h51.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            w12.K(cVar.x == 2);
            arrayList.add(w12);
            if (cVar.x == 2) {
                arrayList.add(h51.B(null));
                i2.g.p(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(h51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(cVar.F), 8));
                arrayList.add(h51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(cVar.G), 9));
            }
            arrayList.add(h51.B(null));
            h51 i11 = h51.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(cVar.w);
            arrayList.add(i11);
            i2.g.A(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            i2.g.p(R.string.BusinessRecipients, arrayList);
            h51 w13 = h51.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w13.K(cVar.v);
            arrayList.add(w13);
            h51 w14 = h51.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w14.K(!cVar.v);
            arrayList.add(w14);
            arrayList.add(h51.B(null));
            cVar.d.a(arrayList, v51Var, true);
            arrayList.add(h51.B(null));
        }
    }

    public final void V(boolean z10) {
        if (this.b == null) {
            return;
        }
        boolean W = W();
        this.b.setEnabled(W);
        if (z10) {
            this.b.animate().alpha(W ? 1.0f : 0.0f).scaleX(W ? 1.0f : 0.0f).scaleY(W ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.b.setAlpha(W ? 1.0f : 0.0f);
        this.b.setScaleX(W ? 1.0f : 0.0f);
        this.b.setScaleY(W ? 1.0f : 0.0f);
    }

    public final boolean W() {
        a0 a0Var;
        if (this.f) {
            boolean z10 = this.s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.n;
            if (z10 == (tL_businessAwayMessage != null)) {
                if (z10 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((a0Var = this.d) == null || !a0Var.g())) {
                        int i10 = this.r;
                        int i11 = this.x;
                        if (i10 == i11 && this.n.offline_only == this.w && (i11 != 2 || (this.y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.a.c > 0.0f) {
            return;
        }
        if (!W()) {
            finishFragment();
            return;
        }
        a2 d = b2.f(this.currentAccount).d("away");
        boolean z10 = this.s;
        if (z10 && d == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View x12 = this.c.x1(2);
            int i10 = -this.h;
            this.h = i10;
            AndroidUtilities.shakeViewSpring(x12, i10);
            d61 d61Var = this.c;
            d61Var.x0(d61Var.w1(2));
            return;
        }
        if (!z10 || this.d.k(this.c)) {
            this.a.a(1.0f);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
            if (this.s) {
                TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                tL_inputBusinessAwayMessage.offline_only = this.w;
                tL_inputBusinessAwayMessage.shortcut_id = d.a;
                tL_inputBusinessAwayMessage.recipients = this.d.e();
                int i11 = this.x;
                if (i11 == 0) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                } else if (i11 == 1) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                } else if (i11 == 2) {
                    TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                    tL_businessAwayMessageScheduleCustom.start_date = this.F;
                    tL_businessAwayMessageScheduleCustom.end_date = this.G;
                    updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                }
                updatebusinessawaymessage.flags |= 1;
                if (userFull != null) {
                    userFull.flags2 |= 8;
                    TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                    userFull.business_away_message = tL_businessAwayMessage;
                    tL_businessAwayMessage.offline_only = this.w;
                    tL_businessAwayMessage.shortcut_id = d.a;
                    tL_businessAwayMessage.recipients = this.d.f();
                    userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                }
            } else if (userFull != null) {
                userFull.flags2 &= -9;
                userFull.business_away_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new v7(this, 10));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void Y() {
        d61 d61Var;
        v51 v51Var;
        if (this.f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.n = tL_businessAwayMessage;
        this.e = userFull.business_work_hours != null;
        this.s = tL_businessAwayMessage != null;
        this.v = tL_businessAwayMessage != null ? tL_businessAwayMessage.recipients.exclude_selected : true;
        this.w = tL_businessAwayMessage != null ? tL_businessAwayMessage.offline_only : true;
        a0 a0Var = this.d;
        if (a0Var != null) {
            a0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.r = 2;
                this.x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.y = i10;
                this.F = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i11;
                this.G = i11;
                d61Var = this.c;
                if (d61Var != null && (v51Var = d61Var.Y2) != null) {
                    v51Var.N(true);
                }
                V(true);
                this.f = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.r = 0;
            this.x = 0;
        } else if (tL_businessAwayMessage3 == null || !(tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.r = 0;
            this.x = 0;
        } else {
            this.r = 1;
            this.x = 1;
        }
        d61Var = this.c;
        if (d61Var != null) {
            v51Var.N(true);
        }
        V(true);
        this.f = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = j6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.a = new or(mutate, new sp(j6.w0(null, i10, false)));
        this.b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.a7, false));
        a0 a0Var = new a0(this, new nb(this, 27));
        this.d = a0Var;
        a0Var.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.n;
        a0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        d61 d61Var = new d61(this, new ci.u(this, 21), new a(this, 0), null);
        this.c = d61Var;
        d61Var.o1();
        d61 d61Var2 = this.c;
        d61Var2.Y2.r = false;
        frameLayout.addView(d61Var2, x5.c(-1.0f, -1));
        this.actionBar.A(this.c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        if (i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.userInfoDidLoad) {
                Y();
            }
        } else {
            d61 d61Var = this.c;
            if (d61Var != null && (v51Var = d61Var.Y2) != null) {
                v51Var.N(true);
            }
            V(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (!W()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            if (!this.s) {
                X();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.UnsavedChanges);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
            showDialog(alertDialog$Builder.a);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        b2.f(this.currentAccount).h();
        Y();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
        this.c.setClipToPadding(false);
    }
}
