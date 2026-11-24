// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class g53 extends my7 {
    public final /* synthetic */ byte c;
    public final float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g53(float f, byte b) {
        super(0, Float.valueOf(Math.max(f, 0.0f)));
        this.c = b;
        switch (b) {
            case 1:
                super(2, Float.valueOf(Math.max(f, 0.0f)));
                this.d = Math.max(f, 0.0f);
                break;
            default:
                this.d = Math.max(f, 0.0f);
                break;
        }
    }

    @Override // my7
    public final String toString() {
        byte b = this.c;
        float f = this.d;
        switch (b) {
            case 0:
                return "[Dash: length=" + f + "]";
            default:
                return "[Gap: length=" + f + "]";
        }
    }
}
