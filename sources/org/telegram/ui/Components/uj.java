package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class uj extends yk0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f;
    public final /* synthetic */ bk h;

    public uj(bk bkVar, Context context) {
        this.h = bkVar;
        this.f = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 1;
    }

    public final vj E(int i10) {
        int e9;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (i10 < size) {
            return (vj) arrayList.get(i10);
        }
        if (!this.d.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.isEmpty() || i10 == size || i10 == size + 1 || (e9 = org.telegram.ui.Cells.pa.e(2, i10, arrayList)) >= arrayList2.size()) {
            return null;
        }
        return (vj) arrayList2.get(e9);
    }

    @Override // f2.q0
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

    @Override // f2.q0
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

    @Override // f2.q0
    public final void l() {
        super.l();
        this.h.T();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f;
        View view = o1Var.a;
        bk bkVar = this.h;
        if (i11 == 0) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (bkVar.V) {
                j4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
                return;
            } else {
                j4Var.setText(LocaleController.getString(R.string.RecentFiles));
                return;
            }
        }
        if (i11 != 1) {
            return;
        }
        vj E = E(i10);
        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
        int i12 = E.a;
        if (i12 != 0) {
            f7Var.d(i10 != this.c.size() - 1, E.b, i12, E.c, null, null);
        } else {
            f7Var.d(false, E.b, 0, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e);
        }
        File file = E.f;
        if (file != null) {
            f7Var.b(bkVar.N.containsKey(file.toString()), !bkVar.Q);
        } else {
            f7Var.b(false, !bkVar.Q);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j4Var;
        View view;
        org.telegram.ui.ActionBar.c6 c6Var = this.h.a;
        Context context = this.f;
        if (i10 == 0) {
            j4Var = new org.telegram.ui.Cells.j4(context, c6Var);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                }
                return new lk0(view);
            }
            j4Var = new org.telegram.ui.Cells.f7(context, 1, c6Var);
        }
        view = j4Var;
        return new lk0(view);
    }
}
