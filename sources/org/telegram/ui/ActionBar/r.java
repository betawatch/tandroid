package org.telegram.ui.ActionBar;

import org.telegram.ui.dz;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class r extends dz {
    public final /* synthetic */ ActionBarLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.a = actionBarLayout;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.a.invalidate();
    }
}
