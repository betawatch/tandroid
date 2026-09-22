package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pz0 extends n01 {
    public pz0(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ai.l4 l4Var;
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.o5 o5Var = this.e;
        if (o5Var == null || (l4Var = o5Var.k) == null) {
            return;
        }
        l4Var.startAnimation();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!getImageReceiver().hasNotThumb()) {
            accessibilityNodeInfo.setVisibleToUser(false);
            return;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenInPhotoViewer)));
    }
}
