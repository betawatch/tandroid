package kh;

import android.content.Context;
import android.view.View;
import lh.aa;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;

    public /* synthetic */ m(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = i10;
        this.b = context;
        this.c = f6Var;
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
