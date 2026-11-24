// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c36 extends zu8 {
    public final /* synthetic */ f36 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c36(f36 f36Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.t1 = f36Var;
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        this.t1.F = null;
    }
}
