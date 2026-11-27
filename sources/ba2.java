// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ba2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na2 b;
    public final /* synthetic */ id[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ ba2(na2 na2Var, id[] idVarArr, int i, byte b) {
        this.a = b;
        this.b = na2Var;
        this.c = idVarArr;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        id[] idVarArr = this.c;
        final na2 na2Var = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                id idVar = idVarArr[0];
                if (idVar != null) {
                    final byte b3 = 1;
                    idVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ca2
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b4 = b3;
                            int i2 = i;
                            na2 na2Var2 = na2Var;
                            switch (b4) {
                                case 0:
                                    na2Var2.b0(i2);
                                    break;
                                default:
                                    na2Var2.Z(i2);
                                    break;
                            }
                        }
                    });
                    na2Var.showDialog(idVarArr[0]);
                    break;
                }
                break;
            default:
                id idVar2 = idVarArr[0];
                if (idVar2 != null) {
                    idVar2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ca2
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b4 = b2;
                            int i2 = i;
                            na2 na2Var2 = na2Var;
                            switch (b4) {
                                case 0:
                                    na2Var2.b0(i2);
                                    break;
                                default:
                                    na2Var2.Z(i2);
                                    break;
                            }
                        }
                    });
                    na2Var.showDialog(idVarArr[0]);
                    break;
                }
                break;
        }
    }
}
