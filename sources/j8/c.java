package j8;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class c extends h {
    public final /* synthetic */ int c;
    public final float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(float f7, int i10) {
        super(0, Float.valueOf(Math.max(f7, 0.0f)));
        this.c = i10;
        switch (i10) {
            case 1:
                super(2, Float.valueOf(Math.max(f7, 0.0f)));
                this.d = Math.max(f7, 0.0f);
                break;
            default:
                this.d = Math.max(f7, 0.0f);
                break;
        }
    }

    @Override // j8.h
    public final String toString() {
        switch (this.c) {
            case 0:
                return "[Dash: length=" + this.d + "]";
            default:
                return "[Gap: length=" + this.d + "]";
        }
    }
}
