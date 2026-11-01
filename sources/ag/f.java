package ag;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f extends org.telegram.ui.ActionBar.k2 implements vs {
    public int D;
    public int E;
    public int F;
    public l5 a;
    public v51 b;
    public x0 c;
    public boolean d;
    public boolean e;
    public int f;
    public TL_account.TL_businessAwayMessage h;
    public int n;
    public boolean r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    public static void Z(f fVar, ArrayList arrayList, q51 q51Var) {
        String L0 = dd.L0(2131752838, null);
        String L02 = dd.L0(2131752835, null);
        b51 b51Var = new b51(2);
        b51Var.l = L0;
        b51Var.o = L02;
        b51Var.m = "RestrictedEmoji";
        b51Var.n = "💤";
        arrayList.add(b51Var);
        b51 i10 = b51.i(1, dd.L0(2131752821, null));
        i10.L(fVar.r);
        arrayList.add(i10);
        arrayList.add(b51.C(null));
        if (fVar.r) {
            h3 d = i3.f(fVar.currentAccount).d("away");
            if (d != null) {
                b51 b51Var2 = new b51(17);
                b51Var2.G = d;
                arrayList.add(b51Var2);
            } else {
                b51 c10 = b51.c(2, R.drawable.msg2_chats_add, dd.L0(2131752837, null));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(b51.C(null));
            arrayList.add(b51.u(dd.L0(2131752830, null)));
            b51 x10 = b51.x(3, dd.L0(2131752829, null));
            x10.L(fVar.x == 0);
            arrayList.add(x10);
            if (fVar.d) {
                b51 x11 = b51.x(4, dd.L0(2131752822, null));
                x11.L(fVar.x == 1);
                arrayList.add(x11);
            }
            b51 x12 = b51.x(5, dd.L0(2131752828, null));
            x12.L(fVar.x == 2);
            arrayList.add(x12);
            if (fVar.x == 2) {
                arrayList.add(b51.C(null));
                arrayList.add(b51.u(dd.L0(2131752830, null)));
                arrayList.add(b51.f(dd.L0(2131752824, null), dd.Q(fVar.E), 8));
                arrayList.add(b51.f(dd.L0(2131752827, null), dd.Q(fVar.F), 9));
            }
            arrayList.add(b51.C(null));
            b51 i11 = b51.i(10, dd.L0(2131752832, null));
            i11.L(fVar.w);
            arrayList.add(i11);
            arrayList.add(b51.C(dd.L0(2131752831, null)));
            arrayList.add(b51.u(dd.L0(2131752688, null)));
            b51 x13 = b51.x(6, dd.L0(2131752781, null));
            x13.L(fVar.s);
            arrayList.add(x13);
            b51 x14 = b51.x(7, dd.L0(2131752776, null));
            x14.L(!fVar.s);
            arrayList.add(x14);
            arrayList.add(b51.C(null));
            fVar.c.a(arrayList, q51Var, true);
            arrayList.add(b51.C(null));
        }
    }

    public final void a0(boolean z10) {
        if (this.a == null) {
            return;
        }
        this.a.a(b0(), z10);
    }

    public final boolean b0() {
        x0 x0Var;
        if (this.e) {
            boolean z10 = this.r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (z10 == (tL_businessAwayMessage != null)) {
                if (z10 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.s && ((x0Var = this.c) == null || !x0Var.g())) {
                        int i10 = this.n;
                        int i11 = this.x;
                        if (i10 == i11 && this.h.offline_only == this.w && (i11 != 2 || (this.y == this.E && this.D == this.F))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void c0() {
        if (this.a.y.f) {
            return;
        }
        if (!b0()) {
            finishFragment();
            return;
        }
        h3 d = i3.f(this.currentAccount).d("away");
        boolean z10 = this.r;
        if (z10 && d == null) {
            org.telegram.messenger.t2.D.a();
            View B1 = this.b.B1(2);
            int i10 = -this.f;
            this.f = i10;
            org.telegram.messenger.i0.F3(i10, B1, null);
            v51 v51Var = this.b;
            v51Var.y0(v51Var.A1(2));
            return;
        }
        if (!z10 || this.c.k(this.b)) {
            this.a.b(true);
            TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
            TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
            if (this.r) {
                TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                tL_inputBusinessAwayMessage.offline_only = this.w;
                tL_inputBusinessAwayMessage.shortcut_id = d.a;
                tL_inputBusinessAwayMessage.recipients = this.c.e();
                int i11 = this.x;
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
                if (a2 != null) {
                    a2.flags2 |= 8;
                    TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                    a2.business_away_message = tL_businessAwayMessage;
                    tL_businessAwayMessage.offline_only = this.w;
                    tL_businessAwayMessage.shortcut_id = d.a;
                    tL_businessAwayMessage.recipients = this.c.f();
                    a2.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                }
            } else if (a2 != null) {
                a2.flags2 &= -9;
                a2.business_away_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new c(this, 0));
            getMessagesStorage().j2(a2, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(dd.L0(2131752838, null));
        int i10 = 0;
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, i10));
        this.a = this.simpleActionBar.n(dd.L0(2131745963, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        x0 x0Var = new x0(this, new a3.d(this, 3));
        this.c = x0Var;
        x0Var.h = this.s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        x0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        v51 v51Var = new v51(this, new a(this, i10), new b(this, i10), null);
        this.b = v51Var;
        v51Var.r1();
        this.b.setSectionsDrawBackground(true);
        v51 v51Var2 = this.b;
        v51Var2.f3.r = false;
        frameLayout.addView(v51Var2, b6.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        v51 v51Var;
        q51 q51Var;
        if (this.e) {
            return;
        }
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
        if (a2 == null) {
            getMessagesController().e3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = a2.business_away_message;
        this.h = tL_businessAwayMessage;
        this.d = a2.business_work_hours != null;
        this.r = tL_businessAwayMessage != null;
        this.s = tL_businessAwayMessage != null ? tL_businessAwayMessage.recipients.exclude_selected : true;
        this.w = tL_businessAwayMessage != null ? tL_businessAwayMessage.offline_only : true;
        x0 x0Var = this.c;
        if (x0Var != null) {
            x0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.h;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.n = 2;
                this.x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.y = i10;
                this.E = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.D = i11;
                this.F = i11;
                v51Var = this.b;
                if (v51Var != null && (q51Var = v51Var.f3) != null) {
                    q51Var.O(true);
                }
                a0(true);
                this.e = true;
            }
        }
        this.E = getConnectionsManager().getCurrentTime();
        this.F = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.h;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.n = 0;
            this.x = 0;
        } else if (tL_businessAwayMessage3 == null || !(tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.n = 0;
            this.x = 0;
        } else {
            this.n = 1;
            this.x = 1;
        }
        v51Var = this.b;
        if (v51Var != null) {
            q51Var.O(true);
        }
        a0(true);
        this.e = true;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        q51 q51Var;
        if (i10 != at.F1) {
            if (i10 == at.E0) {
                d0();
            }
        } else {
            v51 v51Var = this.b;
            if (v51Var != null && (q51Var = v51Var.f3) != null) {
                q51Var.O(true);
            }
            a0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final uk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (!b0()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            if (!this.r) {
                c0();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = dd.L0(2131743860, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = dd.L0(2131752820, null);
            alertDialog$Builder.k(dd.L0(2131754216, null), new b(this, 1));
            alertDialog$Builder.h(dd.L0(2131747596, null), new b(this, 2));
            showDialog(x1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, at.F1);
        getNotificationCenter().c(this, at.E0);
        i3.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, at.F1);
        getNotificationCenter().n(this, at.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
