package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import hi.e7;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.q2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c extends h2 implements fs {
    public int E;
    public int F;
    public int G;
    public d5 a;
    public e51 b;
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

    public static void Z(c cVar, ArrayList arrayList, z41 z41Var) {
        String M0 = gd.M0(2131752827, null);
        String M02 = gd.M0(2131752824, null);
        l41 l41Var = new l41(2);
        l41Var.m = M0;
        l41Var.p = M02;
        l41Var.n = "RestrictedEmoji";
        l41Var.o = "💤";
        arrayList.add(l41Var);
        l41 i7 = l41.i(1, gd.M0(2131752810, null));
        i7.L(cVar.r);
        arrayList.add(i7);
        arrayList.add(l41.C(null));
        if (cVar.r) {
            v1 d = w1.f(cVar.currentAccount).d("away");
            if (d != null) {
                l41 l41Var2 = new l41(17);
                l41Var2.H = d;
                arrayList.add(l41Var2);
            } else {
                l41 c10 = l41.c(2, R.drawable.msg2_chats_add, gd.M0(2131752826, null));
                c10.r = true;
                arrayList.add(c10);
            }
            arrayList.add(l41.C(null));
            arrayList.add(l41.u(gd.M0(2131752819, null)));
            l41 x10 = l41.x(3, gd.M0(2131752818, null));
            x10.L(cVar.x == 0);
            arrayList.add(x10);
            if (cVar.d) {
                l41 x11 = l41.x(4, gd.M0(2131752811, null));
                x11.L(cVar.x == 1);
                arrayList.add(x11);
            }
            l41 x12 = l41.x(5, gd.M0(2131752817, null));
            x12.L(cVar.x == 2);
            arrayList.add(x12);
            if (cVar.x == 2) {
                arrayList.add(l41.C(null));
                arrayList.add(l41.u(gd.M0(2131752819, null)));
                arrayList.add(l41.f(gd.M0(2131752813, null), gd.Q(cVar.F), 8));
                arrayList.add(l41.f(gd.M0(2131752816, null), gd.Q(cVar.G), 9));
            }
            arrayList.add(l41.C(null));
            l41 i10 = l41.i(10, gd.M0(2131752821, null));
            i10.L(cVar.w);
            arrayList.add(i10);
            arrayList.add(l41.C(gd.M0(2131752820, null)));
            arrayList.add(l41.u(gd.M0(2131752677, null)));
            l41 x13 = l41.x(6, gd.M0(2131752770, null));
            x13.L(cVar.s);
            arrayList.add(x13);
            l41 x14 = l41.x(7, gd.M0(2131752765, null));
            x14.L(!cVar.s);
            arrayList.add(x14);
            arrayList.add(l41.C(null));
            cVar.c.a(arrayList, z41Var, true);
            arrayList.add(l41.C(null));
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
        v1 d = w1.f(this.currentAccount).d("away");
        boolean z10 = this.r;
        if (z10 && d == null) {
            q2.E.a();
            View B1 = this.b.B1(2);
            int i7 = -this.f;
            this.f = i7;
            org.telegram.messenger.g0.E3(i7, B1, null);
            e51 e51Var = this.b;
            e51Var.y0(e51Var.A1(2));
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
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new ai.e1(this, 16));
            getMessagesStorage().j2(d2, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(gd.M0(2131752827, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 6));
        this.a = this.simpleActionBar.s(gd.M0(2131745751, null));
        int i7 = 0;
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a0 a0Var = new a0(this, new hi.k(this, 28));
        this.c = a0Var;
        a0Var.h = this.s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        a0Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        e51 e51Var = new e51(this, new e7(this, 7), new a(this, i7), null);
        this.b = e51Var;
        e51Var.r1();
        this.b.setSectionsDrawBackground(true);
        e51 e51Var2 = this.b;
        e51Var2.g3.r = false;
        frameLayout.addView(e51Var2, ma.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        e51 e51Var;
        z41 z41Var;
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
                e51Var = this.b;
                if (e51Var != null && (z41Var = e51Var.g3) != null) {
                    z41Var.O(true);
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
        e51Var = this.b;
        if (e51Var != null) {
            z41Var.O(true);
        }
        a0(true);
        this.e = true;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z41 z41Var;
        if (i7 != ks.F1) {
            if (i7 == ks.E0) {
                d0();
            }
        } else {
            e51 e51Var = this.b;
            if (e51Var != null && (z41Var = e51Var.g3) != null) {
                z41Var.O(true);
            }
            a0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ck0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
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
            String M0 = gd.M0(2131743598, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = gd.M0(2131752809, null);
            alertDialog$Builder.k(gd.M0(2131754214, null), new a(this, 1));
            alertDialog$Builder.h(gd.M0(2131747387, null), new a(this, 2));
            showDialog(u1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.F1);
        getNotificationCenter().c(this, ks.E0);
        w1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.F1);
        getNotificationCenter().n(this, ks.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
