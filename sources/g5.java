// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx0[] b;

    public /* synthetic */ g5(nx0[] nx0VarArr, byte b) {
        this.a = b;
        this.b = nx0VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        nx0[] nx0VarArr = this.b;
        switch (b) {
            case 0:
                nx0VarArr[0].dismiss();
                break;
            case 1:
                nx0VarArr[0].dismiss();
                break;
            case 2:
                nx0VarArr[0].dismiss();
                break;
            case 3:
                nx0 nx0Var = nx0VarArr[0];
                if (nx0Var != null) {
                    nx0Var.dismiss();
                    break;
                }
                break;
            case 4:
                nx0VarArr[0].dismiss();
                break;
            case 5:
                nx0 nx0Var2 = nx0VarArr[0];
                if (nx0Var2 != null) {
                    nx0Var2.dismiss();
                    break;
                }
                break;
            case 6:
                nx0VarArr[0].dismiss();
                break;
            case 7:
                nx0VarArr[0].dismiss();
                break;
            case 8:
                nx0VarArr[0].dismiss();
                break;
            default:
                nx0VarArr[0].dismiss();
                break;
        }
    }
}
