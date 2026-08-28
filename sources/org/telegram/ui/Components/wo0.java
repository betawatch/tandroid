package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wo0 extends lg {
    public final /* synthetic */ int h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wo0(Object obj, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(i9, context, b6Var, true);
        this.h0 = i10;
        this.i0 = obj;
    }

    @Override // org.telegram.ui.Components.lg
    public boolean d() {
        switch (this.h0) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return ((qh.x1) this.i0).k0();
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean f() {
        switch (this.h0) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (((qh.x1) this.i0).H0 || this.r > 0) {
                }
                break;
            default:
                if (((qh.s3) this.i0).S || this.r > 0) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.lg
    public int getFillColor() {
        int i9 = this.h0;
        Object obj = this.i0;
        switch (i9) {
            case 0:
                return ((rp0) obj).getThemedColor(org.telegram.ui.ActionBar.f6.S5);
            case 1:
            default:
                return super.getFillColor();
            case 2:
                int i10 = org.telegram.ui.ActionBar.f6.zf;
                Drawable[] drawableArr = PhotoViewer.P8;
                return ((PhotoViewer) obj).z1(i10);
        }
    }

    @Override // org.telegram.ui.Components.lg
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
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((org.telegram.ui.dy) this.i0).E2.size(), new Object[0]));
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
    public /* synthetic */ wo0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(i9, context, b6Var, false);
        this.h0 = i10;
        this.i0 = notificationCenterDelegate;
    }
}
