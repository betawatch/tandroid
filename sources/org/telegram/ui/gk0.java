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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gk0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public fk0 f;
    public final tf.k1 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public gk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        tf.k1 k1Var = new tf.k1(true);
        this.h = k1Var;
        k1Var.a = new fu(this, 25);
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int f10 = yh.f(1, i10, this.d);
        tf.k1 k1Var = this.h;
        ArrayList arrayList = k1Var.e;
        if (f10 < 0 || f10 >= arrayList.size()) {
            return null;
        }
        return k1Var.e.get(f10);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            fk0 fk0Var = new fk0(this, str, 0);
            this.f = fk0Var;
            dispatchQueue.postRunnable(fk0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        tf.k1 k1Var = this.h;
        int i10 = this.n.s;
        k1Var.g(null, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
        l();
    }

    @Override // f2.o0
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
        if (i10 < this.d.size()) {
            vaVar.g((jk0) this.d.get(i10), (CharSequence) this.e.get(i10), i10 != this.d.size() - 1);
            vaVar.setAddButtonVisible(false);
        } else {
            int f10 = yh.f(1, i10, this.d);
            ArrayList arrayList = this.h.e;
            vaVar.d((TLObject) arrayList.get(f10), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), f10 != arrayList.size() - 1);
            vaVar.setAddButtonVisible(true);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View vaVar;
        if (i10 != 0) {
            vaVar = new org.telegram.ui.Cells.u3(this.c, null);
            vaVar.setBackgroundColor(0);
            vaVar.setTag(-33024);
        } else {
            vaVar = new org.telegram.ui.Cells.va(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.el0(vaVar);
    }
}
