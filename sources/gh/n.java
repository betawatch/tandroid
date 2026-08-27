package gh;

import android.content.Context;
import android.view.View;
import hh.fa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;

    public /* synthetic */ n(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = i10;
        this.b = context;
        this.c = c6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new fa(this.b, this.c).show();
                break;
            case 1:
                new fa(this.b, this.c).show();
                break;
            default:
                new fa(this.b, this.c).show();
                break;
        }
    }
}
