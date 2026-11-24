package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
