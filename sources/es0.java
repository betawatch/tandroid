// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class es0 implements fn7 {
    public final /* synthetic */ long a;
    public final /* synthetic */ fn7[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ bs0 d;

    public es0(long j, fn7[] fn7VarArr, int i, bs0 bs0Var) {
        this.a = j;
        this.b = fn7VarArr;
        this.c = i;
        this.d = bs0Var;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        zh6 zh6Var;
        int i3 = jn7.w0;
        if (i != i3 || (zh6Var = (zh6) objArr[0]) == null) {
            return;
        }
        long j = this.a;
        if (zh6Var.d(j)) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) zh6Var.f(j);
            fn7[] fn7VarArr = this.b;
            if (fn7VarArr[0] != null) {
                jn7.f(this.c).n(fn7VarArr[0], i3);
                fn7VarArr[0] = null;
            }
            if (!(webPage instanceof TLRPC.TL_webPage)) {
                webPage = null;
            }
            this.d.a(webPage);
        }
    }
}
