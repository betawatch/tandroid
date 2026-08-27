package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import e2.e;
import e2.g;
import e7.v;
import i2.b;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // i2.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // i2.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new v(5);
        }
        g.a(new e(this, context.getApplicationContext()));
        return new v(5);
    }
}
