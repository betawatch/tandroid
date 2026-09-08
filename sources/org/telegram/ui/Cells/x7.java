package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.eo0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class x7 implements eo0 {
    public final /* synthetic */ z7 a;

    public x7(z7 z7Var) {
        this.a = z7Var;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void X(float f7, boolean z10) {
        int round;
        z7 z7Var = this.a;
        y7 y7Var = z7Var.r;
        if (y7Var == null || z7Var.n == null) {
            return;
        }
        if (y7Var.c != null) {
            double length = f7 * (r1.length - 1);
            int clamp = Utilities.clamp((int) Math.floor(length), z7Var.r.c.length - 1, 0);
            int clamp2 = Utilities.clamp((int) Math.ceil(length), z7Var.r.c.length - 1, 0);
            int[] iArr = z7Var.r.c;
            round = Math.round(AndroidUtilities.lerp(iArr[clamp], iArr[clamp2], Math.round(((float) (length - Math.floor(length))) * z7Var.r.d) / z7Var.r.d));
        } else {
            round = Math.round(((z7Var.r.a() - z7Var.r.b()) * f7) + y7Var.b());
        }
        int i10 = z7Var.h;
        if (i10 != Integer.MIN_VALUE) {
            round = Math.max(round, i10);
        }
        int i11 = z7Var.f;
        if (i11 != round) {
            if (z7Var.c(i11) != z7Var.c(round)) {
                AndroidUtilities.vibrateCursor(z7Var.e);
            }
            z7Var.f = round;
            z7Var.e(round, true);
            Utilities.Callback callback = z7Var.n;
            if (callback != null) {
                callback.run(Integer.valueOf(z7Var.f));
            }
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        z7 z7Var = this.a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(z7Var.s)) {
                sb2.append(z7Var.s);
            }
            y7 y7Var = z7Var.r;
            if (y7Var != null && (callback2Return = y7Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(z7Var.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) z7Var.r.e.run(-1, Integer.valueOf(z7Var.r.b()));
                CharSequence charSequence3 = (CharSequence) z7Var.r.e.run(1, Integer.valueOf(z7Var.r.a()));
                if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence2);
                    sb2.append(" – ");
                    sb2.append(charSequence3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
            return null;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return z7Var.s;
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public final int l0() {
        y7 y7Var = this.a.r;
        if (y7Var == null) {
            return 0;
        }
        return y7Var.c != null ? (r1.length - 1) * y7Var.d : y7Var.a() - y7Var.b();
    }

    @Override // org.telegram.ui.Components.eo0
    public final /* synthetic */ void B() {
    }
}
