package androidx.profileinstaller;

import ai.ra;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import pb.a;
import r4.g;
import v4.b;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // v4.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // v4.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new a(21);
        }
        g.a(new ra(this, context.getApplicationContext()));
        return new a(21);
    }
}
