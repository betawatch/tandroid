package bi;

import android.content.Context;
import android.view.View;
import di.gb;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 c;

    public /* synthetic */ p(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = i7;
        this.b = context;
        this.c = i6Var;
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
