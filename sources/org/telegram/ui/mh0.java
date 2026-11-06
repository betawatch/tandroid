package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class mh0 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public lh0 f;
    public final jg.z1 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public mh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.a = new wr(this, 25);
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final Object E(int i7) {
        if (i7 >= 0 && i7 < this.d.size()) {
            return this.d.get(i7);
        }
        int g10 = jg.g.g(1, i7, this.d);
        jg.z1 z1Var = this.h;
        ArrayList arrayList = z1Var.e;
        if (g10 < 0 || g10 >= arrayList.size()) {
            return null;
        }
        return z1Var.e.get(g10);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        if (str != null) {
            org.telegram.messenger.p5 p5Var = Utilities.g;
            lh0 lh0Var = new lh0(this, str, 0);
            this.f = lh0Var;
            p5Var.d(lh0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        jg.z1 z1Var = this.h;
        int i7 = this.n.s;
        z1Var.g(null, true, (i7 == 1 || i7 == 3) ? false : true, true, false, 0L, false, 0, 0);
        f();
    }

    @Override // v4.g0
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return i7 == this.d.size() ? 1 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.M0(2131754376, "AddToExceptions"));
            return;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        if (i7 < this.d.size()) {
            paVar.f((oh0) this.d.get(i7), (CharSequence) this.e.get(i7), i7 != this.d.size() - 1);
            paVar.setAddButtonVisible(false);
        } else {
            int g10 = jg.g.g(1, i7, this.d);
            ArrayList arrayList = this.h.e;
            paVar.d((TLObject) arrayList.get(g10), null, org.telegram.messenger.hd.M0(2131747891, "NotificationsOn"), g10 != arrayList.size() - 1);
            paVar.setAddButtonVisible(true);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View paVar;
        if (i7 != 0) {
            paVar = new org.telegram.ui.Cells.x3(this.c, null);
            paVar.setBackgroundColor(0);
            paVar.setTag(-33024);
        } else {
            paVar = new org.telegram.ui.Cells.pa(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.xi0(paVar);
    }
}
