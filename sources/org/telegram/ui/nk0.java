package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nk0 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public mk0 f;
    public final ig.a2 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public nk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        ig.a2 a2Var = new ig.a2(true);
        this.h = a2Var;
        a2Var.a = new st(this, 26);
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int f7 = ic.a.f(1, i10, this.d);
        ig.a2 a2Var = this.h;
        ArrayList arrayList = a2Var.e;
        if (f7 < 0 || f7 >= arrayList.size()) {
            return null;
        }
        return a2Var.e.get(f7);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (str != null) {
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            mk0 mk0Var = new mk0(this, str, 0);
            this.f = mk0Var;
            dispatchQueue2.postRunnable(mk0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        ig.a2 a2Var = this.h;
        int i10 = this.n.s;
        a2Var.g(null, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
        l();
    }

    @Override // s4.h0
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
        if (i10 < this.d.size()) {
            abVar.f((qk0) this.d.get(i10), (CharSequence) this.e.get(i10), i10 != this.d.size() - 1);
            abVar.setAddButtonVisible(false);
        } else {
            int f7 = ic.a.f(1, i10, this.d);
            ArrayList arrayList = this.h.e;
            abVar.d((TLObject) arrayList.get(f7), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), f7 != arrayList.size() - 1);
            abVar.setAddButtonVisible(true);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View abVar;
        if (i10 != 0) {
            abVar = new org.telegram.ui.Cells.z3(this.c, null);
            abVar.setBackgroundColor(0);
            abVar.setTag(-33024);
        } else {
            abVar = new org.telegram.ui.Cells.ab(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.wl0(abVar);
    }
}
