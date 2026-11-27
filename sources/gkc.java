// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gkc extends fo8 {
    public final /* synthetic */ mkc W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkc(mkc mkcVar, Context context, float f, float f2) {
        super(context, f, f2);
        this.W = mkcVar;
    }

    @Override // fo8
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        mkc mkcVar = this.W;
        mkcVar.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], mkcVar.Z.getMeasuredWidth()};
    }
}
