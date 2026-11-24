// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class np7 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ wjb d;
    public final /* synthetic */ mp7 e;

    public /* synthetic */ np7(Context context, int i, wjb wjbVar, mp7 mp7Var, byte b) {
        this.a = b;
        this.b = context;
        this.c = i;
        this.d = wjbVar;
        this.e = mp7Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        mp7 mp7Var = this.e;
        switch (b) {
            case 0:
                u21 j = mp7Var.j();
                cq7.q(this.b, this.c, this.d, j, (String) obj, null);
                break;
            default:
                u21 j2 = mp7Var.j();
                cq7.q(this.b, this.c, this.d, j2, (String) obj, null);
                break;
        }
    }
}
