// default package

import android.content.Context;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
