package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import e2.e;
import e2.f;
import i2.b;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // i2.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // i2.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new ab.b(6);
        }
        f.a(new e(this, context.getApplicationContext()));
        return new ab.b(6);
    }
}
