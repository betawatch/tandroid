// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bd0 extends d implements gk7 {
    public int E;
    public int F;
    public int G;
    public sha a;
    public q5c b;
    public m41 c;
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

    public final void Z(ArrayList arrayList, l5c l5cVar) {
        String M0 = k96.M0(2131752826, null);
        String M02 = k96.M0(2131752823, null);
        c4c c4cVar = new c4c(2);
        c4cVar.m = M0;
        c4cVar.p = M02;
        c4cVar.n = "RestrictedEmoji";
        c4cVar.o = "💤";
        arrayList.add(c4cVar);
        c4c i = c4c.i(1, k96.M0(2131752809, null));
        i.L(this.r);
        arrayList.add(i);
        arrayList.add(c4c.C(null));
        if (this.r) {
            nx8 d = ox8.f(this.currentAccount).d("away");
            if (d != null) {
                c4c c4cVar2 = new c4c(17);
                c4cVar2.H = d;
                arrayList.add(c4cVar2);
            } else {
                c4c c = c4c.c(2, R.drawable.msg2_chats_add, k96.M0(2131752825, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(c4c.C(null));
            arrayList.add(c4c.u(k96.M0(2131752818, null)));
            c4c x = c4c.x(3, k96.M0(2131752817, null));
            x.L(this.x == 0);
            arrayList.add(x);
            if (this.d) {
                c4c x2 = c4c.x(4, k96.M0(2131752810, null));
                x2.L(this.x == 1);
                arrayList.add(x2);
            }
            c4c x3 = c4c.x(5, k96.M0(2131752816, null));
            x3.L(this.x == 2);
            arrayList.add(x3);
            if (this.x == 2) {
                arrayList.add(c4c.C(null));
                arrayList.add(c4c.u(k96.M0(2131752818, null)));
                arrayList.add(c4c.f(k96.M0(2131752812, null), k96.Q(this.F), 8));
                arrayList.add(c4c.f(k96.M0(2131752815, null), k96.Q(this.G), 9));
            }
            arrayList.add(c4c.C(null));
            c4c i2 = c4c.i(10, k96.M0(2131752820, null));
            i2.L(this.w);
            arrayList.add(i2);
            arrayList.add(c4c.C(k96.M0(2131752819, null)));
            arrayList.add(c4c.u(k96.M0(2131752676, null)));
            c4c x4 = c4c.x(6, k96.M0(2131752769, null));
            x4.L(this.s);
            arrayList.add(x4);
            c4c x5 = c4c.x(7, k96.M0(2131752764, null));
            x5.L(!this.s);
            arrayList.add(x5);
            arrayList.add(c4c.C(null));
            this.c.a(arrayList, l5cVar, true);
            arrayList.add(c4c.C(null));
        }
    }

    public final boolean a0() {
        m41 m41Var;
        if (this.e) {
            boolean z = this.r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (z == (tL_businessAwayMessage != null)) {
                if (z && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.s && ((m41Var = this.c) == null || !m41Var.g())) {
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
        nx8 d = ox8.f(this.currentAccount).d("away");
        byte b = 2;
        if (this.r) {
            if (d == null) {
                pw0.E.a();
                View B1 = this.b.B1(2);
                int i = -this.f;
                this.f = i;
                gl.B3(i, B1, null);
                q5c q5cVar = this.b;
                q5cVar.z0(q5cVar.A1(2));
                return;
            }
            if (!this.c.k(this.b)) {
                return;
            }
        }
        this.a.b(true);
        TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
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
            if (W1 != null) {
                W1.flags2 |= 8;
                TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                W1.business_away_message = tL_businessAwayMessage;
                tL_businessAwayMessage.offline_only = this.w;
                tL_businessAwayMessage.shortcut_id = d.a;
                tL_businessAwayMessage.recipients = this.c.f();
                W1.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
            }
        } else if (W1 != null) {
            W1.flags2 &= -9;
            W1.business_away_message = null;
        }
        getConnectionsManager().sendRequest(updatebusinessawaymessage, new uf(this, b));
        getMessagesStorage().g2(W1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        q5c q5cVar;
        l5c l5cVar;
        if (this.e) {
            return;
        }
        TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
        if (W1 == null) {
            getMessagesController().h3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = W1.business_away_message;
        this.h = tL_businessAwayMessage;
        this.d = W1.business_work_hours != null;
        this.r = tL_businessAwayMessage != null;
        this.s = tL_businessAwayMessage != null ? tL_businessAwayMessage.recipients.exclude_selected : true;
        this.w = tL_businessAwayMessage != null ? tL_businessAwayMessage.offline_only : true;
        m41 m41Var = this.c;
        if (m41Var != null) {
            m41Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
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
                q5cVar = this.b;
                if (q5cVar != null && (l5cVar = q5cVar.g3) != null) {
                    l5cVar.O(true);
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
            q5cVar = this.b;
            if (q5cVar != null) {
                l5cVar.O(true);
            }
            Y(true);
            this.e = true;
        }
        this.n = (byte) 0;
        this.x = (byte) 0;
        q5cVar = this.b;
        if (q5cVar != null) {
        }
        Y(true);
        this.e = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(k96.M0(2131752826, null));
        byte b = 6;
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, b));
        this.a = this.simpleActionBar.s(k96.M0(2131745754, null));
        byte b2 = 0;
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        m41 m41Var = new m41(this, new oz(this, b));
        this.c = m41Var;
        m41Var.h = this.s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        m41Var.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        q5c q5cVar = new q5c(this, new f(this, (byte) 14), new zc0(this, b2), null);
        this.b = q5cVar;
        q5cVar.r1();
        this.b.setSectionsDrawBackground(true);
        q5c q5cVar2 = this.b;
        q5cVar2.g3.r = false;
        frameLayout.addView(q5cVar2, nme.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l5c l5cVar;
        if (i != kk7.E1) {
            if (i == kk7.D0) {
                c0();
            }
        } else {
            q5c q5cVar = this.b;
            if (q5cVar != null && (l5cVar = q5cVar.g3) != null) {
                l5cVar.O(true);
            }
            Y(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
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
            String M0 = k96.M0(2131743596, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131752808, null);
            alertDialog$Builder.j(k96.M0(2131754213, null), new zc0(this, (byte) 1));
            alertDialog$Builder.g(k96.M0(2131747387, null), new zc0(this, (byte) 2));
            showDialog(hdVar);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.E1);
        getNotificationCenter().b(this, kk7.D0);
        ox8.f(this.currentAccount).h();
        c0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.E1);
        getNotificationCenter().n(this, kk7.D0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
