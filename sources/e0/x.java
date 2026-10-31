package e0;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x {
    public final CharSequence a;
    public final long b;
    public final l0 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public x(CharSequence charSequence, long j10, l0 l0Var) {
        this.a = charSequence;
        this.b = j10;
        this.c = l0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) arrayList.get(i10);
            l0 l0Var = xVar.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = xVar.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", xVar.b);
            if (l0Var != null) {
                bundle.putCharSequence("sender", l0Var.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", w.a(b5.d.E(l0Var)));
                } else {
                    bundle.putBundle("person", l0Var.c());
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
        long j10 = this.b;
        CharSequence charSequence = this.a;
        l0 l0Var = this.c;
        if (i10 >= 28) {
            a2 = w.b(charSequence, j10, l0Var != null ? b5.d.E(l0Var) : null);
        } else {
            a2 = v.a(charSequence, j10, l0Var != null ? l0Var.a : null);
        }
        String str = this.e;
        if (str != null) {
            v.b(a2, str, this.f);
        }
        return a2;
    }
}
