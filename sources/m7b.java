// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class m7b extends o7b {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    public /* synthetic */ m7b(Object obj, byte b) {
        this.g = b;
        this.h = obj;
    }

    @Override // o7b
    public final void e() {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                xm8 xm8Var = (xm8) obj;
                xm8Var.R = false;
                xm8Var.invalidate();
                break;
            case 1:
                y28 w = ((m8b) obj).w();
                if (w != null) {
                    w.c0(true);
                    break;
                }
                break;
            default:
                be0 be0Var = (be0) obj;
                be0Var.post(new kya((Object) be0Var, (byte) 19));
                break;
        }
    }

    @Override // o7b
    public final void f(boolean z) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                xm8 xm8Var = (xm8) obj;
                xm8Var.R = true;
                xm8Var.invalidate();
                break;
            case 1:
                y28 w = ((m8b) obj).w();
                if (w != null) {
                    w.c0(false);
                }
                d28 d28Var = this.f;
                if (d28Var != null) {
                    d28Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((be0) obj).setVisibility(0);
                break;
        }
    }
}
