// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bgc extends sk8 {
    public final /* synthetic */ hgc W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgc(hgc hgcVar, Context context, float f, float f2) {
        super(context, f, f2);
        this.W = hgcVar;
    }

    @Override // sk8
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        hgc hgcVar = this.W;
        hgcVar.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], hgcVar.Z.getMeasuredWidth()};
    }
}
