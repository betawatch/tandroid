package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class v extends org.telegram.ui.Components.m9 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i10, Context context, boolean z10) {
        super(context, z10);
        this.e = i10;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.e) {
            case 0:
                if (!w.c) {
                    super.invalidate();
                    break;
                } else {
                    w.b.add(this);
                    break;
                }
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.m9, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.e) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.a.n == 0 ? 0 : c3.h0.w(r4, 1, 20, 24)), TLObject.FLAG_30), i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.e) {
            case 0:
                if (w.c) {
                    w.b.add(this);
                    break;
                } else {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
