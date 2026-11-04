package k6;

import a9.j0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.internal.clearcut.a2;
import com.google.android.gms.internal.clearcut.o1;

/* loaded from: classes.dex */
public final class a {
    public static final e j = new e("ClearcutLogger.API", new a6.b(6), new d());
    public final Context a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final o1 f;
    public final j0 g;
    public final w6.a h;
    public final a2 i;

    public a(Context context) {
        j0 j0Var = new j0(context, j, null, new mb.b(5));
        a2 a2Var = new a2(context);
        this.e = -1;
        o1 o1Var = o1.b;
        this.f = o1Var;
        this.a = context;
        this.b = context.getPackageName();
        int i3 = 0;
        try {
            i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.wtf("ClearcutLogger", "This can't happen.", e10);
        }
        this.c = i3;
        this.e = -1;
        this.d = "VISION";
        this.g = j0Var;
        this.h = w6.a.a;
        this.f = o1Var;
        this.i = a2Var;
    }
}
