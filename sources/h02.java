// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h02 extends hd0 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h02(byte b, Context context, boolean z) {
        super(context, z);
        this.e = b;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.e) {
            case 1:
                if (!pi5.c) {
                    super.invalidate();
                    break;
                } else {
                    pi5.b.add(this);
                    break;
                }
            default:
                super.invalidate();
                break;
        }
    }

    @Override // hd0, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.e) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(this.a.n == 0 ? 0 : aq1.h(r4, 1, 20, 24)), TLObject.FLAG_30), i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        switch (this.e) {
            case 1:
                if (pi5.c) {
                    pi5.b.add(this);
                    break;
                } else {
                    super.invalidate(i, i2, i3, i4);
                    break;
                }
            default:
                super.invalidate(i, i2, i3, i4);
                break;
        }
    }
}
