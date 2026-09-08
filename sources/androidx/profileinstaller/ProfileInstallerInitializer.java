package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import ei.a;
import java.util.Collections;
import java.util.List;
import r4.e;
import v4.b;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // v4.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // v4.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new qb.b(21);
        }
        e.a(new a(this, context.getApplicationContext()));
        return new qb.b(21);
    }
}
