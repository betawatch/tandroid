package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fp extends aj0 {
    public final /* synthetic */ mp r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp(mp mpVar, Context context) {
        super(context);
        this.r = mpVar;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.r.N) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToDayTheme));
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToNightTheme));
        }
    }
}
