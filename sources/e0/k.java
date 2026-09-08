package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k {
    public final Bundle a;
    public IconCompat b;
    public final r0[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final CharSequence h;
    public final PendingIntent i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.i = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = r0VarArr;
        this.d = z10;
        this.f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.b == null && (i10 = this.g) != 0) {
            this.b = IconCompat.e(null, "", i10);
        }
        return this.b;
    }
}
