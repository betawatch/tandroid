package di;

import android.os.Bundle;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wb extends an {
    public final /* synthetic */ boolean ud;
    public final /* synthetic */ ic vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(ic icVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.vd = icVar;
        this.ud = z10;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.ud) {
            return;
        }
        this.vd.show();
    }
}
