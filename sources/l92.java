// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class l92 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x92 b;
    public final /* synthetic */ hd[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ l92(x92 x92Var, hd[] hdVarArr, int i, byte b) {
        this.a = b;
        this.b = x92Var;
        this.c = hdVarArr;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        hd[] hdVarArr = this.c;
        final x92 x92Var = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                hd hdVar = hdVarArr[0];
                if (hdVar != null) {
                    final byte b3 = 1;
                    hdVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: m92
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b4 = b3;
                            int i2 = i;
                            x92 x92Var2 = x92Var;
                            switch (b4) {
                                case 0:
                                    x92Var2.b0(i2);
                                    break;
                                default:
                                    x92Var2.Z(i2);
                                    break;
                            }
                        }
                    });
                    x92Var.showDialog(hdVarArr[0]);
                    break;
                }
                break;
            default:
                hd hdVar2 = hdVarArr[0];
                if (hdVar2 != null) {
                    hdVar2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: m92
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b4 = b2;
                            int i2 = i;
                            x92 x92Var2 = x92Var;
                            switch (b4) {
                                case 0:
                                    x92Var2.b0(i2);
                                    break;
                                default:
                                    x92Var2.Z(i2);
                                    break;
                            }
                        }
                    });
                    x92Var.showDialog(hdVarArr[0]);
                    break;
                }
                break;
        }
    }
}
