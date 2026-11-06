package c8;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class c1 {
    public static final File a(Context context, String fileName) {
        kotlin.jvm.internal.j.e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }
}
