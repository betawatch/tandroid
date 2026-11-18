package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import hi.e7;
import hi.t6;
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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v0 extends h2 implements fs {
    public d5 a;
    public e51 b;
    public a0 c;
    public final int[] d;
    public final String[] e;
    public boolean f;
    public int h;
    public TL_account.TL_businessGreetingMessage n;
    public boolean r;
    public boolean s;
    public int w;

    public v0() {
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

    public static void Z(v0 v0Var, ArrayList arrayList, z41 z41Var) {
        String M0 = gd.M0(2131752764, null);
        String M02 = gd.M0(2131752762, null);
        l41 l41Var = new l41(2);
        l41Var.m = M0;
        l41Var.p = M02;
        l41Var.n = "RestrictedEmoji";
        l41Var.o = "👋";
        arrayList.add(l41Var);
        l41 i7 = l41.i(1, gd.M0(2131752758, null));
        i7.L(v0Var.r);
        arrayList.add(i7);
        arrayList.add(l41.C(null));
        if (v0Var.r) {
            v1 d = w1.f(v0Var.currentAccount).d("hello");
            if (d != null) {
                l41 l41Var2 = new l41(17);
                l41Var2.H = d;
                arrayList.add(l41Var2);
            } else {
                l41 c10 = l41.c(2, R.drawable.msg2_chats_add, gd.M0(2131752763, null));
                c10.r = true;
                arrayList.add(c10);
            }
            arrayList.add(l41.C(null));
            arrayList.add(l41.u(gd.M0(2131752677, null)));
            l41 x10 = l41.x(3, gd.M0(2131752770, null));
            x10.L(v0Var.s);
            arrayList.add(x10);
            l41 x11 = l41.x(4, gd.M0(2131752765, null));
            x11.L(!v0Var.s);
            arrayList.add(x11);
            arrayList.add(l41.C(null));
            v0Var.c.a(arrayList, z41Var, true);
            arrayList.add(l41.C(gd.M0(2131752759, null)));
            arrayList.add(l41.u(gd.M0(2131752761, null)));
            int i10 = 0;
            while (true) {
                int[] iArr = v0Var.d;
                if (i10 >= iArr.length) {
                    i10 = -1;
                    break;
                } else if (iArr[i10] == v0Var.w) {
                    break;
                } else {
                    i10++;
                }
            }
            String[] strArr = v0Var.e;
            t6 t6Var = new t6(v0Var, 10);
            l41 l41Var3 = new l41(14);
            l41Var3.q = strArr;
            l41Var3.A = i10;
            l41Var3.D = t6Var;
            l41Var3.C = -1L;
            arrayList.add(l41Var3);
            arrayList.add(l41.C(gd.M0(2131752760, null)));
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
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ai.e1(this, 19));
            getMessagesStorage().j2(d2, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(gd.M0(2131752764, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 9));
        this.a = this.simpleActionBar.s(gd.M0(2131745751, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        int i7 = 2;
        a0 a0Var = new a0(this, new j0(this, 2));
        this.c = a0Var;
        a0Var.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
        a0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        e51 e51Var = new e51(this, new e7(this, 11), new u0(this, i7), null);
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
        z41 z41Var;
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
        a0 a0Var = this.c;
        if (a0Var != null) {
            a0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        }
        e51 e51Var = this.b;
        if (e51Var != null && (z41Var = e51Var.g3) != null) {
            z41Var.O(true);
        }
        a0(true);
        this.f = true;
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
        int i7 = 0;
        if (z10) {
            if (!this.r) {
                c0();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = gd.M0(2131743598, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = gd.M0(2131752757, null);
            alertDialog$Builder.k(gd.M0(2131754214, null), new u0(this, i7));
            alertDialog$Builder.h(gd.M0(2131747387, null), new u0(this, 1));
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
