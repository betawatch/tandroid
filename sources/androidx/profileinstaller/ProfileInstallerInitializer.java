package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import bi.pa;
import java.util.Collections;
import java.util.List;
import u4.e;
import w7.s;
import y4.b;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
