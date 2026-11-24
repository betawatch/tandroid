// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o62 extends oc0 {
    public final /* synthetic */ p62 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o62(p62 p62Var, Context context) {
        super(context);
        this.F = p62Var;
    }

    @Override // oc0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.F.w;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(chatAttachAlertPhotoLayout.L0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(chatAttachAlertPhotoLayout.L0, TLObject.FLAG_30));
    }
}
