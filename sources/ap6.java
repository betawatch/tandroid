// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ap6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eq6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ ap6(eq6 eq6Var, ArrayList arrayList, String str, byte b) {
        this.a = b;
        this.b = eq6Var;
        this.c = arrayList;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        ArrayList arrayList = this.c;
        eq6 eq6Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new ap6(eq6Var, arrayList, str, (byte) 2));
                break;
            case 1:
                eq6Var.f(str, arrayList);
                break;
            default:
                eq6Var.f(str, arrayList);
                break;
        }
    }
}
