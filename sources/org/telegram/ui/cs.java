package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cs {
    public ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public org.telegram.ui.ActionBar.c1 b;
    public org.telegram.ui.ActionBar.g1[] c;

    public final void a(float f7, boolean z10) {
        org.telegram.ui.ActionBar.g1[] g1VarArr = this.c;
        for (int i10 = 0; i10 < g1VarArr.length; i10++) {
            if (!z10 || ((i10 != 0 || Math.abs(f7 - 0.2f) >= 0.01f) && ((i10 != 1 || Math.abs(f7 - 0.5f) >= 0.1f) && ((i10 != 2 || Math.abs(f7 - 1.0f) >= 0.1f) && ((i10 != 3 || Math.abs(f7 - 1.5f) >= 0.1f) && (i10 != 4 || Math.abs(f7 - 2.0f) >= 0.1f)))))) {
                g1VarArr[i10].c(-328966, -328966);
            } else {
                g1VarArr[i10].c(-9718023, -9718023);
            }
        }
        this.b.d(f7, true);
    }
}
