package e0;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z {
    public final CharSequence a;
    public final long b;
    public final p0 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public z(CharSequence charSequence, long j10, p0 p0Var) {
        this.a = charSequence;
        this.b = j10;
        this.c = p0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            z zVar = (z) arrayList.get(i9);
            p0 p0Var = zVar.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = zVar.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", zVar.b);
            if (p0Var != null) {
                bundle.putCharSequence("sender", p0Var.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", y.a(d1.f.D(p0Var)));
                } else {
                    bundle.putBundle("person", p0Var.c());
                }
            }
            String str = zVar.e;
            if (str != null) {
                bundle.putString(TeXSymbolParser.TYPE_ATTR, str);
            }
            Uri uri = zVar.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = zVar.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i9] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        Notification.MessagingStyle.Message a2;
        int i9 = Build.VERSION.SDK_INT;
        long j10 = this.b;
        CharSequence charSequence = this.a;
        p0 p0Var = this.c;
        if (i9 >= 28) {
            a2 = y.b(charSequence, j10, p0Var != null ? d1.f.D(p0Var) : null);
        } else {
            a2 = x.a(charSequence, j10, p0Var != null ? p0Var.a : null);
        }
        String str = this.e;
        if (str != null) {
            x.b(a2, str, this.f);
        }
        return a2;
    }
}
