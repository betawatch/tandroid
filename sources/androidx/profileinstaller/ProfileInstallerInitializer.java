package androidx.profileinstaller;

import ai.ra;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import pb.a;
import r4.g;
import v4.b;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        g.a(new ra(this, context.getApplicationContext()));
        return new a(21);
    }
}
