// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class b1a extends t2b {
    public final /* synthetic */ e0a H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1a(e0a e0aVar, Context context, int i, vnb vnbVar) {
        super(i, vnbVar, context);
        this.H3 = e0aVar;
    }

    @Override // t2b
    public final boolean C1() {
        return i86.e(16388) || this.H3.G.a0 == 4;
    }

    @Override // t2b
    public final void I1(int i) {
        super.I1(i);
        this.H3.d(false);
    }
}
