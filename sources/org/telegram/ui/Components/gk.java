package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class gk extends im0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f;
    public final /* synthetic */ nk h;

    public gk(nk nkVar, Context context) {
        this.h = nkVar;
        this.f = context;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 1;
    }

    public final hk E(int i10) {
        int g10;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (i10 < size) {
            return (hk) arrayList.get(i10);
        }
        if (!this.d.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.isEmpty() || i10 == size || i10 == size + 1 || (g10 = com.google.android.gms.internal.play_billing.k3.g(2, i10, arrayList)) >= arrayList2.size()) {
            return null;
        }
        return (hk) arrayList2.get(g10);
    }

    @Override // s4.g0
    public final int h() {
        int size = this.c.size();
        if (this.d.isEmpty()) {
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                size += arrayList.size() + 2;
            }
        }
        return size + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 3;
        }
        int size = this.c.size();
        if (i10 == size) {
            return 2;
        }
        return i10 == size + 1 ? 0 : 1;
    }

    @Override // s4.g0
    public final void l() {
        super.l();
        this.h.W();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        nk nkVar = this.h;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (nkVar.c0) {
                l4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
                return;
            } else {
                l4Var.setText(LocaleController.getString(R.string.RecentFiles));
                return;
            }
        }
        if (i11 != 1) {
            return;
        }
        hk E = E(i10);
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
        int i12 = E.a;
        if (i12 != 0) {
            i7Var.d(E.b, E.c, null, null, i12, i10 != this.c.size() - 1);
        } else {
            i7Var.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
        }
        File file = E.f;
        if (file != null) {
            i7Var.b(nkVar.R.containsKey(file.toString()), !nkVar.U);
        } else {
            i7Var.b(false, !nkVar.U);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var = this.h.a;
        Context context = this.f;
        if (i10 == 0) {
            l4Var = new org.telegram.ui.Cells.l4(context, d6Var);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                }
                return new tl0(view);
            }
            l4Var = new org.telegram.ui.Cells.i7(context, 1, d6Var);
        }
        view = l4Var;
        return new tl0(view);
    }
}
