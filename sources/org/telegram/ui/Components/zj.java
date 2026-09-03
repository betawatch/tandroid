package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zj extends ql0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Context f;
    public final /* synthetic */ hk h;

    public zj(hk hkVar, Context context) {
        this.h = hkVar;
        this.f = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 1;
    }

    public final ak E(int i10) {
        int e;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (i10 < size) {
            return (ak) arrayList.get(i10);
        }
        if (!this.d.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.isEmpty() || i10 == size || i10 == size + 1 || (e = org.telegram.ui.ai.e(2, i10, arrayList)) >= arrayList2.size()) {
            return null;
        }
        return (ak) arrayList2.get(e);
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
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (hkVar.W) {
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
        ak E = E(i10);
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
        int i12 = E.a;
        if (i12 != 0) {
            h7Var.d(E.b, E.c, null, null, i12, i10 != this.c.size() - 1);
        } else {
            h7Var.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
        }
        File file = E.f;
        if (file != null) {
            h7Var.b(hkVar.O.containsKey(file.toString()), !hkVar.R);
        } else {
            h7Var.b(false, !hkVar.R);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var = this.h.a;
        Context context = this.f;
        if (i10 == 0) {
            l4Var = new org.telegram.ui.Cells.l4(context, f6Var);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    view = new View(context);
                    view.setTag(-33024);
                } else {
                    view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.b) null);
                }
                return new dl0(view);
            }
            l4Var = new org.telegram.ui.Cells.h7(context, 1, f6Var);
        }
        view = l4Var;
        return new dl0(view);
    }
}
