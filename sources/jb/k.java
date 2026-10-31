package jb;

import android.content.Context;
import b2.n0;
import java.util.UUID;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k {
    public static final r9.a b;
    public final Context a;

    static {
        n0 a2 = r9.a.a(k.class);
        a2.a(r9.j.a(g.class));
        a2.a(r9.j.a(Context.class));
        a2.f = new oa.d(9);
        b = a2.b();
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
