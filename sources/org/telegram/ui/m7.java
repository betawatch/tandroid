package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m7 extends h7 {
    public final ArrayList n;
    public final /* synthetic */ u7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(u7 u7Var) {
        super(u7Var, 2);
        this.r = u7Var;
        this.n = new ArrayList();
    }

    @Override // org.telegram.ui.h7, org.telegram.ui.g7
    public final void F() {
        super.F();
        ArrayList arrayList = this.n;
        arrayList.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList.add(new org.telegram.messenger.ye(0, ((n7) arrayList2.get(i3)).d.a.getPath(), 0, ((n7) arrayList2.get(i3)).d.d == 1, 0, 0));
            i3++;
        }
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        View view = d1Var.a;
        l7 l7Var = (l7) view;
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) l7Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        di.b bVar = ((n7) arrayList.get(i3)).d;
        boolean z10 = bVar == view.getTag();
        boolean z11 = i3 != arrayList.size() - 1;
        view.setTag(bVar);
        File file = bVar.a;
        long lastModified = file.lastModified();
        String M0 = bVar.h == 5 ? org.telegram.messenger.bd.M0(2131753941, null) : file.getName();
        String s6 = org.telegram.messenger.bd.s(lastModified / 1000, true);
        String name = file.getName();
        Pattern pattern = Utilities.a;
        int lastIndexOf = name.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? name.substring(lastIndexOf + 1) : null;
        g7Var.d(M0, s6, substring != null ? substring.toUpperCase() : null, null, 0, z11);
        if (!z10) {
            g7Var.setPhoto(file.getPath());
        }
        g7Var.getImageView().setRoundRadius(org.telegram.messenger.g0.L(bVar.h == 5 ? 20.0f : 4.0f));
        l7Var.d = z11;
        l7Var.c.setText(org.telegram.messenger.g0.i0(bVar.c, false, false));
        l7Var.a.a(this.r.h.j.contains(bVar), z10);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        l7 l7Var = new l7(this, viewGroup.getContext(), 0);
        l7Var.e = 2;
        l7Var.b.addView(new org.telegram.ui.Cells.g7(3, viewGroup.getContext(), null));
        return new org.telegram.ui.Components.bj0(l7Var);
    }
}
