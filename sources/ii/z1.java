package ii;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.ug;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ry;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class z1 extends ug {
    public final /* synthetic */ int l0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(Object obj, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(i10, context, d6Var, true);
        this.l0 = i11;
        this.m0 = obj;
    }

    @Override // org.telegram.ui.Components.ug
    public boolean d() {
        switch (this.l0) {
            case 0:
                return ((e2) this.m0).l0();
            case 1:
            case 2:
            default:
                return super.d();
            case 3:
                return false;
            case 4:
                return false;
        }
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean f() {
        switch (this.l0) {
            case 0:
                if (((e2) this.m0).L0 || this.r > 0) {
                }
                break;
            case 1:
                if (((c4) this.m0).W || this.r > 0) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ug
    public int getFillColor() {
        int i10 = this.l0;
        Object obj = this.m0;
        switch (i10) {
            case 2:
                return ((hq0) obj).getThemedColor(org.telegram.ui.ActionBar.h6.S5);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i11 = org.telegram.ui.ActionBar.h6.zf;
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((PhotoViewer) obj).z1(i11);
        }
    }

    @Override // org.telegram.ui.Components.ug
    public boolean j() {
        switch (this.l0) {
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.l0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((ry) this.m0).I2.size(), new Object[0]));
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
    public /* synthetic */ z1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(i10, context, d6Var, false);
        this.l0 = i11;
        this.m0 = notificationCenterDelegate;
    }
}
