package j7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class r {
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.emoji2.text.r a(Context context) {
        ProviderInfo providerInfo;
        o0.d dVar;
        ApplicationInfo applicationInfo;
        h7.u cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c(1) : new h7.u(1);
        PackageManager packageManager = context.getPackageManager();
        k7.j6.a(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] n32 = cVar.n3(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : n32) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new o0.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
            if (dVar != null) {
                return null;
            }
            return new androidx.emoji2.text.r(new androidx.emoji2.text.q(context, dVar));
        }
        dVar = null;
        if (dVar != null) {
        }
    }
}
