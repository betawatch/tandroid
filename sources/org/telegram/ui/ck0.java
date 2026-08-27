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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ck0 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public bk0 f;
    public final pf.j1 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public ck0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        pf.j1 j1Var = new pf.j1(true);
        this.h = j1Var;
        j1Var.a = new zt(this, 25);
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int e9 = org.telegram.ui.Cells.pa.e(1, i10, this.d);
        pf.j1 j1Var = this.h;
        ArrayList arrayList = j1Var.e;
        if (e9 < 0 || e9 >= arrayList.size()) {
            return null;
        }
        return j1Var.e.get(e9);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            bk0 bk0Var = new bk0(this, str, 0);
            this.f = bk0Var;
            dispatchQueue.postRunnable(bk0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        pf.j1 j1Var = this.h;
        int i10 = this.n.s;
        j1Var.g(null, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
        l();
    }

    @Override // f2.q0
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // f2.q0
    public final int j(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
        if (i10 < this.d.size()) {
            saVar.g((fk0) this.d.get(i10), (CharSequence) this.e.get(i10), i10 != this.d.size() - 1);
            saVar.setAddButtonVisible(false);
        } else {
            int e9 = org.telegram.ui.Cells.pa.e(1, i10, this.d);
            ArrayList arrayList = this.h.e;
            saVar.e((TLObject) arrayList.get(e9), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), e9 != arrayList.size() - 1);
            saVar.setAddButtonVisible(true);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View saVar;
        if (i10 != 0) {
            saVar = new org.telegram.ui.Cells.s3(this.c, null);
            saVar.setBackgroundColor(0);
            saVar.setTag(-33024);
        } else {
            saVar = new org.telegram.ui.Cells.sa(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.lk0(saVar);
    }
}
