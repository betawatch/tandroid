// default package

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class do7 {
    public final CharSequence a;
    public final long b;
    public final b78 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public do7(CharSequence charSequence, long j, b78 b78Var) {
        this.a = charSequence;
        this.b = j;
        this.c = b78Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            do7 do7Var = (do7) arrayList.get(i);
            b78 b78Var = do7Var.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = do7Var.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", do7Var.b);
            bundle.putCharSequence("sender", b78Var.a);
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("sender_person", co7.a(go.G(b78Var)));
            } else {
                bundle.putBundle("person", b78Var.b());
            }
            String str = do7Var.e;
            if (str != null) {
                bundle.putString(TeXSymbolParser.TYPE_ATTR, str);
            }
            Uri uri = do7Var.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            bundle.putBundle("extras", do7Var.d);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        int i = Build.VERSION.SDK_INT;
        long j = this.b;
        b78 b78Var = this.c;
        CharSequence charSequence = this.a;
        Notification.MessagingStyle.Message b = i >= 28 ? co7.b(charSequence, j, go.G(b78Var)) : bo7.a(charSequence, j, b78Var.a);
        String str = this.e;
        if (str != null) {
            bo7.b(b, str, this.f);
        }
        return b;
    }
}
