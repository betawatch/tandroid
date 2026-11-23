package hi;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class p0 extends og.o {
    public final /* synthetic */ int Q;
    public final /* synthetic */ FrameLayout R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(FrameLayout frameLayout, Context context, int i7) {
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
                currentHeight = ((s0) this.R).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((w0) this.R).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // og.o
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        switch (this.Q) {
            case 0:
                currentWidth = ((s0) this.R).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((w0) this.R).getCurrentWidth();
                return currentWidth2;
        }
    }
}
