package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import bi.h2;
import java.util.Collections;
import java.util.List;
import qb.a;
import u4.e;
import y4.b;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        e.a(new h2(this, context.getApplicationContext()));
        return new a(26);
    }
}
