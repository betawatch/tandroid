package kf;

import android.os.Build;
import z9.d;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b {
    public static final a a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            a = new d(10);
        } else {
            a = new ab.a(11);
        }
    }
}
