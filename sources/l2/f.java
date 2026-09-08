package l2;

import android.net.Uri;
import android.text.TextUtils;
import b2.s0;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f implements y2.o {
    public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // y2.o
    public final Object f2(Uri uri, g2.k kVar) {
        String readLine = new BufferedReader(new InputStreamReader(kVar, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = a.matcher(readLine);
            if (!matcher.matches()) {
                throw s0.b("Couldn't parse timestamp: " + readLine, null);
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j3 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                time -= (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000) * j3;
            }
            return Long.valueOf(time);
        } catch (ParseException e7) {
            throw s0.b(null, e7);
        }
    }
}
