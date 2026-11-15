package di;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb b;

    public /* synthetic */ ga(bb bbVar, int i7) {
        this.a = i7;
        this.b = bbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.e2 Q;
        org.telegram.ui.ActionBar.e2 Q2;
        switch (this.a) {
            case 0:
                if (this.b.e > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                    c2Var.a = true;
                    Q.showAsSheet(new mb(), c2Var);
                    break;
                }
                break;
            default:
                if (this.b.e > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2();
                    c2Var2.a = true;
                    Q2.showAsSheet(new mb(), c2Var2);
                    break;
                }
                break;
        }
    }
}
