package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ContactsWidgetConfigActivity extends ExternalActionActivity {
    public static final /* synthetic */ int B = 0;
    public int A = 0;

    @Override // org.telegram.ui.ExternalActionActivity
    public final void d(Intent intent, boolean z10, boolean z11, boolean z12, int i9, int i10) {
        if (c(intent, z10, z11, z12, i9, i10)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.A = extras.getInt("appWidgetId", 0);
            }
            if (this.A == 0) {
                finish();
                return;
            }
            org.telegram.messenger.l0.e(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            my myVar = new my(1, this.A);
            myVar.y = new b1(this, 27);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, myVar);
                }
            } else if (this.c.getFragmentStack().isEmpty()) {
                this.c.c(-1, myVar);
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
