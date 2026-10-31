package i6;

import a8.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.e;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.q1;
import com.google.android.gms.internal.clearcut.v0;

/* loaded from: classes.dex */
public final class a {
    public static final e j = new e("ClearcutLogger.API", new d(5), new com.google.android.gms.common.api.d());
    public final Context a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final q1 f;
    public final v0 g;
    public final u6.a h;
    public final c2 i;

    public a(Context context) {
        v0 v0Var = new v0(context, j, null, new com.google.android.gms.common.api.internal.a());
        c2 c2Var = new c2(context);
        this.e = -1;
        q1 q1Var = q1.b;
        this.f = q1Var;
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
        this.g = v0Var;
        this.h = u6.a.a;
        this.f = q1Var;
        this.i = c2Var;
    }
}
