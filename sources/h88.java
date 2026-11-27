// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h88 extends rn {
    public final /* synthetic */ byte b;
    public final /* synthetic */ k88 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h88(k88 k88Var, byte b) {
        super("thumbAnimationProgress", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = k88Var;
                super("thumbImageVisibleProgress", (byte) 0);
                break;
            default:
                this.c = k88Var;
                break;
        }
    }

    @Override // rn
    public final void c(Object obj, float f) {
        byte b = this.b;
        k88 k88Var = this.c;
        switch (b) {
            case 0:
                k88Var.r = f;
                ((k88) obj).invalidate();
                break;
            default:
                k88Var.n = f;
                ((k88) obj).invalidate();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        byte b = this.b;
        k88 k88Var = this.c;
        switch (b) {
            case 0:
                return Float.valueOf(k88Var.r);
            default:
                return Float.valueOf(k88Var.n);
        }
    }
}
