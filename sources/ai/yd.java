package ai;

import android.os.Bundle;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class yd extends sn {
    public final /* synthetic */ boolean Rc;
    public final /* synthetic */ le Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(le leVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.Sc = leVar;
        this.Rc = z10;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Rc) {
            return;
        }
        this.Sc.show();
    }
}
