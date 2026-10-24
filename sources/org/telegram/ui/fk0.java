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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class fk0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ek0 f;
    public final hg.a2 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public fk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.h = a2Var;
        a2Var.a = new xt(this, 24);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, this.d);
        hg.a2 a2Var = this.h;
        ArrayList arrayList = a2Var.e;
        if (g10 < 0 || g10 >= arrayList.size()) {
            return null;
        }
        return a2Var.e.get(g10);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ek0 ek0Var = new ek0(this, str, 0);
            this.f = ek0Var;
            dispatchQueue.postRunnable(ek0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        hg.a2 a2Var = this.h;
        int i10 = this.n.s;
        a2Var.g(null, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
        l();
    }

    @Override // s4.g0
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
        if (i10 < this.d.size()) {
            waVar.f((ik0) this.d.get(i10), (CharSequence) this.e.get(i10), i10 != this.d.size() - 1);
            waVar.setAddButtonVisible(false);
        } else {
            int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, this.d);
            ArrayList arrayList = this.h.e;
            waVar.d((TLObject) arrayList.get(g10), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), g10 != arrayList.size() - 1);
            waVar.setAddButtonVisible(true);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View waVar;
        if (i10 != 0) {
            waVar = new org.telegram.ui.Cells.u3(this.c, null);
            waVar.setBackgroundColor(0);
            waVar.setTag(-33024);
        } else {
            waVar = new org.telegram.ui.Cells.wa(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.wl0(waVar);
    }
}
