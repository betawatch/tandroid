package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import ob.a;
import r4.e;
import v4.b;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // v4.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // v4.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new a(21);
        }
        e.a(new di.a(this, context.getApplicationContext()));
        return new a(21);
    }
}
