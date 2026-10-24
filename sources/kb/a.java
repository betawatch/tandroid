package kb;

import eb.g;
import eb.j;
import eb.u;
import eb.v;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class a extends u {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
    public class a implements v {
        @Override // eb.v
        public final u create(g gVar, lb.a aVar) {
            if (aVar.a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public /* synthetic */ a(int i10) {
        this();
    }

    @Override // eb.u
    public final Object read(mb.a aVar) {
        Date date;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    date = new Date(this.a.parse(v).getTime());
                } catch (ParseException e) {
                    throw new j("Failed parsing '" + v + "' as SQL Date; at path " + aVar.j(), e);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date);
        }
        bVar.r(format);
    }

    private a() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }
}
