package e5;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class i extends c {
    public final Pattern d;

    public i() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // e5.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // e5.c
    public final boolean b() {
        int i7;
        PackageInfo packageInfo;
        boolean b10 = super.b();
        if (!b10 || (i7 = Build.VERSION.SDK_INT) >= 29) {
            return b10;
        }
        boolean z9 = d5.b.a;
        if (i7 >= 26) {
            packageInfo = z6.a.b();
        } else {
            try {
                packageInfo = d5.b.b();
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
