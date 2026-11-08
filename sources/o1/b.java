package o1;

import android.content.Context;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class b {
    public static final boolean a(Context context, String name) {
        j.e(context, "context");
        j.e(name, "name");
        return context.deleteSharedPreferences(name);
    }
}
