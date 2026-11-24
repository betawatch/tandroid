// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c14 extends v46 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c14(Context context, int i) {
        super(context);
        this.r = i;
    }

    @Override // v46
    public final int i(int i, int i2, int i3, int i4, int i5) {
        return super.i(i, i2, i3, i4, i5) + this.r;
    }

    @Override // v46
    public final int m(int i) {
        return super.m(i) << 4;
    }

    @Override // v46
    public final int p() {
        return -1;
    }
}
