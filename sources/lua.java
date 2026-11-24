// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
