package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gk extends lm0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f;
    public final /* synthetic */ nk h;

    public gk(nk nkVar, Context context) {
        this.h = nkVar;
        this.f = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 1;
    }

    public final hk E(int i10) {
        int f7;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (i10 < size) {
            return (hk) arrayList.get(i10);
        }
        if (!this.d.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.isEmpty() || i10 == size || i10 == size + 1 || (f7 = ic.a.f(2, i10, arrayList)) >= arrayList2.size()) {
            return null;
        }
        return (hk) arrayList2.get(f7);
    }

    @Override // s4.h0
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

    @Override // s4.h0
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

    @Override // s4.h0
    public final void l() {
        super.l();
        this.h.W();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        nk nkVar = this.h;
        if (i11 == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            if (nkVar.c0) {
                q4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
                return;
            } else {
                q4Var.setText(LocaleController.getString(R.string.RecentFiles));
                return;
            }
        }
        if (i11 != 1) {
            return;
        }
        hk E = E(i10);
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        int i12 = E.a;
        if (i12 != 0) {
            o7Var.d(E.b, E.c, null, null, i12, i10 != this.c.size() - 1);
        } else {
            o7Var.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
        }
        File file = E.f;
        if (file != null) {
            o7Var.b(nkVar.R.containsKey(file.toString()), !nkVar.U);
        } else {
            o7Var.b(false, !nkVar.U);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View q4Var;
        View view;
        org.telegram.ui.ActionBar.u6 u6Var = this.h.a;
        Context context = this.f;
        if (i10 == 0) {
            q4Var = new org.telegram.ui.Cells.q4(context, u6Var);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.f7(context, (org.telegram.ui.d3) null);
                }
                return new vl0(view);
            }
            q4Var = new org.telegram.ui.Cells.o7(context, 1, u6Var);
        }
        view = q4Var;
        return new vl0(view);
    }
}
