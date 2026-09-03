package cb;

import android.content.Context;
import java.util.UUID;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l {
    public static final c9.b b;
    public final Context a;

    static {
        c9.a b10 = c9.b.b(l.class);
        b10.a(c9.l.b(h.class));
        b10.a(c9.l.b(Context.class));
        b10.g = new b(4);
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
