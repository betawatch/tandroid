package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class d31 implements org.telegram.ui.ActionBar.k6 {
    public boolean a = false;
    public final /* synthetic */ e31 b;

    public d31(e31 e31Var) {
        this.b = e31Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void a(float f7) {
        ArrayList arrayList;
        e31 e31Var = this.b;
        if (f7 == 0.0f && !this.a) {
            org.telegram.ui.Components.kp kpVar = e31Var.b;
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.lp) obj).c = e31Var.M ? 1 : 0;
                }
            }
            if (!e31Var.Q) {
                org.telegram.ui.Components.kp kpVar2 = e31Var.b;
                for (int i11 = 0; i11 < kpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.lp) kpVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        e31Var.E.setColorFilter(new PorterDuffColorFilter(e31Var.d.getThemedColor(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN));
        if (e31Var.Q) {
            org.telegram.ui.Components.kp kpVar3 = e31Var.b;
            for (int i12 = 0; i12 < kpVar3.h(); i12++) {
                ((org.telegram.ui.Components.lp) kpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            e31Var.Q = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
    }
}
