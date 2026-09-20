package jb;

import db.u;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class d extends u {
    public static final c b = new c();
    public final u a;

    public d(u uVar) {
        this.a = uVar;
    }

    @Override // db.u
    public final Object read(lb.a aVar) {
        Date date = (Date) this.a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        this.a.write(bVar, (Timestamp) obj);
    }
}
