package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class ContactsWidgetConfigActivity extends ExternalActionActivity {
    public static final /* synthetic */ int G = 0;
    public int F = 0;

    @Override // org.telegram.ui.ExternalActionActivity
    public final void e(Intent intent, boolean z10, boolean z11, boolean z12, int i7, int i10) {
        if (d(intent, z10, z11, z12, i7, i10)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.F = extras.getInt("appWidgetId", 0);
            }
            if (this.F == 0) {
                finish();
                return;
            }
            org.telegram.ui.Cells.c0.l(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            kx kxVar = new kx(1, this.F);
            kxVar.E = new zr(this, 0);
            if (org.telegram.messenger.g0.Q1()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, kxVar);
                }
            } else if (this.c.getFragmentStack().isEmpty()) {
                this.c.c(-1, kxVar);
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
