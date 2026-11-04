package mb;

import android.content.Context;
import d2.l0;
import java.util.UUID;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k {
    public static final t9.a b;
    public final Context a;

    static {
        l0 a10 = t9.a.a(k.class);
        a10.a(t9.j.a(g.class));
        a10.a(t9.j.a(Context.class));
        a10.f = new v7.s(14);
        b = a10.b();
    }

    public k(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        String string = this.a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
