// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class be implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hj b;

    public /* synthetic */ be(hj hjVar, byte b) {
        this.a = b;
        this.b = hjVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        hj hjVar = this.b;
        switch (b) {
            case 0:
                hjVar.requestFocus();
                gl.E3(hjVar);
                break;
            case 1:
                hjVar.requestFocus();
                gl.E3(hjVar);
                break;
            default:
                gl.c3(new b1(hjVar, (byte) 10));
                break;
        }
    }
}
