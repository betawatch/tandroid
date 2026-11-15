package di;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wb extends ProfileActivity {
    public final /* synthetic */ boolean Z6;
    public final /* synthetic */ jc a7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(jc jcVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.a7 = jcVar;
        this.Z6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Z6) {
            return;
        }
        this.a7.show();
    }
}
