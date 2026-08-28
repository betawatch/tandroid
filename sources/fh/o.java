package fh;

import android.content.Context;
import android.view.View;
import gh.fa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;

    public /* synthetic */ o(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this.a = i9;
        this.b = context;
        this.c = b6Var;
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
