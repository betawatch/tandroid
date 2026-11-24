// default package

import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k6 extends i34 {
    public final /* synthetic */ ActionBarLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(ActionBarLayout actionBarLayout) {
        super(null);
        this.a = actionBarLayout;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.a.invalidate();
    }
}
