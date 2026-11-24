// default package

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lwc extends dp {
    public final Pattern d;

    public lwc() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // dp
    public final boolean b() {
        int i;
        PackageInfo packageInfo;
        boolean b = super.b();
        if (!b || (i = Build.VERSION.SDK_INT) >= 29) {
            return b;
        }
        boolean z = kwc.a;
        if (i >= 26) {
            packageInfo = nq5.c();
        } else {
            try {
                packageInfo = kwc.b();
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
