package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c extends nb.a {
    @Override // nb.a
    public final Signature[] E3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
