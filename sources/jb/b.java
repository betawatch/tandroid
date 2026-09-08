package jb;

import db.g;
import db.j;
import db.u;
import db.v;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b extends u {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public class a implements v {
        @Override // db.v
        public final u create(g gVar, kb.a aVar) {
            if (aVar.a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public /* synthetic */ b(int i10) {
        this();
    }

    @Override // db.u
    public final Object read(lb.a aVar) {
        Time time;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    time = new Time(this.a.parse(v).getTime());
                } catch (ParseException e7) {
                    throw new j("Failed parsing '" + v + "' as SQL Time; at path " + aVar.j(), e7);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time);
        }
        bVar.r(format);
    }

    private b() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }
}
