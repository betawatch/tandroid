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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class kk0 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public jk0 f;
    public final gg.c2 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public kk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.a = new du(this, 25);
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
        gg.c2 c2Var = this.h;
        ArrayList arrayList = c2Var.e;
        if (f7 < 0 || f7 >= arrayList.size()) {
            return null;
        }
        return c2Var.e.get(f7);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            jk0 jk0Var = new jk0(this, str, 0);
            this.f = jk0Var;
            dispatchQueue.postRunnable(jk0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        gg.c2 c2Var = this.h;
        int i10 = this.n.s;
        c2Var.g(null, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
        if (i10 < this.d.size()) {
            zaVar.g((nk0) this.d.get(i10), (CharSequence) this.e.get(i10), i10 != this.d.size() - 1);
            zaVar.setAddButtonVisible(false);
        } else {
            int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
            ArrayList arrayList = this.h.e;
            zaVar.d((TLObject) arrayList.get(f7), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), f7 != arrayList.size() - 1);
            zaVar.setAddButtonVisible(true);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View zaVar;
        if (i10 != 0) {
            zaVar = new org.telegram.ui.Cells.v3(this.c, null);
            zaVar.setBackgroundColor(0);
            zaVar.setTag(-33024);
        } else {
            zaVar = new org.telegram.ui.Cells.za(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.gl0(zaVar);
    }
}
