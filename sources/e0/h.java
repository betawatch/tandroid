package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class h {
    public final Bundle a;
    public IconCompat b;
    public final l0[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final CharSequence h;
    public final PendingIntent i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l0[] l0VarArr, l0[] l0VarArr2, boolean z9, int i7, boolean z10) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.i = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = l0VarArr;
        this.d = z9;
        this.f = i7;
        this.e = z10;
    }

    public final IconCompat a() {
        int i7;
        if (this.b == null && (i7 = this.g) != 0) {
            this.b = IconCompat.e(null, "", i7);
        }
        return this.b;
    }
}
