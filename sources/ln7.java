// default package

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ln7 {
    public final Bundle a;
    public IconCompat b;
    public final t99[] c;
    public final boolean d;
    public final boolean e;
    public final byte f;
    public final int g;
    public final CharSequence h;
    public final PendingIntent i;

    /* JADX WARN: Multi-variable type inference failed */
    public ln7(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, t99[] t99VarArr, boolean z, int i, boolean z2) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.g = iconCompat.g();
        }
        this.h = wn7.c(charSequence);
        this.i = pendingIntent;
        this.a = bundle;
        this.c = t99VarArr;
        this.d = z;
        this.f = i;
        this.e = z2;
    }

    public final IconCompat a() {
        int i;
        IconCompat iconCompat = this.b;
        if (iconCompat != null || (i = this.g) == 0) {
            return iconCompat;
        }
        IconCompat e = IconCompat.e(null, "", i);
        this.b = e;
        return e;
    }
}
