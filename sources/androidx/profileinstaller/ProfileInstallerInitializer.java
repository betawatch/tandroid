package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import qb.a;
import u4.e;
import y4.b;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // y4.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // y4.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new a(26);
        }
        e.a(new ai.a(this, context.getApplicationContext()));
        return new a(26);
    }
}
