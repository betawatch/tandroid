package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class c31 implements org.telegram.ui.ActionBar.k6 {
    public boolean a = false;
    public final /* synthetic */ d31 b;

    public c31(d31 d31Var) {
        this.b = d31Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void a(float f7) {
        ArrayList arrayList;
        d31 d31Var = this.b;
        if (f7 == 0.0f && !this.a) {
            org.telegram.ui.Components.kp kpVar = d31Var.b;
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.lp) obj).c = d31Var.M ? 1 : 0;
                }
            }
            if (!d31Var.Q) {
                org.telegram.ui.Components.kp kpVar2 = d31Var.b;
                for (int i11 = 0; i11 < kpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.lp) kpVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        d31Var.E.setColorFilter(new PorterDuffColorFilter(d31Var.d.getThemedColor(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN));
        if (d31Var.Q) {
            org.telegram.ui.Components.kp kpVar3 = d31Var.b;
            for (int i12 = 0; i12 < kpVar3.h(); i12++) {
                ((org.telegram.ui.Components.lp) kpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            d31Var.Q = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
    }
}
