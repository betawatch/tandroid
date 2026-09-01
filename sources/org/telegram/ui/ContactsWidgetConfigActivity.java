package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class ContactsWidgetConfigActivity extends ExternalActionActivity {
    public static final /* synthetic */ int C = 0;
    public int B = 0;

    @Override // org.telegram.ui.ExternalActionActivity
    public final void d(Intent intent, boolean z4, boolean z10, boolean z11, int i10, int i11) {
        if (c(intent, z4, z10, z11, i10, i11)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.B = extras.getInt("appWidgetId", 0);
            }
            if (this.B == 0) {
                finish();
                return;
            }
            org.telegram.messenger.y3.e(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            yy yyVar = new yy(1, this.B);
            yyVar.y = new a1(this, 27);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, yyVar);
                }
            } else if (this.c.getFragmentStack().isEmpty()) {
                this.c.c(-1, yyVar);
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
