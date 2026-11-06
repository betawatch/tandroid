package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;

    public /* synthetic */ gd(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = i7;
        this.b = context;
        this.c = f6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new uc(this.b, this.c).show();
                break;
            case 1:
                new uc(this.b, this.c).show();
                break;
            default:
                new uc(this.b, this.c).show();
                break;
        }
    }
}
