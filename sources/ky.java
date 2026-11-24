// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ky implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ wjb c;

    public /* synthetic */ ky(Context context, wjb wjbVar, byte b) {
        this.a = b;
        this.b = context;
        this.c = wjbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new ava(this.b, this.c).show();
                break;
            case 1:
                new ava(this.b, this.c).show();
                break;
            case 2:
                new ava(this.b, this.c).show();
                break;
            default:
                new ava(this.b, this.c).show();
                break;
        }
    }
}
