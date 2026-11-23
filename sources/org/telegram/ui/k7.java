package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class k7 extends f7 {
    public final ArrayList n;
    public final /* synthetic */ s7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(s7 s7Var) {
        super(s7Var, 2);
        this.r = s7Var;
        this.n = new ArrayList();
    }

    @Override // org.telegram.ui.f7, org.telegram.ui.e7
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
            arrayList.add(new org.telegram.messenger.ff(0, ((l7) arrayList2.get(i7)).d.a.getPath(), 0, ((l7) arrayList2.get(i7)).d.d == 1, 0, 0));
            i7++;
        }
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        View view = f1Var.a;
        j7 j7Var = (j7) view;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) j7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        ei.b bVar = ((l7) arrayList.get(i7)).d;
        boolean z10 = bVar == view.getTag();
        boolean z11 = i7 != arrayList.size() - 1;
        view.setTag(bVar);
        File file = bVar.a;
        long lastModified = file.lastModified();
        String N0 = bVar.h == 5 ? org.telegram.messenger.hd.N0(2131753938, null) : file.getName();
        String s5 = org.telegram.messenger.hd.s(lastModified / 1000, true);
        String name = file.getName();
        Pattern pattern = Utilities.a;
        int lastIndexOf = name.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? name.substring(lastIndexOf + 1) : null;
        i7Var.d(N0, s5, substring != null ? substring.toUpperCase() : null, null, 0, z11);
        if (!z10) {
            i7Var.setPhoto(file.getPath());
        }
        i7Var.getImageView().setRoundRadius(org.telegram.messenger.g0.L(bVar.h == 5 ? 20.0f : 4.0f));
        j7Var.d = z11;
        j7Var.c.setText(org.telegram.messenger.g0.i0(bVar.c, false, false));
        j7Var.a.a(this.r.h.j.contains(bVar), z10);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        j7 j7Var = new j7(this, viewGroup.getContext(), 0);
        j7Var.e = 2;
        j7Var.b.addView(new org.telegram.ui.Cells.i7(3, viewGroup.getContext(), null));
        return new org.telegram.ui.Components.mj0(j7Var);
    }
}
