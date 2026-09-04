package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class e31 implements org.telegram.ui.ActionBar.k6 {
    public boolean a = false;
    public final /* synthetic */ f31 b;

    public e31(f31 f31Var) {
        this.b = f31Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void a(float f7) {
        ArrayList arrayList;
        f31 f31Var = this.b;
        if (f7 == 0.0f && !this.a) {
            org.telegram.ui.Components.jp jpVar = f31Var.b;
            if (jpVar != null && (arrayList = jpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((org.telegram.ui.Components.kp) obj).c = f31Var.M ? 1 : 0;
                }
            }
            if (!f31Var.Q) {
                org.telegram.ui.Components.jp jpVar2 = f31Var.b;
                for (int i11 = 0; i11 < jpVar2.h(); i11++) {
                    ((org.telegram.ui.Components.kp) jpVar2.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        f31Var.E.setColorFilter(new PorterDuffColorFilter(f31Var.d.getThemedColor(org.telegram.ui.ActionBar.j6.Oh), PorterDuff.Mode.SRC_IN));
        if (f31Var.Q) {
            org.telegram.ui.Components.jp jpVar3 = f31Var.b;
            for (int i12 = 0; i12 < jpVar3.h(); i12++) {
                ((org.telegram.ui.Components.kp) jpVar3.d.get(i12)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            f31Var.Q = false;
            this.a = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
    }
}
