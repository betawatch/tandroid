// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lea extends rb0 {
    public final /* synthetic */ byte M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lea(FrameLayout frameLayout, vnb vnbVar, byte b) {
        super(vnbVar);
        this.M = b;
        this.N = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        byte b = this.M;
        FrameLayout frameLayout = this.N;
        switch (b) {
            case 0:
                super.invalidateSelf();
                ((nea) frameLayout).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((tea) frameLayout).a.invalidate();
                break;
        }
    }
}
