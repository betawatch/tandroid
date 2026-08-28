package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yj extends vk0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f;
    public final /* synthetic */ fk h;

    public yj(fk fkVar, Context context) {
        this.h = fkVar;
        this.f = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 1;
    }

    public final zj E(int i9) {
        int g10;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (i9 < size) {
            return (zj) arrayList.get(i9);
        }
        if (!this.d.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.isEmpty() || i9 == size || i9 == size + 1 || (g10 = j3.r0.g(2, i9, arrayList)) >= arrayList2.size()) {
            return null;
        }
        return (zj) arrayList2.get(g10);
    }

    @Override // f2.r0
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

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == h() - 1) {
            return 3;
        }
        int size = this.c.size();
        if (i9 == size) {
            return 2;
        }
        return i9 == size + 1 ? 0 : 1;
    }

    @Override // f2.r0
    public final void l() {
        super.l();
        this.h.S();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        fk fkVar = this.h;
        if (i10 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (fkVar.V) {
                m4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
                return;
            } else {
                m4Var.setText(LocaleController.getString(R.string.RecentFiles));
                return;
            }
        }
        if (i10 != 1) {
            return;
        }
        zj E = E(i9);
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
        int i11 = E.a;
        if (i11 != 0) {
            i7Var.d(i9 != this.c.size() - 1, E.b, i11, E.c, null, null);
        } else {
            i7Var.d(false, E.b, 0, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e);
        }
        File file = E.f;
        if (file != null) {
            i7Var.b(fkVar.N.containsKey(file.toString()), !fkVar.Q);
        } else {
            i7Var.b(false, !fkVar.Q);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View m4Var;
        View view;
        org.telegram.ui.ActionBar.b6 b6Var = this.h.a;
        Context context = this.f;
        if (i9 == 0) {
            m4Var = new org.telegram.ui.Cells.m4(context, b6Var);
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                }
                return new ik0(view);
            }
            m4Var = new org.telegram.ui.Cells.i7(context, 1, b6Var);
        }
        view = m4Var;
        return new ik0(view);
    }
}
