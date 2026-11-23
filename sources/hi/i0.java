package hi;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class i0 extends og.o {
    public final /* synthetic */ int Q;
    public final /* synthetic */ FrameLayout R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(FrameLayout frameLayout, Context context, int i7) {
        super(context);
        this.Q = i7;
        this.R = frameLayout;
    }

    @Override // og.o
    public final int getCurrentHeight() {
        int currentHeight;
        int currentHeight2;
        switch (this.Q) {
            case 0:
                currentHeight = ((l0) this.R).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((o0) this.R).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // og.o
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        switch (this.Q) {
            case 0:
                currentWidth = ((l0) this.R).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((o0) this.R).getCurrentWidth();
                return currentWidth2;
        }
    }
}
