// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ly implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ vnb c;

    public /* synthetic */ ly(Context context, vnb vnbVar, byte b) {
        this.a = b;
        this.b = context;
        this.c = vnbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new eza(this.b, this.c).show();
                break;
            case 1:
                new eza(this.b, this.c).show();
                break;
            case 2:
                new eza(this.b, this.c).show();
                break;
            default:
                new eza(this.b, this.c).show();
                break;
        }
    }
}
