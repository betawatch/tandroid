// default package

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dr {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final lv6 h;

    public dr(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, lv6 lv6Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = lv6Var;
    }

    public static dr a(Context context, wj5 wj5Var, String str, String str2, ArrayList arrayList, lv6 lv6Var) {
        String packageName = context.getPackageName();
        String d = wj5Var.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String l = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new dr(str, str2, arrayList, d, packageName, l, str3, lv6Var);
    }
}
