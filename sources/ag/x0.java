package ag;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x0 {
    public final Context a;
    public final int b;
    public final p6 c;
    public final org.telegram.ui.ActionBar.k2 d;
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

    public x0(org.telegram.ui.ActionBar.k2 k2Var, Runnable runnable) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = k2Var.getContext();
        this.b = k2Var.getCurrentAccount();
        this.d = k2Var;
        this.e = runnable;
        this.c = k2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, p51 p51Var, boolean z10) {
        String str;
        String str2;
        p51Var.V();
        int d = d();
        str = "";
        if (!this.h) {
            if ((d & 1) != 0) {
                str2 = a1.g.m(null, 2131750777, a1.g.t(!TextUtils.isEmpty("") ? ", " : ""));
            } else {
                str2 = "";
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = sc.e.A(str2, ", ");
                }
                str2 = a1.g.m(null, 2131750728, a1.g.t(str2));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = sc.e.A(str2, ", ");
                }
                str2 = a1.g.m(null, 2131750792, a1.g.t(str2));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = sc.e.A(str2, ", ");
                }
                str2 = a1.g.m(null, 2131750721, a1.g.t(str2));
            }
            ArrayList arrayList2 = this.j;
            if (!arrayList2.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    StringBuilder t10 = a1.g.t(str2);
                    t10.append(cd.H(',', "Chats", arrayList2.size()));
                    str2 = t10.toString();
                } else {
                    StringBuilder i10 = sc.e.i(str2, " + ");
                    i10.append(arrayList2.size());
                    str2 = i10.toString();
                }
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = cd.L0(2131752777, null);
            }
            a51 f7 = a51.f(cd.L0(2131752778, null), str2, 101);
            f7.g = z10;
            arrayList.add(f7);
        }
        boolean z11 = this.i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    str = a1.g.m(null, 2131750777, a1.g.t(TextUtils.isEmpty("") ? "" : ", "));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = sc.e.A(str, ", ");
                    }
                    str = a1.g.m(null, 2131750728, a1.g.t(str));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = sc.e.A(str, ", ");
                    }
                    str = a1.g.m(null, 2131750792, a1.g.t(str));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = sc.e.A(str, ", ");
                    }
                    str = a1.g.m(null, 2131750721, a1.g.t(str));
                }
            }
            ArrayList arrayList3 = this.k;
            if (!arrayList3.isEmpty()) {
                if (TextUtils.isEmpty(str)) {
                    StringBuilder t11 = a1.g.t(str);
                    t11.append(cd.H(',', "Chats", arrayList3.size()));
                    str = t11.toString();
                } else {
                    StringBuilder i11 = sc.e.i(str, " + ");
                    i11.append(arrayList3.size());
                    str = i11.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = cd.L0(2131752779, null);
            }
            a51 f10 = a51.f(cd.L0(2131752780, null), str, zs.o1);
            f10.g = z10;
            arrayList.add(f10);
        }
        p51Var.U();
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
            vp r12 = vp.r1(d20.s0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l4 = (Long) arrayList2.get(i10);
                l4.getClass();
                tL_inputBusinessBotRecipients.users.add(r12.p1(r12.Z1(l4)));
            }
        }
        if (!this.h) {
            vp r13 = vp.r1(d20.s0);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Long l10 = (Long) arrayList.get(i11);
                l10.getClass();
                tL_inputBusinessBotRecipients.exclude_users.add(r13.p1(r13.Z1(l10)));
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
            vp r12 = vp.r1(d20.s0);
            tL_businessBotRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l4 = (Long) arrayList2.get(i10);
                l4.longValue();
                r12.p1(r12.Z1(l4));
                tL_businessBotRecipients.users.add((Long) arrayList2.get(i10));
            }
        }
        if (!this.h) {
            vp r13 = vp.r1(d20.s0);
            tL_businessBotRecipients.flags |= 64;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Long l10 = (Long) arrayList.get(i11);
                l10.longValue();
                r13.p1(r13.Z1(l10));
                tL_businessBotRecipients.users.add((Long) arrayList.get(i11));
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
            vp r12 = vp.r1(d20.s0);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l4 = (Long) arrayList.get(i10);
                l4.getClass();
                tL_inputBusinessRecipients.users.add(r12.p1(r12.Z1(l4)));
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
            vp r12 = vp.r1(d20.s0);
            tL_businessRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l4 = (Long) arrayList.get(i10);
                l4.getClass();
                r12.p1(r12.Z1(l4));
                tL_businessRecipients.users.add((Long) arrayList.get(i10));
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
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            if (!this.l.users.contains(arrayList2.get(i10))) {
                return true;
            }
        }
        if (this.i && !this.h) {
            if (arrayList.size() != this.l.exclude_users.size()) {
                return true;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (!this.l.exclude_users.contains(arrayList.get(i11))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean h(a51 a51Var) {
        int i10 = a51Var.d;
        org.telegram.ui.ActionBar.k2 k2Var = this.d;
        int i11 = 0;
        if (i10 == 101 || i10 == 103) {
            boolean z10 = i10 == 101;
            UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), z10 ? this.j : this.k, z10);
            usersSelectActivity.y = 2;
            usersSelectActivity.G = false;
            usersSelectActivity.F = (!this.i || this.h || z10) ? false : true;
            usersSelectActivity.G = false;
            usersSelectActivity.H = !z10 && this.n;
            usersSelectActivity.n = new w0(i11, this, z10);
            if (k2Var != null) {
                k2Var.presentFragment(usersSelectActivity);
                return true;
            }
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T == null) {
                return true;
            }
            org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
            i2Var.a = true;
            T.showAsSheet(usersSelectActivity, i2Var);
            return true;
        }
        Runnable runnable = this.e;
        if (i10 == 102) {
            runnable.run();
            return true;
        }
        if (i10 == 104) {
            runnable.run();
            return true;
        }
        if (a51Var.a != 11) {
            return false;
        }
        boolean z11 = a51Var.w;
        String A1 = vp.r1(this.b).A1(a51Var.x, false);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, this.c);
        String L0 = cd.L0(!z11 ? 2131752686 : 2131752684, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = cd.a0(null, null, !z11 ? 2131752687 : 2131752685, A1);
        alertDialog$Builder.k(cd.L0(2131746336, null), new v0(this, z11, a51Var, i11));
        alertDialog$Builder.h(cd.L0(2131752589, null), null);
        if (k2Var != null) {
            k2Var.showDialog(x1Var);
            return true;
        }
        x1Var.show();
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

    public final boolean k(u51 u51Var) {
        if (this.h || !this.j.isEmpty() || this.f != 0) {
            return true;
        }
        org.telegram.messenger.t2.D.a();
        View B1 = u51Var.B1(101);
        int i10 = -this.m;
        this.m = i10;
        org.telegram.messenger.i0.F3(i10, B1, null);
        u51Var.y0(u51Var.A1(101));
        return false;
    }

    public x0(Context context, int i10, a3.d dVar, p6 p6Var) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = context;
        this.b = i10;
        this.d = null;
        this.e = dVar;
        this.c = p6Var;
    }
}
