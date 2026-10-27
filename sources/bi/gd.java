package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class gd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 c;

    public /* synthetic */ gd(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.a = i10;
        this.b = context;
        this.c = u6Var;
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
