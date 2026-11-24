// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ka8 extends fec {
    public final /* synthetic */ PhotoViewer i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka8(PhotoViewer photoViewer, Context context, u88 u88Var) {
        super(context, u88Var);
        this.i0 = photoViewer;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Drawable[] drawableArr = PhotoViewer.d9;
        this.i0.R2();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            Drawable[] drawableArr = PhotoViewer.d9;
            this.i0.R2();
        }
    }
}
