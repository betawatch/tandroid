package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class ContactsWidgetConfigActivity extends ExternalActionActivity {
    public static final /* synthetic */ int G = 0;
    public int F = 0;

    @Override // org.telegram.ui.ExternalActionActivity
    public final void d(Intent intent, boolean z10, boolean z11, boolean z12, int i7, int i10) {
        if (c(intent, z10, z11, z12, i7, i10)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.F = extras.getInt("appWidgetId", 0);
            }
            if (this.F == 0) {
                finish();
                return;
            }
            org.telegram.ui.Cells.y0.j(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            gx gxVar = new gx(1, this.F);
            gxVar.E = new zr(this, 0);
            if (org.telegram.messenger.g0.Q1()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, gxVar);
                }
            } else if (this.c.getFragmentStack().isEmpty()) {
                this.c.c(-1, gxVar);
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
