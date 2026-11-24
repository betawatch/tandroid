// default package

import android.content.Context;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bfa extends ClippingImageView {
    public final /* synthetic */ sea S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfa(Context context, sea seaVar) {
        super(context);
        this.S = seaVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}
