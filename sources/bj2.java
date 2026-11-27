// default package

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes.dex */
public final class bj2 {
    public static final zn j = new zn("ClearcutLogger.API", new rr5(10), new xn());
    public final Context a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final xbe f;
    public final qa4 g;
    public final sae h;
    public final fcf i;

    public bj2(Context context) {
        qa4 qa4Var = new qa4(context, j, null, new uif((byte) 13));
        sae saeVar = sae.a;
        fcf fcfVar = new fcf(context);
        this.e = -1;
        xbe xbeVar = xbe.b;
        this.f = xbeVar;
        this.a = context;
        this.b = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.c = i;
        this.e = -1;
        this.d = "VISION";
        this.g = qa4Var;
        this.h = saeVar;
        this.f = xbeVar;
        this.i = fcfVar;
    }
}
