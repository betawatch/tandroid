package gb;

import java.util.Date;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
