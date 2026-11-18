package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q2;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class a0 {
    public final Context a;
    public final int b;
    public final i6 c;
    public final h2 d;
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

    public a0(h2 h2Var, Runnable runnable) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = h2Var.getContext();
        this.b = h2Var.getCurrentAccount();
        this.d = h2Var;
        this.e = runnable;
        this.c = h2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, z41 z41Var, boolean z10) {
        String str;
        String str2;
        z41Var.V();
        int d = d();
        str = "";
        if (!this.h) {
            if ((d & 1) != 0) {
                str2 = i5.c.k(2131750765, null, e2.m(!TextUtils.isEmpty("") ? ", " : ""));
            } else {
                str2 = "";
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = p5.c.v(str2, ", ");
                }
                str2 = i5.c.k(2131750716, null, e2.m(str2));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = p5.c.v(str2, ", ");
                }
                str2 = i5.c.k(2131750780, null, e2.m(str2));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = p5.c.v(str2, ", ");
                }
                str2 = i5.c.k(2131750707, null, e2.m(str2));
            }
            ArrayList arrayList2 = this.j;
            if (!arrayList2.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    StringBuilder m10 = e2.m(str2);
                    m10.append(gd.H(',', "Chats", arrayList2.size()));
                    str2 = m10.toString();
                } else {
                    StringBuilder n10 = p5.c.n(str2, " + ");
                    n10.append(arrayList2.size());
                    str2 = n10.toString();
                }
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = gd.M0(2131752766, null);
            }
            l41 f10 = l41.f(gd.M0(2131752767, null), str2, 101);
            f10.g = z10;
            arrayList.add(f10);
        }
        boolean z11 = this.i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    str = i5.c.k(2131750765, null, e2.m(TextUtils.isEmpty("") ? "" : ", "));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = p5.c.v(str, ", ");
                    }
                    str = i5.c.k(2131750716, null, e2.m(str));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = p5.c.v(str, ", ");
                    }
                    str = i5.c.k(2131750780, null, e2.m(str));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = p5.c.v(str, ", ");
                    }
                    str = i5.c.k(2131750707, null, e2.m(str));
                }
            }
            ArrayList arrayList3 = this.k;
            if (!arrayList3.isEmpty()) {
                if (TextUtils.isEmpty(str)) {
                    StringBuilder m11 = e2.m(str);
                    m11.append(gd.H(',', "Chats", arrayList3.size()));
                    str = m11.toString();
                } else {
                    StringBuilder n11 = p5.c.n(str, " + ");
                    n11.append(arrayList3.size());
                    str = n11.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = gd.M0(2131752768, null);
            }
            l41 f11 = l41.f(gd.M0(2131752769, null), str, ks.o1);
            f11.g = z10;
            arrayList.add(f11);
        }
        z41Var.U();
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
            mp u12 = mp.u1(j10.t0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                Long l10 = (Long) arrayList2.get(i7);
                l10.getClass();
                tL_inputBusinessBotRecipients.users.add(u12.s1(u12.c2(l10)));
            }
        }
        if (!this.h) {
            mp u13 = mp.u1(j10.t0);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l11 = (Long) arrayList.get(i10);
                l11.getClass();
                tL_inputBusinessBotRecipients.exclude_users.add(u13.s1(u13.c2(l11)));
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
            mp u12 = mp.u1(j10.t0);
            tL_businessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                Long l10 = (Long) arrayList2.get(i7);
                l10.longValue();
                u12.s1(u12.c2(l10));
                tL_businessBotRecipients.users.add((Long) arrayList2.get(i7));
            }
        }
        if (!this.h) {
            mp u13 = mp.u1(j10.t0);
            tL_businessBotRecipients.flags |= 64;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l11 = (Long) arrayList.get(i10);
                l11.longValue();
                u13.s1(u13.c2(l11));
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
            mp u12 = mp.u1(j10.t0);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.getClass();
                tL_inputBusinessRecipients.users.add(u12.s1(u12.c2(l10)));
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
            mp u12 = mp.u1(j10.t0);
            tL_businessRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.getClass();
                u12.s1(u12.c2(l10));
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

    public final boolean h(l41 l41Var) {
        int i7 = l41Var.d;
        int i10 = 2;
        h2 h2Var = this.d;
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
            if (h2Var != null) {
                h2Var.presentFragment(usersSelectActivity);
                return true;
            }
            h2 T = LaunchActivity.T();
            if (T == null) {
                return true;
            }
            f2 f2Var = new f2();
            f2Var.a = true;
            T.showAsSheet(usersSelectActivity, f2Var);
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
        if (l41Var.a != 11) {
            return false;
        }
        boolean z13 = l41Var.x;
        String D1 = mp.u1(this.b).D1(l41Var.y, false);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, this.c);
        String M0 = gd.M0(!z13 ? 2131752675 : 2131752673, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = gd.a0(null, null, !z13 ? 2131752676 : 2131752674, D1);
        alertDialog$Builder.k(gd.M0(2131746126, null), new ab.j(this, z13, l41Var, i10));
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        if (h2Var != null) {
            h2Var.showDialog(u1Var);
            return true;
        }
        u1Var.show();
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

    public final boolean k(e51 e51Var) {
        if (this.h || !this.j.isEmpty() || this.f != 0) {
            return true;
        }
        q2.E.a();
        View B1 = e51Var.B1(101);
        int i7 = -this.m;
        this.m = i7;
        org.telegram.messenger.g0.E3(i7, B1, null);
        e51Var.y0(e51Var.A1(101));
        return false;
    }

    public a0(Context context, int i7, j0 j0Var, i6 i6Var) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = context;
        this.b = i7;
        this.d = null;
        this.e = j0Var;
        this.c = i6Var;
    }
}
