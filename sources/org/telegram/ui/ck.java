package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ck extends qn {
    public boolean U0;

    @Override // org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.U0) {
            return;
        }
        n0();
        this.U0 = true;
    }
}
