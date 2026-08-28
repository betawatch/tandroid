package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ok extends ho {
    public boolean P0;

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.P0) {
            return;
        }
        h0();
        this.P0 = true;
    }
}
