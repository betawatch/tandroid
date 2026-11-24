// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class o9b extends q9b {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    public /* synthetic */ o9b(Object obj, byte b) {
        this.g = b;
        this.h = obj;
    }

    @Override // q9b
    public final void e() {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                yo8 yo8Var = (yo8) obj;
                yo8Var.R = false;
                yo8Var.invalidate();
                break;
            case 1:
                a58 w = ((oab) obj).w();
                if (w != null) {
                    w.c0(true);
                    break;
                }
                break;
            default:
                bf0 bf0Var = (bf0) obj;
                bf0Var.post(new nsa((Object) bf0Var, (byte) 27));
                break;
        }
    }

    @Override // q9b
    public final void f(boolean z) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                yo8 yo8Var = (yo8) obj;
                yo8Var.R = true;
                yo8Var.invalidate();
                break;
            case 1:
                a58 w = ((oab) obj).w();
                if (w != null) {
                    w.c0(false);
                }
                g48 g48Var = this.f;
                if (g48Var != null) {
                    g48Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((bf0) obj).setVisibility(0);
                break;
        }
    }
}
