// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ha8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ja8 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ ha8(ja8 ja8Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = ja8Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        ja8 ja8Var = this.b;
        switch (b) {
            case 0:
                zha zhaVar = ja8Var.d;
                if (zhaVar.I) {
                    ja8Var.I = runnable;
                    zhaVar.a(true);
                    break;
                }
                break;
            default:
                zha zhaVar2 = ja8Var.d;
                if (zhaVar2.I) {
                    ja8Var.I = runnable;
                    zhaVar2.a(true);
                    break;
                }
                break;
        }
    }
}
