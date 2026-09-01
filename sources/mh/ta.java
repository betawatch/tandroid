package mh;

import android.os.Bundle;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
