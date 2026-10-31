package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends t7.u {
    @Override // t7.u
    public final Signature[] D(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
