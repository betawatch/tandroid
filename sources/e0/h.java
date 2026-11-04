package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h {
    public final Bundle a;
    public IconCompat b;
    public final m0[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final CharSequence h;
    public final PendingIntent i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, m0[] m0VarArr, m0[] m0VarArr2, boolean z10, int i3, boolean z11) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.i = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = m0VarArr;
        this.d = z10;
        this.f = i3;
        this.e = z11;
    }

    public final IconCompat a() {
        int i3;
        if (this.b == null && (i3 = this.g) != 0) {
            this.b = IconCompat.e(null, "", i3);
        }
        return this.b;
    }
}
