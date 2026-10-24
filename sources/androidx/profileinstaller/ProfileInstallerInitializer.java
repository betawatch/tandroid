package androidx.profileinstaller;

import ai.sa;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import pb.a;
import r4.f;
import v4.b;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        f.a(new sa(this, context.getApplicationContext()));
        return new a(21);
    }
}
