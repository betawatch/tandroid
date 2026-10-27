package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import bi.ra;
import java.util.Collections;
import java.util.List;
import r4.e;
import v4.b;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // v4.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // v4.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new sb.b(21);
        }
        e.a(new ra(this, context.getApplicationContext()));
        return new sb.b(21);
    }
}
