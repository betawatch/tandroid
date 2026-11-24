// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lua implements gk7 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ fx0[] b;

    public lua(boolean[] zArr, fx0[] fx0VarArr) {
        this.a = zArr;
        this.b = fx0VarArr;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        fx0 fx0Var;
        if (i == kk7.B3 && this.a[0] && (fx0Var = this.b[0]) != null) {
            fx0Var.dismiss();
        }
    }
}
