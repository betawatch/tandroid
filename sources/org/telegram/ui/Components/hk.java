package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class hk extends ul0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f;
    public final /* synthetic */ ok h;

    public hk(ok okVar, Context context) {
        this.h = okVar;
        this.f = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    public final ik E(int i10) {
        int f7;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (i10 < size) {
            return (ik) arrayList.get(i10);
        }
        if (!this.d.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.isEmpty() || i10 == size || i10 == size + 1 || (f7 = com.google.android.gms.internal.vision.e2.f(2, i10, arrayList)) >= arrayList2.size()) {
            return null;
        }
        return (ik) arrayList2.get(f7);
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
        ok okVar = this.h;
        if (i11 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (okVar.c0) {
                n4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
                return;
            } else {
                n4Var.setText(LocaleController.getString(R.string.RecentFiles));
                return;
            }
        }
        if (i11 != 1) {
            return;
        }
        ik E = E(i10);
        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
        int i12 = E.a;
        if (i12 != 0) {
            l7Var.d(E.b, E.c, null, null, i12, i10 != this.c.size() - 1);
        } else {
            l7Var.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
        }
        File file = E.f;
        if (file != null) {
            l7Var.b(okVar.R.containsKey(file.toString()), !okVar.U);
        } else {
            l7Var.b(false, !okVar.U);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View n4Var;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var = this.h.a;
        Context context = this.f;
        if (i10 == 0) {
            n4Var = new org.telegram.ui.Cells.n4(context, f6Var);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
                }
                return new fl0(view);
            }
            n4Var = new org.telegram.ui.Cells.l7(context, 1, f6Var);
        }
        view = n4Var;
        return new fl0(view);
    }
}
