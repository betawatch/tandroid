// default package

import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cq1 extends l01 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ int e;
    public final /* synthetic */ wb2 f;
    public final /* synthetic */ zu1 g;
    public final /* synthetic */ Object h;

    public /* synthetic */ cq1(zu1 zu1Var, int i, Object obj, wb2 wb2Var, byte b) {
        this.d = b;
        this.g = zu1Var;
        this.e = i;
        this.h = obj;
        this.f = wb2Var;
    }

    @Override // l01
    public final void c(boolean z) {
        switch (this.d) {
            case 0:
                if (!z) {
                    hl.d3(new zd((Object) this, this.e, (byte) 14), 240L);
                    break;
                }
                break;
            default:
                if (!z) {
                    hl.d3(new zd((Object) this, this.e, (byte) 17), 240L);
                    break;
                }
                break;
        }
    }

    @Override // l01
    public final void d() {
        byte b = this.d;
        wb2 wb2Var = this.f;
        Object obj = this.h;
        int i = this.e;
        zu1 zu1Var = this.g;
        switch (b) {
            case 0:
                zu1Var.lc = i;
                zu1Var.mc = 1;
                zu1Var.nc = (CharacterStyle) obj;
                wb2Var.invalidate();
                break;
            default:
                zu1Var.lc = i;
                zu1Var.mc = 3;
                zu1Var.oc = (String) obj;
                wb2Var.invalidate();
                break;
        }
    }
}
