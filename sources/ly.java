// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
