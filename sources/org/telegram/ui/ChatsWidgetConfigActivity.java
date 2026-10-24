package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class ChatsWidgetConfigActivity extends ExternalActionActivity {
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
            org.telegram.messenger.v0.e(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            ny nyVar = new ny(0, this.E);
            nyVar.y = new a1(this, 25);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, nyVar);
                }
            } else if (this.c.getFragmentStack().isEmpty()) {
                this.c.c(-1, nyVar);
            }
            if (!AndroidUtilities.isTablet()) {
                this.e.setVisibility(8);
            }
            this.c.d0();
            if (AndroidUtilities.isTablet()) {
                this.d.d0();
            }
            intent.setAction(null);
        }
    }
}
