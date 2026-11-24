// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lo1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ he[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ lo1(yv1 yv1Var, he[] heVarArr, int i, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = heVarArr;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        he[] heVarArr = this.c;
        final yv1 yv1Var = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                he heVar = heVarArr[0];
                if (heVar != null) {
                    final byte b3 = 1;
                    heVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: gp1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b4 = b3;
                            int i2 = i;
                            yv1 yv1Var2 = yv1Var;
                            switch (b4) {
                                case 0:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                case 1:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                default:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                            }
                        }
                    });
                    yv1Var.showDialog(heVarArr[0]);
                    break;
                }
                break;
            case 1:
                he heVar2 = heVarArr[0];
                if (heVar2 != null) {
                    heVar2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: gp1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b4 = b2;
                            int i2 = i;
                            yv1 yv1Var2 = yv1Var;
                            switch (b4) {
                                case 0:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                case 1:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                default:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                            }
                        }
                    });
                    yv1Var.showDialog(heVarArr[0]);
                    break;
                }
                break;
            default:
                he heVar3 = heVarArr[0];
                if (heVar3 != null) {
                    final byte b4 = 2;
                    heVar3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: gp1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b42 = b4;
                            int i2 = i;
                            yv1 yv1Var2 = yv1Var;
                            switch (b42) {
                                case 0:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                case 1:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                default:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                            }
                        }
                    });
                    yv1Var.showDialog(heVarArr[0]);
                    break;
                }
                break;
        }
    }
}
