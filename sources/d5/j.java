package d5;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends c {
    public final Pattern d;

    public j() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // d5.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // d5.c
    public final boolean b() {
        int i3;
        PackageInfo packageInfo;
        boolean b10 = super.b();
        if (!b10 || (i3 = Build.VERSION.SDK_INT) >= 29) {
            return b10;
        }
        boolean z10 = c5.a.a;
        if (i3 >= 26) {
            packageInfo = y6.a.a();
        } else {
            try {
                packageInfo = c5.a.b();
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
