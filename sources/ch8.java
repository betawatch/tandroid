// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ch8 extends i49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jh8 b;

    public /* synthetic */ ch8(jh8 jh8Var, byte b) {
        this.a = b;
        this.b = jh8Var;
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        jh8 jh8Var = this.b;
        switch (b) {
            case 0:
                jh8Var.b.invalidate();
                jh8Var.D0();
                break;
            default:
                jh8Var.b.invalidate();
                jh8Var.D0();
                break;
        }
    }
}
