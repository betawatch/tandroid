package hg;

import ai.m8;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import ci.uc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.w51;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public pr a;
    public org.telegram.ui.ActionBar.v0 b;
    public e61 c;
    public c0 d;
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

    public static void U(d dVar, ArrayList arrayList, w51 w51Var) {
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        i51 i51Var = new i51(2);
        i51Var.l = string;
        i51Var.o = string2;
        i51Var.m = "RestrictedEmoji";
        i51Var.n = "💤";
        arrayList.add(i51Var);
        i51 i10 = i51.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(dVar.s);
        arrayList.add(i10);
        arrayList.add(i51.B(null));
        if (dVar.s) {
            b2 d = c2.f(dVar.currentAccount).d("away");
            if (d != null) {
                i51 i51Var2 = new i51(17);
                i51Var2.G = d;
                arrayList.add(i51Var2);
            } else {
                i51 c10 = i51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(i51.B(null));
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessAwaySchedule, arrayList);
            i51 w10 = i51.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            w10.K(dVar.x == 0);
            arrayList.add(w10);
            if (dVar.e) {
                i51 w11 = i51.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                w11.K(dVar.x == 1);
                arrayList.add(w11);
            }
            i51 w12 = i51.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            w12.K(dVar.x == 2);
            arrayList.add(w12);
            if (dVar.x == 2) {
                arrayList.add(i51.B(null));
                com.google.android.gms.internal.vision.e2.n(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(i51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(dVar.F), 8));
                arrayList.add(i51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(dVar.G), 9));
            }
            arrayList.add(i51.B(null));
            i51 i11 = i51.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(dVar.w);
            arrayList.add(i11);
            c.p(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessRecipients, arrayList);
            i51 w13 = i51.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w13.K(dVar.v);
            arrayList.add(w13);
            i51 w14 = i51.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w14.K(!dVar.v);
            arrayList.add(w14);
            arrayList.add(i51.B(null));
            dVar.d.a(arrayList, w51Var, true);
            arrayList.add(i51.B(null));
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
        c0 c0Var;
        if (this.f) {
            boolean z10 = this.s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.n;
            if (z10 == (tL_businessAwayMessage != null)) {
                if (z10 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((c0Var = this.d) == null || !c0Var.g())) {
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
        b2 d = c2.f(this.currentAccount).d("away");
        boolean z10 = this.s;
        if (z10 && d == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View y12 = this.c.y1(2);
            int i10 = -this.h;
            this.h = i10;
            AndroidUtilities.shakeViewSpring(y12, i10);
            e61 e61Var = this.c;
            e61Var.x0(e61Var.x1(2));
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
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new m8(this, 10));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void Y() {
        e61 e61Var;
        w51 w51Var;
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
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
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
                e61Var = this.c;
                if (e61Var != null && (w51Var = e61Var.Y2) != null) {
                    w51Var.N(true);
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
        e61Var = this.c;
        if (e61Var != null) {
            w51Var.N(true);
        }
        V(true);
        this.f = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 9));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = i6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.a = new pr(mutate, new tp(i6.w0(null, i10, false)));
        this.b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.w0(null, i6.a7, false));
        c0 c0Var = new c0(this, new uc(this, 18));
        this.d = c0Var;
        c0Var.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.n;
        c0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        e61 e61Var = new e61(this, new bi.v(this, 21), new a(this, 0), null);
        this.c = e61Var;
        e61Var.p1();
        e61 e61Var2 = this.c;
        e61Var2.Y2.r = false;
        frameLayout.addView(e61Var2, x5.c(-1.0f, -1));
        this.actionBar.z(this.c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if (i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.userInfoDidLoad) {
                Y();
            }
        } else {
            e61 e61Var = this.c;
            if (e61Var != null && (w51Var = e61Var.Y2) != null) {
                w51Var.N(true);
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
        c2.f(this.currentAccount).h();
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
