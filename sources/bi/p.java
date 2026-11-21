package bi;

import android.content.Context;
import android.view.View;
import di.gb;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
