package bi;

import android.os.Bundle;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class pd extends un {
    public final /* synthetic */ boolean kd;
    public final /* synthetic */ be ld;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(be beVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.ld = beVar;
        this.kd = z10;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.kd) {
            return;
        }
        this.ld.show();
    }
}
