// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ix9 extends tya {
    public final /* synthetic */ lw9 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix9(lw9 lw9Var, Context context, int i, wjb wjbVar) {
        super(i, wjbVar, context);
        this.H3 = lw9Var;
    }

    @Override // tya
    public final boolean B1() {
        return e66.e(16388) || this.H3.G.a0 == 4;
    }

    @Override // tya
    public final void H1(int i) {
        super.H1(i);
        this.H3.d(false);
    }
}
