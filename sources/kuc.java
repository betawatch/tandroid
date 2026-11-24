// default package

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kuc extends co {
    public final Pattern d;

    public kuc() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // co
    public final boolean b() {
        int i;
        PackageInfo packageInfo;
        boolean b = super.b();
        if (!b || (i = Build.VERSION.SDK_INT) >= 29) {
            return b;
        }
        boolean z = juc.a;
        if (i >= 26) {
            packageInfo = no5.c();
        } else {
            try {
                packageInfo = juc.b();
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
