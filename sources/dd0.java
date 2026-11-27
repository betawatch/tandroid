// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dd0 extends e implements fn7 {
    public int E;
    public int F;
    public int G;
    public nla a;
    public q9c b;
    public u41 c;
    public boolean d;
    public boolean e;
    public int f;
    public TL_account.TL_businessAwayMessage h;
    public byte n;
    public boolean r;
    public boolean s;
    public boolean w;
    public byte x;
    public int y;

    public final void Y(boolean z) {
        if (this.a == null) {
            return;
        }
        this.a.a(a0(), z);
    }

    public final void Z(ArrayList arrayList, l9c l9cVar) {
        String M0 = ob6.M0(2131752819, null);
        String M02 = ob6.M0(2131752816, null);
        b8c b8cVar = new b8c(2);
        b8cVar.m = M0;
        b8cVar.p = M02;
        b8cVar.n = "RestrictedEmoji";
        b8cVar.o = "💤";
        arrayList.add(b8cVar);
        b8c i = b8c.i(1, ob6.M0(2131752802, null));
        i.L(this.r);
        arrayList.add(i);
        arrayList.add(b8c.C(null));
        if (this.r) {
            a19 d = b19.f(this.currentAccount).d("away");
            if (d != null) {
                b8c b8cVar2 = new b8c(17);
                b8cVar2.H = d;
                arrayList.add(b8cVar2);
            } else {
                b8c c = b8c.c(2, R.drawable.msg2_chats_add, ob6.M0(2131752818, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(b8c.C(null));
            arrayList.add(b8c.u(ob6.M0(2131752811, null)));
            b8c x = b8c.x(3, ob6.M0(2131752810, null));
            x.L(this.x == 0);
            arrayList.add(x);
            if (this.d) {
                b8c x2 = b8c.x(4, ob6.M0(2131752803, null));
                x2.L(this.x == 1);
                arrayList.add(x2);
            }
            b8c x3 = b8c.x(5, ob6.M0(2131752809, null));
            x3.L(this.x == 2);
            arrayList.add(x3);
            if (this.x == 2) {
                arrayList.add(b8c.C(null));
                arrayList.add(b8c.u(ob6.M0(2131752811, null)));
                arrayList.add(b8c.f(ob6.M0(2131752805, null), ob6.Q(this.F), 8));
                arrayList.add(b8c.f(ob6.M0(2131752808, null), ob6.Q(this.G), 9));
            }
            arrayList.add(b8c.C(null));
            b8c i2 = b8c.i(10, ob6.M0(2131752813, null));
            i2.L(this.w);
            arrayList.add(i2);
            arrayList.add(b8c.C(ob6.M0(2131752812, null)));
            arrayList.add(b8c.u(ob6.M0(2131752669, null)));
            b8c x4 = b8c.x(6, ob6.M0(2131752762, null));
            x4.L(this.s);
            arrayList.add(x4);
            b8c x5 = b8c.x(7, ob6.M0(2131752757, null));
            x5.L(!this.s);
            arrayList.add(x5);
            arrayList.add(b8c.C(null));
            this.c.a(arrayList, l9cVar, true);
            arrayList.add(b8c.C(null));
        }
    }

    public final boolean a0() {
        u41 u41Var;
        if (this.e) {
            boolean z = this.r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (z == (tL_businessAwayMessage != null)) {
                if (z && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.s && ((u41Var = this.c) == null || !u41Var.g())) {
                        byte b = this.n;
                        byte b2 = this.x;
                        if (b != b2 || this.h.offline_only != this.w || (b2 == 2 && (this.y != this.F || this.E != this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void b0() {
        if (this.a.y.f) {
            return;
        }
        if (!a0()) {
            finishFragment();
            return;
        }
        a19 d = b19.f(this.currentAccount).d("away");
        byte b = 2;
        if (this.r) {
            if (d == null) {
                yw0.E.a();
                View C1 = this.b.C1(2);
                int i = -this.f;
                this.f = i;
                hl.A3(i, C1, null);
                q9c q9cVar = this.b;
                q9cVar.A0(q9cVar.B1(2));
                return;
            }
            if (!this.c.k(this.b)) {
                return;
            }
        }
        this.a.b(true);
        TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
        TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
        if (this.r) {
            TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
            updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
            tL_inputBusinessAwayMessage.offline_only = this.w;
            tL_inputBusinessAwayMessage.shortcut_id = d.a;
            tL_inputBusinessAwayMessage.recipients = this.c.e();
            byte b2 = this.x;
            if (b2 == 0) {
                updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
            } else if (b2 == 1) {
                updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
            } else if (b2 == 2) {
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                tL_businessAwayMessageScheduleCustom.start_date = this.F;
                tL_businessAwayMessageScheduleCustom.end_date = this.G;
                updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
            }
            updatebusinessawaymessage.flags |= 1;
            if (Y1 != null) {
                Y1.flags2 |= 8;
                TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                Y1.business_away_message = tL_businessAwayMessage;
                tL_businessAwayMessage.offline_only = this.w;
                tL_businessAwayMessage.shortcut_id = d.a;
                tL_businessAwayMessage.recipients = this.c.f();
                Y1.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
            }
        } else if (Y1 != null) {
            Y1.flags2 &= -9;
            Y1.business_away_message = null;
        }
        getConnectionsManager().sendRequest(updatebusinessawaymessage, new ye(this, b));
        getMessagesStorage().l2(Y1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        q9c q9cVar;
        l9c l9cVar;
        if (this.e) {
            return;
        }
        TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
        if (Y1 == null) {
            getMessagesController().o3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = Y1.business_away_message;
        this.h = tL_businessAwayMessage;
        this.d = Y1.business_work_hours != null;
        this.r = tL_businessAwayMessage != null;
        this.s = tL_businessAwayMessage != null ? tL_businessAwayMessage.recipients.exclude_selected : true;
        this.w = tL_businessAwayMessage != null ? tL_businessAwayMessage.offline_only : true;
        u41 u41Var = this.c;
        if (u41Var != null) {
            u41Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.h;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.n = (byte) 2;
                this.x = (byte) 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i = tL_businessAwayMessageScheduleCustom.start_date;
                this.y = i;
                this.F = i;
                int i2 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i2;
                this.G = i2;
                q9cVar = this.b;
                if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
                    l9cVar.O(true);
                }
                Y(true);
                this.e = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.h;
        if (tL_businessAwayMessage3 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule2 = tL_businessAwayMessage3.schedule;
            if (businessAwayMessageSchedule2 instanceof TL_account.TL_businessAwayMessageScheduleAlways) {
                this.n = (byte) 0;
                this.x = (byte) 0;
            } else if (businessAwayMessageSchedule2 instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours) {
                this.n = (byte) 1;
                this.x = (byte) 1;
            }
            q9cVar = this.b;
            if (q9cVar != null) {
                l9cVar.O(true);
            }
            Y(true);
            this.e = true;
        }
        this.n = (byte) 0;
        this.x = (byte) 0;
        q9cVar = this.b;
        if (q9cVar != null) {
        }
        Y(true);
        this.e = true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(ob6.M0(2131752819, null));
        byte b = 6;
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, b));
        this.a = this.simpleActionBar.u(ob6.M0(2131745674, null));
        byte b2 = 0;
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        u41 u41Var = new u41(this, new pz(this, b));
        this.c = u41Var;
        u41Var.h = this.s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        u41Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        q9c q9cVar = new q9c(this, new c(this, (byte) 14), new bd0(this, b2), null);
        this.b = q9cVar;
        q9cVar.s1();
        this.b.setSectionsDrawBackground(true);
        q9c q9cVar2 = this.b;
        q9cVar2.g3.r = false;
        frameLayout.addView(q9cVar2, tre.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l9c l9cVar;
        if (i != jn7.F1) {
            if (i == jn7.E0) {
                c0();
            }
        } else {
            q9c q9cVar = this.b;
            if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
                l9cVar.O(true);
            }
            Y(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        if (!a0()) {
            return super.onBackPressed(z);
        }
        if (z) {
            if (!this.r) {
                b0();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = ob6.M0(2131743490, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131752801, null);
            alertDialog$Builder.j(ob6.M0(2131754209, null), new bd0(this, (byte) 1));
            alertDialog$Builder.g(ob6.M0(2131747307, null), new bd0(this, (byte) 2));
            showDialog(idVar);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.F1);
        getNotificationCenter().b(this, jn7.E0);
        b19.f(this.currentAccount).h();
        c0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.F1);
        getNotificationCenter().n(this, jn7.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
