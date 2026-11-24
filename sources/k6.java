// default package

import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k6 extends x14 {
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
