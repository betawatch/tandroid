package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;

    public /* synthetic */ gd(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = i7;
        this.b = context;
        this.c = g6Var;
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
