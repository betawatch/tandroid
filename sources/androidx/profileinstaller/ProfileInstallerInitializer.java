package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import ph.p0;
import r4.e;
import v4.b;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // v4.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // v4.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new jb.b(19);
        }
        e.a(new p0(this, context.getApplicationContext()));
        return new jb.b(19);
    }
}
