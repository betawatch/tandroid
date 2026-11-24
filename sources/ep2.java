// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ep2 implements fw2 {
    public static final ep2 b = new ep2(0);
    public static final ep2 c = new ep2(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ ep2(byte b2) {
        this.a = b2;
    }

    @Override // fw2
    public final sw2 getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return z14.a;
        }
    }

    @Override // fw2
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
