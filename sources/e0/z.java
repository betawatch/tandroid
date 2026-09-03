package e0;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class z {
    public final CharSequence a;
    public final long b;
    public final o0 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public z(CharSequence charSequence, long j10, o0 o0Var) {
        this.a = charSequence;
        this.b = j10;
        this.c = o0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z zVar = (z) arrayList.get(i10);
            o0 o0Var = zVar.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = zVar.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", zVar.b);
            if (o0Var != null) {
                bundle.putCharSequence("sender", o0Var.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", y.a(d1.f.E(o0Var)));
                } else {
                    bundle.putBundle("person", o0Var.c());
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
        long j10 = this.b;
        CharSequence charSequence = this.a;
        o0 o0Var = this.c;
        if (i10 >= 28) {
            a2 = y.b(charSequence, j10, o0Var != null ? d1.f.E(o0Var) : null);
        } else {
            a2 = x.a(charSequence, j10, o0Var != null ? o0Var.a : null);
        }
        String str = this.e;
        if (str != null) {
            x.b(a2, str, this.f);
        }
        return a2;
    }
}
