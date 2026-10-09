package e0;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class x {
    public final CharSequence a;
    public final long b;
    public final n0 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public x(CharSequence charSequence, long j3, n0 n0Var) {
        this.a = charSequence;
        this.b = j3;
        this.c = n0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) arrayList.get(i10);
            n0 n0Var = xVar.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = xVar.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", xVar.b);
            if (n0Var != null) {
                bundle.putCharSequence("sender", n0Var.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", w.a(b5.d.E(n0Var)));
                } else {
                    bundle.putBundle("person", n0Var.c());
                }
            }
            String str = xVar.e;
            if (str != null) {
                bundle.putString(TeXSymbolParser.TYPE_ATTR, str);
            }
            Uri uri = xVar.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = xVar.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i10] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        Notification.MessagingStyle.Message a2;
        int i10 = Build.VERSION.SDK_INT;
        long j3 = this.b;
        CharSequence charSequence = this.a;
        n0 n0Var = this.c;
        if (i10 >= 28) {
            a2 = w.b(charSequence, j3, n0Var != null ? b5.d.E(n0Var) : null);
        } else {
            a2 = v.a(charSequence, j3, n0Var != null ? n0Var.a : null);
        }
        String str = this.e;
        if (str != null) {
            v.b(a2, str, this.f);
        }
        return a2;
    }
}
