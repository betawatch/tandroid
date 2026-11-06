package l6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import b9.j0;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.internal.clearcut.b2;
import com.google.android.gms.internal.clearcut.p1;

/* loaded from: classes.dex */
public final class a {
    public static final e j = new e("ClearcutLogger.API", new a9.e(8), new d());
    public final Context a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final p1 f;
    public final j0 g;
    public final x6.a h;
    public final b2 i;

    public a(Context context) {
        j0 j0Var = new j0(context, j, null, new sa.d(6));
        b2 b2Var = new b2(context);
        this.e = -1;
        p1 p1Var = p1.b;
        this.f = p1Var;
        this.a = context;
        this.b = context.getPackageName();
        int i7 = 0;
        try {
            i7 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.wtf("ClearcutLogger", "This can't happen.", e10);
        }
        this.c = i7;
        this.e = -1;
        this.d = "VISION";
        this.g = j0Var;
        this.h = x6.a.a;
        this.f = p1Var;
        this.i = b2Var;
    }
}
