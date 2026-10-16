package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import ei.a;
import java.util.Collections;
import java.util.List;
import r4.f;
import v4.b;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // v4.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // v4.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new rb.b(21);
        }
        f.a(new a(this, context.getApplicationContext()));
        return new rb.b(21);
    }
}
