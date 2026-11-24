// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class d52 extends ob0 {
    public final /* synthetic */ e52 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d52(e52 e52Var, Context context) {
        super(context);
        this.F = e52Var;
    }

    @Override // ob0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.F.w;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(chatAttachAlertPhotoLayout.L0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(chatAttachAlertPhotoLayout.L0, TLObject.FLAG_30));
    }
}
