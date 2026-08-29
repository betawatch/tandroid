package ih;

import android.content.Context;
import android.view.View;
import jh.z9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                new z9(this.b, this.c).show();
                break;
            case 1:
                new z9(this.b, this.c).show();
                break;
            default:
                new z9(this.b, this.c).show();
                break;
        }
    }
}
