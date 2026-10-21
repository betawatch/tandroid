package e0;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class w {
    public final CharSequence a;
    public final long b;
    public final m0 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public w(CharSequence charSequence, long j10, m0 m0Var) {
        this.a = charSequence;
        this.b = j10;
        this.c = m0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = (w) arrayList.get(i10);
            m0 m0Var = wVar.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = wVar.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", wVar.b);
            if (m0Var != null) {
                bundle.putCharSequence("sender", m0Var.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", v.a(b5.d.E(m0Var)));
                } else {
                    bundle.putBundle("person", m0Var.c());
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
        m0 m0Var = this.c;
        if (i10 >= 28) {
            a2 = v.b(charSequence, j10, m0Var != null ? b5.d.E(m0Var) : null);
        } else {
            a2 = u.a(charSequence, j10, m0Var != null ? m0Var.a : null);
        }
        String str = this.e;
        if (str != null) {
            u.b(a2, str, this.f);
        }
        return a2;
    }
}
