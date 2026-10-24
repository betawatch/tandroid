package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class pr {
    public ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public org.telegram.ui.ActionBar.a1 b;
    public org.telegram.ui.ActionBar.e1[] c;

    public final void a(float f7, boolean z10) {
        org.telegram.ui.ActionBar.e1[] e1VarArr = this.c;
        for (int i10 = 0; i10 < e1VarArr.length; i10++) {
            if (!z10 || ((i10 != 0 || Math.abs(f7 - 0.2f) >= 0.01f) && ((i10 != 1 || Math.abs(f7 - 0.5f) >= 0.1f) && ((i10 != 2 || Math.abs(f7 - 1.0f) >= 0.1f) && ((i10 != 3 || Math.abs(f7 - 1.5f) >= 0.1f) && (i10 != 4 || Math.abs(f7 - 2.0f) >= 0.1f)))))) {
                e1VarArr[i10].d(-328966, -328966);
            } else {
                e1VarArr[i10].d(-9718023, -9718023);
            }
        }
        this.b.e(f7, true);
    }
}
