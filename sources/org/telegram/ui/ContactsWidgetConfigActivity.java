package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
            org.telegram.messenger.w1.e(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            dz dzVar = new dz(1, this.E);
            dzVar.y = new z0(this, 27);
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
