package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import bi.pa;
import java.util.Collections;
import java.util.List;
import u4.e;
import w7.s;
import y4.b;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
