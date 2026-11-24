// default package

import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class op1 extends c01 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ int e;
    public final /* synthetic */ gb2 f;
    public final /* synthetic */ mu1 g;
    public final /* synthetic */ Object h;

    public /* synthetic */ op1(mu1 mu1Var, int i, Object obj, gb2 gb2Var, byte b) {
        this.d = b;
        this.g = mu1Var;
        this.e = i;
        this.h = obj;
        this.f = gb2Var;
    }

    @Override // c01
    public final void c(boolean z) {
        switch (this.d) {
            case 0:
                if (!z) {
                    gl.d3(new eg((Object) this, this.e, (byte) 14), 240L);
                    break;
                }
                break;
            default:
                if (!z) {
                    gl.d3(new eg((Object) this, this.e, (byte) 17), 240L);
                    break;
                }
                break;
        }
    }

    @Override // c01
    public final void d() {
        byte b = this.d;
        gb2 gb2Var = this.f;
        Object obj = this.h;
        int i = this.e;
        mu1 mu1Var = this.g;
        switch (b) {
            case 0:
                mu1Var.ac = i;
                mu1Var.bc = 1;
                mu1Var.cc = (CharacterStyle) obj;
                gb2Var.invalidate();
                break;
            default:
                mu1Var.ac = i;
                mu1Var.bc = 3;
                mu1Var.dc = (String) obj;
                gb2Var.invalidate();
                break;
        }
    }
}
