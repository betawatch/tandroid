package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import fi.v9;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p2;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s0 extends f2 implements ls {
    public c5 a;
    public r41 b;
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
            this.e[i7] = id.G(iArr2[i7], "DaysSchedule", new Object[0]);
            i7++;
        }
    }

    public static void Z(s0 s0Var, ArrayList arrayList, m41 m41Var) {
        String M0 = id.M0(2131752775, null);
        String M02 = id.M0(2131752773, null);
        x31 x31Var = new x31(2);
        x31Var.l = M0;
        x31Var.o = M02;
        x31Var.m = "RestrictedEmoji";
        x31Var.n = "👋";
        arrayList.add(x31Var);
        x31 i7 = x31.i(1, id.M0(2131752769, null));
        i7.L(s0Var.r);
        arrayList.add(i7);
        arrayList.add(x31.C(null));
        if (s0Var.r) {
            s1 d = t1.f(s0Var.currentAccount).d("hello");
            if (d != null) {
                x31 x31Var2 = new x31(17);
                x31Var2.G = d;
                arrayList.add(x31Var2);
            } else {
                x31 c10 = x31.c(2, R.drawable.msg2_chats_add, id.M0(2131752774, null));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(x31.C(null));
            arrayList.add(x31.u(id.M0(2131752688, null)));
            x31 x10 = x31.x(3, id.M0(2131752781, null));
            x10.L(s0Var.s);
            arrayList.add(x10);
            x31 x11 = x31.x(4, id.M0(2131752776, null));
            x11.L(!s0Var.s);
            arrayList.add(x11);
            arrayList.add(x31.C(null));
            s0Var.c.a(arrayList, m41Var, true);
            arrayList.add(x31.C(id.M0(2131752770, null)));
            arrayList.add(x31.u(id.M0(2131752772, null)));
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
            ii.c cVar = new ii.c(s0Var, 6);
            x31 x31Var3 = new x31(14);
            x31Var3.p = strArr;
            x31Var3.z = i10;
            x31Var3.C = cVar;
            x31Var3.B = -1L;
            arrayList.add(x31Var3);
            arrayList.add(x31.C(id.M0(2131752771, null)));
        }
    }

    public final void a0(boolean z9) {
        if (this.a == null) {
            return;
        }
        this.a.a(b0(), z9);
    }

    public final boolean b0() {
        a0 a0Var;
        if (this.f) {
            boolean z9 = this.r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
            if (z9 != (tL_businessGreetingMessage != null) || (z9 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.w || tL_businessGreetingMessage.recipients.exclude_selected != this.s || ((a0Var = this.c) != null && a0Var.g())))) {
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
        s1 d = t1.f(this.currentAccount).d("hello");
        boolean z9 = this.r;
        if (z9 && d == null) {
            p2.D.a();
            View B1 = this.b.B1(2);
            int i7 = -this.h;
            this.h = i7;
            org.telegram.messenger.g0.G3(i7, B1, null);
            return;
        }
        if (!z9 || this.c.k(this.b)) {
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
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new bi.j0(this, 17));
            getMessagesStorage().j2(b22, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(id.M0(2131752775, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 14));
        this.a = this.simpleActionBar.p(id.M0(2131745946, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a0 a0Var = new a0(this, new v9(this, 25));
        this.c = a0Var;
        a0Var.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
        a0Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        r41 r41Var = new r41(this, new hi.u1(this, 9), new r0(this, 2), null);
        this.b = r41Var;
        r41Var.r1();
        this.b.setSectionsDrawBackground(true);
        r41 r41Var2 = this.b;
        r41Var2.f3.r = false;
        frameLayout.addView(r41Var2, ha.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        m41 m41Var;
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
        r41 r41Var = this.b;
        if (r41Var != null && (m41Var = r41Var.f3) != null) {
            m41Var.O(true);
        }
        a0(true);
        this.f = true;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if (i7 != qs.F1) {
            if (i7 == qs.E0) {
                d0();
            }
        } else {
            r41 r41Var = this.b;
            if (r41Var != null && (m41Var = r41Var.f3) != null) {
                m41Var.O(true);
            }
            a0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (!b0()) {
            return super.onBackPressed(z9);
        }
        int i7 = 0;
        if (z9) {
            if (!this.r) {
                c0();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = id.M0(2131743835, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = id.M0(2131752768, null);
            alertDialog$Builder.k(id.M0(2131754216, null), new r0(this, i7));
            alertDialog$Builder.h(id.M0(2131747580, null), new r0(this, 1));
            showDialog(u1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.F1);
        getNotificationCenter().c(this, qs.E0);
        t1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.F1);
        getNotificationCenter().n(this, qs.E0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
