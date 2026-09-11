package i6;

import a8.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.e;
import com.google.android.gms.internal.clearcut.b2;
import com.google.android.gms.internal.clearcut.p1;
import com.google.android.gms.internal.clearcut.u0;

/* loaded from: classes.dex */
public final class a {
    public static final e j = new e("ClearcutLogger.API", new d(5), new com.google.android.gms.common.api.d());
    public final Context a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final p1 f;
    public final u0 g;
    public final u6.a h;
    public final b2 i;

    public a(Context context) {
        u0 u0Var = new u0(context, j, null, new com.google.android.gms.common.api.internal.a());
        b2 b2Var = new b2(context);
        this.e = -1;
        p1 p1Var = p1.b;
        this.f = p1Var;
        this.a = context;
        this.b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.wtf("ClearcutLogger", "This can't happen.", e7);
        }
        this.c = i10;
        this.e = -1;
        this.d = "VISION";
        this.g = u0Var;
        this.h = u6.a.a;
        this.f = p1Var;
        this.i = b2Var;
    }
}
