// default package

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cj1 extends s09 {
    public final /* synthetic */ byte r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj1(byte b, Context context, Object obj) {
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
                ((fj1) obj).h.invalidate();
                break;
            case 1:
            default:
                super.invalidate();
                break;
            case 2:
                super.invalidate();
                ((l95) obj).invalidate();
                break;
            case 3:
                super.invalidate();
                ((uc5) obj).e.invalidate();
                break;
            case 4:
                super.invalidate();
                ((zf6) obj).h.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (!((if2) this.s).G1) {
                    accessibilityNodeInfo.setText(jb6.M0(2131754749, null));
                    break;
                } else {
                    accessibilityNodeInfo.setText(jb6.M0(2131754750, null));
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
                ((fj1) obj).h.invalidate();
                break;
            case 1:
            case 2:
            default:
                super.invalidate(i, i2, i3, i4);
                break;
            case 3:
                super.invalidate(i, i2, i3, i4);
                ((uc5) obj).e.invalidate();
                break;
            case 4:
                super.invalidate(i, i2, i3, i4);
                ((zf6) obj).h.invalidate();
                break;
        }
    }
}
