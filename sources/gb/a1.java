package gb;

import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class a1 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        if (aVar.x() != 9) {
            return Boolean.valueOf(aVar.v());
        }
        aVar.t();
        return null;
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        Boolean bool = (Boolean) obj;
        bVar.r(bool == null ? BuildConfig.BETA_URL : bool.toString());
    }
}
