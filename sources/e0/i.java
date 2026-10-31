package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i {
    public final Bundle a;
    public IconCompat b;
    public final n0[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final CharSequence h;
    public final PendingIntent i;

    public i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, n0[] n0VarArr, n0[] n0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.g = iconCompat.g();
        }
        this.h = r.d(charSequence);
        this.i = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = n0VarArr;
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
