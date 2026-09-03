package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c extends z9.d {
    @Override // z9.d
    public final Signature[] w3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
