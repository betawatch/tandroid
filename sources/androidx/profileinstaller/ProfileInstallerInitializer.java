package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import e2.f;
import e2.g;
import h7.u;
import i2.b;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // i2.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // i2.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new u(5);
        }
        g.a(new f(this, context.getApplicationContext()));
        return new u(5);
    }
}
