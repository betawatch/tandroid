package kh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.d9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends d9 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Context context, boolean z4) {
        super(context, z4);
        this.e = i10;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.e) {
            case 1:
                if (!oh.t.c) {
                    super.invalidate();
                    break;
                } else {
                    oh.t.b.add(this);
                    break;
                }
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.d9, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.e) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.a.n == 0 ? 0 : e2.c.e(r4, 1, 20, 24)), TLObject.FLAG_30), i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.e) {
            case 1:
                if (oh.t.c) {
                    oh.t.b.add(this);
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
