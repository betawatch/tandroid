package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                return;
            }
            arrayList.add(new org.telegram.messenger.ef(0, ((m7) arrayList2.get(i10)).d.a.getPath(), 0, ((m7) arrayList2.get(i10)).d.d == 1, 0, 0));
            i10++;
        }
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        k7 k7Var = (k7) view;
        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) k7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        sh.a aVar = ((m7) arrayList.get(i10)).d;
        boolean z10 = aVar == view.getTag();
        boolean z11 = i10 != arrayList.size() - 1;
        view.setTag(aVar);
        File file = aVar.a;
        long lastModified = file.lastModified();
        String L0 = aVar.h == 5 ? org.telegram.messenger.cd.L0(2131753941, null) : file.getName();
        String s10 = org.telegram.messenger.cd.s(lastModified / 1000, true);
        String name = file.getName();
        Pattern pattern = Utilities.a;
        int lastIndexOf = name.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? name.substring(lastIndexOf + 1) : null;
        l7Var.d(L0, s10, substring != null ? substring.toUpperCase() : null, null, 0, z11);
        if (!z10) {
            l7Var.setPhoto(file.getPath());
        }
        l7Var.getImageView().setRoundRadius(org.telegram.messenger.i0.L(aVar.h == 5 ? 20.0f : 4.0f));
        k7Var.d = z11;
        k7Var.c.setText(org.telegram.messenger.i0.i0(aVar.c, false, false));
        k7Var.a.a(this.r.h.j.contains(aVar), z10);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 0);
        k7Var.e = 2;
        k7Var.b.addView(new org.telegram.ui.Cells.l7(3, viewGroup.getContext(), null));
        return new org.telegram.ui.Components.ck0(k7Var);
    }
}
