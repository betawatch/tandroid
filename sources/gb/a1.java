package gb;

import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
