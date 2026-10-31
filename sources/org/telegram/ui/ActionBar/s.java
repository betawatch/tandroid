package org.telegram.ui.ActionBar;

import org.telegram.ui.my;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s extends my {
    public final /* synthetic */ ActionBarLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ActionBarLayout actionBarLayout) {
        super(null);
        this.a = actionBarLayout;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.a.invalidate();
    }
}
