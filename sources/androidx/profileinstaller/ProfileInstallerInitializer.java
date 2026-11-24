package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements pn5 {
    @Override // pn5
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // pn5
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new pd5((byte) 24);
        }
        dr8.a(new vf1(this, context.getApplicationContext()));
        return new pd5((byte) 24);
    }
}
