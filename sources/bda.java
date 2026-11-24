// default package

import android.content.Context;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bda extends ClippingImageView {
    public final /* synthetic */ sca S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bda(Context context, sca scaVar) {
        super(context);
        this.S = scaVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}
