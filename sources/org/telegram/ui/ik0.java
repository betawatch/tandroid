package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ik0 extends org.telegram.ui.Components.sl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public hk0 f;
    public final uf.k1 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        uf.k1 k1Var = new uf.k1(true);
        this.h = k1Var;
        k1Var.a = new gu(this, 25);
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int e6 = yh.e(1, i10, this.d);
        uf.k1 k1Var = this.h;
        ArrayList arrayList = k1Var.e;
        if (e6 < 0 || e6 >= arrayList.size()) {
            return null;
        }
        return k1Var.e.get(e6);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            hk0 hk0Var = new hk0(this, str, 0);
            this.f = hk0Var;
            dispatchQueue.postRunnable(hk0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        uf.k1 k1Var = this.h;
        int i10 = this.n.s;
        k1Var.g(null, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
        l();
    }

    @Override // f2.p0
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
        if (i10 < this.d.size()) {
            vaVar.g((lk0) this.d.get(i10), (CharSequence) this.e.get(i10), i10 != this.d.size() - 1);
            vaVar.setAddButtonVisible(false);
        } else {
            int e6 = yh.e(1, i10, this.d);
            ArrayList arrayList = this.h.e;
            vaVar.d((TLObject) arrayList.get(e6), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), e6 != arrayList.size() - 1);
            vaVar.setAddButtonVisible(true);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View vaVar;
        if (i10 != 0) {
            vaVar = new org.telegram.ui.Cells.u3(this.c, null);
            vaVar.setBackgroundColor(0);
            vaVar.setTag(-33024);
        } else {
            vaVar = new org.telegram.ui.Cells.va(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.fl0(vaVar);
    }
}
