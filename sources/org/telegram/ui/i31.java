package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i31 implements org.telegram.ui.ActionBar.k6 {
    public boolean a = false;
    public final /* synthetic */ j31 b;

    public i31(j31 j31Var) {
        this.b = j31Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void a(float f7) {
        ArrayList arrayList;
        j31 j31Var = this.b;
        if (f7 == 0.0f && !this.a) {
            org.telegram.ui.Components.qp qpVar = j31Var.b;
            if (qpVar != null && (arrayList = qpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.rp) obj).c = j31Var.M ? 1 : 0;
                }
            }
            if (!j31Var.Q) {
                org.telegram.ui.Components.qp qpVar2 = j31Var.b;
                for (int i11 = 0; i11 < qpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.rp) qpVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        j31Var.E.setColorFilter(new PorterDuffColorFilter(j31Var.d.getThemedColor(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN));
        if (j31Var.Q) {
            org.telegram.ui.Components.qp qpVar3 = j31Var.b;
            for (int i12 = 0; i12 < qpVar3.h(); i12++) {
                ((org.telegram.ui.Components.rp) qpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            j31Var.Q = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
    }
}
