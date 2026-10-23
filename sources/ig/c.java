package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import ei.bc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m61;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class c extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public as a;
    public eq b;
    public org.telegram.ui.ActionBar.u0 c;
    public j71 d;
    public a0 e;
    public boolean f;
    public boolean h;
    public int n;
    public TL_account.TL_businessAwayMessage r;
    public int s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    public static void U(c cVar, ArrayList arrayList, b71 b71Var) {
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        m61 m61Var = new m61(2);
        m61Var.l = string;
        m61Var.o = string2;
        m61Var.m = "RestrictedEmoji";
        m61Var.n = "💤";
        arrayList.add(m61Var);
        m61 i10 = m61.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(cVar.v);
        arrayList.add(i10);
        arrayList.add(m61.B(null));
        if (cVar.v) {
            y1 d = z1.f(cVar.currentAccount).d("away");
            if (d != null) {
                m61 m61Var2 = new m61(17);
                m61Var2.G = d;
                arrayList.add(m61Var2);
            } else {
                m61 c10 = m61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(m61.B(null));
            i2.o1.q(R.string.BusinessAwaySchedule, arrayList);
            m61 w9 = m61.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            w9.K(cVar.y == 0);
            arrayList.add(w9);
            if (cVar.f) {
                m61 w10 = m61.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                w10.K(cVar.y == 1);
                arrayList.add(w10);
            }
            m61 w11 = m61.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            w11.K(cVar.y == 2);
            arrayList.add(w11);
            if (cVar.y == 2) {
                arrayList.add(m61.B(null));
                i2.o1.q(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(m61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(cVar.G), 8));
                arrayList.add(m61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(cVar.H), 9));
            }
            arrayList.add(m61.B(null));
            m61 i11 = m61.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(cVar.x);
            arrayList.add(i11);
            i2.o1.B(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            i2.o1.q(R.string.BusinessRecipients, arrayList);
            m61 w12 = m61.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w12.K(cVar.w);
            arrayList.add(w12);
            m61 w13 = m61.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w13.K(!cVar.w);
            arrayList.add(w13);
            arrayList.add(m61.B(null));
            cVar.e.a(arrayList, b71Var, true);
            arrayList.add(m61.B(null));
        }
    }

    public final void V(boolean z10) {
        if (this.c == null) {
            return;
        }
        boolean W = W();
        this.c.setEnabled(W);
        if (z10) {
            this.c.animate().alpha(W ? 1.0f : 0.0f).scaleX(W ? 1.0f : 0.0f).scaleY(W ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.c.setAlpha(W ? 1.0f : 0.0f);
        this.c.setScaleX(W ? 1.0f : 0.0f);
        this.c.setScaleY(W ? 1.0f : 0.0f);
    }

    public final boolean W() {
        a0 a0Var;
        if (this.h) {
            boolean z10 = this.v;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.r;
            if (z10 == (tL_businessAwayMessage != null)) {
                if (z10 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.w && ((a0Var = this.e) == null || !a0Var.g())) {
                        int i10 = this.s;
                        int i11 = this.y;
                        if (i10 == i11 && this.r.offline_only == this.x && (i11 != 2 || (this.E == this.G && this.F == this.H))) {
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
        y1 d = z1.f(this.currentAccount).d("away");
        boolean z10 = this.v;
        if (z10 && d == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View E1 = this.d.E1(2);
            int i10 = -this.n;
            this.n = i10;
            AndroidUtilities.shakeViewSpring(E1, i10);
            j71 j71Var = this.d;
            j71Var.x0(j71Var.D1(2));
            return;
        }
        if (!z10 || this.e.k(this.d)) {
            this.a.a(1.0f);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
            if (this.v) {
                TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                tL_inputBusinessAwayMessage.offline_only = this.x;
                tL_inputBusinessAwayMessage.shortcut_id = d.a;
                tL_inputBusinessAwayMessage.recipients = this.e.e();
                int i11 = this.y;
                if (i11 == 0) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                } else if (i11 == 1) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                } else if (i11 == 2) {
                    TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                    tL_businessAwayMessageScheduleCustom.start_date = this.G;
                    tL_businessAwayMessageScheduleCustom.end_date = this.H;
                    updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                }
                updatebusinessawaymessage.flags |= 1;
                if (userFull != null) {
                    userFull.flags2 |= 8;
                    TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                    userFull.business_away_message = tL_businessAwayMessage;
                    tL_businessAwayMessage.offline_only = this.x;
                    tL_businessAwayMessage.shortcut_id = d.a;
                    tL_businessAwayMessage.recipients = this.e.f();
                    userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                }
            } else if (userFull != null) {
                userFull.flags2 &= -9;
                userFull.business_away_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new ai.h(this, 16));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void Y() {
        j71 j71Var;
        b71 b71Var;
        if (this.h) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.r = tL_businessAwayMessage;
        this.f = userFull.business_work_hours != null;
        this.v = tL_businessAwayMessage != null;
        this.w = tL_businessAwayMessage != null ? tL_businessAwayMessage.recipients.exclude_selected : true;
        this.x = tL_businessAwayMessage != null ? tL_businessAwayMessage.offline_only : true;
        a0 a0Var = this.e;
        if (a0Var != null) {
            a0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.r;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.s = 2;
                this.y = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.E = i10;
                this.G = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.F = i11;
                this.H = i11;
                j71Var = this.d;
                if (j71Var != null && (b71Var = j71Var.Z2) != null) {
                    b71Var.N(true);
                }
                V(true);
                this.h = true;
            }
        }
        this.G = getConnectionsManager().getCurrentTime();
        this.H = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.r;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.s = 0;
            this.y = 0;
        } else if (tL_businessAwayMessage3 == null || !(tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.s = 0;
            this.y = 0;
        } else {
            this.s = 1;
            this.y = 1;
        }
        j71Var = this.d;
        if (j71Var != null) {
            b71Var.N(true);
        }
        V(true);
        this.h = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = k6.v8;
        int x02 = k6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
        eq eqVar = new eq(k6.x0(null, i10, false));
        this.b = eqVar;
        this.a = new as(mutate, eqVar);
        org.telegram.ui.ActionBar.u0 i11 = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        this.c = i11;
        r6.z(i11, mutate, i10, null, mode);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.a7, frameLayout, null);
        a0 a0Var = new a0(this, new bc(this, 17));
        this.e = a0Var;
        a0Var.h = this.w;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.r;
        a0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        j71 j71Var = new j71(this, new hg.o(this, 2), new a(this, 0), null);
        this.d = j71Var;
        j71Var.t1();
        j71 j71Var2 = this.d;
        j71Var2.Z2.r = false;
        frameLayout.addView(j71Var2, z5.c(-1.0f, -1));
        this.actionBar.z(this.d, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b71 b71Var;
        if (i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.userInfoDidLoad) {
                Y();
            }
        } else {
            j71 j71Var = this.d;
            if (j71Var != null && (b71Var = j71Var.Z2) != null) {
                b71Var.N(true);
            }
            V(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!W()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            if (!this.v) {
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

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        z1.f(this.currentAccount).h();
        Y();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.d.setPadding(0, 0, 0, i13);
        this.d.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            eq eqVar = this.b;
            if (eqVar != null) {
                eqVar.b(k6.x0(null, k6.v8, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
