package bi;

import android.content.Context;
import android.view.View;
import di.gb;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;

    public /* synthetic */ p(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this.a = i7;
        this.b = context;
        this.c = h6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new gb(this.b, this.c).show();
                break;
            case 1:
                new gb(this.b, this.c).show();
                break;
            default:
                new gb(this.b, this.c).show();
                break;
        }
    }
}
