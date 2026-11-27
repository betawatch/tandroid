// default package

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class di1 extends e29 {
    public final /* synthetic */ byte r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ di1(byte b, Context context, Object obj) {
        super(context);
        this.r = b;
        this.s = obj;
    }

    @Override // android.view.View
    public final void invalidate() {
        byte b = this.r;
        Object obj = this.s;
        switch (b) {
            case 0:
                super.invalidate();
                ((gi1) obj).h.invalidate();
                break;
            case 1:
            default:
                super.invalidate();
                break;
            case 2:
                super.invalidate();
                ((o95) obj).invalidate();
                break;
            case 3:
                super.invalidate();
                ((xc5) obj).e.invalidate();
                break;
            case 4:
                super.invalidate();
                ((cg6) obj).h.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (!((oe2) this.s).G1) {
                    accessibilityNodeInfo.setText(ob6.M0(2131754745, null));
                    break;
                } else {
                    accessibilityNodeInfo.setText(ob6.M0(2131754746, null));
                    break;
                }
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        byte b = this.r;
        Object obj = this.s;
        switch (b) {
            case 0:
                super.invalidate(i, i2, i3, i4);
                ((gi1) obj).h.invalidate();
                break;
            case 1:
            case 2:
            default:
                super.invalidate(i, i2, i3, i4);
                break;
            case 3:
                super.invalidate(i, i2, i3, i4);
                ((xc5) obj).e.invalidate();
                break;
            case 4:
                super.invalidate(i, i2, i3, i4);
                ((cg6) obj).h.invalidate();
                break;
        }
    }
}
