package ji;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.wg;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class y1 extends wg {
    public final /* synthetic */ int l0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(int i10, int i11, Context context, Object obj, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, context, c6Var, true);
        this.l0 = i11;
        this.m0 = obj;
    }

    @Override // org.telegram.ui.Components.wg
    public boolean d() {
        switch (this.l0) {
            case 0:
                return ((d2) this.m0).l0();
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

    @Override // org.telegram.ui.Components.wg
    public final boolean f() {
        switch (this.l0) {
            case 0:
                if (((d2) this.m0).L0 || this.r > 0) {
                }
                break;
            case 1:
                if (((c4) this.m0).W || this.r > 0) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wg
    public int getFillColor() {
        int i10 = this.l0;
        Object obj = this.m0;
        switch (i10) {
            case 2:
                return ((ir0) obj).getThemedColor(org.telegram.ui.ActionBar.g6.S5);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i11 = org.telegram.ui.ActionBar.g6.zf;
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((PhotoViewer) obj).z1(i11);
        }
    }

    @Override // org.telegram.ui.Components.wg
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
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((yy) this.m0).I2.size(), new Object[0]));
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
    public /* synthetic */ y1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, context, c6Var, false);
        this.l0 = i11;
        this.m0 = notificationCenterDelegate;
    }
}
