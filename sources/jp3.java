// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class jp3 extends y1 {
    public final /* synthetic */ byte a;
    public final hk0 b;

    public jp3(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new inb();
                break;
            default:
                this.b = new ip3();
                break;
        }
    }

    @Override // y1
    public final void a(CharSequence charSequence) {
        byte b = this.a;
    }

    @Override // y1
    public final boolean b(hk0 hk0Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(hk0Var);
        }
    }

    @Override // y1
    public final hk0 e() {
        byte b = this.a;
        hk0 hk0Var = this.b;
        switch (b) {
            case 0:
                return (ip3) hk0Var;
            default:
                return (inb) hk0Var;
        }
    }

    @Override // y1
    public final boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // y1
    public final qk2 h(mp3 mp3Var) {
        switch (this.a) {
            case 0:
                return qk2.a(mp3Var.b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
