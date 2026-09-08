package e0;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class z {
    public final CharSequence a;
    public final long b;
    public final p0 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public z(CharSequence charSequence, long j3, p0 p0Var) {
        this.a = charSequence;
        this.b = j3;
        this.c = p0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z zVar = (z) arrayList.get(i10);
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
                    bundle.putParcelable("sender_person", y.a(b5.d.E(p0Var)));
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
            bundleArr[i10] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        Notification.MessagingStyle.Message a2;
        int i10 = Build.VERSION.SDK_INT;
        long j3 = this.b;
        CharSequence charSequence = this.a;
        p0 p0Var = this.c;
        if (i10 >= 28) {
            a2 = y.b(charSequence, j3, p0Var != null ? b5.d.E(p0Var) : null);
        } else {
            a2 = x.a(charSequence, j3, p0Var != null ? p0Var.a : null);
        }
        String str = this.e;
        if (str != null) {
            x.b(a2, str, this.f);
        }
        return a2;
    }
}
