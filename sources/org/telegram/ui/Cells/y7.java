package org.telegram.ui.Cells;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.no0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class y7 implements no0 {
    public final /* synthetic */ a8 a;

    public y7(a8 a8Var) {
        this.a = a8Var;
    }

    @Override // org.telegram.ui.Components.no0
    public final void W(float f7, boolean z10) {
        int round;
        a8 a8Var = this.a;
        z7 z7Var = a8Var.r;
        if (z7Var == null || a8Var.n == null) {
            return;
        }
        if (z7Var.c != null) {
            double length = f7 * (r1.length - 1);
            int clamp = Utilities.clamp((int) Math.floor(length), a8Var.r.c.length - 1, 0);
            int clamp2 = Utilities.clamp((int) Math.ceil(length), a8Var.r.c.length - 1, 0);
            int[] iArr = a8Var.r.c;
            round = Math.round(AndroidUtilities.lerp(iArr[clamp], iArr[clamp2], Math.round(((float) (length - Math.floor(length))) * a8Var.r.d) / a8Var.r.d));
        } else {
            round = Math.round(((a8Var.r.a() - a8Var.r.b()) * f7) + z7Var.b());
        }
        int i10 = a8Var.h;
        if (i10 != Integer.MIN_VALUE) {
            round = Math.max(round, i10);
        }
        int i11 = a8Var.f;
        if (i11 != round) {
            if (a8Var.c(i11) != a8Var.c(round)) {
                AndroidUtilities.vibrateCursor(a8Var.e);
            }
            a8Var.f = round;
            a8Var.e(round, true);
            Utilities.Callback callback = a8Var.n;
            if (callback != null) {
                callback.run(Integer.valueOf(a8Var.f));
            }
        }
    }

    @Override // org.telegram.ui.Components.no0
    public final CharSequence getContentDescription() {
        Utilities.Callback2Return callback2Return;
        a8 a8Var = this.a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(a8Var.s)) {
                sb2.append(a8Var.s);
            }
            z7 z7Var = a8Var.r;
            if (z7Var != null && (callback2Return = z7Var.e) != null) {
                CharSequence charSequence = (CharSequence) callback2Return.run(0, Integer.valueOf(a8Var.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) a8Var.r.e.run(-1, Integer.valueOf(a8Var.r.b()));
                CharSequence charSequence3 = (CharSequence) a8Var.r.e.run(1, Integer.valueOf(a8Var.r.a()));
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
            return a8Var.s;
        }
    }

    @Override // org.telegram.ui.Components.no0
    public final int k0() {
        z7 z7Var = this.a.r;
        if (z7Var == null) {
            return 0;
        }
        return z7Var.c != null ? (r1.length - 1) * z7Var.d : z7Var.a() - z7Var.b();
    }

    @Override // org.telegram.ui.Components.no0
    public final /* synthetic */ void y() {
    }
}
