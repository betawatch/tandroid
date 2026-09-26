package org.telegram.ui;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class dc0 extends org.telegram.ui.Components.i60 {
    public final /* synthetic */ fc0 d;

    public dc0(fc0 fc0Var) {
        this.d = fc0Var;
    }

    @Override // org.telegram.ui.Components.po0
    public final void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.e(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // org.telegram.ui.Components.i60
    public final int h() {
        return 5;
    }

    @Override // org.telegram.ui.Components.i60
    public final int i() {
        return 100;
    }

    @Override // org.telegram.ui.Components.i60
    public final int j() {
        return LiteMode.getPowerSaverLevel();
    }

    @Override // org.telegram.ui.Components.i60
    public final void k(int i10) {
        fc0 fc0Var = this.d;
        float f7 = i10 / 100.0f;
        fc0Var.h.w.X(f7, true);
        fc0Var.h.setProgress(f7);
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
