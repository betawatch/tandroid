package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ChatsWidgetConfigActivity extends ExternalActionActivity {
    public static final /* synthetic */ int G = 0;
    public int F = 0;

    @Override // org.telegram.ui.ExternalActionActivity
    public final void d(Intent intent, boolean z10, boolean z11, boolean z12, int i3, int i10) {
        if (c(intent, z10, z11, z12, i3, i10)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.F = extras.getInt("appWidgetId", 0);
            }
            if (this.F == 0) {
                finish();
                return;
            }
            org.telegram.ui.Cells.f1.l(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            cx cxVar = new cx(0, this.F);
            cxVar.E = new x0(this, 28);
            if (org.telegram.messenger.g0.Q1()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, cxVar);
                }
            } else if (this.c.getFragmentStack().isEmpty()) {
                this.c.c(-1, cxVar);
            }
            if (!org.telegram.messenger.g0.Q1()) {
                this.e.setVisibility(8);
            }
            this.c.f0();
            if (org.telegram.messenger.g0.Q1()) {
                this.d.f0();
            }
            intent.setAction(null);
        }
    }
}
