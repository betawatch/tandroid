package ag;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v1 extends org.telegram.ui.ActionBar.k2 implements us {
    public l5 a;
    public u51 b;
    public x0 c;
    public final int[] d;
    public final String[] e;
    public boolean f;
    public int h;
    public TL_account.TL_businessGreetingMessage n;
    public boolean r;
    public boolean s;
    public int w;

    public v1() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.w = 7;
        this.e = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i10 >= iArr2.length) {
                return;
            }
            this.e[i10] = cd.G(iArr2[i10], "DaysSchedule", new Object[0]);
            i10++;
        }
    }

    public static void Y(v1 v1Var, ArrayList arrayList, p51 p51Var) {
        String L0 = cd.L0(2131752775, null);
        String L02 = cd.L0(2131752773, null);
        a51 a51Var = new a51(2);
        a51Var.l = L0;
        a51Var.o = L02;
        a51Var.m = "RestrictedEmoji";
        a51Var.n = "👋";
        arrayList.add(a51Var);
        a51 i10 = a51.i(1, cd.L0(2131752769, null));
        i10.L(v1Var.r);
        arrayList.add(i10);
        arrayList.add(a51.C(null));
        if (v1Var.r) {
            h3 d = i3.f(v1Var.currentAccount).d("hello");
            if (d != null) {
                a51 a51Var2 = new a51(17);
                a51Var2.G = d;
                arrayList.add(a51Var2);
            } else {
                a51 c10 = a51.c(2, R.drawable.msg2_chats_add, cd.L0(2131752774, null));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(a51.C(null));
            arrayList.add(a51.u(cd.L0(2131752688, null)));
            int i11 = 3;
            a51 x10 = a51.x(3, cd.L0(2131752781, null));
            x10.L(v1Var.s);
            arrayList.add(x10);
            a51 x11 = a51.x(4, cd.L0(2131752776, null));
            x11.L(!v1Var.s);
            arrayList.add(x11);
            arrayList.add(a51.C(null));
            v1Var.c.a(arrayList, p51Var, true);
            arrayList.add(a51.C(cd.L0(2131752770, null)));
            arrayList.add(a51.u(cd.L0(2131752772, null)));
            int i12 = 0;
            while (true) {
                int[] iArr = v1Var.d;
                if (i12 >= iArr.length) {
                    i12 = -1;
                    break;
                } else if (iArr[i12] == v1Var.w) {
                    break;
                } else {
                    i12++;
                }
            }
            String[] strArr = v1Var.e;
            l lVar = new l(v1Var, i11);
            a51 a51Var3 = new a51(14);
            a51Var3.p = strArr;
            a51Var3.z = i12;
            a51Var3.C = lVar;
            a51Var3.B = -1L;
            arrayList.add(a51Var3);
            arrayList.add(a51.C(cd.L0(2131752771, null)));
        }
    }

    public final void Z(boolean z10) {
        if (this.a == null) {
            return;
        }
        this.a.a(a0(), z10);
    }

    public final boolean a0() {
        x0 x0Var;
        if (this.f) {
            boolean z10 = this.r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
            if (z10 != (tL_businessGreetingMessage != null) || (z10 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.w || tL_businessGreetingMessage.recipients.exclude_selected != this.s || ((x0Var = this.c) != null && x0Var.g())))) {
                return true;
            }
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
        h3 d = i3.f(this.currentAccount).d("hello");
        boolean z10 = this.r;
        if (z10 && d == null) {
            org.telegram.messenger.t2.D.a();
            View B1 = this.b.B1(2);
            int i10 = -this.h;
            this.h = i10;
            org.telegram.messenger.i0.F3(i10, B1, null);
            return;
        }
        if (!z10 || this.c.k(this.b)) {
            this.a.b(true);
            TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
            TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
            if (this.r) {
                TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                tL_inputBusinessGreetingMessage.shortcut_id = d.a;
                tL_inputBusinessGreetingMessage.recipients = this.c.e();
                updatebusinessgreetingmessage.message.no_activity_days = this.w;
                updatebusinessgreetingmessage.flags |= 1;
                if (a2 != null) {
                    a2.flags2 |= 4;
                    TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                    a2.business_greeting_message = tL_businessGreetingMessage;
                    tL_businessGreetingMessage.shortcut_id = d.a;
                    tL_businessGreetingMessage.recipients = this.c.f();
                    a2.business_greeting_message.no_activity_days = this.w;
                }
            } else if (a2 != null) {
                a2.flags2 &= -5;
                a2.business_greeting_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new c(this, 3));
            getMessagesStorage().j2(a2, false);
        }
    }

    public final void c0() {
        p51 p51Var;
        if (this.f) {
            return;
        }
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
        if (a2 == null) {
            getMessagesController().e3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = a2.business_greeting_message;
        this.n = tL_businessGreetingMessage;
        this.r = tL_businessGreetingMessage != null;
        this.w = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.no_activity_days : 7;
        this.s = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.recipients.exclude_selected : true;
        x0 x0Var = this.c;
        if (x0Var != null) {
            x0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        }
        u51 u51Var = this.b;
        if (u51Var != null && (p51Var = u51Var.f3) != null) {
            p51Var.O(true);
        }
        Z(true);
        this.f = true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(cd.L0(2131752775, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 3));
        this.a = this.simpleActionBar.n(cd.L0(2131745963, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        x0 x0Var = new x0(this, new a3.d(this, 7));
        this.c = x0Var;
        x0Var.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
        x0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        u51 u51Var = new u51(this, new a(this, 4), new u1(this, 2), null);
        this.b = u51Var;
        u51Var.r1();
        this.b.setSectionsDrawBackground(true);
        u51 u51Var2 = this.b;
        u51Var2.f3.r = false;
        frameLayout.addView(u51Var2, b6.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p51 p51Var;
        if (i10 != zs.F1) {
            if (i10 == zs.E0) {
                c0();
            }
        } else {
            u51 u51Var = this.b;
            if (u51Var != null && (p51Var = u51Var.f3) != null) {
                p51Var.O(true);
            }
            Z(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (!a0()) {
            return super.onBackPressed(z10);
        }
        int i10 = 0;
        if (z10) {
            if (!this.r) {
                b0();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = cd.L0(2131743860, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = cd.L0(2131752768, null);
            alertDialog$Builder.k(cd.L0(2131754216, null), new u1(this, i10));
            alertDialog$Builder.h(cd.L0(2131747596, null), new u1(this, 1));
            showDialog(x1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, zs.F1);
        getNotificationCenter().c(this, zs.E0);
        i3.f(this.currentAccount).h();
        c0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, zs.F1);
        getNotificationCenter().n(this, zs.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
