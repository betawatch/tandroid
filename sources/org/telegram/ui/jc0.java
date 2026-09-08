package org.telegram.ui;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class jc0 extends org.telegram.ui.Components.x50 {
    public final /* synthetic */ lc0 d;

    public jc0(lc0 lc0Var) {
        this.d = lc0Var;
    }

    @Override // org.telegram.ui.Components.co0
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
        lc0 lc0Var = this.d;
        float f7 = i10 / 100.0f;
        lc0Var.h.w.X(f7, true);
        lc0Var.h.setProgress(f7);
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
