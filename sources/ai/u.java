package ai;

import android.content.Context;
import android.view.View;
import ci.nb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;

    public /* synthetic */ u(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = i3;
        this.b = context;
        this.c = e6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new nb(this.b, this.c).show();
                break;
            case 1:
                new nb(this.b, this.c).show();
                break;
            default:
                new nb(this.b, this.c).show();
                break;
        }
    }
}
