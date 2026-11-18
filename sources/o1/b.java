package o1;

import android.content.Context;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class b {
    public static final boolean a(Context context, String name) {
        j.e(context, "context");
        j.e(name, "name");
        return context.deleteSharedPreferences(name);
    }
}
