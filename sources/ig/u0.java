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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class u0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public as a;
    public eq b;
    public org.telegram.ui.ActionBar.u0 c;
    public j71 d;
    public a0 e;
    public final int[] f;
    public final String[] h;
    public boolean n;
    public int r;
    public TL_account.TL_businessGreetingMessage s;
    public boolean v;
    public boolean w;
    public int x;

    public u0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.f = iArr;
        this.r = -4;
        this.x = 7;
        this.h = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f;
            if (i10 >= iArr2.length) {
                return;
            }
            this.h[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
            i10++;
        }
    }

    public static void U(u0 u0Var, ArrayList arrayList, b71 b71Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        m61 m61Var = new m61(2);
        m61Var.l = string;
        m61Var.o = string2;
        m61Var.m = "RestrictedEmoji";
        m61Var.n = "👋";
        arrayList.add(m61Var);
        m61 i10 = m61.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(u0Var.v);
        arrayList.add(i10);
        arrayList.add(m61.B(null));
        if (u0Var.v) {
            y1 d = z1.f(u0Var.currentAccount).d("hello");
            if (d != null) {
                m61 m61Var2 = new m61(17);
                m61Var2.G = d;
                arrayList.add(m61Var2);
            } else {
                m61 c10 = m61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(m61.B(null));
            i2.o1.q(R.string.BusinessRecipients, arrayList);
            m61 w9 = m61.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w9.K(u0Var.w);
            arrayList.add(w9);
            m61 w10 = m61.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w10.K(!u0Var.w);
            arrayList.add(w10);
            arrayList.add(m61.B(null));
            u0Var.e.a(arrayList, b71Var, true);
            i2.o1.B(R.string.BusinessGreetRecipientsInfo, arrayList);
            i2.o1.q(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = u0Var.f;
                if (i11 >= iArr.length) {
                    i11 = -1;
                    break;
                } else if (iArr[i11] == u0Var.x) {
                    break;
                } else {
                    i11++;
                }
            }
            String[] strArr = u0Var.h;
            k0 k0Var = new k0(u0Var, 1);
            m61 m61Var3 = new m61(14);
            m61Var3.p = strArr;
            m61Var3.z = i11;
            m61Var3.C = k0Var;
            m61Var3.B = -1L;
            arrayList.add(m61Var3);
            i2.o1.B(R.string.BusinessGreetPeriodInfo, arrayList);
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
        if (this.n) {
            boolean z10 = this.v;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.s;
            if (z10 != (tL_businessGreetingMessage != null) || (z10 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.x || tL_businessGreetingMessage.recipients.exclude_selected != this.w || ((a0Var = this.e) != null && a0Var.g())))) {
                return true;
            }
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
        y1 d = z1.f(this.currentAccount).d("hello");
        boolean z10 = this.v;
        if (z10 && d == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View E1 = this.d.E1(2);
            int i10 = -this.r;
            this.r = i10;
            AndroidUtilities.shakeViewSpring(E1, i10);
            return;
        }
        if (!z10 || this.e.k(this.d)) {
            this.a.a(1.0f);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
            if (this.v) {
                TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                tL_inputBusinessGreetingMessage.shortcut_id = d.a;
                tL_inputBusinessGreetingMessage.recipients = this.e.e();
                updatebusinessgreetingmessage.message.no_activity_days = this.x;
                updatebusinessgreetingmessage.flags |= 1;
                if (userFull != null) {
                    userFull.flags2 |= 4;
                    TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                    userFull.business_greeting_message = tL_businessGreetingMessage;
                    tL_businessGreetingMessage.shortcut_id = d.a;
                    tL_businessGreetingMessage.recipients = this.e.f();
                    userFull.business_greeting_message.no_activity_days = this.x;
                }
            } else if (userFull != null) {
                userFull.flags2 &= -5;
                userFull.business_greeting_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ai.h(this, 19));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void Y() {
        b71 b71Var;
        if (this.n) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = userFull.business_greeting_message;
        this.s = tL_businessGreetingMessage;
        this.v = tL_businessGreetingMessage != null;
        this.x = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.no_activity_days : 7;
        this.w = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.recipients.exclude_selected : true;
        a0 a0Var = this.e;
        if (a0Var != null) {
            a0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        }
        j71 j71Var = this.d;
        if (j71Var != null && (b71Var = j71Var.Z2) != null) {
            b71Var.N(true);
        }
        V(true);
        this.n = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 14));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = k6.v8;
        int x02 = k6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.b = new eq(k6.x0(null, i10, false));
        this.a = new as(mutate, this.b);
        org.telegram.ui.ActionBar.u0 i11 = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        this.c = i11;
        r6.z(i11, mutate, i10, null, mode);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.a7, frameLayout, null);
        a0 a0Var = new a0(this, new bc(this, 21));
        this.e = a0Var;
        a0Var.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.s;
        a0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        j71 j71Var = new j71(this, new hg.o(this, 6), new t0(this, 2), null);
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
            alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new t0(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new t0(this, 1));
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
            org.telegram.ui.ActionBar.u0 u0Var = this.c;
            if (u0Var != null) {
                u0Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
