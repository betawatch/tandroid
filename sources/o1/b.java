package o1;

import android.content.Context;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class b {
    public static final boolean a(Context context, String name) {
        j.e(context, "context");
        j.e(name, "name");
        return context.deleteSharedPreferences(name);
    }
}
