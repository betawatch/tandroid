package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c extends rb.a {
    @Override // rb.a
    public final Signature[] N3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
