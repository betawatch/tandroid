// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gr1 extends cu6 {
    public final /* synthetic */ mu1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr1(mu1 mu1Var, jq1 jq1Var, mq1 mq1Var) {
        super(jq1Var, mq1Var);
        this.x = mu1Var;
    }

    public final void l(int i) {
        if (this.x.nb) {
            if (i == 0) {
                i = 1;
            } else if (i == 1) {
                i = 0;
            }
        }
        this.b = i;
    }
}
