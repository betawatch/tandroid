package oa;

import j$.util.Objects;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends la.u {
    public static final e c = new e();
    public final g a;
    public final ArrayList b;

    public h(g gVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(gVar);
        this.a = gVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (na.h.a >= 9) {
            arrayList.add(new SimpleDateFormat(aa.d.z("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // la.u
    public final Object read(ta.a aVar) {
        Date b10;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this.b) {
            try {
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        try {
                            b10 = pa.a.b(v, new ParsePosition(0));
                            break;
                        } catch (ParseException e10) {
                            StringBuilder t10 = aa.d.t("Failed parsing '", v, "' as Date; at path ");
                            t10.append(aVar.j());
                            throw new la.j(t10.toString(), e10);
                        }
                    }
                    Object obj = arrayList.get(i9);
                    i9++;
                    DateFormat dateFormat = (DateFormat) obj;
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            b10 = dateFormat.parse(v);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.a.a(b10);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            cVar.i();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            format = dateFormat.format(date);
        }
        cVar.r(format);
    }
}
