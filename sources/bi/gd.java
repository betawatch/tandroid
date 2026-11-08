package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
