package hi;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.im;
import org.telegram.ui.t71;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u2 extends org.telegram.ui.ActionBar.q0 {
    public final /* synthetic */ int A0;
    public final /* synthetic */ Object B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, yVar, 0, 0, false, e6Var);
        this.A0 = i7;
        this.B0 = frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.q0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.A0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((d3) this.B0).E.getText());
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.B0).y.getText());
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((im) this.B0).y.getText());
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((t71) this.B0).h.getText());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(t71 t71Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0);
        this.A0 = 3;
        this.B0 = t71Var;
    }
}
