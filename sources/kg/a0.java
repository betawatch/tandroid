package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.p2;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a0 {
    public final Context a;
    public final int b;
    public final e6 c;
    public final e2 d;
    public final Runnable e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public TL_account.TL_businessBotRecipients l;
    public int m;
    public boolean n;

    public a0(e2 e2Var, Runnable runnable) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = e2Var.getContext();
        this.b = e2Var.getCurrentAccount();
        this.d = e2Var;
        this.e = runnable;
        this.c = e2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, p41 p41Var, boolean z10) {
        String str;
        String str2;
        p41Var.V();
        int d = d();
        str = "";
        if (!this.h) {
            if ((d & 1) != 0) {
                str2 = i5.c.k(2131750776, null, com.google.android.gms.internal.vision.e2.m(!TextUtils.isEmpty("") ? ", " : ""));
            } else {
                str2 = "";
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = r.b.v(str2, ", ");
                }
                str2 = i5.c.k(2131750727, null, com.google.android.gms.internal.vision.e2.m(str2));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = r.b.v(str2, ", ");
                }
                str2 = i5.c.k(2131750791, null, com.google.android.gms.internal.vision.e2.m(str2));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = r.b.v(str2, ", ");
                }
                str2 = i5.c.k(2131750720, null, com.google.android.gms.internal.vision.e2.m(str2));
            }
            ArrayList arrayList2 = this.j;
            if (!arrayList2.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str2);
                    m10.append(hd.H(',', "Chats", arrayList2.size()));
                    str2 = m10.toString();
                } else {
                    StringBuilder m11 = r.b.m(str2, " + ");
                    m11.append(arrayList2.size());
                    str2 = m11.toString();
                }
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = hd.M0(2131752777, null);
            }
            b41 f10 = b41.f(hd.M0(2131752778, null), str2, 101);
            f10.g = z10;
            arrayList.add(f10);
        }
        boolean z11 = this.i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    str = i5.c.k(2131750776, null, com.google.android.gms.internal.vision.e2.m(TextUtils.isEmpty("") ? "" : ", "));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = r.b.v(str, ", ");
                    }
                    str = i5.c.k(2131750727, null, com.google.android.gms.internal.vision.e2.m(str));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = r.b.v(str, ", ");
                    }
                    str = i5.c.k(2131750791, null, com.google.android.gms.internal.vision.e2.m(str));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = r.b.v(str, ", ");
                    }
                    str = i5.c.k(2131750720, null, com.google.android.gms.internal.vision.e2.m(str));
                }
            }
            ArrayList arrayList3 = this.k;
            if (!arrayList3.isEmpty()) {
                if (TextUtils.isEmpty(str)) {
                    StringBuilder m12 = com.google.android.gms.internal.vision.e2.m(str);
                    m12.append(hd.H(',', "Chats", arrayList3.size()));
                    str = m12.toString();
                } else {
                    StringBuilder m13 = r.b.m(str, " + ");
                    m13.append(arrayList3.size());
                    str = m13.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = hd.M0(2131752779, null);
            }
            b41 f11 = b41.f(hd.M0(2131752780, null), str, ns.o1);
            f11.g = z10;
            arrayList.add(f11);
        }
        p41Var.U();
    }

    public final TL_account.TL_inputBusinessBotRecipients b() {
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int d = d();
        tL_inputBusinessBotRecipients.flags = d & (-49);
        tL_inputBusinessBotRecipients.existing_chats = (d & 1) != 0;
        tL_inputBusinessBotRecipients.new_chats = (d & 2) != 0;
        tL_inputBusinessBotRecipients.contacts = (d & 4) != 0;
        tL_inputBusinessBotRecipients.non_contacts = (d & 8) != 0;
        boolean z10 = this.h;
        tL_inputBusinessBotRecipients.exclude_selected = z10;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z10 ? arrayList : this.j;
        if (!arrayList2.isEmpty()) {
            np s12 = np.s1(m10.t0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                Long l10 = (Long) arrayList2.get(i7);
                l10.getClass();
                tL_inputBusinessBotRecipients.users.add(s12.q1(s12.a2(l10)));
            }
        }
        if (!this.h) {
            np s13 = np.s1(m10.t0);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l11 = (Long) arrayList.get(i10);
                l11.getClass();
                tL_inputBusinessBotRecipients.exclude_users.add(s13.q1(s13.a2(l11)));
            }
        }
        return tL_inputBusinessBotRecipients;
    }

    public final TL_account.TL_businessBotRecipients c() {
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
        int d = d();
        tL_businessBotRecipients.flags = d & (-49);
        tL_businessBotRecipients.existing_chats = (d & 1) != 0;
        tL_businessBotRecipients.new_chats = (d & 2) != 0;
        tL_businessBotRecipients.contacts = (d & 4) != 0;
        tL_businessBotRecipients.non_contacts = (d & 8) != 0;
        boolean z10 = this.h;
        tL_businessBotRecipients.exclude_selected = z10;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z10 ? arrayList : this.j;
        if (!arrayList2.isEmpty()) {
            np s12 = np.s1(m10.t0);
            tL_businessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                Long l10 = (Long) arrayList2.get(i7);
                l10.longValue();
                s12.q1(s12.a2(l10));
                tL_businessBotRecipients.users.add((Long) arrayList2.get(i7));
            }
        }
        if (!this.h) {
            np s13 = np.s1(m10.t0);
            tL_businessBotRecipients.flags |= 64;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l11 = (Long) arrayList.get(i10);
                l11.longValue();
                s13.q1(s13.a2(l11));
                tL_businessBotRecipients.users.add((Long) arrayList.get(i10));
            }
        }
        return tL_businessBotRecipients;
    }

    public final int d() {
        return this.h ? this.g : this.f;
    }

    public final TL_account.TL_inputBusinessRecipients e() {
        TL_account.TL_inputBusinessRecipients tL_inputBusinessRecipients = new TL_account.TL_inputBusinessRecipients();
        int d = d();
        tL_inputBusinessRecipients.flags = d & (-49);
        tL_inputBusinessRecipients.existing_chats = (d & 1) != 0;
        tL_inputBusinessRecipients.new_chats = (d & 2) != 0;
        tL_inputBusinessRecipients.contacts = (d & 4) != 0;
        tL_inputBusinessRecipients.non_contacts = (d & 8) != 0;
        boolean z10 = this.h;
        tL_inputBusinessRecipients.exclude_selected = z10;
        ArrayList arrayList = z10 ? this.k : this.j;
        if (!arrayList.isEmpty()) {
            np s12 = np.s1(m10.t0);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.getClass();
                tL_inputBusinessRecipients.users.add(s12.q1(s12.a2(l10)));
            }
        }
        return tL_inputBusinessRecipients;
    }

    public final TL_account.TL_businessRecipients f() {
        TL_account.TL_businessRecipients tL_businessRecipients = new TL_account.TL_businessRecipients();
        int d = d();
        tL_businessRecipients.flags = d & (-49);
        tL_businessRecipients.existing_chats = (d & 1) != 0;
        tL_businessRecipients.new_chats = (d & 2) != 0;
        tL_businessRecipients.contacts = (d & 4) != 0;
        tL_businessRecipients.non_contacts = (d & 8) != 0;
        boolean z10 = this.h;
        tL_businessRecipients.exclude_selected = z10;
        ArrayList arrayList = z10 ? this.k : this.j;
        if (!arrayList.isEmpty()) {
            np s12 = np.s1(m10.t0);
            tL_businessRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.getClass();
                s12.q1(s12.a2(l10));
                tL_businessRecipients.users.add((Long) arrayList.get(i7));
            }
        }
        return tL_businessRecipients;
    }

    public final boolean g() {
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.l;
        if (tL_businessBotRecipients == null || tL_businessBotRecipients.exclude_selected != this.h || (tL_businessBotRecipients.flags & (-49)) != d()) {
            return true;
        }
        boolean z10 = this.h;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z10 ? arrayList : this.j;
        if (arrayList2.size() != this.l.users.size()) {
            return true;
        }
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            if (!this.l.users.contains(arrayList2.get(i7))) {
                return true;
            }
        }
        if (this.i && !this.h) {
            if (arrayList.size() != this.l.exclude_users.size()) {
                return true;
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!this.l.exclude_users.contains(arrayList.get(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean h(b41 b41Var) {
        int i7 = b41Var.d;
        int i10 = 2;
        e2 e2Var = this.d;
        boolean z10 = false;
        if (i7 == 101 || i7 == 103) {
            boolean z11 = i7 == 101;
            UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), z11 ? this.j : this.k, z11);
            usersSelectActivity.y = 2;
            usersSelectActivity.H = false;
            boolean z12 = this.i;
            usersSelectActivity.G = (!z12 || this.h || z11) ? false : true;
            usersSelectActivity.H = false;
            usersSelectActivity.I = z12;
            if (!z11 && this.n) {
                z10 = true;
            }
            usersSelectActivity.J = z10;
            usersSelectActivity.n = new ab.z(i10, this, z11);
            if (e2Var != null) {
                e2Var.presentFragment(usersSelectActivity);
                return true;
            }
            e2 T = LaunchActivity.T();
            if (T == null) {
                return true;
            }
            c2 c2Var = new c2();
            c2Var.a = true;
            T.showAsSheet(usersSelectActivity, c2Var);
            return true;
        }
        Runnable runnable = this.e;
        if (i7 == 102) {
            runnable.run();
            return true;
        }
        if (i7 == 104) {
            runnable.run();
            return true;
        }
        if (b41Var.a != 11) {
            return false;
        }
        boolean z13 = b41Var.w;
        String B1 = np.s1(this.b).B1(b41Var.x, false);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, this.c);
        String M0 = hd.M0(!z13 ? 2131752686 : 2131752684, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = hd.a0(null, null, !z13 ? 2131752687 : 2131752685, B1);
        alertDialog$Builder.k(hd.M0(2131746321, null), new ab.j(this, z13, b41Var, i10));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        if (e2Var != null) {
            e2Var.showDialog(t1Var);
            return true;
        }
        t1Var.show();
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.i = true;
        this.l = tL_businessBotRecipients;
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.g = 0;
            this.f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f = 0;
            this.g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.l.users);
            return;
        }
        this.f = tL_businessBotRecipients.flags & (-49);
        this.g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.l.users);
        arrayList2.addAll(this.l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.l;
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.g = 0;
            this.f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f = 0;
            this.g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.l.users);
            return;
        }
        this.f = tL_businessBotRecipients2.flags & (-49);
        this.g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.l.users);
        arrayList2.addAll(this.l.exclude_users);
    }

    public final boolean k(u41 u41Var) {
        if (this.h || !this.j.isEmpty() || this.f != 0) {
            return true;
        }
        p2.E.a();
        View B1 = u41Var.B1(101);
        int i7 = -this.m;
        this.m = i7;
        org.telegram.messenger.g0.F3(i7, B1, null);
        u41Var.y0(u41Var.A1(101));
        return false;
    }

    public a0(Context context, int i7, hi.e1 e1Var, e6 e6Var) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = context;
        this.b = i7;
        this.d = null;
        this.e = e1Var;
        this.c = e6Var;
    }
}
