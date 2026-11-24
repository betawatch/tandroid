// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
