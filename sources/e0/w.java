package e0;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w {
    public final CharSequence a;
    public final long b;
    public final k0 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public w(CharSequence charSequence, long j10, k0 k0Var) {
        this.a = charSequence;
        this.b = j10;
        this.c = k0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            w wVar = (w) arrayList.get(i3);
            k0 k0Var = wVar.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = wVar.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", wVar.b);
            if (k0Var != null) {
                bundle.putCharSequence("sender", k0Var.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", v.a(d1.f.E(k0Var)));
                } else {
                    bundle.putBundle("person", k0Var.c());
                }
            }
            String str = wVar.e;
            if (str != null) {
                bundle.putString(TeXSymbolParser.TYPE_ATTR, str);
            }
            Uri uri = wVar.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = wVar.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i3] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        Notification.MessagingStyle.Message a10;
        int i3 = Build.VERSION.SDK_INT;
        long j10 = this.b;
        CharSequence charSequence = this.a;
        k0 k0Var = this.c;
        if (i3 >= 28) {
            a10 = v.b(charSequence, j10, k0Var != null ? d1.f.E(k0Var) : null);
        } else {
            a10 = u.a(charSequence, j10, k0Var != null ? k0Var.a : null);
        }
        String str = this.e;
        if (str != null) {
            u.b(a10, str, this.f);
        }
        return a10;
    }
}
