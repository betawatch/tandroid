// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m04 extends y46 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m04(Context context, int i) {
        super(context);
        this.r = i;
    }

    @Override // y46
    public final int i(int i, int i2, int i3, int i4, int i5) {
        return super.i(i, i2, i3, i4, i5) + this.r;
    }

    @Override // y46
    public final int m(int i) {
        return super.m(i) << 4;
    }

    @Override // y46
    public final int p() {
        return -1;
    }
}
