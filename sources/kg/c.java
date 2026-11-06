package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import fi.h9;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p2;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class c extends f2 implements ls {
    public int D;
    public int E;
    public int F;
    public b5 a;
    public k41 b;
    public a0 c;
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

    public static void Z(c cVar, ArrayList arrayList, f41 f41Var) {
        String M0 = hd.M0(2131752838, null);
        String M02 = hd.M0(2131752835, null);
        r31 r31Var = new r31(2);
        r31Var.l = M0;
        r31Var.o = M02;
        r31Var.m = "RestrictedEmoji";
        r31Var.n = "💤";
        arrayList.add(r31Var);
        r31 i7 = r31.i(1, hd.M0(2131752821, null));
        i7.L(cVar.r);
        arrayList.add(i7);
        arrayList.add(r31.C(null));
        if (cVar.r) {
            s1 d = t1.f(cVar.currentAccount).d("away");
            if (d != null) {
                r31 r31Var2 = new r31(17);
                r31Var2.G = d;
                arrayList.add(r31Var2);
            } else {
                r31 c10 = r31.c(2, R.drawable.msg2_chats_add, hd.M0(2131752837, null));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(r31.C(null));
            arrayList.add(r31.u(hd.M0(2131752830, null)));
            r31 x10 = r31.x(3, hd.M0(2131752829, null));
            x10.L(cVar.x == 0);
            arrayList.add(x10);
            if (cVar.d) {
                r31 x11 = r31.x(4, hd.M0(2131752822, null));
                x11.L(cVar.x == 1);
                arrayList.add(x11);
            }
            r31 x12 = r31.x(5, hd.M0(2131752828, null));
            x12.L(cVar.x == 2);
            arrayList.add(x12);
            if (cVar.x == 2) {
                arrayList.add(r31.C(null));
                arrayList.add(r31.u(hd.M0(2131752830, null)));
                arrayList.add(r31.f(hd.M0(2131752824, null), hd.Q(cVar.E), 8));
                arrayList.add(r31.f(hd.M0(2131752827, null), hd.Q(cVar.F), 9));
            }
            arrayList.add(r31.C(null));
            r31 i10 = r31.i(10, hd.M0(2131752832, null));
            i10.L(cVar.w);
            arrayList.add(i10);
            arrayList.add(r31.C(hd.M0(2131752831, null)));
            arrayList.add(r31.u(hd.M0(2131752688, null)));
            r31 x13 = r31.x(6, hd.M0(2131752781, null));
            x13.L(cVar.s);
            arrayList.add(x13);
            r31 x14 = r31.x(7, hd.M0(2131752776, null));
            x14.L(!cVar.s);
            arrayList.add(x14);
            arrayList.add(r31.C(null));
            cVar.c.a(arrayList, f41Var, true);
            arrayList.add(r31.C(null));
        }
    }

    public final void a0(boolean z9) {
        if (this.a == null) {
            return;
        }
        this.a.a(b0(), z9);
    }

    public final boolean b0() {
        a0 a0Var;
        if (this.e) {
            boolean z9 = this.r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (z9 == (tL_businessAwayMessage != null)) {
                if (z9 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.s && ((a0Var = this.c) == null || !a0Var.g())) {
                        int i7 = this.n;
                        int i10 = this.x;
                        if (i7 == i10 && this.h.offline_only == this.w && (i10 != 2 || (this.y == this.E && this.D == this.F))) {
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
        s1 d = t1.f(this.currentAccount).d("away");
        boolean z9 = this.r;
        if (z9 && d == null) {
            p2.D.a();
            View B1 = this.b.B1(2);
            int i7 = -this.f;
            this.f = i7;
            org.telegram.messenger.g0.G3(i7, B1, null);
            k41 k41Var = this.b;
            k41Var.y0(k41Var.A1(2));
            return;
        }
        if (!z9 || this.c.k(this.b)) {
            this.a.b(true);
            TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
            TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
            if (this.r) {
                TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                tL_inputBusinessAwayMessage.offline_only = this.w;
                tL_inputBusinessAwayMessage.shortcut_id = d.a;
                tL_inputBusinessAwayMessage.recipients = this.c.e();
                int i10 = this.x;
                if (i10 == 0) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                } else if (i10 == 1) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                } else if (i10 == 2) {
                    TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                    tL_businessAwayMessageScheduleCustom.start_date = this.E;
                    tL_businessAwayMessageScheduleCustom.end_date = this.F;
                    updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                }
                updatebusinessawaymessage.flags |= 1;
                if (b22 != null) {
                    b22.flags2 |= 8;
                    TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                    b22.business_away_message = tL_businessAwayMessage;
                    tL_businessAwayMessage.offline_only = this.w;
                    tL_businessAwayMessage.shortcut_id = d.a;
                    tL_businessAwayMessage.recipients = this.c.f();
                    b22.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                }
            } else if (b22 != null) {
                b22.flags2 &= -9;
                b22.business_away_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new bi.j0(this, 14));
            getMessagesStorage().j2(b22, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(hd.M0(2131752838, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 11));
        this.a = this.simpleActionBar.n(hd.M0(2131745947, null));
        int i7 = 0;
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a0 a0Var = new a0(this, new h9(this, 22));
        this.c = a0Var;
        a0Var.h = this.s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        a0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        k41 k41Var = new k41(this, new hi.u1(this, 5), new a(this, i7), null);
        this.b = k41Var;
        k41Var.r1();
        this.b.setSectionsDrawBackground(true);
        k41 k41Var2 = this.b;
        k41Var2.f3.r = false;
        frameLayout.addView(k41Var2, ha.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        k41 k41Var;
        f41 f41Var;
        if (this.e) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = b22.business_away_message;
        this.h = tL_businessAwayMessage;
        this.d = b22.business_work_hours != null;
        this.r = tL_businessAwayMessage != null;
        this.s = tL_businessAwayMessage != null ? tL_businessAwayMessage.recipients.exclude_selected : true;
        this.w = tL_businessAwayMessage != null ? tL_businessAwayMessage.offline_only : true;
        a0 a0Var = this.c;
        if (a0Var != null) {
            a0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.h;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.n = 2;
                this.x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i7 = tL_businessAwayMessageScheduleCustom.start_date;
                this.y = i7;
                this.E = i7;
                int i10 = tL_businessAwayMessageScheduleCustom.end_date;
                this.D = i10;
                this.F = i10;
                k41Var = this.b;
                if (k41Var != null && (f41Var = k41Var.f3) != null) {
                    f41Var.O(true);
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
        k41Var = this.b;
        if (k41Var != null) {
            f41Var.O(true);
        }
        a0(true);
        this.e = true;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        f41 f41Var;
        if (i7 != qs.F1) {
            if (i7 == qs.E0) {
                d0();
            }
        } else {
            k41 k41Var = this.b;
            if (k41Var != null && (f41Var = k41Var.f3) != null) {
                f41Var.O(true);
            }
            a0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (!b0()) {
            return super.onBackPressed(z9);
        }
        if (z9) {
            if (!this.r) {
                c0();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = hd.M0(2131743836, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = hd.M0(2131752820, null);
            alertDialog$Builder.k(hd.M0(2131754216, null), new a(this, 1));
            alertDialog$Builder.h(hd.M0(2131747579, null), new a(this, 2));
            showDialog(u1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.F1);
        getNotificationCenter().c(this, qs.E0);
        t1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.F1);
        getNotificationCenter().n(this, qs.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
