package i2;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements e2.m, e2.h {
    public final /* synthetic */ b2.n0 a;

    public /* synthetic */ t(b2.n0 n0Var) {
        this.a = n0Var;
    }

    @Override // e2.h
    public void accept(Object obj) {
        ((m4.e1) obj).C(this.a);
    }

    @Override // e2.m
    public void invoke(Object obj) {
        ((b2.z0) obj).onMediaMetadataChanged(this.a);
    }
}
