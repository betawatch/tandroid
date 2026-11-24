// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h88 extends ecc {
    public final /* synthetic */ PhotoViewer i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h88(PhotoViewer photoViewer, Context context, s68 s68Var) {
        super(context, s68Var);
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
