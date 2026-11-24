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
public final class o35 extends d implements gk7 {
    public sha a;
    public q5c b;
    public m41 c;
    public final int[] d;
    public final String[] e;
    public boolean f;
    public int h;
    public TL_account.TL_businessGreetingMessage n;
    public boolean r;
    public boolean s;
    public int w;

    public o35() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.w = 7;
        this.e = new String[iArr.length];
        int i = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i >= iArr2.length) {
                return;
            }
            this.e[i] = k96.G(iArr2[i], "DaysSchedule", new Object[0]);
            i++;
        }
    }

    public final void Y(boolean z) {
        if (this.a == null) {
            return;
        }
        this.a.a(a0(), z);
    }

    public final void Z(ArrayList arrayList, l5c l5cVar) {
        String M0 = k96.M0(2131752763, null);
        String M02 = k96.M0(2131752761, null);
        c4c c4cVar = new c4c(2);
        c4cVar.m = M0;
        c4cVar.p = M02;
        c4cVar.n = "RestrictedEmoji";
        c4cVar.o = "👋";
        arrayList.add(c4cVar);
        c4c i = c4c.i(1, k96.M0(2131752757, null));
        i.L(this.r);
        arrayList.add(i);
        arrayList.add(c4c.C(null));
        if (this.r) {
            nx8 d = ox8.f(this.currentAccount).d("hello");
            if (d != null) {
                c4c c4cVar2 = new c4c(17);
                c4cVar2.H = d;
                arrayList.add(c4cVar2);
            } else {
                c4c c = c4c.c(2, R.drawable.msg2_chats_add, k96.M0(2131752762, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(c4c.C(null));
            arrayList.add(c4c.u(k96.M0(2131752676, null)));
            c4c x = c4c.x(3, k96.M0(2131752769, null));
            x.L(this.s);
            arrayList.add(x);
            c4c x2 = c4c.x(4, k96.M0(2131752764, null));
            x2.L(!this.s);
            arrayList.add(x2);
            arrayList.add(c4c.C(null));
            this.c.a(arrayList, l5cVar, true);
            arrayList.add(c4c.C(k96.M0(2131752758, null)));
            arrayList.add(c4c.u(k96.M0(2131752760, null)));
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                } else if (iArr[i2] == this.w) {
                    break;
                } else {
                    i2++;
                }
            }
            hj3 hj3Var = new hj3(this, (byte) 15);
            c4c c4cVar3 = new c4c(14);
            c4cVar3.q = this.e;
            c4cVar3.A = i2;
            c4cVar3.D = hj3Var;
            c4cVar3.C = -1L;
            arrayList.add(c4cVar3);
            arrayList.add(c4c.C(k96.M0(2131752759, null)));
        }
    }

    public final boolean a0() {
        m41 m41Var;
        if (this.f) {
            boolean z = this.r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
            if (z != (tL_businessGreetingMessage != null) || (z && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.w || tL_businessGreetingMessage.recipients.exclude_selected != this.s || ((m41Var = this.c) != null && m41Var.g())))) {
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
        nx8 d = ox8.f(this.currentAccount).d("hello");
        if (this.r) {
            if (d == null) {
                pw0.E.a();
                View B1 = this.b.B1(2);
                int i = -this.h;
                this.h = i;
                gl.B3(i, B1, null);
                return;
            }
            if (!this.c.k(this.b)) {
                return;
            }
        }
        this.a.b(true);
        TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
        TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
        if (this.r) {
            TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
            updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
            tL_inputBusinessGreetingMessage.shortcut_id = d.a;
            tL_inputBusinessGreetingMessage.recipients = this.c.e();
            updatebusinessgreetingmessage.message.no_activity_days = this.w;
            updatebusinessgreetingmessage.flags |= 1;
            if (W1 != null) {
                W1.flags2 |= 4;
                TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                W1.business_greeting_message = tL_businessGreetingMessage;
                tL_businessGreetingMessage.shortcut_id = d.a;
                tL_businessGreetingMessage.recipients = this.c.f();
                W1.business_greeting_message.no_activity_days = this.w;
            }
        } else if (W1 != null) {
            W1.flags2 &= -5;
            W1.business_greeting_message = null;
        }
        getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new n35(this, (byte) 0));
        getMessagesStorage().g2(W1, false);
    }

    public final void c0() {
        l5c l5cVar;
        if (this.f) {
            return;
        }
        TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
        if (W1 == null) {
            getMessagesController().h3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = W1.business_greeting_message;
        this.n = tL_businessGreetingMessage;
        this.r = tL_businessGreetingMessage != null;
        this.w = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.no_activity_days : 7;
        this.s = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.recipients.exclude_selected : true;
        m41 m41Var = this.c;
        if (m41Var != null) {
            m41Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        }
        q5c q5cVar = this.b;
        if (q5cVar != null && (l5cVar = q5cVar.g3) != null) {
            l5cVar.O(true);
        }
        Y(true);
        this.f = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(k96.M0(2131752763, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 22));
        this.a = this.simpleActionBar.s(k96.M0(2131745754, null));
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        m41 m41Var = new m41(this, new iu4(this, (byte) 11));
        this.c = m41Var;
        m41Var.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
        m41Var.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        q5c q5cVar = new q5c(this, new ur4((Object) this, (byte) 8), new m35(this, (byte) 2), null);
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
        byte b = 0;
        if (z) {
            if (!this.r) {
                b0();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131743596, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131752756, null);
            alertDialog$Builder.j(k96.M0(2131754213, null), new m35(this, b));
            alertDialog$Builder.g(k96.M0(2131747387, null), new m35(this, (byte) 1));
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
