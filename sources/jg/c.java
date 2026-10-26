package jg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import fi.ua;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class c extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public u5 a;
    public r71 b;
    public b0 c;
    public boolean d;
    public boolean e;
    public int f;
    public TL_account.TL_businessAwayMessage h;
    public int n;
    public boolean r;
    public boolean s;
    public boolean v;
    public int w;
    public int x;
    public int y;

    public static void V(c cVar, ArrayList arrayList, j71 j71Var) {
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        t61 t61Var = new t61(2);
        t61Var.l = string;
        t61Var.o = string2;
        t61Var.m = "RestrictedEmoji";
        t61Var.n = "💤";
        arrayList.add(t61Var);
        t61 i10 = t61.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.L(cVar.r);
        arrayList.add(i10);
        arrayList.add(t61.C(null));
        if (cVar.r) {
            b2 d = c2.f(cVar.currentAccount).d("away");
            if (d != null) {
                t61 t61Var2 = new t61(17);
                t61Var2.G = d;
                arrayList.add(t61Var2);
            } else {
                t61 c10 = t61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(t61.C(null));
            ic.a.p(R.string.BusinessAwaySchedule, arrayList);
            t61 x9 = t61.x(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            x9.L(cVar.w == 0);
            arrayList.add(x9);
            if (cVar.d) {
                t61 x10 = t61.x(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                x10.L(cVar.w == 1);
                arrayList.add(x10);
            }
            t61 x11 = t61.x(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            x11.L(cVar.w == 2);
            arrayList.add(x11);
            if (cVar.w == 2) {
                arrayList.add(t61.C(null));
                ic.a.p(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(t61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(cVar.E), 8));
                arrayList.add(t61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(cVar.F), 9));
            }
            arrayList.add(t61.C(null));
            t61 i11 = t61.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.L(cVar.v);
            arrayList.add(i11);
            ic.a.z(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            ic.a.p(R.string.BusinessRecipients, arrayList);
            t61 x12 = t61.x(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            x12.L(cVar.s);
            arrayList.add(x12);
            t61 x13 = t61.x(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            x13.L(!cVar.s);
            arrayList.add(x13);
            arrayList.add(t61.C(null));
            cVar.c.a(arrayList, j71Var, true);
            arrayList.add(t61.C(null));
        }
    }

    public final void W(boolean z10) {
        if (this.a == null) {
            return;
        }
        this.a.a(X(), z10);
    }

    public final boolean X() {
        b0 b0Var;
        if (this.e) {
            boolean z10 = this.r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (z10 == (tL_businessAwayMessage != null)) {
                if (z10 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.s && ((b0Var = this.c) == null || !b0Var.g())) {
                        int i10 = this.n;
                        int i11 = this.w;
                        if (i10 == i11 && this.h.offline_only == this.v && (i11 != 2 || (this.x == this.E && this.y == this.F))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void Y() {
        if (this.a.x.f) {
            return;
        }
        if (!X()) {
            finishFragment();
            return;
        }
        b2 d = c2.f(this.currentAccount).d("away");
        boolean z10 = this.r;
        if (z10 && d == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View E1 = this.b.E1(2);
            int i10 = -this.f;
            this.f = i10;
            AndroidUtilities.shakeViewSpring(E1, i10);
            r71 r71Var = this.b;
            r71Var.y0(r71Var.D1(2));
            return;
        }
        if (!z10 || this.c.k(this.b)) {
            this.a.b(true);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
            if (this.r) {
                TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                tL_inputBusinessAwayMessage.offline_only = this.v;
                tL_inputBusinessAwayMessage.shortcut_id = d.a;
                tL_inputBusinessAwayMessage.recipients = this.c.e();
                int i11 = this.w;
                if (i11 == 0) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                } else if (i11 == 1) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                } else if (i11 == 2) {
                    TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                    tL_businessAwayMessageScheduleCustom.start_date = this.E;
                    tL_businessAwayMessageScheduleCustom.end_date = this.F;
                    updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                }
                updatebusinessawaymessage.flags |= 1;
                if (userFull != null) {
                    userFull.flags2 |= 8;
                    TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                    userFull.business_away_message = tL_businessAwayMessage;
                    tL_businessAwayMessage.offline_only = this.v;
                    tL_businessAwayMessage.shortcut_id = d.a;
                    tL_businessAwayMessage.recipients = this.c.f();
                    userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                }
            } else if (userFull != null) {
                userFull.flags2 &= -9;
                userFull.business_away_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new bi.i0(this, 15));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void Z() {
        r71 r71Var;
        j71 j71Var;
        if (this.e) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.h = tL_businessAwayMessage;
        this.d = userFull.business_work_hours != null;
        this.r = tL_businessAwayMessage != null;
        this.s = tL_businessAwayMessage != null ? tL_businessAwayMessage.recipients.exclude_selected : true;
        this.v = tL_businessAwayMessage != null ? tL_businessAwayMessage.offline_only : true;
        b0 b0Var = this.c;
        if (b0Var != null) {
            b0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.h;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.n = 2;
                this.w = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.x = i10;
                this.E = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.y = i11;
                this.F = i11;
                r71Var = this.b;
                if (r71Var != null && (j71Var = r71Var.g3) != null) {
                    j71Var.O(true);
                }
                W(true);
                this.e = true;
            }
        }
        this.E = getConnectionsManager().getCurrentTime();
        this.F = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.h;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.n = 0;
            this.w = 0;
        } else if (tL_businessAwayMessage3 == null || !(tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.n = 0;
            this.w = 0;
        } else {
            this.n = 1;
            this.w = 1;
        }
        r71Var = this.b;
        if (r71Var != null) {
            j71Var.O(true);
        }
        W(true);
        this.e = true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 11));
        this.a = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        W(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new ua(this, 22));
        this.c = b0Var;
        b0Var.h = this.s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        b0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        r71 r71Var = new r71(this, new hi.e2(this, 5), new a(this, 0), null);
        this.b = r71Var;
        r71Var.u1();
        this.b.setSectionsDrawBackground(true);
        r71 r71Var2 = this.b;
        r71Var2.g3.r = false;
        frameLayout.addView(r71Var2, gb1.g(-1.0f, -1));
        Z();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        if (i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.userInfoDidLoad) {
                Z();
            }
        } else {
            r71 r71Var = this.b;
            if (r71Var != null && (j71Var = r71Var.g3) != null) {
                j71Var.O(true);
            }
            W(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final mm0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (!X()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            if (!this.r) {
                Y();
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

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        c2.f(this.currentAccount).h();
        Z();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
