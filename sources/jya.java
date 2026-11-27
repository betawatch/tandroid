// default package

import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class jya implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cza b;

    public /* synthetic */ jya(cza czaVar, byte b) {
        this.a = b;
        this.b = czaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e Q;
        e Q2;
        byte b = this.a;
        cza czaVar = this.b;
        switch (b) {
            case 0:
                if (czaVar.e > 0 && (Q = LaunchActivity.Q()) != null) {
                    bg0 bg0Var = new bg0();
                    bg0Var.a = true;
                    Q.showAsSheet(new nza(), bg0Var);
                    break;
                }
                break;
            default:
                if (czaVar.e > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    bg0 bg0Var2 = new bg0();
                    bg0Var2.a = true;
                    Q2.showAsSheet(new nza(), bg0Var2);
                    break;
                }
                break;
        }
    }
}
