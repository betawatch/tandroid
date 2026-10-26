package e0;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class w {
    public final CharSequence a;
    public final long b;
    public final l0 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public w(CharSequence charSequence, long j10, l0 l0Var) {
        this.a = charSequence;
        this.b = j10;
        this.c = l0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = (w) arrayList.get(i10);
            l0 l0Var = wVar.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = wVar.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", wVar.b);
            if (l0Var != null) {
                bundle.putCharSequence("sender", l0Var.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", v.a(c5.d.E(l0Var)));
                } else {
                    bundle.putBundle("person", l0Var.c());
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
            a2 = v.b(charSequence, j10, l0Var != null ? c5.d.E(l0Var) : null);
        } else {
            a2 = u.a(charSequence, j10, l0Var != null ? l0Var.a : null);
        }
        String str = this.e;
        if (str != null) {
            u.b(a2, str, this.f);
        }
        return a2;
    }
}
