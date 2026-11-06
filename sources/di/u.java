package di;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class u extends org.telegram.ui.Components.z8 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i7, Context context, boolean z9) {
        super(context, z9);
        this.e = i7;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.e) {
            case 0:
                if (!v.c) {
                    super.invalidate();
                    break;
                } else {
                    v.b.add(this);
                    break;
                }
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.z8, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.e) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.a.n == 0 ? 0 : com.google.android.recaptcha.internal.a.e(r4, 1, 20, 24)), TLObject.FLAG_30), i10);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.e) {
            case 0:
                if (v.c) {
                    v.b.add(this);
                    break;
                } else {
                    super.invalidate(i7, i10, i11, i12);
                    break;
                }
            default:
                super.invalidate(i7, i10, i11, i12);
                break;
        }
    }
}
