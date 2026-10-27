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
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v0 extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public u5 a;
    public s71 b;
    public b0 c;
    public final int[] d;
    public final String[] e;
    public boolean f;
    public int h;
    public TL_account.TL_businessGreetingMessage n;
    public boolean r;
    public boolean s;
    public int v;

    public v0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.v = 7;
        this.e = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i10 >= iArr2.length) {
                return;
            }
            this.e[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
            i10++;
        }
    }

    public static void V(v0 v0Var, ArrayList arrayList, k71 k71Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        u61 u61Var = new u61(2);
        u61Var.l = string;
        u61Var.o = string2;
        u61Var.m = "RestrictedEmoji";
        u61Var.n = "👋";
        arrayList.add(u61Var);
        u61 i10 = u61.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.L(v0Var.r);
        arrayList.add(i10);
        arrayList.add(u61.C(null));
        if (v0Var.r) {
            b2 d = c2.f(v0Var.currentAccount).d("hello");
            if (d != null) {
                u61 u61Var2 = new u61(17);
                u61Var2.G = d;
                arrayList.add(u61Var2);
            } else {
                u61 c10 = u61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(u61.C(null));
            ic.a.p(R.string.BusinessRecipients, arrayList);
            u61 x9 = u61.x(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            x9.L(v0Var.s);
            arrayList.add(x9);
            u61 x10 = u61.x(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            x10.L(!v0Var.s);
            arrayList.add(x10);
            arrayList.add(u61.C(null));
            v0Var.c.a(arrayList, k71Var, true);
            ic.a.z(R.string.BusinessGreetRecipientsInfo, arrayList);
            ic.a.p(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = v0Var.d;
                if (i11 >= iArr.length) {
                    i11 = -1;
                    break;
                } else if (iArr[i11] == v0Var.v) {
                    break;
                } else {
                    i11++;
                }
            }
            String[] strArr = v0Var.e;
            ig.o oVar = new ig.o(v0Var, 5);
            u61 u61Var3 = new u61(14);
            u61Var3.p = strArr;
            u61Var3.z = i11;
            u61Var3.C = oVar;
            u61Var3.B = -1L;
            arrayList.add(u61Var3);
            ic.a.z(R.string.BusinessGreetPeriodInfo, arrayList);
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
        if (this.f) {
            boolean z10 = this.r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
            if (z10 != (tL_businessGreetingMessage != null) || (z10 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.v || tL_businessGreetingMessage.recipients.exclude_selected != this.s || ((b0Var = this.c) != null && b0Var.g())))) {
                return true;
            }
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
        b2 d = c2.f(this.currentAccount).d("hello");
        boolean z10 = this.r;
        if (z10 && d == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View E1 = this.b.E1(2);
            int i10 = -this.h;
            this.h = i10;
            AndroidUtilities.shakeViewSpring(E1, i10);
            return;
        }
        if (!z10 || this.c.k(this.b)) {
            this.a.b(true);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
            if (this.r) {
                TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                tL_inputBusinessGreetingMessage.shortcut_id = d.a;
                tL_inputBusinessGreetingMessage.recipients = this.c.e();
                updatebusinessgreetingmessage.message.no_activity_days = this.v;
                updatebusinessgreetingmessage.flags = 1 | updatebusinessgreetingmessage.flags;
                if (userFull != null) {
                    userFull.flags2 |= 4;
                    TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                    userFull.business_greeting_message = tL_businessGreetingMessage;
                    tL_businessGreetingMessage.shortcut_id = d.a;
                    tL_businessGreetingMessage.recipients = this.c.f();
                    userFull.business_greeting_message.no_activity_days = this.v;
                }
            } else if (userFull != null) {
                userFull.flags2 &= -5;
                userFull.business_greeting_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new bi.i0(this, 18));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void Z() {
        k71 k71Var;
        if (this.f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = userFull.business_greeting_message;
        this.n = tL_businessGreetingMessage;
        this.r = tL_businessGreetingMessage != null;
        this.v = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.no_activity_days : 7;
        this.s = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.recipients.exclude_selected : true;
        b0 b0Var = this.c;
        if (b0Var != null) {
            b0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        }
        s71 s71Var = this.b;
        if (s71Var != null && (k71Var = s71Var.g3) != null) {
            k71Var.O(true);
        }
        W(true);
        this.f = true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 14));
        this.a = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        W(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new ua(this, 26));
        this.c = b0Var;
        b0Var.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
        b0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        s71 s71Var = new s71(this, new hi.e2(this, 9), new u0(this, 2), null);
        this.b = s71Var;
        s71Var.u1();
        this.b.setSectionsDrawBackground(true);
        s71 s71Var2 = this.b;
        s71Var2.g3.r = false;
        frameLayout.addView(s71Var2, kb1.g(-1.0f, -1));
        Z();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k71 k71Var;
        if (i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.userInfoDidLoad) {
                Z();
            }
        } else {
            s71 s71Var = this.b;
            if (s71Var != null && (k71Var = s71Var.g3) != null) {
                k71Var.O(true);
            }
            W(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final nm0 getListViewForSimpleGlass() {
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
            alertDialog$Builder.a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new u0(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new u0(this, 1));
            showDialog(alertDialog$Builder.a);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addWeakObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.userInfoDidLoad);
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
