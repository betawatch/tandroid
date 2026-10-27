package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
            org.telegram.messenger.wh.c(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            ny nyVar = new ny(0, this.E);
            nyVar.y = new y0(this, 27);
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
            this.c.e0();
            if (AndroidUtilities.isTablet()) {
                this.d.e0();
            }
            intent.setAction(null);
        }
    }
}
