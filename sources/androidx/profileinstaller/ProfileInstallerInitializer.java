package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import ei.a;
import java.util.Collections;
import java.util.List;
import r4.e;
import v4.b;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
