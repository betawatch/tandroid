// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class n9a implements yr3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ gk7 c;
    public final /* synthetic */ View d;

    public /* synthetic */ n9a(gk7 gk7Var, View view, int[] iArr, byte b) {
        this.a = b;
        this.c = gk7Var;
        this.d = view;
        this.b = iArr;
    }

    @Override // yr3
    public final void a(yla ylaVar, float f, float f2) {
        byte b = this.a;
        int[] iArr = this.b;
        View view = this.d;
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                ((taa) gk7Var).K0((waa) view, iArr, f / 1000.0f);
                break;
            default:
                ((caa) gk7Var).d.K0(view, iArr, f / 1000.0f);
                break;
        }
    }
}
