package hh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.h9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b extends h9 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Context context, boolean z10) {
        super(context, z10);
        this.e = i10;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.e) {
            case 1:
                if (!lh.t.c) {
                    super.invalidate();
                    break;
                } else {
                    lh.t.b.add(this);
                    break;
                }
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.h9, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.e) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.a.n == 0 ? 0 : com.google.android.recaptcha.internal.a.f(r4, 1, 20, 24)), TLObject.FLAG_30), i11);
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
                if (lh.t.c) {
                    lh.t.b.add(this);
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
