// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class lbb extends nbb {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    public /* synthetic */ lbb(Object obj, byte b) {
        this.g = b;
        this.h = obj;
    }

    @Override // nbb
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

    @Override // nbb
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
                u58 u58Var = this.f;
                if (u58Var != null) {
                    u58Var.setTranslationX(0.0f);
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
