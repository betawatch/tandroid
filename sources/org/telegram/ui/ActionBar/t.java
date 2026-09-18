package org.telegram.ui.ActionBar;

import org.telegram.ui.jz;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t extends jz {
    public final /* synthetic */ ActionBarLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ActionBarLayout actionBarLayout) {
        super(null);
        this.a = actionBarLayout;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.a.invalidate();
    }
}
