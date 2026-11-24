// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o87 implements uc7 {
    public final /* synthetic */ na7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ TLRPC.InputPeer e;
    public final /* synthetic */ long f;

    public /* synthetic */ o87(na7 na7Var, long j, int i, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.a = na7Var;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = inputPeer;
        this.f = j2;
    }

    @Override // uc7
    public final void a(int i) {
        na7 na7Var = this.a;
        long e = na7Var.getUserConfig().e();
        long j = this.b;
        if (j == e) {
            na7Var.D1().b();
        }
        na7Var.U(j, 2, this.c, Math.max(0, i), this.d, this.e, this.f);
        na7Var.F(1);
    }
}
