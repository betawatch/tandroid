package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pr {
    public ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public org.telegram.ui.ActionBar.c1 b;
    public org.telegram.ui.ActionBar.g1[] c;

    public final void a(float f10, boolean z10) {
        org.telegram.ui.ActionBar.g1[] g1VarArr = this.c;
        for (int i9 = 0; i9 < g1VarArr.length; i9++) {
            if (!z10 || ((i9 != 0 || Math.abs(f10 - 0.2f) >= 0.01f) && ((i9 != 1 || Math.abs(f10 - 0.5f) >= 0.1f) && ((i9 != 2 || Math.abs(f10 - 1.0f) >= 0.1f) && ((i9 != 3 || Math.abs(f10 - 1.5f) >= 0.1f) && (i9 != 4 || Math.abs(f10 - 2.0f) >= 0.1f)))))) {
                g1VarArr[i9].c(-328966, -328966);
            } else {
                g1VarArr[i9].c(-9718023, -9718023);
            }
        }
        this.b.d(f10, true);
    }
}
