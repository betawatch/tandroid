package ii;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.tg;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class y1 extends tg {
    public final /* synthetic */ int l0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(Object obj, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(i10, context, e6Var, true);
        this.l0 = i11;
        this.m0 = obj;
    }

    @Override // org.telegram.ui.Components.tg
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

    @Override // org.telegram.ui.Components.tg
    public final boolean f() {
        switch (this.l0) {
            case 0:
                if (((d2) this.m0).L0 || this.r > 0) {
                }
                break;
            case 1:
                if (((b4) this.m0).W || this.r > 0) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.tg
    public int getFillColor() {
        int i10 = this.l0;
        Object obj = this.m0;
        switch (i10) {
            case 2:
                return ((hq0) obj).getThemedColor(i6.S5);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i11 = i6.zf;
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((PhotoViewer) obj).z1(i11);
        }
    }

    @Override // org.telegram.ui.Components.tg
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
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((uy) this.m0).I2.size(), new Object[0]));
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
    public /* synthetic */ y1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(i10, context, e6Var, false);
        this.l0 = i11;
        this.m0 = notificationCenterDelegate;
    }
}
