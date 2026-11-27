package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements sp5 {
    @Override // sp5
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // sp5
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new qf5((byte) 24);
        }
        nu8.a(new xf1(this, context.getApplicationContext()));
        return new qf5((byte) 24);
    }
}
