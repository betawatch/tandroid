package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import hi.y7;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.q2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c extends g2 implements fs {
    public int E;
    public int F;
    public int G;
    public c5 a;
    public g51 b;
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

    public static void Z(c cVar, ArrayList arrayList, b51 b51Var) {
        String N0 = gd.N0(2131752826, null);
        String N02 = gd.N0(2131752823, null);
        n41 n41Var = new n41(2);
        n41Var.m = N0;
        n41Var.p = N02;
        n41Var.n = "RestrictedEmoji";
        n41Var.o = "💤";
        arrayList.add(n41Var);
        n41 i7 = n41.i(1, gd.N0(2131752809, null));
        i7.L(cVar.r);
        arrayList.add(i7);
        arrayList.add(n41.C(null));
        if (cVar.r) {
            v1 d = w1.f(cVar.currentAccount).d("away");
            if (d != null) {
                n41 n41Var2 = new n41(17);
                n41Var2.H = d;
                arrayList.add(n41Var2);
            } else {
                n41 c10 = n41.c(2, R.drawable.msg2_chats_add, gd.N0(2131752825, null));
                c10.r = true;
                arrayList.add(c10);
            }
            arrayList.add(n41.C(null));
            arrayList.add(n41.u(gd.N0(2131752818, null)));
            n41 x10 = n41.x(3, gd.N0(2131752817, null));
            x10.L(cVar.x == 0);
            arrayList.add(x10);
            if (cVar.d) {
                n41 x11 = n41.x(4, gd.N0(2131752810, null));
                x11.L(cVar.x == 1);
                arrayList.add(x11);
            }
            n41 x12 = n41.x(5, gd.N0(2131752816, null));
            x12.L(cVar.x == 2);
            arrayList.add(x12);
            if (cVar.x == 2) {
                arrayList.add(n41.C(null));
                arrayList.add(n41.u(gd.N0(2131752818, null)));
                arrayList.add(n41.f(gd.N0(2131752812, null), gd.Q(cVar.F), 8));
                arrayList.add(n41.f(gd.N0(2131752815, null), gd.Q(cVar.G), 9));
            }
            arrayList.add(n41.C(null));
            n41 i10 = n41.i(10, gd.N0(2131752820, null));
            i10.L(cVar.w);
            arrayList.add(i10);
            arrayList.add(n41.C(gd.N0(2131752819, null)));
            arrayList.add(n41.u(gd.N0(2131752676, null)));
            n41 x13 = n41.x(6, gd.N0(2131752769, null));
            x13.L(cVar.s);
            arrayList.add(x13);
            n41 x14 = n41.x(7, gd.N0(2131752764, null));
            x14.L(!cVar.s);
            arrayList.add(x14);
            arrayList.add(n41.C(null));
            cVar.c.a(arrayList, b51Var, true);
            arrayList.add(n41.C(null));
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
        v1 d = w1.f(this.currentAccount).d("away");
        boolean z10 = this.r;
        if (z10 && d == null) {
            q2.E.a();
            View B1 = this.b.B1(2);
            int i7 = -this.f;
            this.f = i7;
            org.telegram.messenger.g0.E3(i7, B1, null);
            g51 g51Var = this.b;
            g51Var.y0(g51Var.A1(2));
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
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new ai.b1(this, 16));
            getMessagesStorage().j2(d2, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(gd.N0(2131752826, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 6));
        this.a = this.simpleActionBar.s(gd.N0(2131745750, null));
        int i7 = 0;
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new hi.w(this, 28));
        this.c = b0Var;
        b0Var.h = this.s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        b0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        g51 g51Var = new g51(this, new y7(this, 7), new a(this, i7), null);
        this.b = g51Var;
        g51Var.r1();
        this.b.setSectionsDrawBackground(true);
        g51 g51Var2 = this.b;
        g51Var2.g3.r = false;
        frameLayout.addView(g51Var2, na.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        g51 g51Var;
        b51 b51Var;
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
                g51Var = this.b;
                if (g51Var != null && (b51Var = g51Var.g3) != null) {
                    b51Var.O(true);
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
        g51Var = this.b;
        if (g51Var != null) {
            b51Var.O(true);
        }
        a0(true);
        this.e = true;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        b51 b51Var;
        if (i7 != ks.F1) {
            if (i7 == ks.E0) {
                d0();
            }
        } else {
            g51 g51Var = this.b;
            if (g51Var != null && (b51Var = g51Var.g3) != null) {
                b51Var.O(true);
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
            String N0 = gd.N0(2131743588, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = gd.N0(2131752808, null);
            alertDialog$Builder.k(gd.N0(2131754213, null), new a(this, 1));
            alertDialog$Builder.h(gd.N0(2131747386, null), new a(this, 2));
            showDialog(t1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.F1);
        getNotificationCenter().c(this, ks.E0);
        w1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.F1);
        getNotificationCenter().n(this, ks.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
