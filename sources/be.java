// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.F3(hjVar);
                break;
            case 1:
                hjVar.requestFocus();
                gl.F3(hjVar);
                break;
            default:
                gl.d3(new b1(hjVar, (byte) 10));
                break;
        }
    }
}
