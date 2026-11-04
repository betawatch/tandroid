package androidx.profileinstaller;

import ai.s1;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import nb.a;
import t4.f;
import x4.b;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // x4.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // x4.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new a(24);
        }
        f.a(new s1(this, context.getApplicationContext()));
        return new a(24);
    }
}
