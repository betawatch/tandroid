package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import hi.c7;
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
public final class u0 extends g2 implements fs {
    public c5 a;
    public g51 b;
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
            this.e[i7] = gd.G(iArr2[i7], "DaysSchedule", new Object[0]);
            i7++;
        }
    }

    public static void Z(u0 u0Var, ArrayList arrayList, b51 b51Var) {
        String N0 = gd.N0(2131752763, null);
        String N02 = gd.N0(2131752761, null);
        n41 n41Var = new n41(2);
        n41Var.m = N0;
        n41Var.p = N02;
        n41Var.n = "RestrictedEmoji";
        n41Var.o = "👋";
        arrayList.add(n41Var);
        n41 i7 = n41.i(1, gd.N0(2131752757, null));
        i7.L(u0Var.r);
        arrayList.add(i7);
        arrayList.add(n41.C(null));
        if (u0Var.r) {
            v1 d = w1.f(u0Var.currentAccount).d("hello");
            if (d != null) {
                n41 n41Var2 = new n41(17);
                n41Var2.H = d;
                arrayList.add(n41Var2);
            } else {
                n41 c10 = n41.c(2, R.drawable.msg2_chats_add, gd.N0(2131752762, null));
                c10.r = true;
                arrayList.add(c10);
            }
            arrayList.add(n41.C(null));
            arrayList.add(n41.u(gd.N0(2131752676, null)));
            n41 x10 = n41.x(3, gd.N0(2131752769, null));
            x10.L(u0Var.s);
            arrayList.add(x10);
            n41 x11 = n41.x(4, gd.N0(2131752764, null));
            x11.L(!u0Var.s);
            arrayList.add(x11);
            arrayList.add(n41.C(null));
            u0Var.c.a(arrayList, b51Var, true);
            arrayList.add(n41.C(gd.N0(2131752758, null)));
            arrayList.add(n41.u(gd.N0(2131752760, null)));
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
            c7 c7Var = new c7(u0Var, 10);
            n41 n41Var3 = new n41(14);
            n41Var3.q = strArr;
            n41Var3.A = i10;
            n41Var3.D = c7Var;
            n41Var3.C = -1L;
            arrayList.add(n41Var3);
            arrayList.add(n41.C(gd.N0(2131752759, null)));
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
        v1 d = w1.f(this.currentAccount).d("hello");
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
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ai.b1(this, 19));
            getMessagesStorage().j2(d2, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(gd.N0(2131752763, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 9));
        this.a = this.simpleActionBar.s(gd.N0(2131745750, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        int i7 = 2;
        b0 b0Var = new b0(this, new i0(this, 2));
        this.c = b0Var;
        b0Var.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
        b0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        g51 g51Var = new g51(this, new y7(this, 11), new t0(this, i7), null);
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
        b51 b51Var;
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
        g51 g51Var = this.b;
        if (g51Var != null && (b51Var = g51Var.g3) != null) {
            b51Var.O(true);
        }
        a0(true);
        this.f = true;
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
        int i7 = 0;
        if (z10) {
            if (!this.r) {
                c0();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String N0 = gd.N0(2131743588, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = gd.N0(2131752756, null);
            alertDialog$Builder.k(gd.N0(2131754213, null), new t0(this, i7));
            alertDialog$Builder.h(gd.N0(2131747386, null), new t0(this, 1));
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
