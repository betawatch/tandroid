package ai;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;

    public /* synthetic */ qd(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = i10;
        this.b = context;
        this.c = g6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new ed(this.b, this.c).show();
                break;
            case 1:
                new ed(this.b, this.c).show();
                break;
            default:
                new ed(this.b, this.c).show();
                break;
        }
    }
}
