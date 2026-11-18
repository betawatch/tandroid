package hi;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class h0 extends og.o {
    public final /* synthetic */ int Q;
    public final /* synthetic */ FrameLayout R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(FrameLayout frameLayout, Context context, int i7) {
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
                currentHeight = ((k0) this.R).getCurrentHeight();
                return currentHeight;
            default:
                currentHeight2 = ((n0) this.R).getCurrentHeight();
                return currentHeight2;
        }
    }

    @Override // og.o
    public final int getCurrentWidth() {
        int currentWidth;
        int currentWidth2;
        switch (this.Q) {
            case 0:
                currentWidth = ((k0) this.R).getCurrentWidth();
                return currentWidth;
            default:
                currentWidth2 = ((n0) this.R).getCurrentWidth();
                return currentWidth2;
        }
    }
}
