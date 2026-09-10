package bi;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class l0 extends kg.p {
    public final /* synthetic */ int P;
    public final /* synthetic */ FrameLayout Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.P = i10;
        this.Q = frameLayout;
    }

    @Override // kg.p
    public final int getCurrentHeight() {
        int currentHeight;
        int currentHeight2;
        switch (this.P) {
            case 0:
                currentHeight = ((n0) this.Q).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((q0) this.Q).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // kg.p
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        switch (this.P) {
            case 0:
                currentWidth = ((n0) this.Q).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((q0) this.Q).getCurrentWidth();
                return currentWidth2;
        }
    }
}
