package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class b {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
