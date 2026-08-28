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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bk0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ak0 f;
    public final of.v1 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public bk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        of.v1 v1Var = new of.v1(true);
        this.h = v1Var;
        v1Var.a = new wt(this, 25);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final Object E(int i9) {
        if (i9 >= 0 && i9 < this.d.size()) {
            return this.d.get(i9);
        }
        int g10 = j3.r0.g(1, i9, this.d);
        of.v1 v1Var = this.h;
        ArrayList arrayList = v1Var.e;
        if (g10 < 0 || g10 >= arrayList.size()) {
            return null;
        }
        return v1Var.e.get(g10);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ak0 ak0Var = new ak0(this, str, 0);
            this.f = ak0Var;
            dispatchQueue.postRunnable(ak0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        of.v1 v1Var = this.h;
        int i9 = this.n.s;
        v1Var.g(null, true, (i9 == 1 || i9 == 3) ? false : true, true, false, 0L, false, 0, 0);
        l();
    }

    @Override // f2.r0
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return i9 == this.d.size() ? 1 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
        if (i9 < this.d.size()) {
            vaVar.g((ek0) this.d.get(i9), (CharSequence) this.e.get(i9), i9 != this.d.size() - 1);
            vaVar.setAddButtonVisible(false);
        } else {
            int g10 = j3.r0.g(1, i9, this.d);
            ArrayList arrayList = this.h.e;
            vaVar.e((TLObject) arrayList.get(g10), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), g10 != arrayList.size() - 1);
            vaVar.setAddButtonVisible(true);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View vaVar;
        if (i9 != 0) {
            vaVar = new org.telegram.ui.Cells.v3(this.c, null);
            vaVar.setBackgroundColor(0);
            vaVar.setTag(-33024);
        } else {
            vaVar = new org.telegram.ui.Cells.va(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.ik0(vaVar);
    }
}
