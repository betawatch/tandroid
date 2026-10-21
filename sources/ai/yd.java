package ai;

import android.os.Bundle;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class yd extends qn {
    public final /* synthetic */ boolean Rc;
    public final /* synthetic */ le Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(le leVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.Sc = leVar;
        this.Rc = z10;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Rc) {
            return;
        }
        this.Sc.show();
    }
}
