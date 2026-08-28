package eh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.c9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b extends c9 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i9, Context context, boolean z10) {
        super(context, z10);
        this.e = i9;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.e) {
            case 1:
                if (!ih.v.c) {
                    super.invalidate();
                    break;
                } else {
                    ih.v.b.add(this);
                    break;
                }
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.c9, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.e) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.a.n == 0 ? 0 : e2.c.e(r4, 1, 20, 24)), TLObject.FLAG_30), i10);
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate(int i9, int i10, int i11, int i12) {
        switch (this.e) {
            case 1:
                if (ih.v.c) {
                    ih.v.b.add(this);
                    break;
                } else {
                    super.invalidate(i9, i10, i11, i12);
                    break;
                }
            default:
                super.invalidate(i9, i10, i11, i12);
                break;
        }
    }
}
