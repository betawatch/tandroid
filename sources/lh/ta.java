package lh;

import android.os.Bundle;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class ta extends xn {
    public final /* synthetic */ boolean Nc;
    public final /* synthetic */ eb Oc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(eb ebVar, Bundle bundle, boolean z4) {
        super(bundle);
        this.Oc = ebVar;
        this.Nc = z4;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Nc) {
            return;
        }
        this.Oc.show();
    }
}
