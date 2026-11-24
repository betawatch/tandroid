// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class f5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fx0[] b;

    public /* synthetic */ f5(fx0[] fx0VarArr, byte b) {
        this.a = b;
        this.b = fx0VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        fx0[] fx0VarArr = this.b;
        switch (b) {
            case 0:
                fx0VarArr[0].dismiss();
                break;
            case 1:
                fx0VarArr[0].dismiss();
                break;
            case 2:
                fx0VarArr[0].dismiss();
                break;
            case 3:
                fx0 fx0Var = fx0VarArr[0];
                if (fx0Var != null) {
                    fx0Var.dismiss();
                    break;
                }
                break;
            case 4:
                fx0VarArr[0].dismiss();
                break;
            case 5:
                fx0 fx0Var2 = fx0VarArr[0];
                if (fx0Var2 != null) {
                    fx0Var2.dismiss();
                    break;
                }
                break;
            case 6:
                fx0VarArr[0].dismiss();
                break;
            case 7:
                fx0VarArr[0].dismiss();
                break;
            case 8:
                fx0VarArr[0].dismiss();
                break;
            default:
                fx0VarArr[0].dismiss();
                break;
        }
    }
}
