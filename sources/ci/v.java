package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class v extends org.telegram.ui.Components.k9 {
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

    @Override // org.telegram.ui.Components.k9, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.e) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.a.n == 0 ? 0 : com.google.android.gms.internal.play_billing.k3.v(r4, 1, 20, 24)), TLObject.FLAG_30), i11);
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
