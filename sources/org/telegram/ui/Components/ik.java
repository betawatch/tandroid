package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ik extends ll0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f;
    public final /* synthetic */ pk h;

    public ik(pk pkVar, Context context) {
        this.h = pkVar;
        this.f = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    public final jk E(int i10) {
        int f7;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (i10 < size) {
            return (jk) arrayList.get(i10);
        }
        if (!this.d.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.isEmpty() || i10 == size || i10 == size + 1 || (f7 = com.google.android.gms.internal.vision.e2.f(2, i10, arrayList)) >= arrayList2.size()) {
            return null;
        }
        return (jk) arrayList2.get(f7);
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
        this.h.T();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        pk pkVar = this.h;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (pkVar.c0) {
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
        jk E = E(i10);
        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
        int i12 = E.a;
        if (i12 != 0) {
            j7Var.d(E.b, E.c, null, null, i12, i10 != this.c.size() - 1);
        } else {
            j7Var.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
        }
        File file = E.f;
        if (file != null) {
            j7Var.b(pkVar.R.containsKey(file.toString()), !pkVar.U);
        } else {
            j7Var.b(false, !pkVar.U);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var = this.h.a;
        Context context = this.f;
        if (i10 == 0) {
            m4Var = new org.telegram.ui.Cells.m4(context, d6Var);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                }
                return new wk0(view);
            }
            m4Var = new org.telegram.ui.Cells.j7(context, 1, d6Var);
        }
        view = m4Var;
        return new wk0(view);
    }
}
