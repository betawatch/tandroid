package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k {
    public final Bundle a;
    public IconCompat b;
    public final q0[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final CharSequence h;
    public final PendingIntent i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q0[] q0VarArr, q0[] q0VarArr2, boolean z4, int i10, boolean z10) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.i = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = q0VarArr;
        this.d = z4;
        this.f = i10;
        this.e = z10;
    }

    public final IconCompat a() {
        int i10;
        if (this.b == null && (i10 = this.g) != 0) {
            this.b = IconCompat.e(null, "", i10);
        }
        return this.b;
    }
}
