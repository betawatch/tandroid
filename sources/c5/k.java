package c5;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class k extends c {
    public final Pattern d;

    public k() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // c5.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // c5.c
    public final boolean b() {
        int i10;
        PackageInfo packageInfo;
        boolean b10 = super.b();
        if (!b10 || (i10 = Build.VERSION.SDK_INT) >= 29) {
            return b10;
        }
        boolean z10 = b5.a.a;
        if (i10 >= 26) {
            packageInfo = x6.a.a();
        } else {
            try {
                packageInfo = b5.a.b();
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
