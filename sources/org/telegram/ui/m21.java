package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m21 implements org.telegram.ui.ActionBar.l6 {
    public boolean a = false;
    public final /* synthetic */ n21 b;

    public m21(n21 n21Var) {
        this.b = n21Var;
    }

    @Override // org.telegram.ui.ActionBar.l6
    public final void a(float f10) {
        ArrayList arrayList;
        n21 n21Var = this.b;
        if (f10 == 0.0f && !this.a) {
            org.telegram.ui.Components.kp kpVar = n21Var.b;
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.lp) obj).c = n21Var.J ? 1 : 0;
                }
            }
            if (!n21Var.N) {
                org.telegram.ui.Components.kp kpVar2 = n21Var.b;
                for (int i11 = 0; i11 < kpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.lp) kpVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        n21Var.B.setColorFilter(new PorterDuffColorFilter(n21Var.d.getThemedColor(org.telegram.ui.ActionBar.k6.Oh), PorterDuff.Mode.SRC_IN));
        if (n21Var.N) {
            org.telegram.ui.Components.kp kpVar3 = n21Var.b;
            for (int i12 = 0; i12 < kpVar3.h(); i12++) {
                ((org.telegram.ui.Components.lp) kpVar3.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            n21Var.N = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.l6
    public final void b() {
    }
}
