package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c extends w7.s {
    @Override // w7.s
    public final Signature[] z4(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
