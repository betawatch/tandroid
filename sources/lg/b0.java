package lg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import ci.l3;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.p2;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b0 {
    public final Context a;
    public final int b;
    public final e6 c;
    public final d2 d;
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

    public b0(d2 d2Var, Runnable runnable) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = d2Var.getContext();
        this.b = d2Var.getCurrentAccount();
        this.d = d2Var;
        this.e = runnable;
        this.c = d2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, f41 f41Var, boolean z10) {
        String str;
        String str2;
        f41Var.V();
        int d = d();
        str = "";
        if (!this.h) {
            if ((d & 1) != 0) {
                str2 = k2.p1.k(2131750777, null, com.google.android.recaptcha.internal.a.l(!TextUtils.isEmpty("") ? ", " : ""));
            } else {
                str2 = "";
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = t4.c.q(str2, ", ");
                }
                str2 = k2.p1.k(2131750728, null, com.google.android.recaptcha.internal.a.l(str2));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = t4.c.q(str2, ", ");
                }
                str2 = k2.p1.k(2131750792, null, com.google.android.recaptcha.internal.a.l(str2));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = t4.c.q(str2, ", ");
                }
                str2 = k2.p1.k(2131750721, null, com.google.android.recaptcha.internal.a.l(str2));
            }
            ArrayList arrayList2 = this.j;
            if (!arrayList2.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str2);
                    l10.append(bd.H(',', "Chats", arrayList2.size()));
                    str2 = l10.toString();
                } else {
                    StringBuilder h = t4.c.h(str2, " + ");
                    h.append(arrayList2.size());
                    str2 = h.toString();
                }
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = bd.M0(2131752777, null);
            }
            r31 f10 = r31.f(bd.M0(2131752778, null), str2, 101);
            f10.g = z10;
            arrayList.add(f10);
        }
        boolean z11 = this.i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    str = k2.p1.k(2131750777, null, com.google.android.recaptcha.internal.a.l(TextUtils.isEmpty("") ? "" : ", "));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = t4.c.q(str, ", ");
                    }
                    str = k2.p1.k(2131750728, null, com.google.android.recaptcha.internal.a.l(str));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = t4.c.q(str, ", ");
                    }
                    str = k2.p1.k(2131750792, null, com.google.android.recaptcha.internal.a.l(str));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = t4.c.q(str, ", ");
                    }
                    str = k2.p1.k(2131750721, null, com.google.android.recaptcha.internal.a.l(str));
                }
            }
            ArrayList arrayList3 = this.k;
            if (!arrayList3.isEmpty()) {
                if (TextUtils.isEmpty(str)) {
                    StringBuilder l11 = com.google.android.recaptcha.internal.a.l(str);
                    l11.append(bd.H(',', "Chats", arrayList3.size()));
                    str = l11.toString();
                } else {
                    StringBuilder h7 = t4.c.h(str, " + ");
                    h7.append(arrayList3.size());
                    str = h7.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = bd.M0(2131752779, null);
            }
            r31 f11 = r31.f(bd.M0(2131752780, null), str, hs.o1);
            f11.g = z10;
            arrayList.add(f11);
        }
        f41Var.U();
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
            hp s12 = hp.s1(h10.t0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                Long l10 = (Long) arrayList2.get(i3);
                l10.getClass();
                tL_inputBusinessBotRecipients.users.add(s12.q1(s12.a2(l10)));
            }
        }
        if (!this.h) {
            hp s13 = hp.s1(h10.t0);
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
            hp s12 = hp.s1(h10.t0);
            tL_businessBotRecipients.flags |= 16;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                Long l10 = (Long) arrayList2.get(i3);
                l10.longValue();
                s12.q1(s12.a2(l10));
                tL_businessBotRecipients.users.add((Long) arrayList2.get(i3));
            }
        }
        if (!this.h) {
            hp s13 = hp.s1(h10.t0);
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
            hp s12 = hp.s1(h10.t0);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Long l10 = (Long) arrayList.get(i3);
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
            hp s12 = hp.s1(h10.t0);
            tL_businessRecipients.flags |= 16;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Long l10 = (Long) arrayList.get(i3);
                l10.getClass();
                s12.q1(s12.a2(l10));
                tL_businessRecipients.users.add((Long) arrayList.get(i3));
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
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            if (!this.l.users.contains(arrayList2.get(i3))) {
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

    public final boolean h(r31 r31Var) {
        int i3 = r31Var.d;
        d2 d2Var = this.d;
        boolean z10 = false;
        int i10 = 1;
        if (i3 == 101 || i3 == 103) {
            boolean z11 = i3 == 101;
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
            usersSelectActivity.n = new ei.f(i10, this, z11);
            if (d2Var != null) {
                d2Var.presentFragment(usersSelectActivity);
                return true;
            }
            d2 T = LaunchActivity.T();
            if (T == null) {
                return true;
            }
            b2 b2Var = new b2();
            b2Var.a = true;
            T.showAsSheet(usersSelectActivity, b2Var);
            return true;
        }
        Runnable runnable = this.e;
        if (i3 == 102) {
            runnable.run();
            return true;
        }
        if (i3 == 104) {
            runnable.run();
            return true;
        }
        if (r31Var.a != 11) {
            return false;
        }
        boolean z13 = r31Var.w;
        String B1 = hp.s1(this.b).B1(r31Var.x, false);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, this.c);
        String M0 = bd.M0(!z13 ? 2131752686 : 2131752684, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = bd.a0(null, null, !z13 ? 2131752687 : 2131752685, B1);
        alertDialog$Builder.k(bd.M0(2131746329, null), new l3(this, z13, r31Var, i10));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        if (d2Var != null) {
            d2Var.showDialog(s1Var);
            return true;
        }
        s1Var.show();
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

    public final boolean k(l41 l41Var) {
        if (this.h || !this.j.isEmpty() || this.f != 0) {
            return true;
        }
        p2.E.a();
        View B1 = l41Var.B1(101);
        int i3 = -this.m;
        this.m = i3;
        org.telegram.messenger.g0.G3(i3, B1, null);
        l41Var.y0(l41Var.A1(101));
        return false;
    }

    public b0(Context context, int i3, n nVar, e6 e6Var) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = context;
        this.b = i3;
        this.d = null;
        this.e = nVar;
        this.c = e6Var;
    }
}
