package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mk extends ul0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f;
    public final /* synthetic */ tk h;

    public mk(tk tkVar, Context context) {
        this.h = tkVar;
        this.f = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    public final nk E(int i10) {
        int e;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (i10 < size) {
            return (nk) arrayList.get(i10);
        }
        if (!this.d.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.isEmpty() || i10 == size || i10 == size + 1 || (e = com.google.android.gms.internal.vision.e2.e(2, i10, arrayList)) >= arrayList2.size()) {
            return null;
        }
        return (nk) arrayList2.get(e);
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
        tk tkVar = this.h;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (tkVar.c0) {
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
        nk E = E(i10);
        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
        int i12 = E.a;
        if (i12 != 0) {
            l7Var.d(E.b, E.c, null, null, i12, i10 != this.c.size() - 1);
        } else {
            l7Var.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
        }
        File file = E.f;
        if (file != null) {
            l7Var.b(tkVar.R.containsKey(file.toString()), !tkVar.U);
        } else {
            l7Var.b(false, !tkVar.U);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
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
                    view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                }
                return new fl0(view);
            }
            m4Var = new org.telegram.ui.Cells.l7(context, 1, f6Var);
        }
        view = m4Var;
        return new fl0(view);
    }
}
