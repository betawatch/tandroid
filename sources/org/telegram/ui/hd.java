package org.telegram.ui;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hd extends org.telegram.ui.Components.ei0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd(Object obj, Context context, int i10) {
        super(context);
        this.r = i10;
        this.s = obj;
    }

    @Override // android.view.View
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((kd) this.s).h.invalidate();
                break;
            case 1:
            case 2:
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((c60) this.s).e.invalidate();
                break;
            case 4:
                super.invalidate(i10, i11, i12, i13);
                ((wd0) this.s).h.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (!((org.telegram.ui.Components.dp) this.s).D1) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.cd.L0(2131754750, null));
                    break;
                } else {
                    accessibilityNodeInfo.setText(org.telegram.messenger.cd.L0(2131754751, null));
                    break;
                }
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.r) {
            case 0:
                super.invalidate();
                ((kd) this.s).h.invalidate();
                break;
            case 1:
            default:
                super.invalidate();
                break;
            case 2:
                super.invalidate();
                ((org.telegram.ui.Components.y10) this.s).invalidate();
                break;
            case 3:
                super.invalidate();
                ((c60) this.s).e.invalidate();
                break;
            case 4:
                super.invalidate();
                ((wd0) this.s).h.invalidate();
                break;
        }
    }
}
