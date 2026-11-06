package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
