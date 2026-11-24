package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements pp5 {
    @Override // pp5
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // pp5
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new nf5((byte) 24);
        }
        gt8.a(new dh1(this, context.getApplicationContext()));
        return new nf5((byte) 24);
    }
}
