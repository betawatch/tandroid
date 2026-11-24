// default package

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class m41 {
    public final Context a;
    public final int b;
    public final wjb c;
    public final d d;
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

    public m41(d dVar, Runnable runnable) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = dVar.getContext();
        this.b = dVar.getCurrentAccount();
        this.d = dVar;
        this.e = runnable;
        this.c = dVar.getResourceProvider();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
    
        if (r5 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c6, code lost:
    
        if (r5 != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ArrayList arrayList, l5c l5cVar, boolean z) {
        String str;
        l5cVar.V();
        int d = d();
        str = "";
        if (!this.h) {
            String M0 = (d & 1) != 0 ? k96.M0(2131750764, null) : "";
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(M0)) {
                    M0 = M0.concat(", ");
                }
                M0 = M0.concat(k96.M0(2131750715, null));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(M0)) {
                    M0 = M0.concat(", ");
                }
                M0 = M0.concat(k96.M0(2131750779, null));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(M0)) {
                    M0 = M0.concat(", ");
                }
                M0 = M0.concat(k96.M0(2131750706, null));
            }
            ArrayList arrayList2 = this.j;
            if (!arrayList2.isEmpty()) {
                if (TextUtils.isEmpty(M0)) {
                    M0 = M0.concat(k96.H(',', "Chats", arrayList2.size()));
                } else {
                    StringBuilder k = b00.k(M0, " + ");
                    k.append(arrayList2.size());
                    M0 = k.toString();
                }
            }
            if (TextUtils.isEmpty(M0)) {
                M0 = k96.M0(2131752765, null);
            }
            c4c f = c4c.f(k96.M0(2131752766, null), M0, 101);
            f.g = z;
            arrayList.add(f);
        }
        boolean z2 = this.i;
        boolean z3 = this.h;
        if (!z2) {
        }
        str = (d & 1) != 0 ? k96.M0(2131750764, null) : "";
        if ((d & 2) != 0) {
            if (!TextUtils.isEmpty(str)) {
                str = str.concat(", ");
            }
            str = str.concat(k96.M0(2131750715, null));
        }
        if ((d & 4) != 0) {
            if (!TextUtils.isEmpty(str)) {
                str = str.concat(", ");
            }
            str = str.concat(k96.M0(2131750779, null));
        }
        if ((d & 8) != 0) {
            if (!TextUtils.isEmpty(str)) {
                str = str.concat(", ");
            }
            str = str.concat(k96.M0(2131750706, null));
        }
        ArrayList arrayList3 = this.k;
        if (!arrayList3.isEmpty()) {
            if (TextUtils.isEmpty(str)) {
                str = str.concat(k96.H(',', "Chats", arrayList3.size()));
            } else {
                StringBuilder k2 = b00.k(str, " + ");
                k2.append(arrayList3.size());
                str = k2.toString();
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = k96.M0(2131752767, null);
        }
        c4c f2 = c4c.f(k96.M0(2131752768, null), str, kk7.n1);
        f2.g = z;
        arrayList.add(f2);
        l5cVar.U();
    }

    public final TL_account.TL_inputBusinessBotRecipients b() {
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int d = d();
        tL_inputBusinessBotRecipients.flags = d & (-49);
        tL_inputBusinessBotRecipients.existing_chats = (d & 1) != 0;
        tL_inputBusinessBotRecipients.new_chats = (d & 2) != 0;
        tL_inputBusinessBotRecipients.contacts = (d & 4) != 0;
        tL_inputBusinessBotRecipients.non_contacts = (d & 8) != 0;
        boolean z = this.h;
        tL_inputBusinessBotRecipients.exclude_selected = z;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z ? arrayList : this.j;
        if (!arrayList2.isEmpty()) {
            na7 q1 = na7.q1(y6c.t0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i = 0; i < arrayList2.size(); i++) {
                Long l = (Long) arrayList2.get(i);
                l.getClass();
                tL_inputBusinessBotRecipients.users.add(q1.o1(q1.V1(l)));
            }
        }
        if (!this.h) {
            na7 q12 = na7.q1(y6c.t0);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Long l2 = (Long) arrayList.get(i2);
                l2.getClass();
                tL_inputBusinessBotRecipients.exclude_users.add(q12.o1(q12.V1(l2)));
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
        boolean z = this.h;
        tL_businessBotRecipients.exclude_selected = z;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z ? arrayList : this.j;
        if (!arrayList2.isEmpty()) {
            na7 q1 = na7.q1(y6c.t0);
            tL_businessBotRecipients.flags |= 16;
            for (int i = 0; i < arrayList2.size(); i++) {
                Long l = (Long) arrayList2.get(i);
                l.getClass();
                q1.o1(q1.V1(l));
                tL_businessBotRecipients.users.add((Long) arrayList2.get(i));
            }
        }
        if (!this.h) {
            na7 q12 = na7.q1(y6c.t0);
            tL_businessBotRecipients.flags |= 64;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Long l2 = (Long) arrayList.get(i2);
                l2.getClass();
                q12.o1(q12.V1(l2));
                tL_businessBotRecipients.users.add((Long) arrayList.get(i2));
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
        boolean z = this.h;
        tL_inputBusinessRecipients.exclude_selected = z;
        ArrayList arrayList = z ? this.k : this.j;
        if (!arrayList.isEmpty()) {
            na7 q1 = na7.q1(y6c.t0);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = (Long) arrayList.get(i);
                l.getClass();
                tL_inputBusinessRecipients.users.add(q1.o1(q1.V1(l)));
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
        boolean z = this.h;
        tL_businessRecipients.exclude_selected = z;
        ArrayList arrayList = z ? this.k : this.j;
        if (!arrayList.isEmpty()) {
            na7 q1 = na7.q1(y6c.t0);
            tL_businessRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = (Long) arrayList.get(i);
                l.getClass();
                q1.o1(q1.V1(l));
                tL_businessRecipients.users.add((Long) arrayList.get(i));
            }
        }
        return tL_businessRecipients;
    }

    public final boolean g() {
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.l;
        if (tL_businessBotRecipients == null || tL_businessBotRecipients.exclude_selected != this.h || (tL_businessBotRecipients.flags & (-49)) != d()) {
            return true;
        }
        boolean z = this.h;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = z ? arrayList : this.j;
        if (arrayList2.size() != this.l.users.size()) {
            return true;
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if (!this.l.users.contains(arrayList2.get(i))) {
                return true;
            }
        }
        if (this.i && !this.h) {
            if (arrayList.size() != this.l.exclude_users.size()) {
                return true;
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (!this.l.exclude_users.contains(arrayList.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean h(c4c c4cVar) {
        boolean z;
        int i = c4cVar.d;
        d dVar = this.d;
        byte b = 0;
        byte b2 = 1;
        if (i == 101) {
            z = true;
        } else {
            if (i != 103) {
                Runnable runnable = this.e;
                if (i == 102) {
                    runnable.run();
                    return true;
                }
                if (i == 104) {
                    runnable.run();
                    return true;
                }
                if (c4cVar.a != 11) {
                    return false;
                }
                boolean z2 = c4cVar.x;
                String y1 = na7.q1(this.b).y1(c4cVar.y, false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.c, this.a);
                String M0 = k96.M0(!z2 ? 2131752674 : 2131752672, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.a0(null, null, !z2 ? 2131752675 : 2131752673, y1);
                alertDialog$Builder.j(k96.M0(2131746128, null), new ch(this, z2, c4cVar, b2));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                if (dVar != null) {
                    dVar.showDialog(hdVar);
                    return true;
                }
                hdVar.show();
                return true;
            }
            z = false;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), z ? this.j : this.k, z);
        usersSelectActivity.y = (byte) 2;
        usersSelectActivity.H = false;
        boolean z3 = this.i;
        usersSelectActivity.G = (!z3 || this.h || z) ? false : true;
        usersSelectActivity.H = false;
        usersSelectActivity.I = z3;
        usersSelectActivity.J = !z && this.n;
        usersSelectActivity.n = new l41(b, this, z);
        if (dVar != null) {
            dVar.presentFragment(usersSelectActivity);
            return true;
        }
        d S = LaunchActivity.S();
        if (S == null) {
            return true;
        }
        ag0 ag0Var = new ag0();
        ag0Var.a = true;
        S.showAsSheet(usersSelectActivity, ag0Var);
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
        boolean z = tL_businessBotRecipients.exclude_selected;
        this.h = z;
        if (z) {
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
        TL_account.TL_businessBotRecipients tL_businessBotRecipients;
        this.i = false;
        if (tL_businessRecipients != null) {
            tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            tL_businessBotRecipients = null;
            this.l = null;
        }
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
        boolean z = tL_businessBotRecipients.exclude_selected;
        this.h = z;
        if (z) {
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

    public final boolean k(q5c q5cVar) {
        if (this.h || !this.j.isEmpty() || this.f != 0) {
            return true;
        }
        pw0.E.a();
        View B1 = q5cVar.B1(101);
        int i = -this.m;
        this.m = i;
        gl.A3(i, B1, null);
        q5cVar.z0(q5cVar.A1(101));
        return false;
    }

    public m41(Activity activity, int i, hq1 hq1Var, wjb wjbVar) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = activity;
        this.b = i;
        this.d = null;
        this.e = hq1Var;
        this.c = wjbVar;
    }
}
