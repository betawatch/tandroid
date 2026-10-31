package la;

import j$.util.DesugarTimeZone;
import ja.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements ja.f {
    public static final SimpleDateFormat a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).b(a.format((Date) obj));
    }
}
