package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import db.a;
import e2.f;
import e2.g;
import i2.b;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // i2.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // i2.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new a(5);
        }
        g.a(new f(this, context.getApplicationContext()));
        return new a(5);
    }
}
