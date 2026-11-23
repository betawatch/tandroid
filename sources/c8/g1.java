package c8;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class g1 {
    public static final File a(Context context, String fileName) {
        kotlin.jvm.internal.j.e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }
}
