package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
            org.telegram.ui.Cells.f1.j(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            hy hyVar = new hy(1, this.E);
            hyVar.D = new y0(this, 29);
            if (org.telegram.messenger.i0.Q1()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, hyVar);
                }
            } else if (this.c.getFragmentStack().isEmpty()) {
                this.c.c(-1, hyVar);
            }
            if (!org.telegram.messenger.i0.Q1()) {
                this.e.setVisibility(8);
            }
            this.c.e0();
            if (org.telegram.messenger.i0.Q1()) {
                this.d.e0();
            }
            intent.setAction(null);
        }
    }
}
