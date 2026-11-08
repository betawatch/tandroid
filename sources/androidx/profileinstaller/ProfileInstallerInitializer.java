package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import bi.pa;
import java.util.Collections;
import java.util.List;
import u4.e;
import w7.s;
import y4.b;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // y4.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // y4.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new s(25, false);
        }
        e.a(new pa(this, context.getApplicationContext()));
        return new s(25, false);
    }
}
