// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jzb extends rzb {
    public final /* synthetic */ cib T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzb(Context context, String str, String str2, CharSequence charSequence, cib cibVar) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.T1 = cibVar;
    }

    @Override // rzb, fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        cib cibVar = this.T1;
        if (cibVar != null) {
            cibVar.run();
        }
    }
}
