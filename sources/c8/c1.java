package c8;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class c1 {
    public static final File a(Context context, String fileName) {
        kotlin.jvm.internal.j.e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }
}
