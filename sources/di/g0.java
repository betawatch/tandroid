package di;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class g0 extends mg.p {
    public final /* synthetic */ int P;
    public final /* synthetic */ FrameLayout Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.P = i10;
        this.Q = frameLayout;
    }

    @Override // mg.p
    public final int getCurrentHeight() {
        int currentHeight;
        int currentHeight2;
        switch (this.P) {
            case 0:
                currentHeight = ((i0) this.Q).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((l0) this.Q).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // mg.p
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        switch (this.P) {
            case 0:
                currentWidth = ((i0) this.Q).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((l0) this.Q).getCurrentWidth();
                return currentWidth2;
        }
    }
}
