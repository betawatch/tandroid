// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class f5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ my0[] b;

    public /* synthetic */ f5(my0[] my0VarArr, byte b) {
        this.a = b;
        this.b = my0VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        my0[] my0VarArr = this.b;
        switch (b) {
            case 0:
                my0VarArr[0].dismiss();
                break;
            case 1:
                my0VarArr[0].dismiss();
                break;
            case 2:
                my0VarArr[0].dismiss();
                break;
            case 3:
                my0 my0Var = my0VarArr[0];
                if (my0Var != null) {
                    my0Var.dismiss();
                    break;
                }
                break;
            case 4:
                my0VarArr[0].dismiss();
                break;
            case 5:
                my0 my0Var2 = my0VarArr[0];
                if (my0Var2 != null) {
                    my0Var2.dismiss();
                    break;
                }
                break;
            case 6:
                my0VarArr[0].dismiss();
                break;
            case 7:
                my0VarArr[0].dismiss();
                break;
            case 8:
                my0VarArr[0].dismiss();
                break;
            default:
                my0VarArr[0].dismiss();
                break;
        }
    }
}
