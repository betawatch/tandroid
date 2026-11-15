package bi;

import android.content.Context;
import android.view.View;
import di.db;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                new db(this.b, this.c).show();
                break;
            case 1:
                new db(this.b, this.c).show();
                break;
            default:
                new db(this.b, this.c).show();
                break;
        }
    }
}
