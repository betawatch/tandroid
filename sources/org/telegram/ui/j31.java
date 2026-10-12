package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class j31 implements org.telegram.ui.ActionBar.h6 {
    public boolean a = false;
    public final /* synthetic */ k31 b;

    public j31(k31 k31Var) {
        this.b = k31Var;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void a(float f7) {
        ArrayList arrayList;
        k31 k31Var = this.b;
        if (f7 == 0.0f && !this.a) {
            org.telegram.ui.Components.xp xpVar = k31Var.b;
            if (xpVar != null && (arrayList = xpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.yp) obj).c = k31Var.M ? 1 : 0;
                }
            }
            if (!k31Var.Q) {
                org.telegram.ui.Components.xp xpVar2 = k31Var.b;
                for (int i11 = 0; i11 < xpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.yp) xpVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        k31Var.E.setColorFilter(new PorterDuffColorFilter(k31Var.d.getThemedColor(org.telegram.ui.ActionBar.g6.Oh), PorterDuff.Mode.SRC_IN));
        if (k31Var.Q) {
            org.telegram.ui.Components.xp xpVar3 = k31Var.b;
            for (int i12 = 0; i12 < xpVar3.h(); i12++) {
                ((org.telegram.ui.Components.yp) xpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            k31Var.Q = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b() {
    }
}
