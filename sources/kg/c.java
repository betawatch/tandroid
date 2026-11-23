package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import hi.d7;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.q2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class c extends g2 implements gs {
    public int E;
    public int F;
    public int G;
    public c5 a;
    public h51 b;
    public b0 c;
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

    public static void Z(c cVar, ArrayList arrayList, c51 c51Var) {
        String N0 = hd.N0(2131752826, null);
        String N02 = hd.N0(2131752823, null);
        o41 o41Var = new o41(2);
        o41Var.m = N0;
        o41Var.p = N02;
        o41Var.n = "RestrictedEmoji";
        o41Var.o = "💤";
        arrayList.add(o41Var);
        o41 i7 = o41.i(1, hd.N0(2131752809, null));
        i7.L(cVar.r);
        arrayList.add(i7);
        arrayList.add(o41.C(null));
        if (cVar.r) {
            u1 d = v1.f(cVar.currentAccount).d("away");
            if (d != null) {
                o41 o41Var2 = new o41(17);
                o41Var2.H = d;
                arrayList.add(o41Var2);
            } else {
                o41 c10 = o41.c(2, R.drawable.msg2_chats_add, hd.N0(2131752825, null));
                c10.r = true;
                arrayList.add(c10);
            }
            arrayList.add(o41.C(null));
            arrayList.add(o41.u(hd.N0(2131752818, null)));
            o41 x10 = o41.x(3, hd.N0(2131752817, null));
            x10.L(cVar.x == 0);
            arrayList.add(x10);
            if (cVar.d) {
                o41 x11 = o41.x(4, hd.N0(2131752810, null));
                x11.L(cVar.x == 1);
                arrayList.add(x11);
            }
            o41 x12 = o41.x(5, hd.N0(2131752816, null));
            x12.L(cVar.x == 2);
            arrayList.add(x12);
            if (cVar.x == 2) {
                arrayList.add(o41.C(null));
                arrayList.add(o41.u(hd.N0(2131752818, null)));
                arrayList.add(o41.f(hd.N0(2131752812, null), hd.Q(cVar.F), 8));
                arrayList.add(o41.f(hd.N0(2131752815, null), hd.Q(cVar.G), 9));
            }
            arrayList.add(o41.C(null));
            o41 i10 = o41.i(10, hd.N0(2131752820, null));
            i10.L(cVar.w);
            arrayList.add(i10);
            arrayList.add(o41.C(hd.N0(2131752819, null)));
            arrayList.add(o41.u(hd.N0(2131752676, null)));
            o41 x13 = o41.x(6, hd.N0(2131752769, null));
            x13.L(cVar.s);
            arrayList.add(x13);
            o41 x14 = o41.x(7, hd.N0(2131752764, null));
            x14.L(!cVar.s);
            arrayList.add(x14);
            arrayList.add(o41.C(null));
            cVar.c.a(arrayList, c51Var, true);
            arrayList.add(o41.C(null));
        }
    }

    public final void a0(boolean z10) {
        if (this.a == null) {
            return;
        }
        this.a.a(b0(), z10);
    }

    public final boolean b0() {
        b0 b0Var;
        if (this.e) {
            boolean z10 = this.r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (z10 == (tL_businessAwayMessage != null)) {
                if (z10 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.s && ((b0Var = this.c) == null || !b0Var.g())) {
                        int i7 = this.n;
                        int i10 = this.x;
                        if (i7 == i10 && this.h.offline_only == this.w && (i10 != 2 || (this.y == this.F && this.E == this.G))) {
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
        u1 d = v1.f(this.currentAccount).d("away");
        boolean z10 = this.r;
        if (z10 && d == null) {
            q2.E.a();
            View B1 = this.b.B1(2);
            int i7 = -this.f;
            this.f = i7;
            org.telegram.messenger.g0.E3(i7, B1, null);
            h51 h51Var = this.b;
            h51Var.y0(h51Var.A1(2));
            return;
        }
        if (!z10 || this.c.k(this.b)) {
            this.a.b(true);
            TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
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
                    tL_businessAwayMessageScheduleCustom.start_date = this.F;
                    tL_businessAwayMessageScheduleCustom.end_date = this.G;
                    updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                }
                updatebusinessawaymessage.flags |= 1;
                if (d2 != null) {
                    d2.flags2 |= 8;
                    TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                    d2.business_away_message = tL_businessAwayMessage;
                    tL_businessAwayMessage.offline_only = this.w;
                    tL_businessAwayMessage.shortcut_id = d.a;
                    tL_businessAwayMessage.recipients = this.c.f();
                    d2.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                }
            } else if (d2 != null) {
                d2.flags2 &= -9;
                d2.business_away_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new ai.g1(this, 16));
            getMessagesStorage().j2(d2, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(hd.N0(2131752826, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 6));
        this.a = this.simpleActionBar.s(hd.N0(2131745750, null));
        int i7 = 0;
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new hi.l(this, 28));
        this.c = b0Var;
        b0Var.h = this.s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        b0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        h51 h51Var = new h51(this, new d7(this, 7), new a(this, i7), null);
        this.b = h51Var;
        h51Var.r1();
        this.b.setSectionsDrawBackground(true);
        h51 h51Var2 = this.b;
        h51Var2.g3.r = false;
        frameLayout.addView(h51Var2, ma.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        h51 h51Var;
        c51 c51Var;
        if (this.e) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = d2.business_away_message;
        this.h = tL_businessAwayMessage;
        this.d = d2.business_work_hours != null;
        this.r = tL_businessAwayMessage != null;
        this.s = tL_businessAwayMessage != null ? tL_businessAwayMessage.recipients.exclude_selected : true;
        this.w = tL_businessAwayMessage != null ? tL_businessAwayMessage.offline_only : true;
        b0 b0Var = this.c;
        if (b0Var != null) {
            b0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
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
                this.F = i7;
                int i10 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i10;
                this.G = i10;
                h51Var = this.b;
                if (h51Var != null && (c51Var = h51Var.g3) != null) {
                    c51Var.O(true);
                }
                a0(true);
                this.e = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
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
        h51Var = this.b;
        if (h51Var != null) {
            c51Var.O(true);
        }
        a0(true);
        this.e = true;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c51 c51Var;
        if (i7 != ls.F1) {
            if (i7 == ls.E0) {
                d0();
            }
        } else {
            h51 h51Var = this.b;
            if (h51Var != null && (c51Var = h51Var.g3) != null) {
                c51Var.O(true);
            }
            a0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ek0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
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
            String N0 = hd.N0(2131743590, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = hd.N0(2131752808, null);
            alertDialog$Builder.k(hd.N0(2131754213, null), new a(this, 1));
            alertDialog$Builder.h(hd.N0(2131747386, null), new a(this, 2));
            showDialog(t1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ls.F1);
        getNotificationCenter().c(this, ls.E0);
        v1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ls.F1);
        getNotificationCenter().n(this, ls.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
