package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bk extends rl0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f;
    public final /* synthetic */ jk h;

    public bk(jk jkVar, Context context) {
        this.h = jkVar;
        this.f = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 1;
    }

    public final ck E(int i10) {
        int e6;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (i10 < size) {
            return (ck) arrayList.get(i10);
        }
        if (!this.d.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.isEmpty() || i10 == size || i10 == size + 1 || (e6 = org.telegram.ui.yh.e(2, i10, arrayList)) >= arrayList2.size()) {
            return null;
        }
        return (ck) arrayList2.get(e6);
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
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f;
        View view = m1Var.a;
        jk jkVar = this.h;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (jkVar.W) {
                m4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
                return;
            } else {
                m4Var.setText(LocaleController.getString(R.string.RecentFiles));
                return;
            }
        }
        if (i11 != 1) {
            return;
        }
        ck E = E(i10);
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
        int i12 = E.a;
        if (i12 != 0) {
            i7Var.d(E.b, E.c, null, null, i12, i10 != this.c.size() - 1);
        } else {
            i7Var.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
        }
        File file = E.f;
        if (file != null) {
            i7Var.b(jkVar.O.containsKey(file.toString()), !jkVar.R);
        } else {
            i7Var.b(false, !jkVar.R);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        org.telegram.ui.ActionBar.g6 g6Var = this.h.a;
        Context context = this.f;
        if (i10 == 0) {
            m4Var = new org.telegram.ui.Cells.m4(context, g6Var);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.b) null);
                }
                return new el0(view);
            }
            m4Var = new org.telegram.ui.Cells.i7(context, 1, g6Var);
        }
        view = m4Var;
        return new el0(view);
    }
}
