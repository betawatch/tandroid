package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jh0 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public hh0 f;
    public final kg.v1 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public jh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        kg.v1 v1Var = new kg.v1(true);
        this.h = v1Var;
        v1Var.a = new ur(this, 26);
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final Object E(int i3) {
        if (i3 >= 0 && i3 < this.d.size()) {
            return this.d.get(i3);
        }
        int f10 = k2.p1.f(1, i3, this.d);
        kg.v1 v1Var = this.h;
        ArrayList arrayList = v1Var.e;
        if (f10 < 0 || f10 >= arrayList.size()) {
            return null;
        }
        return v1Var.e.get(f10);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        if (str != null) {
            org.telegram.messenger.p5 p5Var = Utilities.g;
            hh0 hh0Var = new hh0(this, str, 0);
            this.f = hh0Var;
            p5Var.e(hh0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        kg.v1 v1Var = this.h;
        int i3 = this.n.s;
        v1Var.g(null, true, (i3 == 1 || i3 == 3) ? false : true, true, false, 0L, false, 0, 0);
        f();
    }

    @Override // u4.h0
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return i3 == this.d.size() ? 1 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.M0(2131754376, "AddToExceptions"));
            return;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        if (i3 < this.d.size()) {
            paVar.f((lh0) this.d.get(i3), (CharSequence) this.e.get(i3), i3 != this.d.size() - 1);
            paVar.setAddButtonVisible(false);
        } else {
            int f10 = k2.p1.f(1, i3, this.d);
            ArrayList arrayList = this.h.e;
            paVar.d((TLObject) arrayList.get(f10), null, org.telegram.messenger.bd.M0(2131747900, "NotificationsOn"), f10 != arrayList.size() - 1);
            paVar.setAddButtonVisible(true);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View paVar;
        if (i3 != 0) {
            paVar = new org.telegram.ui.Cells.x3(this.c, null);
            paVar.setBackgroundColor(0);
            paVar.setTag(-33024);
        } else {
            paVar = new org.telegram.ui.Cells.pa(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.bj0(paVar);
    }
}
