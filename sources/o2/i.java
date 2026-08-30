package o2;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i extends c {
    public final Pattern d;

    public i() {
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
        boolean z4 = n2.c.a;
        if (i10 >= 26) {
            packageInfo = k6.a.c();
        } else {
            try {
                packageInfo = n2.c.a();
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
