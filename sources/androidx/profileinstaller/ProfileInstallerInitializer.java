package androidx.profileinstaller;

import ai.sa;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import pb.a;
import r4.f;
import v4.b;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
