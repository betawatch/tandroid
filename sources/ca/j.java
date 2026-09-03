package ca;

import android.text.TextUtils;
import h7.u;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u a;

    public j(u uVar) {
        this.a = uVar;
    }

    public final boolean a(da.b bVar) {
        if (TextUtils.isEmpty(bVar.c)) {
            return true;
        }
        long j10 = bVar.f + bVar.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j10 < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
