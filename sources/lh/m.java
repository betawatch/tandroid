package lh;

import android.content.Context;
import android.view.View;
import mh.aa;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
