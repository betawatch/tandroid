// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class j3c extends r3c {
    public final /* synthetic */ s8b T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3c(Context context, String str, String str2, CharSequence charSequence, s8b s8bVar) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.T1 = s8bVar;
    }

    @Override // r3c, nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        s8b s8bVar = this.T1;
        if (s8bVar != null) {
            s8bVar.run();
        }
    }
}
