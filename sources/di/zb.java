package di;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zb extends ProfileActivity {
    public final /* synthetic */ boolean b7;
    public final /* synthetic */ mc c7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(mc mcVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.c7 = mcVar;
        this.b7 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.b7) {
            return;
        }
        this.c7.show();
    }
}
