package o1;

import android.content.Context;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class b {
    public static final boolean a(Context context, String name) {
        j.e(context, "context");
        j.e(name, "name");
        return context.deleteSharedPreferences(name);
    }
}
