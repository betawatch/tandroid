package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import hi.d7;
import hi.s6;
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
public final class u0 extends g2 implements gs {
    public c5 a;
    public h51 b;
    public b0 c;
    public final int[] d;
    public final String[] e;
    public boolean f;
    public int h;
    public TL_account.TL_businessGreetingMessage n;
    public boolean r;
    public boolean s;
    public int w;

    public u0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.w = 7;
        this.e = new String[iArr.length];
        int i7 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i7 >= iArr2.length) {
                return;
            }
            this.e[i7] = hd.G(iArr2[i7], "DaysSchedule", new Object[0]);
            i7++;
        }
    }

    public static void Z(u0 u0Var, ArrayList arrayList, c51 c51Var) {
        String N0 = hd.N0(2131752763, null);
        String N02 = hd.N0(2131752761, null);
        o41 o41Var = new o41(2);
        o41Var.m = N0;
        o41Var.p = N02;
        o41Var.n = "RestrictedEmoji";
        o41Var.o = "👋";
        arrayList.add(o41Var);
        o41 i7 = o41.i(1, hd.N0(2131752757, null));
        i7.L(u0Var.r);
        arrayList.add(i7);
        arrayList.add(o41.C(null));
        if (u0Var.r) {
            u1 d = v1.f(u0Var.currentAccount).d("hello");
            if (d != null) {
                o41 o41Var2 = new o41(17);
                o41Var2.H = d;
                arrayList.add(o41Var2);
            } else {
                o41 c10 = o41.c(2, R.drawable.msg2_chats_add, hd.N0(2131752762, null));
                c10.r = true;
                arrayList.add(c10);
            }
            arrayList.add(o41.C(null));
            arrayList.add(o41.u(hd.N0(2131752676, null)));
            o41 x10 = o41.x(3, hd.N0(2131752769, null));
            x10.L(u0Var.s);
            arrayList.add(x10);
            o41 x11 = o41.x(4, hd.N0(2131752764, null));
            x11.L(!u0Var.s);
            arrayList.add(x11);
            arrayList.add(o41.C(null));
            u0Var.c.a(arrayList, c51Var, true);
            arrayList.add(o41.C(hd.N0(2131752758, null)));
            arrayList.add(o41.u(hd.N0(2131752760, null)));
            int i10 = 0;
            while (true) {
                int[] iArr = u0Var.d;
                if (i10 >= iArr.length) {
                    i10 = -1;
                    break;
                } else if (iArr[i10] == u0Var.w) {
                    break;
                } else {
                    i10++;
                }
            }
            String[] strArr = u0Var.e;
            s6 s6Var = new s6(u0Var, 10);
            o41 o41Var3 = new o41(14);
            o41Var3.q = strArr;
            o41Var3.A = i10;
            o41Var3.D = s6Var;
            o41Var3.C = -1L;
            arrayList.add(o41Var3);
            arrayList.add(o41.C(hd.N0(2131752759, null)));
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
        if (this.f) {
            boolean z10 = this.r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
            if (z10 != (tL_businessGreetingMessage != null) || (z10 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.w || tL_businessGreetingMessage.recipients.exclude_selected != this.s || ((b0Var = this.c) != null && b0Var.g())))) {
                return true;
            }
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
        u1 d = v1.f(this.currentAccount).d("hello");
        boolean z10 = this.r;
        if (z10 && d == null) {
            q2.E.a();
            View B1 = this.b.B1(2);
            int i7 = -this.h;
            this.h = i7;
            org.telegram.messenger.g0.E3(i7, B1, null);
            return;
        }
        if (!z10 || this.c.k(this.b)) {
            this.a.b(true);
            TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
            TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
            if (this.r) {
                TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                tL_inputBusinessGreetingMessage.shortcut_id = d.a;
                tL_inputBusinessGreetingMessage.recipients = this.c.e();
                updatebusinessgreetingmessage.message.no_activity_days = this.w;
                updatebusinessgreetingmessage.flags |= 1;
                if (d2 != null) {
                    d2.flags2 |= 4;
                    TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                    d2.business_greeting_message = tL_businessGreetingMessage;
                    tL_businessGreetingMessage.shortcut_id = d.a;
                    tL_businessGreetingMessage.recipients = this.c.f();
                    d2.business_greeting_message.no_activity_days = this.w;
                }
            } else if (d2 != null) {
                d2.flags2 &= -5;
                d2.business_greeting_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ai.g1(this, 19));
            getMessagesStorage().j2(d2, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(hd.N0(2131752763, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 9));
        this.a = this.simpleActionBar.s(hd.N0(2131745750, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        int i7 = 2;
        b0 b0Var = new b0(this, new i0(this, 2));
        this.c = b0Var;
        b0Var.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
        b0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        h51 h51Var = new h51(this, new d7(this, 11), new t0(this, i7), null);
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
        c51 c51Var;
        if (this.f) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = d2.business_greeting_message;
        this.n = tL_businessGreetingMessage;
        this.r = tL_businessGreetingMessage != null;
        this.w = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.no_activity_days : 7;
        this.s = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.recipients.exclude_selected : true;
        b0 b0Var = this.c;
        if (b0Var != null) {
            b0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        }
        h51 h51Var = this.b;
        if (h51Var != null && (c51Var = h51Var.g3) != null) {
            c51Var.O(true);
        }
        a0(true);
        this.f = true;
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
        int i7 = 0;
        if (z10) {
            if (!this.r) {
                c0();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String N0 = hd.N0(2131743590, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = hd.N0(2131752756, null);
            alertDialog$Builder.k(hd.N0(2131754213, null), new t0(this, i7));
            alertDialog$Builder.h(hd.N0(2131747386, null), new t0(this, 1));
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
