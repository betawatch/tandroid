package fi;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bm;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w2 extends org.telegram.ui.ActionBar.r0 {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, yVar, 0, 0, false, f6Var);
        this.z0 = i7;
        this.A0 = frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.r0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.z0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((f3) this.A0).D.getText());
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.A0).y.getText());
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((bm) this.A0).y.getText());
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((v71) this.A0).h.getText());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(v71 v71Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0);
        this.z0 = 3;
        this.A0 = v71Var;
    }
}
