package ab;

import android.content.Context;
import java.util.UUID;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l {
    public static final a9.b b;
    public final Context a;

    static {
        a9.a b10 = a9.b.b(l.class);
        b10.a(a9.m.b(h.class));
        b10.a(a9.m.b(Context.class));
        b10.g = new b(2);
        b = b10.b();
    }

    public l(Context context) {
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
