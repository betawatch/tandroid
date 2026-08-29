package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hp0 extends og {
    public final /* synthetic */ int h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp0(Object obj, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, context, c6Var, true);
        this.h0 = i11;
        this.i0 = obj;
    }

    @Override // org.telegram.ui.Components.og
    public boolean d() {
        switch (this.h0) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return ((th.x1) this.i0).l0();
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean f() {
        switch (this.h0) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (((th.x1) this.i0).H0 || this.r > 0) {
                }
                break;
            default:
                if (((th.t3) this.i0).S || this.r > 0) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public int getFillColor() {
        int i10 = this.h0;
        Object obj = this.i0;
        switch (i10) {
            case 0:
                return ((dq0) obj).getThemedColor(org.telegram.ui.ActionBar.g6.S5);
            case 1:
            default:
                return super.getFillColor();
            case 2:
                int i11 = org.telegram.ui.ActionBar.g6.zf;
                Drawable[] drawableArr = PhotoViewer.P8;
                return ((PhotoViewer) obj).z1(i11);
        }
    }

    @Override // org.telegram.ui.Components.og
    public boolean j() {
        switch (this.h0) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.h0) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((org.telegram.ui.fy) this.i0).E2.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, context, c6Var, false);
        this.h0 = i11;
        this.i0 = notificationCenterDelegate;
    }
}
