package bi;

import android.content.Context;
import android.view.View;
import di.cb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;

    public /* synthetic */ p(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = i7;
        this.b = context;
        this.c = e6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new cb(this.b, this.c).show();
                break;
            case 1:
                new cb(this.b, this.c).show();
                break;
            default:
                new cb(this.b, this.c).show();
                break;
        }
    }
}
