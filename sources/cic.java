// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cic extends um8 {
    public final /* synthetic */ iic W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cic(iic iicVar, Context context, float f, float f2) {
        super(context, f, f2);
        this.W = iicVar;
    }

    @Override // um8
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        iic iicVar = this.W;
        iicVar.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], iicVar.Z.getMeasuredWidth()};
    }
}
