package gb;

import java.util.Date;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public class e implements db.v {
    @Override // db.v
    public final db.u create(db.g gVar, kb.a aVar) {
        if (aVar.a == Date.class) {
            return new h(g.a);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
