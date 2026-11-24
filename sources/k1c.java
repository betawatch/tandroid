// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k1c extends s1c {
    public final /* synthetic */ zcb T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1c(Context context, String str, String str2, CharSequence charSequence, zcb zcbVar) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.T1 = zcbVar;
    }

    @Override // s1c, my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        zcb zcbVar = this.T1;
        if (zcbVar != null) {
            zcbVar.run();
        }
    }
}
