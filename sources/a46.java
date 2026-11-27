// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class a46 extends ok8 {
    public final /* synthetic */ l46 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a46(l46 l46Var, Context context, vnb vnbVar) {
        super(vnbVar, context, true);
        this.S = l46Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.S.a2) {
            return;
        }
        super.invalidate();
    }
}
