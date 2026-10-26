package li;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cy;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class w1 extends vg {
    public final /* synthetic */ int n0;
    public final /* synthetic */ Object o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(int i10, int i11, Context context, Object obj, u6 u6Var) {
        super(i10, context, u6Var, true);
        this.n0 = i11;
        this.o0 = obj;
    }

    @Override // org.telegram.ui.Components.vg
    public boolean d() {
        switch (this.n0) {
            case 0:
                return ((b2) this.o0).m0();
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

    @Override // org.telegram.ui.Components.vg
    public final boolean f() {
        switch (this.n0) {
            case 0:
                if (((b2) this.o0).L0 || this.r > 0) {
                }
                break;
            case 1:
                if (((a4) this.o0).W || this.r > 0) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.vg
    public int getFillColor() {
        int i10 = this.n0;
        Object obj = this.o0;
        switch (i10) {
            case 2:
                return ((mr0) obj).getThemedColor(y6.S5);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i11 = y6.zf;
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((PhotoViewer) obj).A1(i11);
        }
    }

    @Override // org.telegram.ui.Components.vg
    public boolean j() {
        switch (this.n0) {
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
        switch (this.n0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((cy) this.o0).I2.size(), new Object[0]));
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
    public /* synthetic */ w1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10, u6 u6Var, int i11) {
        super(i10, context, u6Var, false);
        this.n0 = i11;
        this.o0 = notificationCenterDelegate;
    }
}
