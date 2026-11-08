package e0;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class w {
    public final CharSequence a;
    public final long b;
    public final j0 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public w(CharSequence charSequence, long j3, j0 j0Var) {
        this.a = charSequence;
        this.b = j3;
        this.c = j0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            w wVar = (w) arrayList.get(i7);
            j0 j0Var = wVar.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = wVar.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", wVar.b);
            if (j0Var != null) {
                bundle.putCharSequence("sender", j0Var.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", v.a(d1.f.E(j0Var)));
                } else {
                    bundle.putBundle("person", j0Var.c());
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
            bundleArr[i7] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        Notification.MessagingStyle.Message a10;
        int i7 = Build.VERSION.SDK_INT;
        long j3 = this.b;
        CharSequence charSequence = this.a;
        j0 j0Var = this.c;
        if (i7 >= 28) {
            a10 = v.b(charSequence, j3, j0Var != null ? d1.f.E(j0Var) : null);
        } else {
            a10 = u.a(charSequence, j3, j0Var != null ? j0Var.a : null);
        }
        String str = this.e;
        if (str != null) {
            u.b(a10, str, this.f);
        }
        return a10;
    }
}
