package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import bi.pa;
import java.util.Collections;
import java.util.List;
import u4.e;
import w7.s;
import y4.b;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
