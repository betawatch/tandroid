package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public class ContactsWidgetConfigActivity extends ExternalActionActivity {
    public static final /* synthetic */ int F = 0;
    public int E = 0;

    @Override // org.telegram.ui.ExternalActionActivity
    public final void d(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (c(intent, z10, z11, z12, i10, i11)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.E = extras.getInt("appWidgetId", 0);
            }
            if (this.E == 0) {
                finish();
                return;
            }
            org.telegram.messenger.bi.d(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            dz dzVar = new dz(1, this.E);
            dzVar.y = new z0(this, 29);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, dzVar);
                }
            } else if (this.c.getFragmentStack().isEmpty()) {
                this.c.c(-1, dzVar);
            }
            if (!AndroidUtilities.isTablet()) {
                this.e.setVisibility(8);
            }
            this.c.c0();
            if (AndroidUtilities.isTablet()) {
                this.d.c0();
            }
            intent.setAction(null);
        }
    }
}
