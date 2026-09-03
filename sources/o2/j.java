package o2;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j extends c {
    public final Pattern d;

    public j() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // o2.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // o2.c
    public final boolean b() {
        int i10;
        PackageInfo packageInfo;
        boolean b10 = super.b();
        if (!b10 || (i10 = Build.VERSION.SDK_INT) >= 29) {
            return b10;
        }
        boolean z4 = n2.b.a;
        if (i10 >= 26) {
            packageInfo = k6.a.c();
        } else {
            try {
                packageInfo = n2.b.b();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo == null) {
            return false;
        }
        Matcher matcher = this.d.matcher(packageInfo.versionName);
        return matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
