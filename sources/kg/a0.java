package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import fi.h9;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.p2;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a0 {
    public final Context a;
    public final int b;
    public final f6 c;
    public final f2 d;
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

    public a0(f2 f2Var, Runnable runnable) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = f2Var.getContext();
        this.b = f2Var.getCurrentAccount();
        this.d = f2Var;
        this.e = runnable;
        this.c = f2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, l41 l41Var, boolean z9) {
        String str;
        String str2;
        l41Var.V();
        int d = d();
        str = "";
        if (!this.h) {
            if ((d & 1) != 0) {
                str2 = jg.g.l(2131750777, null, com.google.android.recaptcha.internal.a.m(!TextUtils.isEmpty("") ? ", " : ""));
            } else {
                str2 = "";
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = rf.b.r(str2, ", ");
                }
                str2 = jg.g.l(2131750728, null, com.google.android.recaptcha.internal.a.m(str2));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = rf.b.r(str2, ", ");
                }
                str2 = jg.g.l(2131750792, null, com.google.android.recaptcha.internal.a.m(str2));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    str2 = rf.b.r(str2, ", ");
                }
                str2 = jg.g.l(2131750721, null, com.google.android.recaptcha.internal.a.m(str2));
            }
            ArrayList arrayList2 = this.j;
            if (!arrayList2.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str2);
                    m10.append(id.H(',', "Chats", arrayList2.size()));
                    str2 = m10.toString();
                } else {
                    StringBuilder j3 = rf.b.j(str2, " + ");
                    j3.append(arrayList2.size());
                    str2 = j3.toString();
                }
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = id.M0(2131752777, null);
            }
            x31 f10 = x31.f(id.M0(2131752778, null), str2, 101);
            f10.g = z9;
            arrayList.add(f10);
        }
        boolean z10 = this.i;
        if (z10 || this.h) {
            if (!z10 || this.h) {
                if ((d & 1) != 0) {
                    str = jg.g.l(2131750777, null, com.google.android.recaptcha.internal.a.m(TextUtils.isEmpty("") ? "" : ", "));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = rf.b.r(str, ", ");
                    }
                    str = jg.g.l(2131750728, null, com.google.android.recaptcha.internal.a.m(str));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = rf.b.r(str, ", ");
                    }
                    str = jg.g.l(2131750792, null, com.google.android.recaptcha.internal.a.m(str));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = rf.b.r(str, ", ");
                    }
                    str = jg.g.l(2131750721, null, com.google.android.recaptcha.internal.a.m(str));
                }
            }
            ArrayList arrayList3 = this.k;
            if (!arrayList3.isEmpty()) {
                if (TextUtils.isEmpty(str)) {
                    StringBuilder m11 = com.google.android.recaptcha.internal.a.m(str);
                    m11.append(id.H(',', "Chats", arrayList3.size()));
                    str = m11.toString();
                } else {
                    StringBuilder j10 = rf.b.j(str, " + ");
                    j10.append(arrayList3.size());
                    str = j10.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = id.M0(2131752779, null);
            }
            x31 f11 = x31.f(id.M0(2131752780, null), str, qs.o1);
            f11.g = z9;
            arrayList.add(f11);
        }
        l41Var.U();
    }

    public final TL_account.TL_inputBusinessBotRecipients b() {
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int d = d();
        tL_inputBusinessBotRecipients.flags = d & (-49);
        tL_inputBusinessBotRecipients.existing_chats = (d & 1) != 0;
        tL_inputBusinessBotRecipients.new_chats = (d & 2) != 0;
        tL_inputBusinessBotRecipients.contacts = (d & 4) != 0;
        tL_inputBusinessBotRecipients.non_contacts = (d & 8) != 0;
        boolean z9 = this.h;
        tL_inputBusinessBotRecipients.exclude_selected = z9;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z9 ? arrayList : this.j;
        if (!arrayList2.isEmpty()) {
            qp s12 = qp.s1(p10.s0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                Long l10 = (Long) arrayList2.get(i7);
                l10.getClass();
                tL_inputBusinessBotRecipients.users.add(s12.q1(s12.a2(l10)));
            }
        }
        if (!this.h) {
            qp s13 = qp.s1(p10.s0);
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
        boolean z9 = this.h;
        tL_businessBotRecipients.exclude_selected = z9;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z9 ? arrayList : this.j;
        if (!arrayList2.isEmpty()) {
            qp s12 = qp.s1(p10.s0);
            tL_businessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                Long l10 = (Long) arrayList2.get(i7);
                l10.longValue();
                s12.q1(s12.a2(l10));
                tL_businessBotRecipients.users.add((Long) arrayList2.get(i7));
            }
        }
        if (!this.h) {
            qp s13 = qp.s1(p10.s0);
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
        boolean z9 = this.h;
        tL_inputBusinessRecipients.exclude_selected = z9;
        ArrayList arrayList = z9 ? this.k : this.j;
        if (!arrayList.isEmpty()) {
            qp s12 = qp.s1(p10.s0);
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
        boolean z9 = this.h;
        tL_businessRecipients.exclude_selected = z9;
        ArrayList arrayList = z9 ? this.k : this.j;
        if (!arrayList.isEmpty()) {
            qp s12 = qp.s1(p10.s0);
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
        boolean z9 = this.h;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z9 ? arrayList : this.j;
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

    public final boolean h(x31 x31Var) {
        int i7 = x31Var.d;
        int i10 = 2;
        f2 f2Var = this.d;
        boolean z9 = false;
        if (i7 == 101 || i7 == 103) {
            boolean z10 = i7 == 101;
            UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), z10 ? this.j : this.k, z10);
            usersSelectActivity.y = 2;
            usersSelectActivity.G = false;
            boolean z11 = this.i;
            usersSelectActivity.F = (!z11 || this.h || z10) ? false : true;
            usersSelectActivity.G = false;
            usersSelectActivity.H = z11;
            if (!z10 && this.n) {
                z9 = true;
            }
            usersSelectActivity.I = z9;
            usersSelectActivity.n = new ab.y(i10, this, z10);
            if (f2Var != null) {
                f2Var.presentFragment(usersSelectActivity);
                return true;
            }
            f2 T = LaunchActivity.T();
            if (T == null) {
                return true;
            }
            d2 d2Var = new d2();
            d2Var.a = true;
            T.showAsSheet(usersSelectActivity, d2Var);
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
        if (x31Var.a != 11) {
            return false;
        }
        boolean z12 = x31Var.w;
        String B1 = qp.s1(this.b).B1(x31Var.x, false);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, this.c);
        String M0 = id.M0(!z12 ? 2131752686 : 2131752684, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = id.a0(null, null, !z12 ? 2131752687 : 2131752685, B1);
        alertDialog$Builder.k(id.M0(2131746322, null), new ab.j(this, z12, x31Var, i10));
        alertDialog$Builder.h(id.M0(2131752589, null), null);
        if (f2Var != null) {
            f2Var.showDialog(u1Var);
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
        boolean z9 = tL_businessBotRecipients.exclude_selected;
        this.h = z9;
        if (z9) {
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
        boolean z9 = tL_businessBotRecipients2.exclude_selected;
        this.h = z9;
        if (z9) {
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

    public final boolean k(q41 q41Var) {
        if (this.h || !this.j.isEmpty() || this.f != 0) {
            return true;
        }
        p2.D.a();
        View B1 = q41Var.B1(101);
        int i7 = -this.m;
        this.m = i7;
        org.telegram.messenger.g0.G3(i7, B1, null);
        q41Var.y0(q41Var.A1(101));
        return false;
    }

    public a0(Context context, int i7, h9 h9Var, f6 f6Var) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = context;
        this.b = i7;
        this.d = null;
        this.e = h9Var;
        this.c = f6Var;
    }
}
