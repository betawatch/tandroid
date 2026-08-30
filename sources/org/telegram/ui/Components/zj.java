package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zj extends rl0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f;
    public final /* synthetic */ hk h;

    public zj(hk hkVar, Context context) {
        this.h = hkVar;
        this.f = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 1;
    }

    public final ak E(int i10) {
        int f10;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (i10 < size) {
            return (ak) arrayList.get(i10);
        }
        if (!this.d.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.isEmpty() || i10 == size || i10 == size + 1 || (f10 = org.telegram.ui.yh.f(2, i10, arrayList)) >= arrayList2.size()) {
            return null;
        }
        return (ak) arrayList2.get(f10);
    }

    @Override // f2.o0
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

    @Override // f2.o0
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

    @Override // f2.o0
    public final void l() {
        super.l();
        this.h.T();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        hk hkVar = this.h;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (hkVar.W) {
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
        ak E = E(i10);
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
        int i12 = E.a;
        if (i12 != 0) {
            i7Var.d(i10 != this.c.size() - 1, E.b, i12, E.c, null, null);
        } else {
            i7Var.d(false, E.b, 0, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e);
        }
        File file = E.f;
        if (file != null) {
            i7Var.b(hkVar.O.containsKey(file.toString()), !hkVar.R);
        } else {
            i7Var.b(false, !hkVar.R);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var = this.h.a;
        Context context = this.f;
        if (i10 == 0) {
            m4Var = new org.telegram.ui.Cells.m4(context, f6Var);
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
            m4Var = new org.telegram.ui.Cells.i7(context, 1, f6Var);
        }
        view = m4Var;
        return new el0(view);
    }
}
