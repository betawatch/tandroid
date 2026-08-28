package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import e2.f;
import e2.g;
import i2.b;
import java.util.Collections;
import java.util.List;
import za.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // i2.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // i2.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new a(5);
        }
        g.a(new f(this, context.getApplicationContext()));
        return new a(5);
    }
}
