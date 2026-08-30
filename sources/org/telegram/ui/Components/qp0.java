package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qp0 extends lg {
    public final /* synthetic */ int i0;
    public final /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qp0(Object obj, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(i10, context, f6Var, true);
        this.i0 = i11;
        this.j0 = obj;
    }

    @Override // org.telegram.ui.Components.lg
    public boolean d() {
        switch (this.i0) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return ((vh.y1) this.j0).l0();
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean f() {
        switch (this.i0) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (((vh.y1) this.j0).I0 || this.r > 0) {
                }
                break;
            default:
                if (((vh.v3) this.j0).T || this.r > 0) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.lg
    public int getFillColor() {
        int i10 = this.i0;
        Object obj = this.j0;
        switch (i10) {
            case 0:
                return ((lq0) obj).getThemedColor(org.telegram.ui.ActionBar.j6.S5);
            case 1:
            default:
                return super.getFillColor();
            case 2:
                int i11 = org.telegram.ui.ActionBar.j6.zf;
                Drawable[] drawableArr = PhotoViewer.Q8;
                return ((PhotoViewer) obj).z1(i11);
        }
    }

    @Override // org.telegram.ui.Components.lg
    public boolean j() {
        switch (this.i0) {
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
        switch (this.i0) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((org.telegram.ui.oy) this.j0).F2.size(), new Object[0]));
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
    public /* synthetic */ qp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(i10, context, f6Var, false);
        this.i0 = i11;
        this.j0 = notificationCenterDelegate;
    }
}
