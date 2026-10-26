package j6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import b8.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.internal.clearcut.a2;
import com.google.android.gms.internal.clearcut.o1;

/* loaded from: classes.dex */
public final class a {
    public static final e j = new e("ClearcutLogger.API", new d(5), new com.google.android.gms.common.api.d());
    public final Context a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final o1 f;
    public final a6.a g;
    public final v6.a h;
    public final a2 i;

    public a(Context context) {
        a6.a aVar = new a6.a(context, j, null, new com.google.android.gms.common.api.internal.a());
        a2 a2Var = new a2(context);
        this.e = -1;
        o1 o1Var = o1.b;
        this.f = o1Var;
        this.a = context;
        this.b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.c = i10;
        this.e = -1;
        this.d = "VISION";
        this.g = aVar;
        this.h = v6.a.a;
        this.f = o1Var;
        this.i = a2Var;
    }
}
