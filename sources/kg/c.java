package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.x4;
import c8.ja;
import hi.q4;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c extends e2 implements is {
    public int E;
    public int F;
    public int G;
    public z4 a;
    public u41 b;
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

    public static void Z(c cVar, ArrayList arrayList, p41 p41Var) {
        String M0 = hd.M0(2131752838, null);
        String M02 = hd.M0(2131752835, null);
        b41 b41Var = new b41(2);
        b41Var.l = M0;
        b41Var.o = M02;
        b41Var.m = "RestrictedEmoji";
        b41Var.n = "💤";
        arrayList.add(b41Var);
        b41 i7 = b41.i(1, hd.M0(2131752821, null));
        i7.L(cVar.r);
        arrayList.add(i7);
        arrayList.add(b41.C(null));
        if (cVar.r) {
            u1 d = v1.f(cVar.currentAccount).d("away");
            if (d != null) {
                b41 b41Var2 = new b41(17);
                b41Var2.G = d;
                arrayList.add(b41Var2);
            } else {
                b41 c10 = b41.c(2, R.drawable.msg2_chats_add, hd.M0(2131752837, null));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(b41.C(null));
            arrayList.add(b41.u(hd.M0(2131752830, null)));
            b41 x10 = b41.x(3, hd.M0(2131752829, null));
            x10.L(cVar.x == 0);
            arrayList.add(x10);
            if (cVar.d) {
                b41 x11 = b41.x(4, hd.M0(2131752822, null));
                x11.L(cVar.x == 1);
                arrayList.add(x11);
            }
            b41 x12 = b41.x(5, hd.M0(2131752828, null));
            x12.L(cVar.x == 2);
            arrayList.add(x12);
            if (cVar.x == 2) {
                arrayList.add(b41.C(null));
                arrayList.add(b41.u(hd.M0(2131752830, null)));
                arrayList.add(b41.f(hd.M0(2131752824, null), hd.Q(cVar.F), 8));
                arrayList.add(b41.f(hd.M0(2131752827, null), hd.Q(cVar.G), 9));
            }
            arrayList.add(b41.C(null));
            b41 i10 = b41.i(10, hd.M0(2131752832, null));
            i10.L(cVar.w);
            arrayList.add(i10);
            arrayList.add(b41.C(hd.M0(2131752831, null)));
            arrayList.add(b41.u(hd.M0(2131752688, null)));
            b41 x13 = b41.x(6, hd.M0(2131752781, null));
            x13.L(cVar.s);
            arrayList.add(x13);
            b41 x14 = b41.x(7, hd.M0(2131752776, null));
            x14.L(!cVar.s);
            arrayList.add(x14);
            arrayList.add(b41.C(null));
            cVar.c.a(arrayList, p41Var, true);
            arrayList.add(b41.C(null));
        }
    }

    public final void a0(boolean z10) {
        if (this.a == null) {
            return;
        }
        this.a.a(b0(), z10);
    }

    public final boolean b0() {
        a0 a0Var;
        if (this.e) {
            boolean z10 = this.r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (z10 == (tL_businessAwayMessage != null)) {
                if (z10 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.s && ((a0Var = this.c) == null || !a0Var.g())) {
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
            p2.E.a();
            View B1 = this.b.B1(2);
            int i7 = -this.f;
            this.f = i7;
            org.telegram.messenger.g0.F3(i7, B1, null);
            u41 u41Var = this.b;
            u41Var.y0(u41Var.A1(2));
            return;
        }
        if (!z10 || this.c.k(this.b)) {
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
                    tL_businessAwayMessageScheduleCustom.start_date = this.F;
                    tL_businessAwayMessageScheduleCustom.end_date = this.G;
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
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new ai.e1(this, 14));
            getMessagesStorage().j2(b22, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(hd.M0(2131752838, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 4));
        this.a = this.simpleActionBar.q(hd.M0(2131745946, null));
        int i7 = 0;
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a0 a0Var = new a0(this, new hi.e1(this, 24));
        this.c = a0Var;
        a0Var.h = this.s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        a0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        u41 u41Var = new u41(this, new q4(this, 7), new a(this, i7), null);
        this.b = u41Var;
        u41Var.r1();
        this.b.setSectionsDrawBackground(true);
        u41 u41Var2 = this.b;
        u41Var2.g3.r = false;
        frameLayout.addView(u41Var2, ja.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        u41 u41Var;
        p41 p41Var;
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
                this.F = i7;
                int i10 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i10;
                this.G = i10;
                u41Var = this.b;
                if (u41Var != null && (p41Var = u41Var.g3) != null) {
                    p41Var.O(true);
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
        u41Var = this.b;
        if (u41Var != null) {
            p41Var.O(true);
        }
        a0(true);
        this.e = true;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        if (i7 != ns.F1) {
            if (i7 == ns.E0) {
                d0();
            }
        } else {
            u41 u41Var = this.b;
            if (u41Var != null && (p41Var = u41Var.g3) != null) {
                p41Var.O(true);
            }
            a0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final uj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
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
            String M0 = hd.M0(2131743835, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = hd.M0(2131752820, null);
            alertDialog$Builder.k(hd.M0(2131754216, null), new a(this, 1));
            alertDialog$Builder.h(hd.M0(2131747580, null), new a(this, 2));
            showDialog(t1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ns.F1);
        getNotificationCenter().c(this, ns.E0);
        v1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ns.F1);
        getNotificationCenter().n(this, ns.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
