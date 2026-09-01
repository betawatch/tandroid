package lh;

import android.content.Context;
import android.view.View;
import mh.aa;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ g6 c;

    public /* synthetic */ m(Context context, int i10, g6 g6Var) {
        this.a = i10;
        this.b = context;
        this.c = g6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new aa(this.b, this.c).show();
                break;
            case 1:
                new aa(this.b, this.c).show();
                break;
            default:
                new aa(this.b, this.c).show();
                break;
        }
    }
}
