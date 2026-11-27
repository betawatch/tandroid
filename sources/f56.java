// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class f56 extends ky8 {
    public final /* synthetic */ i56 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f56(i56 i56Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.t1 = i56Var;
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        this.t1.F = null;
    }
}
