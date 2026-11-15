package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class l7 extends g7 {
    public final ArrayList n;
    public final /* synthetic */ t7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(t7 t7Var) {
        super(t7Var, 2);
        this.r = t7Var;
        this.n = new ArrayList();
    }

    @Override // org.telegram.ui.g7, org.telegram.ui.f7
    public final void F() {
        super.F();
        ArrayList arrayList = this.n;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i7 >= arrayList2.size()) {
                return;
            }
            arrayList.add(new org.telegram.messenger.ff(0, ((m7) arrayList2.get(i7)).d.a.getPath(), 0, ((m7) arrayList2.get(i7)).d.d == 1, 0, 0));
            i7++;
        }
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        View view = e1Var.a;
        k7 k7Var = (k7) view;
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) k7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        ei.b bVar = ((m7) arrayList.get(i7)).d;
        boolean z10 = bVar == view.getTag();
        boolean z11 = i7 != arrayList.size() - 1;
        view.setTag(bVar);
        File file = bVar.a;
        long lastModified = file.lastModified();
        String M0 = bVar.h == 5 ? org.telegram.messenger.hd.M0(2131753941, null) : file.getName();
        String s5 = org.telegram.messenger.hd.s(lastModified / 1000, true);
        String name = file.getName();
        Pattern pattern = Utilities.a;
        int lastIndexOf = name.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? name.substring(lastIndexOf + 1) : null;
        g7Var.d(M0, s5, substring != null ? substring.toUpperCase() : null, null, 0, z11);
        if (!z10) {
            g7Var.setPhoto(file.getPath());
        }
        g7Var.getImageView().setRoundRadius(org.telegram.messenger.g0.L(bVar.h == 5 ? 20.0f : 4.0f));
        k7Var.d = z11;
        k7Var.c.setText(org.telegram.messenger.g0.i0(bVar.c, false, false));
        k7Var.a.a(this.r.h.j.contains(bVar), z10);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 0);
        k7Var.e = 2;
        k7Var.b.addView(new org.telegram.ui.Cells.g7(3, viewGroup.getContext(), null));
        return new org.telegram.ui.Components.cj0(k7Var);
    }
}
