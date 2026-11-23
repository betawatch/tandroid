package org.telegram.ui.ActionBar;

import org.telegram.ui.ox;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class r extends ox {
    public final /* synthetic */ ActionBarLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ActionBarLayout actionBarLayout) {
        super(null);
        this.a = actionBarLayout;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.a.invalidate();
    }
}
