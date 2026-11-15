package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.x4;
import c8.ja;
import hi.g7;
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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class s0 extends e2 implements is {
    public z4 a;
    public u41 b;
    public a0 c;
    public final int[] d;
    public final String[] e;
    public boolean f;
    public int h;
    public TL_account.TL_businessGreetingMessage n;
    public boolean r;
    public boolean s;
    public int w;

    public s0() {
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

    public static void Z(s0 s0Var, ArrayList arrayList, p41 p41Var) {
        String M0 = hd.M0(2131752775, null);
        String M02 = hd.M0(2131752773, null);
        b41 b41Var = new b41(2);
        b41Var.l = M0;
        b41Var.o = M02;
        b41Var.m = "RestrictedEmoji";
        b41Var.n = "👋";
        arrayList.add(b41Var);
        b41 i7 = b41.i(1, hd.M0(2131752769, null));
        i7.L(s0Var.r);
        arrayList.add(i7);
        arrayList.add(b41.C(null));
        if (s0Var.r) {
            u1 d = v1.f(s0Var.currentAccount).d("hello");
            if (d != null) {
                b41 b41Var2 = new b41(17);
                b41Var2.G = d;
                arrayList.add(b41Var2);
            } else {
                b41 c10 = b41.c(2, R.drawable.msg2_chats_add, hd.M0(2131752774, null));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(b41.C(null));
            arrayList.add(b41.u(hd.M0(2131752688, null)));
            b41 x10 = b41.x(3, hd.M0(2131752781, null));
            x10.L(s0Var.s);
            arrayList.add(x10);
            b41 x11 = b41.x(4, hd.M0(2131752776, null));
            x11.L(!s0Var.s);
            arrayList.add(x11);
            arrayList.add(b41.C(null));
            s0Var.c.a(arrayList, p41Var, true);
            arrayList.add(b41.C(hd.M0(2131752770, null)));
            arrayList.add(b41.u(hd.M0(2131752772, null)));
            int i10 = 0;
            while (true) {
                int[] iArr = s0Var.d;
                if (i10 >= iArr.length) {
                    i10 = -1;
                    break;
                } else if (iArr[i10] == s0Var.w) {
                    break;
                } else {
                    i10++;
                }
            }
            String[] strArr = s0Var.e;
            g7 g7Var = new g7(s0Var, 9);
            b41 b41Var3 = new b41(14);
            b41Var3.p = strArr;
            b41Var3.z = i10;
            b41Var3.C = g7Var;
            b41Var3.B = -1L;
            arrayList.add(b41Var3);
            arrayList.add(b41.C(hd.M0(2131752771, null)));
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
        if (this.f) {
            boolean z10 = this.r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
            if (z10 != (tL_businessGreetingMessage != null) || (z10 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.w || tL_businessGreetingMessage.recipients.exclude_selected != this.s || ((a0Var = this.c) != null && a0Var.g())))) {
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
            p2.E.a();
            View B1 = this.b.B1(2);
            int i7 = -this.h;
            this.h = i7;
            org.telegram.messenger.g0.F3(i7, B1, null);
            return;
        }
        if (!z10 || this.c.k(this.b)) {
            this.a.b(true);
            TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
            TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
            if (this.r) {
                TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                tL_inputBusinessGreetingMessage.shortcut_id = d.a;
                tL_inputBusinessGreetingMessage.recipients = this.c.e();
                updatebusinessgreetingmessage.message.no_activity_days = this.w;
                updatebusinessgreetingmessage.flags |= 1;
                if (b22 != null) {
                    b22.flags2 |= 4;
                    TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                    b22.business_greeting_message = tL_businessGreetingMessage;
                    tL_businessGreetingMessage.shortcut_id = d.a;
                    tL_businessGreetingMessage.recipients = this.c.f();
                    b22.business_greeting_message.no_activity_days = this.w;
                }
            } else if (b22 != null) {
                b22.flags2 &= -5;
                b22.business_greeting_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ai.d1(this, 17));
            getMessagesStorage().j2(b22, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(hd.M0(2131752775, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 7));
        this.a = this.simpleActionBar.q(hd.M0(2131745946, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a0 a0Var = new a0(this, new hi.e1(this, 28));
        this.c = a0Var;
        a0Var.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
        a0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        u41 u41Var = new u41(this, new q4(this, 11), new r0(this, 2), null);
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
        p41 p41Var;
        if (this.f) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = b22.business_greeting_message;
        this.n = tL_businessGreetingMessage;
        this.r = tL_businessGreetingMessage != null;
        this.w = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.no_activity_days : 7;
        this.s = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.recipients.exclude_selected : true;
        a0 a0Var = this.c;
        if (a0Var != null) {
            a0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        }
        u41 u41Var = this.b;
        if (u41Var != null && (p41Var = u41Var.g3) != null) {
            p41Var.O(true);
        }
        a0(true);
        this.f = true;
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
        int i7 = 0;
        if (z10) {
            if (!this.r) {
                c0();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = hd.M0(2131743835, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = hd.M0(2131752768, null);
            alertDialog$Builder.k(hd.M0(2131754216, null), new r0(this, i7));
            alertDialog$Builder.h(hd.M0(2131747580, null), new r0(this, 1));
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
