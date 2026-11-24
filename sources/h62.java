// default package

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h62 extends r7 {
    public final /* synthetic */ byte A0;
    public final /* synthetic */ Object B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h62(FrameLayout frameLayout, Context context, r6 r6Var, ylb ylbVar, byte b) {
        super(context, r6Var, 0, 0, false, ylbVar);
        this.A0 = b;
        this.B0 = frameLayout;
    }

    @Override // r7, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        byte b = this.A0;
        Object obj = this.B0;
        switch (b) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) obj).y.getText());
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((x62) obj).y.getText());
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((tt4) obj).E.getText());
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((rob) obj).h.getText());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h62(rob robVar, Context context, r6 r6Var) {
        super(context, r6Var, 0);
        this.A0 = (byte) 3;
        this.B0 = robVar;
    }
}
