// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
