package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements sp5 {
    @Override // sp5
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // sp5
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new qf5((byte) 24);
        }
        nu8.a(new xf1(this, context.getApplicationContext()));
        return new qf5((byte) 24);
    }
}
