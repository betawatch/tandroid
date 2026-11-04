package lg;

import ai.g5;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import gi.j8;
import gi.q4;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t0 extends d2 implements cs {
    public b5 a;
    public l41 b;
    public b0 c;
    public final int[] d;
    public final String[] e;
    public boolean f;
    public int h;
    public TL_account.TL_businessGreetingMessage n;
    public boolean r;
    public boolean s;
    public int w;

    public t0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.w = 7;
        this.e = new String[iArr.length];
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i3 >= iArr2.length) {
                return;
            }
            this.e[i3] = bd.G(iArr2[i3], "DaysSchedule", new Object[0]);
            i3++;
        }
    }

    public static void Z(t0 t0Var, ArrayList arrayList, f41 f41Var) {
        String M0 = bd.M0(2131752775, null);
        String M02 = bd.M0(2131752773, null);
        r31 r31Var = new r31(2);
        r31Var.l = M0;
        r31Var.o = M02;
        r31Var.m = "RestrictedEmoji";
        r31Var.n = "👋";
        arrayList.add(r31Var);
        r31 i3 = r31.i(1, bd.M0(2131752769, null));
        i3.L(t0Var.r);
        arrayList.add(i3);
        arrayList.add(r31.C(null));
        if (t0Var.r) {
            t1 d = u1.f(t0Var.currentAccount).d("hello");
            if (d != null) {
                r31 r31Var2 = new r31(17);
                r31Var2.G = d;
                arrayList.add(r31Var2);
            } else {
                r31 c2 = r31.c(2, R.drawable.msg2_chats_add, bd.M0(2131752774, null));
                c2.q = true;
                arrayList.add(c2);
            }
            arrayList.add(r31.C(null));
            arrayList.add(r31.u(bd.M0(2131752688, null)));
            r31 x10 = r31.x(3, bd.M0(2131752781, null));
            x10.L(t0Var.s);
            arrayList.add(x10);
            r31 x11 = r31.x(4, bd.M0(2131752776, null));
            x11.L(!t0Var.s);
            arrayList.add(x11);
            arrayList.add(r31.C(null));
            t0Var.c.a(arrayList, f41Var, true);
            arrayList.add(r31.C(bd.M0(2131752770, null)));
            arrayList.add(r31.u(bd.M0(2131752772, null)));
            int i10 = 0;
            while (true) {
                int[] iArr = t0Var.d;
                if (i10 >= iArr.length) {
                    i10 = -1;
                    break;
                } else if (iArr[i10] == t0Var.w) {
                    break;
                } else {
                    i10++;
                }
            }
            String[] strArr = t0Var.e;
            j8 j8Var = new j8(t0Var, 9);
            r31 r31Var3 = new r31(14);
            r31Var3.p = strArr;
            r31Var3.z = i10;
            r31Var3.C = j8Var;
            r31Var3.B = -1L;
            arrayList.add(r31Var3);
            arrayList.add(r31.C(bd.M0(2131752771, null)));
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
        t1 d = u1.f(this.currentAccount).d("hello");
        boolean z10 = this.r;
        if (z10 && d == null) {
            p2.E.a();
            View B1 = this.b.B1(2);
            int i3 = -this.h;
            this.h = i3;
            org.telegram.messenger.g0.G3(i3, B1, null);
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
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ci.d0(this, 17));
            getMessagesStorage().j2(b22, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(bd.M0(2131752775, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 15));
        this.a = this.simpleActionBar.n(bd.M0(2131745956, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new n(this, 3));
        this.c = b0Var;
        b0Var.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
        b0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        l41 l41Var = new l41(this, new q4(this, 19), new s0(this, 2), null);
        this.b = l41Var;
        l41Var.r1();
        this.b.setSectionsDrawBackground(true);
        l41 l41Var2 = this.b;
        l41Var2.g3.r = false;
        frameLayout.addView(l41Var2, mf.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        f41 f41Var;
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
        b0 b0Var = this.c;
        if (b0Var != null) {
            b0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        }
        l41 l41Var = this.b;
        if (l41Var != null && (f41Var = l41Var.g3) != null) {
            f41Var.O(true);
        }
        a0(true);
        this.f = true;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f41 f41Var;
        if (i3 != hs.F1) {
            if (i3 == hs.E0) {
                d0();
            }
        } else {
            l41 l41Var = this.b;
            if (l41Var != null && (f41Var = l41Var.g3) != null) {
                f41Var.O(true);
            }
            a0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (!b0()) {
            return super.onBackPressed(z10);
        }
        int i3 = 0;
        if (z10) {
            if (!this.r) {
                c0();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = bd.M0(2131743845, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = bd.M0(2131752768, null);
            alertDialog$Builder.k(bd.M0(2131754216, null), new s0(this, i3));
            alertDialog$Builder.h(bd.M0(2131747588, null), new s0(this, 1));
            showDialog(s1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.F1);
        getNotificationCenter().c(this, hs.E0);
        u1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.F1);
        getNotificationCenter().n(this, hs.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
