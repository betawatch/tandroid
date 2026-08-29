package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bk extends il0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f;
    public final /* synthetic */ jk h;

    public bk(jk jkVar, Context context) {
        this.h = jkVar;
        this.f = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 1;
    }

    public final ck E(int i10) {
        int e10;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (i10 < size) {
            return (ck) arrayList.get(i10);
        }
        if (!this.d.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.isEmpty() || i10 == size || i10 == size + 1 || (e10 = org.telegram.ui.th.e(2, i10, arrayList)) >= arrayList2.size()) {
            return null;
        }
        return (ck) arrayList2.get(e10);
    }

    @Override // f2.p0
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

    @Override // f2.p0
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

    @Override // f2.p0
    public final void l() {
        super.l();
        this.h.T();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f;
        View view = n1Var.a;
        jk jkVar = this.h;
        if (i11 == 0) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (jkVar.V) {
                k4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
                return;
            } else {
                k4Var.setText(LocaleController.getString(R.string.RecentFiles));
                return;
            }
        }
        if (i11 != 1) {
            return;
        }
        ck E = E(i10);
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
        int i12 = E.a;
        if (i12 != 0) {
            g7Var.d(i10 != this.c.size() - 1, E.b, i12, E.c, null, null);
        } else {
            g7Var.d(false, E.b, 0, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e);
        }
        File file = E.f;
        if (file != null) {
            g7Var.b(jkVar.N.containsKey(file.toString()), !jkVar.Q);
        } else {
            g7Var.b(false, !jkVar.Q);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View k4Var;
        View view;
        org.telegram.ui.ActionBar.c6 c6Var = this.h.a;
        Context context = this.f;
        if (i10 == 0) {
            k4Var = new org.telegram.ui.Cells.k4(context, c6Var);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.b) null);
                }
                return new vk0(view);
            }
            k4Var = new org.telegram.ui.Cells.g7(context, 1, c6Var);
        }
        view = k4Var;
        return new vk0(view);
    }
}
