// default package

import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class br1 extends k11 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ int e;
    public final /* synthetic */ rc2 f;
    public final /* synthetic */ yv1 g;
    public final /* synthetic */ Object h;

    public /* synthetic */ br1(yv1 yv1Var, int i, Object obj, rc2 rc2Var, byte b) {
        this.d = b;
        this.g = yv1Var;
        this.e = i;
        this.h = obj;
        this.f = rc2Var;
    }

    @Override // k11
    public final void c(boolean z) {
        switch (this.d) {
            case 0:
                if (!z) {
                    gm.d3(new eh((Object) this, this.e, (byte) 14), 240L);
                    break;
                }
                break;
            default:
                if (!z) {
                    gm.d3(new eh((Object) this, this.e, (byte) 17), 240L);
                    break;
                }
                break;
        }
    }

    @Override // k11
    public final void d() {
        byte b = this.d;
        rc2 rc2Var = this.f;
        Object obj = this.h;
        int i = this.e;
        yv1 yv1Var = this.g;
        switch (b) {
            case 0:
                yv1Var.kc = i;
                yv1Var.lc = 1;
                yv1Var.mc = (CharacterStyle) obj;
                rc2Var.invalidate();
                break;
            default:
                yv1Var.kc = i;
                yv1Var.lc = 3;
                yv1Var.nc = (String) obj;
                rc2Var.invalidate();
                break;
        }
    }
}
