package org.telegram.ui;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ac0 extends org.telegram.ui.Components.y50 {
    public final /* synthetic */ cc0 d;

    public ac0(cc0 cc0Var) {
        this.d = cc0Var;
    }

    @Override // org.telegram.ui.Components.ho0
    public final void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.e(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // org.telegram.ui.Components.y50
    public final int h() {
        return 5;
    }

    @Override // org.telegram.ui.Components.y50
    public final int i() {
        return 100;
    }

    @Override // org.telegram.ui.Components.y50
    public final int j() {
        return LiteMode.getPowerSaverLevel();
    }

    @Override // org.telegram.ui.Components.y50
    public final void k(int i10) {
        cc0 cc0Var = this.d;
        float f10 = i10 / 100.0f;
        cc0Var.h.w.Y(f10, true);
        cc0Var.h.setProgress(f10);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.LiteBatteryTitle));
        sb.append(", ");
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        if (powerSaverLevel <= 0) {
            sb.append(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled));
        } else if (powerSaverLevel >= 100) {
            sb.append(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled));
        } else {
            sb.append(LocaleController.formatString(R.string.AccDescrLiteBatteryWhenBelow, Integer.valueOf(Math.round(powerSaverLevel))));
        }
        accessibilityEvent.setContentDescription(sb);
        this.d.setContentDescription(sb);
    }
}
