package kh;

import android.content.Context;
import android.view.View;
import lh.aa;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f6 c;

    public /* synthetic */ m(Context context, int i10, f6 f6Var) {
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
