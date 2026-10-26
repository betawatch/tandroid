package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import bi.ra;
import java.util.Collections;
import java.util.List;
import r4.e;
import v4.b;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // v4.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // v4.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new sb.b(21);
        }
        e.a(new ra(this, context.getApplicationContext()));
        return new sb.b(21);
    }
}
