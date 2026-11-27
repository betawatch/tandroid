// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class kbb extends mbb {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    public /* synthetic */ kbb(Object obj, byte b) {
        this.g = b;
        this.h = obj;
    }

    @Override // mbb
    public final void e() {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                iq8 iq8Var = (iq8) obj;
                iq8Var.R = false;
                iq8Var.invalidate();
                break;
            case 1:
                o68 w = ((lcb) obj).w();
                if (w != null) {
                    w.c0(true);
                    break;
                }
                break;
            default:
                de0 de0Var = (de0) obj;
                de0Var.post(new s8b(de0Var, (byte) 6));
                break;
        }
    }

    @Override // mbb
    public final void f(boolean z) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                iq8 iq8Var = (iq8) obj;
                iq8Var.R = true;
                iq8Var.invalidate();
                break;
            case 1:
                o68 w = ((lcb) obj).w();
                if (w != null) {
                    w.c0(false);
                }
                t58 t58Var = this.f;
                if (t58Var != null) {
                    t58Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((de0) obj).setVisibility(0);
                break;
        }
    }
}
