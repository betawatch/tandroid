package org.telegram.ui;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ob0 extends org.telegram.ui.Components.g50 {
    public final /* synthetic */ qb0 d;

    public ob0(qb0 qb0Var) {
        this.d = qb0Var;
    }

    @Override // org.telegram.ui.Components.mn0
    public final void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.e(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // org.telegram.ui.Components.g50
    public final int h() {
        return 5;
    }

    @Override // org.telegram.ui.Components.g50
    public final int i() {
        return 100;
    }

    @Override // org.telegram.ui.Components.g50
    public final int j() {
        return LiteMode.getPowerSaverLevel();
    }

    @Override // org.telegram.ui.Components.g50
    public final void k(int i9) {
        qb0 qb0Var = this.d;
        float f10 = i9 / 100.0f;
        qb0Var.h.w.Q(f10, true);
        qb0Var.h.setProgress(f10);
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
