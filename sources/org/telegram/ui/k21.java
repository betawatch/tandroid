package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k21 implements org.telegram.ui.ActionBar.k6 {
    public boolean a = false;
    public final /* synthetic */ l21 b;

    public k21(l21 l21Var) {
        this.b = l21Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void a(float f10) {
        ArrayList arrayList;
        l21 l21Var = this.b;
        if (f10 == 0.0f && !this.a) {
            org.telegram.ui.Components.ip ipVar = l21Var.b;
            if (ipVar != null && (arrayList = ipVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.jp) obj).c = l21Var.J ? 1 : 0;
                }
            }
            if (!l21Var.N) {
                org.telegram.ui.Components.ip ipVar2 = l21Var.b;
                for (int i11 = 0; i11 < ipVar2.h(); i11++) {
                    ((org.telegram.ui.Components.jp) ipVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        l21Var.B.setColorFilter(new PorterDuffColorFilter(l21Var.d.getThemedColor(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN));
        if (l21Var.N) {
            org.telegram.ui.Components.ip ipVar3 = l21Var.b;
            for (int i12 = 0; i12 < ipVar3.h(); i12++) {
                ((org.telegram.ui.Components.jp) ipVar3.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            l21Var.N = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
    }
}
