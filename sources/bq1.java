// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bq1 implements fn7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp6 b;
    public final /* synthetic */ zu1 c;
    public final /* synthetic */ zu1 d;

    public bq1(zu1 zu1Var, int i, gp6 gp6Var, zu1 zu1Var2) {
        this.d = zu1Var;
        this.a = i;
        this.b = gp6Var;
        this.c = zu1Var2;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        int i4 = jn7.C;
        if (i == i4 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            hl.d3(new aq1(this.c, i, i2, objArr, (byte) 0), 50L);
            i3 = ((e) this.d).currentAccount;
            jn7.f(i3).n(this, i4);
        }
    }
}
