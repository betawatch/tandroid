package org.telegram.ui;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class lc0 extends org.telegram.ui.Components.x50 {
    public final /* synthetic */ nc0 d;

    public lc0(nc0 nc0Var) {
        this.d = nc0Var;
    }

    @Override // org.telegram.ui.Components.do0
    public final void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.e(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // org.telegram.ui.Components.x50
    public final int h() {
        return 5;
    }

    @Override // org.telegram.ui.Components.x50
    public final int i() {
        return 100;
    }

    @Override // org.telegram.ui.Components.x50
    public final int j() {
        return LiteMode.getPowerSaverLevel();
    }

    @Override // org.telegram.ui.Components.x50
    public final void k(int i10) {
        nc0 nc0Var = this.d;
        float f7 = i10 / 100.0f;
        nc0Var.h.w.X(f7, true);
        nc0Var.h.setProgress(f7);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.LiteBatteryTitle));
        sb2.append(", ");
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        if (powerSaverLevel <= 0) {
            sb2.append(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled));
        } else if (powerSaverLevel >= 100) {
            sb2.append(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled));
        } else {
            sb2.append(LocaleController.formatString(R.string.AccDescrLiteBatteryWhenBelow, Integer.valueOf(Math.round(powerSaverLevel))));
        }
        accessibilityEvent.setContentDescription(sb2);
        this.d.setContentDescription(sb2);
    }
}
